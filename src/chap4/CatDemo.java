package chap4;

//用面向对象方法找小猫
//主类：测试类
public class CatDemo {
    public static void main(String[] args) {
        //创建第一个对象
        Cat cat1 = new Cat();
        cat1.name = "小白";
        cat1.color = "白色";
        cat1.age = 3;
        Cat cat2 = new Cat();
        cat2.name = "小花";
        cat2.color = "花色";
        cat2.age = 10;
    }
}

//问题域类
class Cat {
    String name;
    String color;
    int age;
    Master myMaster;
}
class Master{
    String name;
    String address;
    int age;
}
