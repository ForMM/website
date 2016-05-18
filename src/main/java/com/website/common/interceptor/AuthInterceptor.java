package com.website.common.interceptor;

import java.io.PrintWriter;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;

import com.website.common.content.SysContent;

public class AuthInterceptor {          
  
	public Log log=LogFactory.getLog(getClass());
	
	public void doBefore(JoinPoint jp) {
    	 log.info("log Begining method: "
                + jp.getTarget().getClass().getName() + "."
                + jp.getSignature().getName());
	}
	
	public void doAfter(JoinPoint jp) {
    	log.info("log Ending method: "
                + jp.getTarget().getClass().getName() + "."
                + jp.getSignature().getName());
    }
	
	public Object doAround(ProceedingJoinPoint pjp) throws Throwable {
		HttpServletRequest request=SysContent.getRequest();	    	
		HttpServletResponse response=SysContent.getResponse();
        long time = System.currentTimeMillis();
        Object o= request.getSession().getAttribute("user");
       
        if(o==null){//若没登录，则根据请求方式跳转到登录
			log.warn("no user login,please login first");	 
			  
			response.setCharacterEncoding("utf-8");
			response.setContentType("text/html;charset=utf-8");
			PrintWriter pw=response.getWriter();
			
			request.setAttribute("toLoginFlag",true);
			return  "login";
		
        }else{
        	Object retVal = pjp.proceed();
	        time = System.currentTimeMillis() - time;
	        log.info("process time: " + time + " ms");
	        return retVal;
        }
    }
	
	public void doThrowing(JoinPoint jp, Throwable ex) {
    	 log.info("method " + jp.getTarget().getClass().getName()
                + "." + jp.getSignature().getName() + " throw exception");
    	 log.error(ex);
    	 
    }
	
}  