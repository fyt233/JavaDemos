import java.util.Scanner;

public class Demo4_2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Stock s1 = new Stock("600029","nanfanghangkong",sc.nextDouble(),sc.nextDouble());
        Stock s2 = new Stock(sc.next(),sc.next(),sc.nextDouble(),sc.nextDouble());

        System.out.println("the first:\n"+s1.getDetails());
        System.out.println("the second:\n"+s2.getDetails());
        sc.close();

    }
}

class Stock {
    private String symbol;
    private String name;
    private double previousClosingPrice;
    private double currentPrice;



    public Stock(String symbol, String name, double previousClosingPrice, double currentPrice){
        this.symbol = symbol;
        this.name = name;
        this.previousClosingPrice = previousClosingPrice;
        this.currentPrice = currentPrice;
    }

    public double getChangePercent(){
        return (currentPrice - previousClosingPrice) / previousClosingPrice;
    }
    public String getDetails(){
        String t;
//        t = String.format("Symbol:%s\nName:%s\nPreviousClosingPrice:%.2f\nCurrentPrice:%2f\namount of increase:%.2f%%",symbol,name,previousClosingPrice,currentPrice,getChangePercent()*100);
        t="Symbol:"+symbol+"\nName:"+name+"\nPreviousClosingPrice:"+previousClosingPrice+"\nCurrentPrice:"+currentPrice+"\namount of increase:"+String.format("%.2f%%",getChangePercent()*100);
        return t;
    }

}
