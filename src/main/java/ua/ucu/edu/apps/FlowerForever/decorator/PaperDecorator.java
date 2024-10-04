package ua.ucu.edu.apps.FlowerForever.decorator;

import ua.ucu.edu.apps.FlowerForever.model.Item;

public class PaperDecorator extends ItemDecorator {
    
    public PaperDecorator(Item item){
        this.item = item;
    }

    @Override
    public String getDescription() {
        return item.getDescription();
    }

    @Override
    public double price(){
        return 13 + item.price();
    }
}
