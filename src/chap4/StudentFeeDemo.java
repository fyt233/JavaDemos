package chap4;

public class StudentFeeDemo {
    public static void main(String[] args) {
        Student s1 = new Student("张三", 18, 5600);
        s1.join();
        //静态用类名访问
        System.out.println(Student.getTotal());
        System.out.println(Student.getTotalFee());
    }
}

//问题域类   学生类
class Student {
    String name;
    int age;
    float fee;

    //静态成员变量，是类的变量，为本类所有对象共享
    private static int total = 0;
    private static float totalFee = 0;

    //构造方法
    public Student(String name, int age, float fee) {
        this.name = name;
        this.age = age;
        this.fee = fee;
    }

    public void join() {
        total++;
        totalFee += fee;
        System.out.println("学生" + name + "进入排队");
    }

    public static int getTotal() {
        return total;
    }

    public static float getTotalFee() {
        return totalFee;
    }

    public static void setTotal(int total) {
        Student.total = total;
    }

    public static void setTotalFee(float totalFee) {
        Student.totalFee = totalFee;
    }
}