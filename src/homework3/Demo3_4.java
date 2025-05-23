package homework3;

import java.util.ArrayList;
import java.util.Scanner;

public class Demo3_4 {
    public static void main(String[] args) {
        Scanner sc  = new Scanner(System.in);
        ArrayList <String> list = new ArrayList<String>();
        int n = sc.nextInt();
        for(int i=0;i<n;i++){
            list.add(sc.next());
        }
        //输出
        System.out.println("Content of ArrayList:"+list.toString());
        System.out.println("Size of ArrayList:"+list.size());
        list.add(3, sc.next());
        System.out.println("Content of ArrayList:"+list.toString());
        System.out.println("Size of ArrayList:"+list.size());
        list.remove(1);
        System.out.println("Content of ArrayList:"+list.toString());
        System.out.println("Size of ArrayList:"+list.size());

        sc.close();
    }
}
