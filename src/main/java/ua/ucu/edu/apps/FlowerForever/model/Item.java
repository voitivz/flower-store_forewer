package ua.ucu.edu.apps.FlowerForever.model;

import lombok.Getter;

public abstract class Item {
    @Getter
    private String description;

    public abstract String getDescription();
    public abstract double price();
}
