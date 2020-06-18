package FlowerBusiness.decorator.impl.Delivery;

import FlowerBusiness.decorator.BouquetDecorator;

public class DeliverByDron extends BouquetDecorator {
    private final int ADD_PRICE = 75;
    private final String ADD_TO_NAME ="+ Luxury Dron Delivery";

    public DeliverByDron() {
        setAddToPrice(ADD_PRICE);
        setAddName(ADD_TO_NAME);
    }
}
