package homework5;

import java.util.Scanner;

public class Demo5_1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Robot r1 = new Car(sc.next(), sc.nextDouble());
        Robot r2 = new AirCraft(sc.next(), sc.nextDouble());
        System.out.println(r1.getDetails());
        r1.move();
        System.out.println(r2.getDetails());
        r2.move();
        sc.close();
    }
}

abstract class Robot{
    double mass;
    String name;

    public Robot(String name,double mass){
        this.name = name;
        this.mass = mass;
    }
    abstract void move();

    public String getDetails(){
        String info;
        info = "name:" + name + " weight:" + String.format("%.1fKG",mass);
        return info;
    }
}

class Car extends Robot{

    public Car(String name,double mass){
        super(name,mass);
    }
    public void move(){
        System.out.println("I am automobile,I am running on the ground!");
    }

}

class AirCraft extends Robot{

    public AirCraft(String name,double mass){
        super(name,mass);
    }
    public void move(){
        System.out.println("I am aircraft,I am flying in the sky!");
    }
}