# HalDemo
app获取hal层返回的字符串、hal服务开机自启动....

## 执行环境
- Andorid P
- Android Studio 4.1.2
- gradle 6.1.1
- Android gradle plugin 4.0.0
- JDK 8


## 注意
1. 需要将hello_hidl.tar(hal服务)解压放置于安卓设备上的`hardware/interfaces`或`vendor/<company>/hardware/interfaces`目录下，集成进系统
2. app端未配置selinux权限，因此在安卓设备上执行时，需要现在安卓设备设置为permissive模式（在安卓设备root用户环境下执行`set enforce 0`）