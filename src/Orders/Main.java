package Orders;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Orders o1 = new Orders("LeiJun",1);
        Goods g1= new Goods("XRING",8000.0,o1);
        Goods g2=new Goods("15S Pro",5999,o1);
        Orders o2 = new Orders("DongMingzhu",2);
        Goods g3=  new Goods("airconditioner",4000.0,o2);

        for(int i=0;i<o1.getGoodsArray().size();i++){
            Goods aGoods = (Goods) o1.getGoodsArray().get(i);
            System.out.println("GoodsName:"+aGoods.getThing()+" Price:"+aGoods.getPrice());
        }
        for(int i=0;i<o2.getGoodsArray().size();i++){
            Goods aGoods = (Goods) o2.getGoodsArray().get(i);
            System.out.println("GoodsName:"+aGoods.getThing()+" Price:"+aGoods.getPrice());
        }


        System.out.println(g1.getOrder().getName());
    }
}
