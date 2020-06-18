package FlowerBusiness.BouquetImpl;

import FlowerBusiness.Bouquet;

import java.util.LinkedList;
import java.util.List;

public class AuthorsBouquet implements Bouquet {
    final private int PRICE = 0;
    final private String NAME_BOUQUET = "Self-made";
    private List<String> orderInfo;
    public AuthorsBouquet(){
        orderInfo = new LinkedList<>();
        orderInfo.add("not a thing");
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
