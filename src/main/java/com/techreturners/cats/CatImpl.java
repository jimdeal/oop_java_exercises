package com.techreturners.cats;

public abstract class CatImpl implements Cat {

    private final String ASLEEP_MESSAGE = "Cat should be awake by default";
    private final String AWAKE_MESSAGE = "Cat should be awake now";
    private final String GO_TO_SLEEP_MESSAGE = "Cat should be snoozing";
    public final String CAT_SETTING = "cat";

    // is this correct - should we initialise eat to a noise we may be unsure of ?
    public final String CAT_EAT = "mewww";

    // who knows the average height of "base cat" - so make nonsense?
    // who knows the average height of other cats - unless specified
    public final int NONSENSE_AVERAGE_HEIGHT = -1;

    // This is private - as it's not changed anywhere else
    // would need to be protected if this is different from subclasses
    private String asleepMessage = ASLEEP_MESSAGE;
    protected String catSetting = CAT_SETTING;
    protected int averageHeight = NONSENSE_AVERAGE_HEIGHT;
    protected String eat = CAT_EAT;

    public String isAsleep(){
        return asleepMessage;
    }
    public void goToSleep(){
        asleepMessage = GO_TO_SLEEP_MESSAGE;
    }
    public void wakeUp(){
        asleepMessage = AWAKE_MESSAGE;
    }
    public String getSetting(){
        return catSetting;
    }

    public int getAverageHeight(){
        return averageHeight;
    }

    public String eat(){
        return eat;
    }

}
