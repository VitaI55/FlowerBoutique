package FlowerBusiness.decorator.impl.Inboxing;

import FlowerBusiness.decorator.BouquetDecorator;

public class ShinePapers extends BouquetDecorator {
    private final int ADD_PRICE = 8;
    private final String ADDI_COMPONENT ="+Good shine paper";

    public ShinePapers() {
        setAddToPrice(ADD_PRICE);
        setAddingComponent(ADDI_COMPONENT);
    }

}
