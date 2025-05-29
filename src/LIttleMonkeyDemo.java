public class LIttleMonkeyDemo {
    public static void main(String[] args) {
        LittleMonkey t1 = new LittleMonkey();
        t1.fly();
        t1.swim();
    }
}

class Monkey{
    String name;
    public void jump(){
        System.out.println("跳！进染缸！");
    }
}

interface Fish{
    public void swim();
}
interface Bird{
    public void fly();
}
class LittleMonkey extends Monkey implements Fish,Bird{
    @Override
    public void fly() {
        System.out.println("小猴子在飞！");
    }

    @Override
    public void swim() {
        System.out.println("小猴子在游泳！");
    }
}