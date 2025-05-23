package homework5.Demo5_3;

abstract class Charge {
    private final int input = 220;
    private String name;
    public Charge(String name) {
        this.name = name;
    }
    public String getName() {
        return name;
    }
    abstract String addPower();
    abstract String disCharge();
    public int getInput() {
        return input;
    }
}

class Car extends Charge {
//    private String name;
    private double charge;
    private int discharge;
    public Car(String name, double charge,int discharge) {
        super(name);
        this.charge = charge;
        this.discharge = discharge;
    }
    public String addPower() {
        String info=null;
        info="name:"+super.getName()+" vehicle,I am charging...\n"+"input voltage:"+super.getInput()+"V charging voltage:"+String.format("%.1f",charge)+"V\n";
        return info;
    }

    public String disCharge() {
        String info=null;
        info="name:"+super.getName()+" vehicle,I will discharge "+discharge+" degrees,I am discharging...\n";
        return info;
    }
}


class Computer extends Charge{
    private int charge;
    private double discharge;
    public Computer(String name, int charge,double discharge) {
        super(name);
        this.charge = charge;
        this.discharge = discharge;
    }

    public String addPower() {
        String info=null;
        info="name:"+super.getName()+" notebook,I am charging...\n"+"input voltage:"+super.getInput()+"V charging power:"+charge+"W\n";
        return info;
    }

    public String disCharge() {
        String info=null;
        info="name:"+super.getName()+" notebook,I will discharge.\n"+"Discharge voltage:"+discharge+"V,I am discharging...";
        return info;
    }
}