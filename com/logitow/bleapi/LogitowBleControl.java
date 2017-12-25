/*
 * 
 * 
 * 
 */
package com.logitow.bleapi;

import java.util.ArrayList;

public class LogitowBleControl {
	
	//--------------------------------------------------------------���Ա���
	//0��ʼ������1��ʼ���ɹ���
	private static int blesdksta;
	
	//��������Ψһʵ��
	private static LogitowBleControl _linstance;
	
	//����ͨѶ���ݱ�
	private ArrayList<String> dataMap;
	
	//---------------------------------------------------------------C++ java  ���ط���
	//����sdk��ʼ��
	public native int bleInit();
	
	//��ȡ����״̬
	public native int getBleStatus();
	
	
	//��ʼ��������������
	public native void startSearchBle();
	
	//���������豸
	public native void connectDevice();
	
	//����dll��
    static {
        System.loadLibrary("LogitowBleCore");
    }
    
    //��������ڷ���
    public static void main(String[] args) {
    	blesdksta = 0;
    	System.out.println("LogitowBleControl >> bleInit");
    	blesdksta = LogitowBleControl.getInstance().bleInit();
    }
    
    //��ȡʵ������
    public static LogitowBleControl getInstance()
    {
    	if(_linstance==null)
    	{
    		_linstance = new LogitowBleControl();
    	}
    	return _linstance;
    }
    
    //c++��Java����֪ͨ
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
    
    //��ȡ��������
    public String getBleData()
    {
    	if(dataMap!=null&&dataMap.size()>0)
    	{
    		return dataMap.remove(0);
    	}
    	return "";
    }
    
    //��ȡ��ǰ�������ݳ��ȡ�
    public int getBleDataSize()
    {
    	if(dataMap!=null&&dataMap.size()>0)
    	{
    		return dataMap.size();
    	}
    	return 0;
    }
    
    
    
}
