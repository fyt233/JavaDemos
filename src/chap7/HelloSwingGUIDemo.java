package chap7;
/*
设计步骤：
1、继承自JFrame
2、定义组件
3、创建组件
4、设置布局管理，添加组件
5、设置窗体
6、显示窗体
7、注册事件监听
 */
import javax.swing.*;
import java.awt.*;

class HelloSwingGUI extends JFrame {//1、继承自JFrame
    //2、定义组件
    JLabel messageLab;//定义标签
    JTextField messageTxt;//定义文本框
    JButton okBtn;//定义按钮

    //构造方法
    public HelloSwingGUI() {
        //3、创建组件
        messageLab = new JLabel("输入你的4399账号:");
        messageTxt = new JTextField(10);
        okBtn = new JButton("开始刷点券");

        //4、设置布局管理————流式布局
        this.setLayout(new FlowLayout());
        //添加组件
        this.add(messageLab);
        this.add(messageTxt);
        this.add(okBtn);

        //5、设置窗体
        this.setSize(300,100);
        this.setLocation(400,400);
        this.setTitle("欢迎来到生死狙击");
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        //6、显示窗体
        this.setVisible(true);
    }
}
public class HelloSwingGUIDemo {
    public static void main(String[] args) {
        new  HelloSwingGUI();
    }
}
