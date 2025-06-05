package Orders;

public class Goods {
    private String thing;
    private double price;
    private Orders order;
    public Goods(String thing,double price,Orders order)
    {
        this.thing = thing;
        this.price = price;
        order.addGoodstoOrder(this);
        this.order = order;
    }

    public Orders getOrder() {
        return order;
    }

    public void setOrder(Orders order) {
        this.order = order;
    }

    public String getThing() {
        return thing;
    }

    public void setThing(String thing) {
        this.thing = thing;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }
}
