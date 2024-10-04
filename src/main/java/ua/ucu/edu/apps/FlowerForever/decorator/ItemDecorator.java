package ua.ucu.edu.apps.FlowerForever.decorator;

import ua.ucu.edu.apps.FlowerForever.model.Item;

public abstract class ItemDecorator extends Item {
    protected Item item;

    public abstract String getDescription();
}
