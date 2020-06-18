package FlowerBusiness.decorator.impl.Delivery;

import FlowerBusiness.decorator.BouquetDecorator;

public class DeliverByCourier extends BouquetDecorator {
    private final int ADD_PRICE = 45;
    private final String ADD_TO_NAME ="+ Courier Delivery";

    public DeliverByCourier() {
        setAddToPrice(ADD_PRICE);
        setAddName(ADD_TO_NAME);
    }
}
