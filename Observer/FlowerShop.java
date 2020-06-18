package FlowerBusiness.Observer;

import java.util.ArrayList;
import java.util.List;

public class FlowerShop {
    private List<Observer> clients = new ArrayList<Observer>();;
    private String sale;

    public String getSale() {
        return sale;
    }

    public void setSale(String sale) {
        this.sale = sale;
        notifyAllClients();

    }

    public void register(Observer client){
        clients.add(client);
    }

    public void notifyAllClients(){
        for (Observer client:clients) {
            client.update();
        }
    }
}
