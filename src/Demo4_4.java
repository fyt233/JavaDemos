import java.util.Scanner;

public class Demo4_4 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Before objects creation,number of Student:"+Students.getTotal());

        Students s1 = new Students();
        Students s2 = new Students(sc.next(),sc.next(),sc.nextInt(),sc.nextInt(),sc.nextInt());

        System.out.println(s1.toString());
        System.out.println(s2.toString());

        System.out.println("After objects creation,number of Student:"+Students.getTotal());

        sc.close();
    }
}

class Students{
    private String name="unknown";
    private String id="unknown";
    private int score1=0;
    private int score2=0;
    private int score3=0;
    private static int total=0;

    public static int getTotal() {
        return total;
    }

    public Students(){
        total++;
    }
    public Students(String id,String name,int score1,int score2,int score3){
        this.name=name;
        this.id=id;
        this.score1=score1;
        this.score2=score2;
        this.score3=score3;
        total++;
    }


    public double getAvg(){
        return (score1+score2+score3)/3.0;
    }

    public String toString(){
        String temp;
        temp=String.format("stuNo:%s\nname:%s\nmath:%d\nenglish:%d\njava:%d\ntotal:%d\navg:%.2f",id,name,score1,score2,score3,score1+score2+score3,getAvg());
        return temp;
    }
}
