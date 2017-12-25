Logitow蓝牙通讯sdk(window)beta version 0.0.1

**环境要求：**

1. win8,win10 64位系统
2. 电脑拥有蓝牙功能，或者使用外设蓝牙设备。
3. sdk依赖dll(C:\Windows\SysWOW64)如图一。
4. java环境配置 jdk1.8.0_131 (参考：https://www.cnblogs.com/smyhvae/p/3788534.html)

**开发工具**

1.eclips luna
2.vs2017

**通讯方式**

java与C++通过jni通讯

接口类待完善：

单例管理类
	LogitowBleControl.java
	
	
 	LogitowBleControl.main(null);    
	LogitowBleControl.getInstance().bleInit();
    LogitowBleControl.getInstance().startSearchBle();


**设备准备**

1. 打开主机积木电源。
2. windows蓝牙设置界面，添加蓝牙设备。
3. 识别蓝牙设备Logitow.点击连接设备。
4. mod中调用以上接口类代码。

**MC-Mod开发dll使用**
	
>1.选中java项目,查看项目属性
>
>2.选中JavaBuildPath,点击Libraries标签
>
>3.点击展开JRE System Library结构
>
>4.选中本地库选项（Native library location）
>
>5.双击此项并设置自己的dll库所在位置目录即可	

--------------------En-----------------------------

Logitow Bluetooth communication sdk(windows)beta version 0.0.1

**Environmental Requirements**

1. win8,win10 （64-bit system）
2. The computer has a Bluetooth function, or use a peripheral Bluetooth device
3. sdk depends on dll（C:\Windows\SysWOW64）E.g 图一。
4. java Environmental configuration jdk1.8.0_131 (参考：https://www.cnblogs.com/smyhvae/p/3788534.html)

**Dev Tools**
1.eclips luna
2.vs2017

**Communication Method**

java and C ++ through jni communication

Interface class (to be perfect)：

singleton pattern:

	LogitowBleControl.java
	
 	LogitowBleControl.main(null);    
	LogitowBleControl.getInstance().bleInit();
    LogitowBleControl.getInstance().startSearchBle();

**Equipment Preparation**
1.Open the main building block power supply
2.windows bluetooth settings interface, add bluetooth device
3.Identify Bluetooth devices Logitow. Click Connect Devices
4.mod to call the above interface class code

**MC-Mod development dll use**

>1.Check the java project, view the project properties
>
>2.Select JavaBuildPath, click the Libraries tab
>
>3.Click to expand the JRE System Library structure
>
>4.Select Local Library Options（Native library location）
>
>5.Double-click this item and set your own dll library where the directory can be
