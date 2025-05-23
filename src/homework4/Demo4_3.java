package homework4;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Scanner;


public class Demo4_3{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int id = sc.nextInt();
        double balance = sc.nextDouble();
        double rate = sc.nextDouble();
        Account a = new Account(id,balance,rate);
        Calendar date=Calendar.getInstance();
        date.set(2021,Calendar.MARCH,18,9,30,30);
        a.setDate(date);
        a.setAmount(3000.0);
        System.out.println("the first:");
        System.out.println(a.getDetails());
        System.out.println(a.withdraw());
        System.out.println(a.getDetails());

        System.out.println();
        System.out.println("the second:");
        Account b = new Account();

        date.set(2021,Calendar.MARCH,18,15,04,15);
        b.setDate(date);

        System.out.println(b.getDetails());
        b.setRate(0.025);
        b.setAmount(2500);
        b.deposit();
        System.out.println("deposit:"+b.getAmount());
        System.out.println(b.getDetails());
        sc.close();
    }

}

class Account{
    private int id;
    private double balance;
    private double rate;
    private Calendar date;

    public Calendar getDate() {
        return date;
    }

    public void setDate(Calendar date){
        this.date=date;
    }

    private double amount;

    public void setAmount(double amount) {
        this.amount = amount;
    }
    public double getAmount() {
        return amount;
    }

    public Account(){
        id = 0;
        balance = 0;
        rate = 0;
        date =Calendar.getInstance();
        date.setTimeInMillis(0);
    }
    public Account(int id,double balance,double rate){
        this.id = id;
        this.balance = balance;
        this.rate = rate;
    }
    //操作
    public String withdraw(){
        if(balance >= amount){
            balance -= amount;
            return String.format("withdraw:%.1f", amount);
        }
        else{
            return String.format("withdraw:%.1f The balance of account is insufficient!", amount);
        }
    }

    public void deposit(){
        balance += amount;
    }

    public String getDetails(){
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
        String formattedDate = sdf.format(date.getTime());
        return String.format("account:%d\nbalance:%.1f\nrate:%.1f%%\ndate:%s", id,balance,rate*100,formattedDate);
    }




    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public double getRate() {
        return rate;
    }

    public void setRate(double rate) {
        this.rate = rate;
    }
}