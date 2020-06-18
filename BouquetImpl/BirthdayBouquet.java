package FlowerBusiness.BouquetImpl;

import FlowerBusiness.Bouquet;

import java.util.LinkedList;
import java.util.List;

public class BirthdayBouquet implements Bouquet {
    final private int PRICE = 400;
    final private String NAME_BOUQUET = "Birthday Bouquet";
    private List<String> orderInfo;
    public BirthdayBouquet(){
        orderInfo = new LinkedList<>();
        orderInfo.add("5 Red Roses");
        orderInfo.add("10 Violets");
        orderInfo.add("3 AnnaEyes");
        orderInfo.add("7 White Roses");
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
