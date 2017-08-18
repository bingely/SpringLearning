package com.bingley.warning;
/**
 * 定义告警服务的调用接口
 * 包名称： com.soft.moneyInOut.warningServices 
 * 类名称：MyWarning<br/>    
 * 类描述：<br/>  
 * @version <br/>   
 * TODO
 */
public interface WarningCenter {
	/**
	 * 发送告警信息
	 * @return
	 */
	public boolean send(String subject, String text);
}
