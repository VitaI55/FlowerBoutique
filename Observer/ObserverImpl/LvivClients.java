package FlowerBusiness.Observer.ObserverImpl;

import FlowerBusiness.Observer.FlowerShop;
import FlowerBusiness.Observer.Observer;

public class LvivClients extends Observer {
    public LvivClients(FlowerShop shop) {
        this.shop = shop;
        this.shop.register(this);
    }

    @Override
    public void update() {
        System.out.println("Lviv Man's have "+ shop.getSale());
    }

}
