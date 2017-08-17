package com.bingley.log;

 /**
   *
   * Author:  Mr.bingley
   * Version:
   * Date:  2017/8/17
   */
public interface MyLogger {

     void info(Object sender,String arg0);

     void info(Object sender,String arg0, Object... arg1);

     void debug(Object sender,String arg0);

     void debug(Object sender,String arg0, Object... arg1);

     void error(Object sender,String subject,String text);

     void error(Object sender,String subject,String text, Object... text1);

     void warn(Object sender,String arg0);

     void warn(Object sender,String arg0, Object... arg1);

     void trace(Object sender,String arg0);

     void trace(Object sender,String arg0, Object... arg1);
}
