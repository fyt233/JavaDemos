package homework3;

import java.util.Random;
import java.util.Scanner;

public class Demo3_1 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        String stu[][]={
                { "10905100", "Tanlinlin" },{ "10905101", "Chenyixing" },
                { "10905102", "Sunsimiao" },{ "10905103", "Zhangwuji" },
                { "10905104", "Lichunfeng" },{ "10905105", "Wangfeifei" },
                { "10905106", "Qianliuyi" },{ "10905107", "Shenqiqi" },
                { "10905108", "Yangtianyi" },{ "10905109", "Xiaozhan" }
        };
        int n= sc.nextInt();
        Random rd = new Random(n);
        sc.nextLine();
//        System.out.println(stu[7][0]+stu[7][1]);
        while(true){
            if(sc.nextLine().equals("e")){
                break;
            }
            else{
//                System.out.println(rd.nextInt(10));
                int i = rd.nextInt(10);
                System.out.println(stu[i][0]+" "+stu[i][1]);
            }
        }
        sc.close();
    }
}
