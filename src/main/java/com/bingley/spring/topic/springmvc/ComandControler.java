package com.bingley.spring.topic.springmvc;


import org.springframework.validation.BindException;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.AbstractCommandController;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Author:  Mr.bingley
 * Version:
 * Date:  2017/8/9
 */

//  高版本中AbstractCommandController已经不能识别了，3.2.0还能识别
public class ComandControler extends AbstractCommandController {

    protected ModelAndView handle(HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse, Object o, BindException e) throws Exception {
        return null;
    }
}
