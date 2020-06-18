package FlowerBusiness.decorator.impl.SelfMade;

import FlowerBusiness.decorator.BouquetDecorator;

public class WhiteRoses extends BouquetDecorator {
    private final int ADD_PRICE1 = 150;
    private final String ADDI_COMPONENT ="+5 White Roses";

    public WhiteRoses(){
        setAddingComponent(ADDI_COMPONENT);
        setAddToPrice(ADD_PRICE1);
    }

}
