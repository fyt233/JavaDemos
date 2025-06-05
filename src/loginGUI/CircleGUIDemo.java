package loginGUI;

import java.awt.FlowLayout;
import java.awt.event.*;
import javax.swing.*;
/*
 * 功能：问题域类与用户界面类的交互
 */


class Circle {
    private double radius;

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public Circle(double radius) {
        this.radius = radius;
    }

    public Circle() {
    }


    public double calArea() {
        return Math.PI * radius * radius;
    }

    public double calGirth() {
        return 2 * Math.PI * radius;
    }

    //添加toString()

    public String toString() {
        String info = null;
        info = "圆的半径：" + radius + "\n圆的周长：" + String.format("%.2f", calGirth()) + "\n圆的面积：" + String.format("%.2f", calArea());
        return info;
    }
}

class CircleGUI extends JFrame implements ActionListener {
    Circle aCircle;  //定义问题域类对象

    //定义组件
    JLabel messageLab;
    JTextField messageText;
    JButton calBtn, closeBtn;
    JTextArea resultText;

    JPanel centerPanel;
    JScrollPane jsp;//滚动窗格

    //构造方法
    public CircleGUI() {
        messageLab = new JLabel("输入圆的半径：");
        messageText = new JTextField(5);
        calBtn = new JButton("计算");
        closeBtn = new JButton("关闭窗口");
        resultText = new JTextArea("计算结果：", 3, 20);

        //resultText.setEditable(false);

        jsp = new JScrollPane(resultText);
        centerPanel = new JPanel();//默认为流式布局

        //设置布局管理，添加组件
        this.setLayout(new FlowLayout());

        centerPanel.add(messageLab);
        centerPanel.add(messageText);
        centerPanel.add(calBtn);
        centerPanel.add(closeBtn);

        this.add(centerPanel);
        this.add(jsp);

        //注册事件源到监听器
        calBtn.addActionListener(this);
        closeBtn.addActionListener(this);

        this.setTitle("计算圆的面积和周长");
        this.setSize(360, 170);
        this.setLocation(400, 400);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setVisible(true);
    }

    //方法实现：实现接口ActionListener中的方法
    public void actionPerformed(ActionEvent e) {
        //判断事件源是否是"计算"按钮
        if (e.getSource() == calBtn) {
            calculate();  //调用本类方法，计算面积和周长并显示
        } else if (e.getActionCommand() == "关闭窗口") {
            shutDown();   //System.exit(0);
        }
    }

    //自定义方法，处理按钮"计算"事件的方法
    private void calculate() {
        String strRadius = messageText.getText();
        //如果用户没有输入数据，则弹出对话框提示输入半径
        if (strRadius.length() == 0) {
            JOptionPane.showMessageDialog(null, "请输入半径！", "提示", 2);
        } else {
            //半径转换为整型
            double radius = Integer.parseInt(strRadius);
            //创建问题域类对象实例
            aCircle = new Circle(radius);

            //在文本区域显示结果
            resultText.setText("计算结果：\n"+aCircle.toString());
        }
    }

    //自定义方法：关闭
    public void shutDown() {
        System.exit(0);
    }
}

public class CircleGUIDemo {
    public static void main(String[] args) {
        // TODO Auto-generated method stub
        new CircleGUI();
    }
}