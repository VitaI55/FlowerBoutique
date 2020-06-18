package FlowerBusiness.Observer.ObserverImpl;

import FlowerBusiness.Observer.FlowerShop;
import FlowerBusiness.Observer.Observer;

public class ZakarpatClients extends Observer{

    public ZakarpatClients(FlowerShop shop) {
        this.shop = shop;
        this.shop.register(this);
    }

    @Override
    public void update() {
        System.out.println("Zakarpatsky Man's have "+ shop.getSale());
    }
}
