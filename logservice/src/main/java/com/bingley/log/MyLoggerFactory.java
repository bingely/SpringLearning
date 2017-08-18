package com.bingley.log;

import com.bingley.warning.WarningCenter;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.File;


/**
   *
   * Author:  Mr.bingley
   * Version:
   * Date:  2017/8/17
  *  类描述：封装了Log4j2的Logger，可以把各个级别的日志信息做二次转发、预警等处理<br/>
 *
 *
 *   基本的思维就是
 *   1 接口--及其实现类。
 *   2 面向接口编程，
 *   3 以后修改的话直接修改实现类
   */
public class MyLoggerFactory implements MyLogger{

    // import org.slf4j.Logger    为啥不是其它的？？？
    private static Logger logger = null;

    // System.getProperty("user.dir")  当前工程路径           http://blog.csdn.net/zhuhuiby/article/details/8569516
    private static String log4j2Path = System.getProperty("user.dir")+"/config/log4j2.xml";

    private  WarningCenter  warningCenter=null;

    public MyLoggerFactory(WarningCenter warningCenter) {
        this.warningCenter = warningCenter;
        File setFile = new File(log4j2Path);

    }

    @Override
    public void info(Object sender,String arg0) {
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
        warningCenter.send(subject, text);
    }

    @Override
    public void error(Object sender,String subject,String text, Object... text1) {
        logger = LoggerFactory.getLogger(sender.getClass().getName());
        logger.error(text, text1);
        warningCenter.send(subject, text);
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
