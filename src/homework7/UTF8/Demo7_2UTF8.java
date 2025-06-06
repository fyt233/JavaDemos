package homework7.UTF8;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

class Student {
    private String name;
    private int yy, mm, dd;

    public Student(String name, int yy, int mm, int dd) {
        this.name = name;
        this.yy = yy;
        this.mm = mm;
        this.dd = dd;
    }

    public int getAge() {
        return 2025 - yy;
    }
}

class GUI extends JFrame implements ActionListener{
    JLabel name, year, month, day, age, born;
    JTextField nameText, yearText, monthText, dayText;
    JButton ojbk, cancel;
    JTextArea Age;
    JScrollPane scroll;

    public GUI() {
        name = new JLabel("姓名");
        born = new JLabel("出生年月");
        year = new JLabel("年");
        month = new JLabel("月");
        day = new JLabel("日");
        age = new JLabel("年龄为");
        ojbk = new JButton("确定");
        cancel = new JButton("取消");
        nameText = new JTextField(20);
        yearText = new JTextField(4);
        monthText = new JTextField(4);
        dayText = new JTextField(4);
        Age = new JTextArea(3, 20);
        scroll  = new JScrollPane(Age);


        Font font = new Font("微软雅黑",Font.BOLD,14);

        JPanel p1 = new JPanel();
        p1.add(name);
        p1.add(nameText);
        JPanel p2 = new JPanel();
        p2.add(born);
        p2.add(yearText);
        p2.add(year);
        p2.add(monthText);
        p2.add(month);
        p2.add(dayText);
        p2.add(day);
        JPanel p3 = new JPanel();
        p3.add(age);
        p3.add(scroll);
        JPanel p4 = new JPanel();
        p4.add(ojbk);
        p4.add(cancel);
        JPanel p5 = new JPanel();
        p5.setLayout(new BorderLayout());
        p5.add(p2,BorderLayout.NORTH);
        p5.add(p3,BorderLayout.SOUTH);

        this.setLayout(new BorderLayout());
        this.add(p1,BorderLayout.NORTH);
        this.add(p5,BorderLayout.CENTER);
        this.add(p4,BorderLayout.SOUTH);

        ojbk.addActionListener(this);
        cancel.addActionListener(this);

        setSize(300,200);
        setLocation(300,300);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
    }

    public void actionPerformed(ActionEvent e) {
        if(e.getSource()==ojbk){
            Student s = new Student(nameText.getText(),Integer.parseInt(yearText.getText()),Integer.parseInt(monthText.getText()),Integer.parseInt(dayText.getText()));
            Age.setText(Integer.toString(s.getAge()));
        }
        else if(e.getSource()==cancel){
            nameText.setText("");
            yearText.setText("");
            monthText.setText("");
            dayText.setText("");
            Age.setText("");
        }
    }
}

public class Demo7_2UTF8 {
    public static void main(String[] args) {
        new GUI();
    }
}
