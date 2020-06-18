package FlowerBusiness.BouquetImpl;

import FlowerBusiness.Bouquet;

import java.util.LinkedList;
import java.util.List;

public class FuneralBouquet implements Bouquet {
    final private int PRICE = 200;
    final private String NAME_BOUQUET = "Funeral Bouquet";
    private List<String> orderInfo;
    public FuneralBouquet(){
        orderInfo = new LinkedList<>();
        orderInfo.add("5 Red Funeral Roses");
        orderInfo.add("5 Funeral Violets");
        orderInfo.add("1 AnnaEyes");
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
