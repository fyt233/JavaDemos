package homework3;

import java.util.Random;
import java.util.Scanner;

public class Demo3_2 {
    public static void main(String[] args) {
        boolean red[]= new boolean[34];
        boolean blue[] = new boolean[17];
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        Random rd = new Random(n);
        for(int i=0;i<6;i++){
            int j=rd.nextInt(33);
            if(red[j]==true){
                i--;
                continue;
            }
            red[j]=true;
        }
        blue[rd.nextInt(16)]=true;
        for(int i=0;i<33;i++){
            if(red[i]){
                System.out.printf("%02d ",i+1);
            }
        }
        System.out.println();
        for(int i=0;i<16;i++){
            if(blue[i]){
                System.out.printf("%02d",i+1);
                break;
            }
        }
    }
}
