import java.util.Scanner;

public class Demo2_7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        float a = sc.nextFloat();
        float b = sc.nextFloat();
        System.out.println(a+b);
        System.out.println(a-b);
        System.out.println(a*b);
        if(b==0){
            System.out.println("error!Divide by zero!");
        }
        else {
            System.out.println(a/b);
        }
    }
}
