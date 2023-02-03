package com.techreturners.cats;

public class DomesticCat extends CatImpl{
    public final String DOMESTIC_SETTING = "domestic";
    public final String DOMESTIC_EAT = "Purrrrrrr";
    public final int DOMESTIC_CAT_AVERAGE_HEIGHT = 23;

    public DomesticCat() {
        this.catSetting = DOMESTIC_SETTING;
        this.averageHeight = DOMESTIC_CAT_AVERAGE_HEIGHT;
        this.eat = DOMESTIC_EAT;
    }
}
