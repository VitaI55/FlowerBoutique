package FlowerBusiness.decorator.impl.Bonuses;

import FlowerBusiness.decorator.BouquetDecorator;

public class SilverCard extends BouquetDecorator {
    private final int GOLD_DISCOUNT = 150;
    private final String ADD_TO_NAME ="+ Silver Discount";

    public SilverCard() {
        setAddToPrice(-GOLD_DISCOUNT);
        setAddName(ADD_TO_NAME);
    }
}
