//用借口实现多态
public class CarShopDemo {
    public static void main(String[] args) {
        CarShop aCarShop = new CarShop();
        aCarShop.sellCar(new BMW());
        System.out.println("收入："+aCarShop.getIncome());
        aCarShop.sellCar(new Xiaomi());
        System.out.println("收入："+aCarShop.getIncome());
    }
}

//汽车接口
interface Car{
    String getName();
    int getPrice();
}

//BMW
class BMW implements Car{
    public String getName(){
        return "BMW";
    }
    public int getPrice(){
        return 300000;
    }
}

//Xiaomi
class Xiaomi implements Car{
    public String getName(){
        return "Xiaomi SU7";
    }
    public int getPrice(){
        return 299900;
    }
}

class CarShop{
    private int income=0;
    //卖车
    public void sellCar(Car aCar){
        income += aCar.getPrice();
        System.out.println("卖了一辆"+aCar.getName()+"，收入"+aCar.getPrice());
    }

    public int getIncome() {
        return income;
    }

    public void setIncome(int income) {
        this.income = income;
    }
}
