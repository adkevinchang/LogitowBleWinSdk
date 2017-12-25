/*
 * 
 * 
 * 
 */
package com.logitow.bleapi;

import java.util.ArrayList;

public class LogitowBleControl {
	
	//--------------------------------------------------------------属性变量
	//0初始化错误，1初始化成功。
	private static int blesdksta;
	
	//蓝牙控制唯一实例
	private static LogitowBleControl _linstance;
	
	//蓝牙通讯数据表
	private ArrayList<String> dataMap;
	
	//---------------------------------------------------------------C++ java  本地方法
	//蓝牙sdk初始化
	public native int bleInit();
	
	//获取蓝牙状态
	public native int getBleStatus();
	
	
	//开始搜索蓝牙并连接
	public native void startSearchBle();
	
	//连接主机设备
	public native void connectDevice();
	
	//载入dll库
    static {
        System.loadLibrary("LogitowBleCore");
    }
    
    //库运行入口方法
    public static void main(String[] args) {
    	blesdksta = 0;
    	System.out.println("LogitowBleControl >> bleInit");
    	blesdksta = LogitowBleControl.getInstance().bleInit();
    }
    
    //获取实例方法
    public static LogitowBleControl getInstance()
    {
    	if(_linstance==null)
    	{
    		_linstance = new LogitowBleControl();
    	}
    	return _linstance;
    }
    
    //c++给Java发送通知
    public void sendBleNotification(String _data)  
    {  
    	System.out.println("sendBleNotification >> LogitowBleControl:"+_data);
    	if(dataMap==null)
    	{
    		dataMap = new ArrayList<>();
    	}
    	dataMap.add(_data);
    	/*
    	 * 
    	Message message = new Message();
        Bundle bundle = new Bundle();
        bundle.putInt("a",a);
        message.setData(bundle);
        message.what=1;
        handler.sendMessage(message);
    	if(blesdksta==1)
    	{
    		
    	}
    	*/
    	
    }
    
    //获取蓝牙数据
    public String getBleData()
    {
    	if(dataMap!=null&&dataMap.size()>0)
    	{
    		return dataMap.remove(0);
    	}
    	return "";
    }
    
    //获取当前蓝牙数据长度。
    public int getBleDataSize()
    {
    	if(dataMap!=null&&dataMap.size()>0)
    	{
    		return dataMap.size();
    	}
    	return 0;
    }
    
    
    
}
