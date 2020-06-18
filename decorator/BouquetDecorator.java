package FlowerBusiness.decorator;

import FlowerBusiness.Bouquet;

import java.util.List;
import java.util.Optional;

public class BouquetDecorator implements Bouquet {

    private Optional<Bouquet> bouquet;
    private int addToPrice;
    private String addName ="";
    private String addingComponent;

    public void setBouquet(Bouquet outBouquet) {
        bouquet = Optional.ofNullable(outBouquet);
        if(addingComponent!= null){
            bouquet.orElseThrow(IllegalAccessError::new).getOrderInfo().add(addingComponent);
        }
    }

    public void setAddToPrice(int addToPrice) {
        this.addToPrice = addToPrice;
    }

    public void setAddingComponent(String addingComponent) {
        this.addingComponent = addingComponent;
    }

    public void setAddName(String addName) {
        this.addName = addName;
    }

    @Override
    public String getName() {
        return bouquet.orElseThrow(IllegalAccessError::new).getName() + addName;
    }

    @Override
    public int getCost() {
        return bouquet.orElseThrow(IllegalAccessError::new).getCost() + addToPrice;
    }

    @Override
    public List<String> getOrderInfo() {
        return bouquet.orElseThrow(IllegalAccessError::new).getOrderInfo();
    }
}
