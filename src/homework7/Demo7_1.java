package homework7;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

class Calculator extends JFrame implements ActionListener,MouseListener{
    JTextField t1,t2;
    JButton jb;
    JTextArea result;
    JLabel op;

    public Calculator(){
        t1 = new JTextField(2);
        t2 = new JTextField(2);
        jb = new JButton("=");
        result = new JTextArea(1,3);
        op = new JLabel("+");

        setLayout(new FlowLayout());
        add(t1);
        add(op);
        add(t2);
        add(jb);
        add(result);

        jb.addActionListener(this);
        op.addMouseListener(this);

        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(200,100);
        setLocation(300,300);
        setTitle("Simple Calculator");
        setVisible(true);
    }

    public void actionPerformed(ActionEvent e){
        int a = Integer.parseInt(t1.getText());
        int b = Integer.parseInt(t2.getText());
        if(op.getText().equals("+")){
            result.setText(String.valueOf(a+b));
        }else if(op.getText().equals("-")){
            result.setText(String.valueOf(a-b));
        }else if(op.getText().equals("*")){
            result.setText(String.valueOf(a*b));
        }else if(op.getText().equals("/")){
            result.setText(String.valueOf(a/b));
        }
    }

    public void mouseClicked(MouseEvent e){
        if(e.getClickCount()%4==0){
            op.setText("+");
        }else if(e.getClickCount()%4==1){
            op.setText("-");
        }else if(e.getClickCount()%4==2){
            op.setText("*");
        }else if(e.getClickCount()%4==3){
            op.setText("/");
        }
    }
    public void mousePressed(MouseEvent e){}
    public void mouseReleased(MouseEvent e){}
    public void mouseEntered(MouseEvent e){}
    public void mouseExited(MouseEvent e){}
}


public class Demo7_1 {
    public static void main(String[] args) {
        new Calculator();
    }
}
