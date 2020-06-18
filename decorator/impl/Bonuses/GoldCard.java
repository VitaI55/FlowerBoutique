package FlowerBusiness.decorator.impl.Bonuses;

import FlowerBusiness.decorator.BouquetDecorator;

public class GoldCard extends BouquetDecorator {
    private final int GOLD_DISCOUNT = 250;
    private final String ADD_TO_NAME ="+ Gold Discount";

    public GoldCard() {
        setAddToPrice(-GOLD_DISCOUNT);
        setAddName(ADD_TO_NAME);
    }
}
