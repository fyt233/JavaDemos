package homework5.Demo5_3;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc  = new Scanner(System.in);
        Charge c = new Car(sc.next(),sc.nextDouble(),sc.nextInt());
        System.out.print(c.addPower());
        System.out.print(c.disCharge());
        Charge d = new Computer(sc.next(),sc.nextInt(),sc.nextDouble());
        System.out.print(d.addPower());
        System.out.print(d.disCharge());
        sc.close();
    }
}
