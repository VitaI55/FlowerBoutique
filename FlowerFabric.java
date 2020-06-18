package FlowerBusiness;

import FlowerBusiness.BouquetImpl.*;

public class FlowerFabric {
    private Bouquet bouquet;
    private BouquetType bouquetType;


    public FlowerFabric(BouquetType bT){
        this.bouquetType = bT;
    }
    public Bouquet getBouquet() {

        switch (bouquetType){
            case NONE:
                bouquet = new AuthorsBouquet();
                break;
            case FUNERAL:
                bouquet = new FuneralBouquet();
                break;
            case WEDDING:
                bouquet = new WeddingBouquet();
                break;
            case BIRTHDAY:
                bouquet = new BirthdayBouquet();
                break;
            case VALENTINES:
                bouquet = new ValentinesBouquet();
                break;
        }
        return bouquet;
    }
}
