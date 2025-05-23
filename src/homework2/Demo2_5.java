package homework2;

import java.util.Scanner;

//约瑟夫环

public class Demo2_5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n];
        sc.close();
        int p = -1;
        for (int i = 0; i < n - 1; i++) {
            for(int j=0;j<3;j++){
                p++;
                p%=n;
                while (a[p] == 1) {
                    p++;
                    if(p==n){
                        p=0;
                    }
                }

            }
            a[p] = 1;


        }
        for (int i = 0; i < n; i++) {
            if (a[i] == 0) {

                    System.out.println(i+1);


            }
        }

    }

}
