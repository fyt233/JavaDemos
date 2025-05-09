
import java.util.Scanner;

public class Demo2_4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.close();
        int sum = 0;
        for (int i = 0; i < n; i++) {
            String s = sc.next();
            sum += h2D(s);
        }
        System.out.println(sum);
    }

    public static int h2D(String s) {
        int sum = 0;
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            int d;
            if (c >= '0' && c <= '9') {
                d = c - '0';
            } else {
                d = c - 'A' + 10;
            }
            sum = sum * 16 + d;
            //从上一位到下一位依次计算
        }
        return sum;
    }
}