package Orders;

import java.util.ArrayList;

public class Orders {
    private String name;
    private int id;
    private ArrayList<Goods> goodsArray;
    private double totalPrice;

    public Orders(String name,int id){
        this.id = id;
        this.name = name;
        goodsArray  = new ArrayList<Goods>();
    }

    public ArrayList getGoodsArray()
    {
        return goodsArray;
    }

    public void addGoodstoOrder(Goods aGoods){
        goodsArray.add(aGoods);
        totalPrice += aGoods.getPrice();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public double getTotalPrice() {
        return totalPrice;
    }

    public void setTotalPrice(double totalPrice) {
        this.totalPrice = totalPrice;
    }
}
