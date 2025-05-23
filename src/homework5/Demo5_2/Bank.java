package homework5.Demo5_2;

/*
银行类 Bank有属性：savedMoney、year(只能取整数)、interest、interestRate=0.035(固定值，可定义为final变量成员)
有方法：computeInterest( )，按整年计算利息，计算方法为：year*0.035*savedMoney。
Bank的子类建设银行ConstructionBank和大连银行BankOfDalian，隐藏继承的变量成员year，并重写计算利息的方法，
即在子类中声明一个double型的变量year。当year取值为5.216时，表示计算5年216天的利息。
建设银行或大连银行把5.216的整数部分赋给隐藏的year，并用super调用Bank类中计算利息的方法，求出5年的利息，
再按自己的方法计算216天的利息。存期利息 = 年利息+日利息。
建设银行计算日利息的方法：day*0.0001*savedMoney，大连银行计算日利息的方法：day*0.00012*savedMoney.
定义测试类，从键盘输入存款金额和存期year(double型)，调用带参构造方法分别创建两个银行对象，
计算两银行的利息差额（大连银行-建设银行）。结果保留2位小数。
 */
public class Bank {
    private double savedMoney;
    private int year;
    private double interest;
    private final double interestRate = 0.035;

    public Bank(double savedMoney) {
        this.savedMoney = savedMoney;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public double getSavedMoney() {
        return savedMoney;
    }

    public double computeInterest() {
        return year * interestRate * savedMoney;
    }
}

class ConstructionBank extends Bank {
    private double year;
    private int day;

    public ConstructionBank(double savedMoney, double year) {
        super(savedMoney);
        this.year = year;
        super.setYear((int) Math.floor(year));
        this.day = (int) ((year - Math.floor(year)) * 1000);
    }

    public int getDay() {
        return day;
    }

    public double computeInterest() {
        return super.computeInterest() + day * 0.0001 * super.getSavedMoney();
    }
}

class BankOfDalian extends Bank {
    private double year;
    private int day;

    public BankOfDalian(double savedMoney, double year) {
        super(savedMoney);
        this.year = year;
        super.setYear((int) Math.floor(year));
        this.day = (int) ((year - Math.floor(year)) * 1000);
    }
    public double computeInterest() {
        return super.computeInterest() + day * 0.00012 * super.getSavedMoney();
    }
}