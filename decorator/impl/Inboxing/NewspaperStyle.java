package FlowerBusiness.decorator.impl.Inboxing;

import FlowerBusiness.decorator.BouquetDecorator;

public class NewspaperStyle extends BouquetDecorator {
    private final int ADD_PRICE = 10;
    private final String ADDI_COMPONENT = "+ Newspaper Style";

    public NewspaperStyle() {
        setAddToPrice(ADD_PRICE);
        setAddingComponent(ADDI_COMPONENT);
    }
}