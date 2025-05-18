import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Demo3_3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] a = new int[10];
        for (int i = 0; i < 10; i++) {
            a[i] = sc.nextInt();
        }
        System.out.println(Arrays.toString(a));
        int[] b = Arrays.copyOf(a, 10);
        System.out.println(Arrays.toString(b));
        int [] c = Arrays.copyOf(a,6);
        System.out.println(Arrays.toString(c));
        int[] d = Arrays.copyOfRange(a,5,10);
        d[4]=-100;
        System.out.println(Arrays.toString(d));
        sc.close();
    }
}
