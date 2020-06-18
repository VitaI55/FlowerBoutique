package FlowerBusiness.decorator.impl.SelfMade;

import FlowerBusiness.decorator.BouquetDecorator;

public class AnnaEyes extends BouquetDecorator {
    private final int ADD_PRICE1 = 100;
    private final String ADDI_COMPONENT ="+5 Anna's eyes";

    public AnnaEyes(){
        setAddingComponent(ADDI_COMPONENT);
        setAddToPrice(ADD_PRICE1);
    }
}
