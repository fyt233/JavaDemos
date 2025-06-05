package loginGUI;/*
 * 功能：用户登录界面设计及按钮事件处理
 * 设计步骤：
 * 1.继承JFrame
 * 2.定义组件
 * 3.创建组件
 * 4.设置布局管理，添加组件
 * 5.设置窗体
 * 6.设置可见
       7.事件处理
 */

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;


//用户登录界面
class LoginGUI extends JFrame implements ActionListener {   //1.继承JFrame，实现接口
    //2.声明事件源--定义组件
    private JPanel jp1, jp2, jp3;
    private JLabel jlUser, jlPwd;
    private JButton jbLogin, jbCancel;
    private JTextField jtf;
    private JPasswordField jpf;

    //构造方法，完成初始化
    public LoginGUI() {
        //3.创建组件
        jp1 = new JPanel();
        jp2 = new JPanel();
        jp3 = new JPanel();
        jlUser = new JLabel("用户名");
        jlPwd = new JLabel("密  码");
        jbLogin = new JButton("登录");
        jbCancel = new JButton("取消");
        jtf = new JTextField(10);  //控制宽度，美观
        jpf = new JPasswordField(10);

        //美化界面：设置字体及字体颜色
		//设置字体
        Font font = new Font("楷体",Font.BOLD,18);
        jlUser.setFont(font);
        jlPwd.setFont(font);
        jbLogin.setFont(font);
        jbCancel.setFont(font);

        //设置前景色，字的颜色
        Color color = new Color(0x66CCFF);
        jlUser.setForeground(color);
        jlPwd.setForeground(color);
        jbLogin.setForeground(color);
        jbCancel.setForeground(color);

        //4.设置布局，添加组件
        this.setLayout(new GridLayout(3, 1));
        jp1.add(jlUser);
        jp1.add(jtf);

        jp2.add(jlPwd);
        jp2.add(jpf);

        jp3.add(jbLogin);
        jp3.add(jbCancel);

        //中间容器添加到顶层容器
        this.add(jp1);
        add(jp2);
        add(jp3);

        //注册监听????注册按钮事件源监听按钮事件
        jbLogin.addActionListener(this);
        jbCancel.addActionListener(this);

        //设置图标
        ImageIcon icon = new ImageIcon("src\\loginGUI\\images\\QQ.jpg");
        this.setIconImage(icon.getImage());

        //6.设置窗体
        this.setTitle("用户登录");
        this.setSize(300, 180);
        this.setLocation(400, 400);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setVisible(true);  //设置窗体可见
    }

    //实现接口ActionListener中方法 接收、分派事件
    //当按钮被单击时，actionPerform被调用
    public void actionPerformed(ActionEvent e) {
        //检查是哪一个按钮被单击
        if (e.getSource() == jbLogin) {
            //登录按钮被单击
            if (check() == true) {
                JOptionPane.showMessageDialog(null, "登录成功！\n用户名和密码都正确！", "提示", 1);

            } else {
                JOptionPane.showMessageDialog(null, "登录失败！\n用户名或密码错误！", "提示", 2);
                clear();
            }
        } else {
            if (e.getActionCommand() == "取消") {
                clear();
            }


        }

    }

    //自定义方法
    private boolean check() {
        String userName = "dxxy";
        String userPwd = "admin";
        String user = jtf.getText().trim();
        String pw = String.valueOf(jpf.getPassword()).trim();

        if (user.equals(userName) && pw.equals(userPwd)) {
            return true;
        } else {
            return false;
        }
    }

    private void clear() {
        jtf.setText("");
        jpf.setText("");
    }
}

public class LoginDemo {
    public static void main(String[] args) {
        new LoginGUI();
    }
}