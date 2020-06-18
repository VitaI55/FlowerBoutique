package FlowerBusiness.Observer.ObserverImpl;

import FlowerBusiness.Observer.FlowerShop;
import FlowerBusiness.Observer.Observer;

public class TernopilClients extends Observer {
    public TernopilClients(FlowerShop shop) {
        this.shop = shop;
        this.shop.register(this);
    }

    @Override
    public void update() {
        System.out.println("Ternopil Man's have "+ shop.getSale());
    }
}
