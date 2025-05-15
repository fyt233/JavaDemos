package chap4;

public class PersonDemo {
    public static void main(String[] args) {
        Person p1 = new Person();
        p1.speak();
        int sum=p1.compute();
        System.out.println(sum);
        System.out.println(p1.compute(10));
        System.out.println(p1.compute(12,34));
    }
}

class Person {
    String name;
    int age;

    //方法成员
    public void speak() {
        System.out.println("我们不要学习python");
    }

    public int compute(){
        int sum = 0;
        for(int i=1;i<=100;i++){
            sum+=i;
        }
        return sum;
    }

    public int compute(int n){
        int sum=0;
        for(int i=1;i<=2*n+1;i+=2){
            sum+=i;
        }
        return sum;
    }
    public int compute(int a,int b){
        return a+b;
    }
}