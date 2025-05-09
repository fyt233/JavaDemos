/*
 *作者：
 *时间：
 *功能：改错：使用switch例－输入学生成绩，输出相应的等级
 */

import java.util.*;

class ScoreSwitchDemo {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        // 给出提示：从控制台读取学生成绩
        System.out.println("请输入学生成绩：");
        String s1 = in.nextLine();  //从控制台读入字符串

        // 把String-->int
        int score = Integer.parseInt(s1);
        System.out.println("成绩为:" + score);

        // 判断成绩等级
        switch (score / 10) {
            case 10:
            case 9:
                System.out.println("优");
                break;
            case 8:
                System.out.println("良");
                break;
            case 7:
                System.out.println("中");
                break;
            case 6:
                System.out.println("及格");
                break;
            case 5:
            case 4:
            case 3:
            case 2:
            case 1:
            case 0:
                System.out.println("不及格");
                break;
            default:
                System.out.println("数据错误，请重新输入！");
        }
        in.close();
    }
}

