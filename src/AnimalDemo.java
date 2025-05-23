public class AnimalDemo {
    public static void main(String[] args){

    }
}

abstract class Animal{
    private String name;
    private int age;

    public abstract void cry();
}
class Cat extends Animal{
    public void cry(){
        System.out.println("这个很开门");
    }
}

class Dog extends Animal{
    public void cry(){
        System.out.println("这个今晚会涨的到时候大家一起收割");
    }
}
