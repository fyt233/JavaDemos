package chap7;

import javax.swing.*;
import java.awt.*;

public class LayoutGUIDemo {
    public static void main(String[] args) {
        new LayoutGUI();
    }
}

class LayoutGUI extends JFrame {
    //    JButton jp1, jp2, jp3, jp4, jp5, jp6;
    JButton[] jbs = new JButton[6];

    public LayoutGUI() {
//        jp1 = new JButton("吴佩孚");
//        jp2 = new JButton("段祺瑞");
//        jp3 = new JButton("张作霖");
//        jp4 = new JButton("阎锡山");
//        jp5 = new JButton("冯玉祥");
//        jp6 = new JButton("冯国璋");

        JPanel j1Panel = new JPanel();
        JPanel j2Panel = new JPanel();//只在构造方法中使用


        String[] names = {"吴佩孚", "段祺瑞", "张作霖", "阎锡山", "冯玉祥", "冯国璋"};

        for (int i = 0; i < jbs.length; i++) {
            jbs[i] = new JButton(names[i]);
        }


        //流式布局
        this.setLayout(new FlowLayout());
        for (int i = 0; i < jbs.length; i++) {
            this.add(jbs[i]);
        }

        j1Panel.add(jbs[0]);
        j1Panel.add(jbs[1]);

        j2Panel.add(jbs[2]);
        j2Panel.add(jbs[3]);
        j2Panel.add(jbs[4]);

        //使用默认布局BoarderLayout
//        this.add(jp1, BorderLayout.CENTER);
//        this.add(jp2, BorderLayout.EAST);
//        this.add(jp3, BorderLayout.SOUTH);
//        this.add(jp4, BorderLayout.WEST);
//        this.add(jp5, BorderLayout.NORTH);
//        this.add(jp6);

        this.add(j1Panel,BorderLayout.NORTH);
        this.add(j2Panel,BorderLayout.SOUTH);

        this.setTitle("选择你的阵营");
        this.setSize(300, 200);
        this.setLocation(400, 400);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        this.setVisible(true);
    }
}
