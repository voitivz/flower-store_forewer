package ua.ucu.edu.apps.FlowerForever.decorator;

import ua.ucu.edu.apps.FlowerForever.model.Item;

public class RibbonDecorator extends ItemDecorator {
    public RibbonDecorator(Item item){
        this.item = item;
    }

    @Override
    public String getDescription() {
        return item.getDescription();
    }

    public double price(){
        return 40 + item.price();
    }
}
