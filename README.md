Logitow蓝牙通讯sdk(window)

环境要求：

1. win8-win10 64位系统
2. sdk依赖dll(C:\Windows\SysWOW64)如图一。

通讯方式：

java与C++通过jni通讯

接口类待完善：
单例管理类
	LogitowBleControl.java
	
	
 	LogitowBleControl.main(null);    
	LogitowBleControl.getInstance().bleInit();
    LogitowBleControl.getInstance().startSearchBle();


设备准备：

1. 打开主机积木电源。
2. windows蓝牙设置界面，添加蓝牙设备。
3. 识别蓝牙设备Logitow.点击连接设备。
4. mod中调用接口类代码。
	