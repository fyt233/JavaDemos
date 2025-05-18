import java.util.Scanner;

public class Demo4_1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Circle c1 = new Circle(sc.nextDouble());
        System.out.printf("%.3f\n",c1.getS());
        System.out.printf("%.3f",c1.getC());
        sc.close();
    }
}

class Circle{
    private double r;

    public Circle(double r){
        this.r = r;
    }

    public double getS(){
        return Math.PI*r*r;
    }

    public double getC(){
        return 2*Math.PI*r;
    }
}