public class interfaceDemo {
    public static void main(String[] args) {
        //创建一台电脑
        Computer aComputer = new Computer();
        //创建一台相机
        Camera aCamera = new Camera();
        aComputer.useUsb(aCamera);
        aComputer.useUsb(new Phone());

        Usb aUsb = new Phone();
    }
}

//定义接口
interface Usb{
    //两个方法
    //开始工作
    public void start();
    //结束工作
    public void stop();
}

//相机类
//重要原则：当一个类实现一个接口时，要求将这个接口的所有方法都实现
class Camera implements Usb{
    public void start(){
        System.out.println("相机开始工作");
    }
    public void stop(){
        System.out.println("相机结束工作");
    }
}

class Phone implements Usb{
    public void start(){
        System.out.println("手机开始工作");
    }
    public void stop(){
        System.out.println("手机结束工作");
    }
}


//计算机类
class Computer{
    //开始使用USB接口
    public void useUsb(Usb aUsb){
        aUsb.start();
        aUsb.stop();
    }
}
