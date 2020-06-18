package FlowerBusiness;

import java.util.List;

public class Client {
    public static void main(String[] args) {
        OrderFacade fac = new OrderFacade();
       show(fac.getAuthorBouquet());


    }

    public static void show(Bouquet bouquet){
        int price = bouquet.getCost();
        String name = bouquet.getName();
        List<String> info = bouquet.getOrderInfo();
        System.out.println("Price: " + price);
        System.out.println("Name: "+name);
        System.out.println("COMPONENTS ==============");
        for (String com: info) {
            System.out.println(com);
        }
    }
}
