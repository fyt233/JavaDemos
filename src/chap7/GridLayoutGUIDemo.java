package chap7;

import javax.swing.*;
import java.awt.*;
public class GridLayoutGUIDemo {
    public static void main(String[] args){

    }
}
class GridLayoutGUI extends JFrame {
    int size=9;
    JButton[] jbs=new JButton[size];
    public GridLayoutGUI()
    {
        for(int i=0;i<size;i++){
            jbs[i]= new JButton(String.valueOf(i+1));
        }
        this.setLayout(new GridLayout(3,3,10,10));
        for(int i=0;i<jbs.length;i++){
            this.add(jbs[i]);
        }
        this.setTitle("GridLayoutGUI");
        this.setSize(300,300);
        this.setLocation(400,400);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setVisible(true);
    }
}