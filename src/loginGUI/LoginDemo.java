package loginGUI;/*
 * ���ܣ��û���¼������Ƽ���ť�¼�����
 * ��Ʋ��裺
 * 1.�̳�JFrame
 * 2.�������
 * 3.�������
 * 4.���ò��ֹ���������
 * 5.���ô���
 * 6.���ÿɼ�
       7.�¼�����
 */

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;


//�û���¼����
class LoginGUI extends JFrame implements ActionListener {   //1.�̳�JFrame��ʵ�ֽӿ�
    //2.�����¼�Դ--�������
    private JPanel jp1, jp2, jp3;
    private JLabel jlUser, jlPwd;
    private JButton jbLogin, jbCancel;
    private JTextField jtf;
    private JPasswordField jpf;

    //���췽������ɳ�ʼ��
    public LoginGUI() {
        //3.�������
        jp1 = new JPanel();
        jp2 = new JPanel();
        jp3 = new JPanel();
        jlUser = new JLabel("�û���");
        jlPwd = new JLabel("��  ��");
        jbLogin = new JButton("��¼");
        jbCancel = new JButton("ȡ��");
        jtf = new JTextField(10);  //���ƿ�ȣ�����
        jpf = new JPasswordField(10);

        //�������棺�������弰������ɫ
		//��������
        Font font = new Font("����",Font.BOLD,18);
        jlUser.setFont(font);
        jlPwd.setFont(font);
        jbLogin.setFont(font);
        jbCancel.setFont(font);

        //����ǰ��ɫ���ֵ���ɫ
        Color color = new Color(0x66CCFF);
        jlUser.setForeground(color);
        jlPwd.setForeground(color);
        jbLogin.setForeground(color);
        jbCancel.setForeground(color);

        //4.���ò��֣�������
        this.setLayout(new GridLayout(3, 1));
        jp1.add(jlUser);
        jp1.add(jtf);

        jp2.add(jlPwd);
        jp2.add(jpf);

        jp3.add(jbLogin);
        jp3.add(jbCancel);

        //�м�������ӵ���������
        this.add(jp1);
        add(jp2);
        add(jp3);

        //ע�����????ע�ᰴť�¼�Դ������ť�¼�
        jbLogin.addActionListener(this);
        jbCancel.addActionListener(this);

        //����ͼ��
        ImageIcon icon = new ImageIcon("src\\loginGUI\\images\\QQ.jpg");
        this.setIconImage(icon.getImage());

        //6.���ô���
        this.setTitle("�û���¼");
        this.setSize(300, 180);
        this.setLocation(400, 400);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setVisible(true);  //���ô���ɼ�
    }

    //ʵ�ֽӿ�ActionListener�з��� ���ա������¼�
    //����ť������ʱ��actionPerform������
    public void actionPerformed(ActionEvent e) {
        //�������һ����ť������
        if (e.getSource() == jbLogin) {
            //��¼��ť������
            if (check() == true) {
                JOptionPane.showMessageDialog(null, "��¼�ɹ���\n�û��������붼��ȷ��", "��ʾ", 1);

            } else {
                JOptionPane.showMessageDialog(null, "��¼ʧ�ܣ�\n�û������������", "��ʾ", 2);
                clear();
            }
        } else {
            if (e.getActionCommand() == "ȡ��") {
                clear();
            }


        }

    }

    //�Զ��巽��
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