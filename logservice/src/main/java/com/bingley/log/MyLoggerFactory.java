package com.bingley.log;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;


/**
   *
   * Author:  Mr.bingley
   * Version:
   * Date:  2017/8/17
  *  类描述：封装了Log4j2的Logger，可以把各个级别的日志信息做二次转发、预警等处理<br/>
   */
public class MyLoggerFactory implements MyLogger{

    // import org.slf4j.Logger    为啥不是其它的？？？
    private static Logger logger = null;

    // System.getProperty("user.dir")  当前工程路径           http://blog.csdn.net/zhuhuiby/article/details/8569516
    private static String log4j2Path = System.getProperty("user.dir")+"/config/log4j2.xml";

    @Override
    public void info(Object sender,String arg0) {
        // TODO Auto-generated method stub
        logger = LoggerFactory.getLogger(sender.getClass().getName());
        logger.info(arg0);
    }

    @Override
    public void info(Object sender,String arg0, Object... arg1) {
        logger = LoggerFactory.getLogger(sender.getClass().getName());
        logger.info(arg0, arg1);
    }

    @Override
    public void debug(Object sender,String arg0) {
        logger = LoggerFactory.getLogger(sender.getClass().getName());
        logger.debug(arg0);
    }

    @Override
    public void debug(Object sender,String arg0, Object... arg1) {
        logger = LoggerFactory.getLogger(sender.getClass().getName());
        logger.debug(arg0, arg1);
    }

    @Override
    public void error(Object sender,String subject,String text) {
        logger = LoggerFactory.getLogger(sender.getClass().getName());
        logger.error(text);
        //warningCenter.send(subject, text);
    }

    @Override
    public void error(Object sender,String subject,String text, Object... text1) {
        logger = LoggerFactory.getLogger(sender.getClass().getName());
        logger.error(text, text1);
       // warningCenter.send(subject, text);
    }

    @Override
    public void warn(Object sender,String arg0) {
        logger = LoggerFactory.getLogger(sender.getClass().getName());
        logger.warn(arg0);
    }

    @Override
    public void warn(Object sender,String arg0, Object... arg1) {
        logger = LoggerFactory.getLogger(sender.getClass().getName());
        logger.warn(arg0, arg1);
    }

    @Override
    public void trace(Object sender,String arg0) {
        logger = LoggerFactory.getLogger(sender.getClass().getName());
        logger.trace(arg0);
    }

    @Override
    public void trace(Object sender,String arg0, Object... arg1) {
        logger = LoggerFactory.getLogger(sender.getClass().getName());
        logger.trace(arg0, arg1);
    }
}
