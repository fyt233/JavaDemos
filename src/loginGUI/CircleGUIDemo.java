package loginGUI;

import java.awt.FlowLayout;
import java.awt.event.*;
import javax.swing.*;
/*
 * ���ܣ������������û�������Ľ���
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

    //���toString()

    public String toString() {
        String info = null;
        info = "Բ�İ뾶��" + radius + "\nԲ���ܳ���" + String.format("%.2f", calGirth()) + "\nԲ�������" + String.format("%.2f", calArea());
        return info;
    }
}

class CircleGUI extends JFrame implements ActionListener {
    Circle aCircle;  //���������������

    //�������
    JLabel messageLab;
    JTextField messageText;
    JButton calBtn, closeBtn;
    JTextArea resultText;

    JPanel centerPanel;
    JScrollPane jsp;//��������

    //���췽��
    public CircleGUI() {
        messageLab = new JLabel("����Բ�İ뾶��");
        messageText = new JTextField(5);
        calBtn = new JButton("����");
        closeBtn = new JButton("�رմ���");
        resultText = new JTextArea("��������", 3, 20);

        //resultText.setEditable(false);

        jsp = new JScrollPane(resultText);
        centerPanel = new JPanel();//Ĭ��Ϊ��ʽ����

        //���ò��ֹ���������
        this.setLayout(new FlowLayout());

        centerPanel.add(messageLab);
        centerPanel.add(messageText);
        centerPanel.add(calBtn);
        centerPanel.add(closeBtn);

        this.add(centerPanel);
        this.add(jsp);

        //ע���¼�Դ��������
        calBtn.addActionListener(this);
        closeBtn.addActionListener(this);

        this.setTitle("����Բ��������ܳ�");
        this.setSize(360, 170);
        this.setLocation(400, 400);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setVisible(true);
    }

    //����ʵ�֣�ʵ�ֽӿ�ActionListener�еķ���
    public void actionPerformed(ActionEvent e) {
        //�ж��¼�Դ�Ƿ���"����"��ť
        if (e.getSource() == calBtn) {
            calculate();  //���ñ��෽��������������ܳ�����ʾ
        } else if (e.getActionCommand() == "�رմ���") {
            shutDown();   //System.exit(0);
        }
    }

    //�Զ��巽��������ť"����"�¼��ķ���
    private void calculate() {
        String strRadius = messageText.getText();
        //����û�û���������ݣ��򵯳��Ի�����ʾ����뾶
        if (strRadius.length() == 0) {
            JOptionPane.showMessageDialog(null, "������뾶��", "��ʾ", 2);
        } else {
            //�뾶ת��Ϊ����
            double radius = Integer.parseInt(strRadius);
            //���������������ʵ��
            aCircle = new Circle(radius);

            //���ı�������ʾ���
            resultText.setText("��������\n"+aCircle.toString());
        }
    }

    //�Զ��巽�����ر�
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