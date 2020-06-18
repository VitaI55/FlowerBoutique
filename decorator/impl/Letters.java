package FlowerBusiness.decorator.impl;

import FlowerBusiness.decorator.BouquetDecorator;

public class Letters extends BouquetDecorator {
    private final int ADD_PRICE = 15;
    private final String ADDI_COMPONENT ="+Big expensive letters";

    public Letters() {
        setAddToPrice(ADD_PRICE);
        setAddingComponent(ADDI_COMPONENT);
    }
}
