package FlowerBusiness.decorator.impl.Bonuses;

import FlowerBusiness.decorator.BouquetDecorator;

public class CommonClient extends BouquetDecorator {
    private final int COMMON_DISC = 50;
    private final String ADD_TO_NAME ="+ Common Discount";

    public CommonClient() {
        setAddToPrice(-COMMON_DISC);
        setAddName(ADD_TO_NAME);
    }
}
