package ua.ucu.edu.apps.FlowerForever.delivery;

import java.util.List;

import ua.ucu.edu.apps.FlowerForever.model.Item;

public interface Delivery {
    void deliver(List<Item> items);
}
