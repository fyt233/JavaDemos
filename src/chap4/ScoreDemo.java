package chap4;

import java.util.Scanner;

public class ScoreDemo {
    public static void main(String[] args) {
        Score sc1 = new Score(78,90,98,70);
        sc1.english = 90;
        sc1.setJava(95);
        sc1.showTotalScore();


        System.out.println(sc1.getDetails());


        Score sc2 = new Score();

        //从键盘输入数据再创建对象
        Scanner in = new Scanner(System.in);
        //方法一
        int a = in.nextInt();
        int b = in.nextInt();
        int c = in.nextInt();
        int d = in.nextInt();
        Score sc3= new Score(a,b,c,d);

        //方法二
        Score sc4 = new Score(in.nextInt(),in.nextInt(),in.nextInt(),in.nextInt());
        System.out.println(sc4.getDetails());
    }
}


class Score {
    int english;
    private int cLanguage;
    private int java;
    private int advancedMath;

    //标准方法
    public int getEnglish() {
        return english;
    }

    public void setEnglish(int english) {
        this.english = english;
    }

    public int getcLanguage() {
        return cLanguage;
    }

    public void setcLanguage(int cLanguage) {
        this.cLanguage = cLanguage;
    }

    public int getJava() {
        return java;
    }

    public void setJava(int java) {
        this.java = java;
    }

    public int getAdvancedMath() {
        return advancedMath;
    }

    public void setAdvancedMath(int advancedMath) {
        this.advancedMath = advancedMath;
    }

    //自定义方法
    public int calTotalScore(){
        return english+cLanguage+java+advancedMath;
    }
    public double calAvg(){
        return calTotalScore()/4.0;
    }

    public void showTotalScore(){
        System.out.println("总分："+calTotalScore());
    }
    public void showAvg(){
        System.out.println("平均分："+calAvg());
    }

    //构造方法
    public Score(int english,int cLanguage,int java,int advancedMath){
        this.english = english;
        this.cLanguage = cLanguage;
        this.java = java;
        this.advancedMath = advancedMath;
    }

    //无参构造
    public Score(){}


    public Score(int english){
        this.english=english;
    }


    //将问题域类中的成员组成一个长字符串
    //将问题域类与外部类隔离
    public String getDetails(){
        String info=null;
        info="英语："+english+"\nC语言："+getcLanguage()+"\nJava："+getJava()+"\n高数："+getAdvancedMath();
        return info;
    }
}
