/**
 * Created by Administrator on 2014/9/13.
 */
var eventUtil = new Object();
eventUtil.addHandlerEvent = function(oTarget, sEventType, fHandler){
    if(oTarget.addEventListener){
        oTarget.addEventListener(sEventType,fHandler,false);
    }else if(oTarget.attachEvent){
        oTarget.attachEvent("on"+sEventType,fHandler);
    }else{
        oTarget["on"+sEventType] = fHandler;
    }
}

eventUtil.removeHandlerEvent = function(oTarget, sEventType, fHandler){
    if(oTarget.removeEventListener){
        oTarget.removeEventListener(sEventType,fHandler,false);
    }else if(oTarget.detachEvent){
        oTarget.detachEvent("on"+sEventType,fHandler);
    }else{
        oTarget["on"+sEventType] = null;
    }
}

eventUtil.formatEvent = function (oEvent) {
    if (isIE && isWin) {
        oEvent.charCode = (oEvent.type == "keypress") ? oEvent.keyCode : 0;
        oEvent.eventPhase = 2;
        oEvent.isChar = (oEvent.charCode > 0);
        oEvent.pageX = oEvent.clientX + document.body.scrollLeft;
        oEvent.pageY = oEvent.clientY + document.body.scrollTop;
        oEvent.preventDefault = function () {
            this.returnValue = false;
        };

        if (oEvent.type == "mouseout") {
            oEvent.relatedTarget = oEvent.toElement;
        } else if (oEvent.type == "mouseover") {
            oEvent.relatedTarget = oEvent.fromElement;
        }

        oEvent.stopPropagation = function () {
            this.cancelBubble = true;
        };

        oEvent.target = oEvent.srcElement;
        oEvent.time = (new Date).getTime();
    }
    return oEvent;
};

eventUtil.getEvent = function() {
    if (window.event) {
        return this.formatEvent(window.event);
    } else {
        return eventUtil.getEvent.caller.arguments[0];
    }
};
