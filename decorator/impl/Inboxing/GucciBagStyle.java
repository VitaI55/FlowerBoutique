package FlowerBusiness.decorator.impl.Inboxing;

import FlowerBusiness.decorator.BouquetDecorator;

public class GucciBagStyle extends BouquetDecorator {
    private final int ADD_PRICE = 2000;
    private final String ADDI_COMPONENT = "+ GucciBag Style";

    public GucciBagStyle() {
        setAddToPrice(ADD_PRICE);
        setAddingComponent(ADDI_COMPONENT);
    }
}
