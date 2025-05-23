package homework5.Demo5_2;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double a = sc.nextDouble();
        double b = sc.nextDouble();
        ConstructionBank cb = new ConstructionBank(a, b);
        System.out.printf("%.2f\n", cb.computeInterest());
//        System.out.println(cb.getDay());
        BankOfDalian bd = new BankOfDalian(a, b);
        System.out.printf("%.2f\n", bd.computeInterest());
        System.out.printf("%.2f",bd.computeInterest()-cb.computeInterest());
    }
}
