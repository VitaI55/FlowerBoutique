package FlowerBusiness.decorator.impl.SelfMade;

import FlowerBusiness.decorator.BouquetDecorator;

public class Violets extends BouquetDecorator {
    private final int ADD_PRICE1 = 75;
    private final String ADDI_COMPONENT ="+5 Violets";

    public Violets(){
        setAddingComponent(ADDI_COMPONENT);
        setAddToPrice(ADD_PRICE1);
    }
}
