package FlowerBusiness.decorator.impl.Delivery;

import FlowerBusiness.decorator.BouquetDecorator;

public class DeliverByTruck extends BouquetDecorator {
    private final int ADD_PRICE = 15;
    private final String ADD_TO_NAME ="+ Truck Delivery";

    public DeliverByTruck() {
        setAddToPrice(ADD_PRICE);
        setAddName(ADD_TO_NAME);
    }
}
