package FlowerBusiness;

import FlowerBusiness.decorator.BouquetDecorator;
import FlowerBusiness.decorator.impl.Bonuses.CommonClient;
import FlowerBusiness.decorator.impl.Bonuses.SilverCard;
import FlowerBusiness.decorator.impl.Delivery.DeliverByCourier;
import FlowerBusiness.decorator.impl.Delivery.DeliverByDron;
import FlowerBusiness.decorator.impl.Inboxing.GucciBagStyle;
import FlowerBusiness.decorator.impl.Inboxing.NewspaperStyle;
import FlowerBusiness.decorator.impl.SelfMade.RedRoses;
import FlowerBusiness.decorator.impl.SelfMade.Violets;
import FlowerBusiness.decorator.impl.SelfMade.WhiteRoses;

public class OrderFacade {
    private Bouquet bouquet;
    private FlowerFabric flowerBouquet;

    public Bouquet getBirthdayBouquet(){
        flowerBouquet = new FlowerFabric(BouquetType.BIRTHDAY);
        return getBouquet();
    }

    public Bouquet getFuneralBouquet(){
        flowerBouquet = new FlowerFabric(BouquetType.FUNERAL);
        return getBouquet();
    }

    public Bouquet getWeddingBouquet(){
        flowerBouquet = new FlowerFabric(BouquetType.WEDDING);
        return getBouquet();
    }

    public Bouquet getAuthorBouquet(){
        flowerBouquet = new FlowerFabric(BouquetType.NONE);
        bouquet = flowerBouquet.getBouquet();
        BouquetDecorator rose = new RedRoses();
        BouquetDecorator rose1 = new RedRoses();
        BouquetDecorator white = new WhiteRoses();
        BouquetDecorator violet = new Violets();
        BouquetDecorator paper = new GucciBagStyle();
        BouquetDecorator deliver = new DeliverByCourier();
        BouquetDecorator discount = new CommonClient();
        rose.setBouquet(bouquet);
        rose1.setBouquet(rose);
        white.setBouquet(rose1);
        violet.setBouquet(white);
        paper.setBouquet(violet);
        deliver.setBouquet(paper);
        discount.setBouquet(deliver);
        BouquetDecorator full = discount;
        return full;


    }

    public Bouquet getValentinesBouquet(){
        flowerBouquet = new FlowerFabric(BouquetType.VALENTINES);
        return getBouquet();
    }

    private Bouquet getBouquet() {
        bouquet = flowerBouquet.getBouquet();
        BouquetDecorator paper = new NewspaperStyle();
        BouquetDecorator deliver = new DeliverByDron();
        BouquetDecorator silver = new SilverCard();
        paper.setBouquet(bouquet);
        deliver.setBouquet(paper);
        silver.setBouquet(deliver);
        BouquetDecorator fullBouquet = silver;
        return fullBouquet;
    }

}
