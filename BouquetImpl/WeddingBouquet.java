package FlowerBusiness.BouquetImpl;

import FlowerBusiness.Bouquet;

import java.util.LinkedList;
import java.util.List;

public class WeddingBouquet implements Bouquet {
    final private int PRICE = 700;
    final private String NAME_BOUQUET = "Wedding Bouquet";
    private List<String> orderInfo;
    public WeddingBouquet(){
        orderInfo = new LinkedList<>();
        orderInfo.add("15 Red Roses");
        orderInfo.add("20 Violets");
        orderInfo.add("10 AnnaEyes");
        orderInfo.add("20 White Roses");
        orderInfo.add("+ Arrangements");
    }

    @Override
    public String getName() {
        return NAME_BOUQUET;
    }

    @Override
    public int getCost() {
        return PRICE;
    }

    @Override
    public List<String> getOrderInfo() {
        return orderInfo;
    }
}
