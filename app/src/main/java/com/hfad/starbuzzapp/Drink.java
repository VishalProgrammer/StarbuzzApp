package com.hfad.starbuzzapp;

/**
 * Created by vishal on 22/10/15.
 */
public class Drink {

    private String name;
    private String description;
    private int imageResourceId;

    public static final Drink[] drinks = {
            new Drink("TEA", "GARAM CHAI", R.drawable.tea),
            new Drink("COFFEE", "COLD COFFEE", R.drawable.coffee),
            new Drink("BEER", "COLD BEER", R.drawable.beer)
    };

    private Drink(String name, String description, int imageResourceId) {
        this.name = name;
        this.description = description;
        this.imageResourceId = imageResourceId;
    }

    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }

    public int getImageResourceId() {
        return imageResourceId;
    }

    public String toString() {
        return this.name;
    }
}
