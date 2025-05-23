package homework2;

import java.util.Scanner;

public class Demo2_1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        sc.close();
        for (int i = a; i < 999; i++) {
            int a100,a10,a1;
            a100=i/100;
            a10=i%100/10;
            a1=i%10;
            if(Math.pow(a100,3)+Math.pow(a10,3)+Math.pow(a1,3)==i){
                System.out.print(i+" ");
            }
        }
    }
}
