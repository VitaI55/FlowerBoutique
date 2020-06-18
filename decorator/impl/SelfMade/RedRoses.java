package FlowerBusiness.decorator.impl.SelfMade;

import FlowerBusiness.decorator.BouquetDecorator;

public class RedRoses extends BouquetDecorator {
    private final int ADD_PRICE1 = 125;
    private final String ADDI_COMPONENT ="+5 Red Roses";

    public RedRoses(){
        setAddingComponent(ADDI_COMPONENT);
        setAddToPrice(ADD_PRICE1);
    }

}
