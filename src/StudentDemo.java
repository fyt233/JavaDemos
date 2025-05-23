public class StudentDemo {
    public static void main(String[] args) {
        Pupil p1 = new Pupil("张飞",7);
        p1.pay(124);
        System.out.println(p1.toString());
        ColStu c1 = new ColStu("赵云",20,"电子信息工程",3.9f);
        c1.pay(5600);
        System.out.println(c1.toString());
    }
}

//定义父类Student，将学生共同属性和行为提取出来放在父类中
class
Student {
    private String name;
    private int age;
    private float fee;


    public String toString() {
        String info = null;
        info = "姓名：" + name + " 年龄：" + age + " 学费：" + fee;
        return info;
    }

    public Student(String name, int age) {
        this.name = name;
        this.age = age;
//        this.fee = fee;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public float getFee() {
        return fee;
    }

    public void setFee(float fee) {
        this.fee = fee;
    }

    public Student(){}
}



class Pupil extends Student {


    public Pupil(String name, int age) {
        super(name,age);
    }

    public void pay(float fee) {
        setFee(fee);
    }


}


class MiddleStu extends Student{

    public MiddleStu(String name, int age) {
        super(name,age);
    }
    public MiddleStu() {}
    public void pay(float fee) {
//        this.fee = fee * 0.9f;

        setFee(fee * 0.9f);
    }

}


class ColStu extends Student{
    //增加数据成员
    String major;
    float gpa;

    public ColStu(String name,int age,String major,float gpa){
        super(name,age);
        this.major = major;
        this.gpa = gpa;
    }


    public void pay(float fee){
        if(gpa>=3.9){
            setFee(fee*0.65f);
        }
        else{
            setFee(fee*0.8f);
        }
    }

    public String toString(){
        String info = super.toString() + " 专业："+getMajor() + " gpa："+getGpa();
        return info;
    }

    public String getMajor() {
        return major;
    }

    public void setMajor(String major) {
        this.major = major;
    }

    public float getGpa() {
        return gpa;
    }

    public void setGpa(float gpa) {
        this.gpa = gpa;
    }
}