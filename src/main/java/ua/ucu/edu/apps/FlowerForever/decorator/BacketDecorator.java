package ua.ucu.edu.apps.FlowerForever.decorator;

import ua.ucu.edu.apps.FlowerForever.model.Item;

public class BacketDecorator extends ItemDecorator {
    public BacketDecorator(Item item){
        this.item = item;
    }

    @Override
    public String getDescription() {
        return item.getDescription();
    }

    public double price(){
        return 4 + item.price();
    }
    
}
