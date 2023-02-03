package com.techreturners.cats;

public class LionCat extends CatImpl{
    public final int LION_CAT_AVERAGE_HEIGHT = 1100;
    public final String LION_EAT = "Roar!!!!";

    public LionCat() {
        this.averageHeight = LION_CAT_AVERAGE_HEIGHT;
        this.eat = LION_EAT;
    }
}
