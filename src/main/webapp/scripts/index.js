$(function() {
    var $fullpage, $header, adjustFooterHeight, initFullPage;
    $('body').show();
    $fullpage = $('#fullPage');
    $header = $('#header');
    initFullPage = function() {
        return $fullpage.fullpage({
            navigation: true,
            navigationPosition: "right",
            verticalCentered: false,
            resize: false,
            css3: true,
            easingcss3: 'linear',
            scrollingSpeed: 600,
            fitToSection: true,
            scrollOverflow: true,
            fixedElements: '#header',
            paddingTop: '66px',
            afterRender: function() {
                return $fullpage.find('.section').show().css('opacity', 1);
            },
            afterLoad: function(anchorLink, index) {
                var height, loadedSection;
                loadedSection = $(this);
                height = loadedSection.height();
                $('.section-home').find('.icon').each(function() {
                    var classStr;
                    classStr = $(this).attr('class');
                    classStr = classStr.replace('hide-', '');
                    return $(this).attr('class', classStr);
                });
                $('.section-appraise').find('.icon').each(function() {
                    var classStr;
                    classStr = $(this).attr('class');
                    classStr = classStr.replace('hide-', '');
                    return $(this).attr('class', classStr);
                });
                switch (index) {
                    case 1:
                        return $('.icon-breath2').addClass('icon-breath-animate');
                    case 2:
                        return $('.section-intro').addClass('section-intro-animate');
                    case 3:
                        $('.section-data').addClass('section-data-animate');
                        if (height > 800) {
                            return $('.client-comment').addClass('special');
                        }
                        break;
                    case 5:
                        if (height > 800) {
                            return $('.client-comment').addClass('special');
                        }
                        break;
                    case 6:
                        return adjustFooterHeight();
                }
            },
            onLeave: function(index, nextIndex, direction) {
                $('.js-popup-close').trigger('click');
                switch (index) {
                    case 1:
                        $('.icon-breath2').removeClass('icon-breath-animate');
                        $header.show().finish();
                        return;
                    case 2:
                        $('.section-intro').removeClass('section-intro-animate');
                        return;
                    case 3:
                        return $('.section-data').removeClass('section-data-animate');
                }
            }
        });
    };
    initFullPage();
    return true;
});
