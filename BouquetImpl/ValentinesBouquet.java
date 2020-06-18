package FlowerBusiness.BouquetImpl;

import FlowerBusiness.Bouquet;

import java.util.LinkedList;
import java.util.List;

public class ValentinesBouquet implements Bouquet {
    final private int PRICE = 600;
    final private String NAME_BOUQUET = "Valentines Bouquet";
    private List<String> orderInfo;
    public ValentinesBouquet(){
        orderInfo = new LinkedList<>();
        orderInfo.add("30 Red Roses");
        orderInfo.add("1 Violets");
        orderInfo.add("0 AnnaEyes");
        orderInfo.add("0 White Roses");
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
