package com.techreturners.cats;

public abstract class CatImpl implements Cat {

    private final String ASLEEP_MESSAGE = "Cat should be awake by default";
    private final String AWAKE_MESSAGE = "Cat should be awake now";
    private final String GO_TO_SLEEP_MESSAGE = "Cat should be snoozing";
    public final String CAT_SETTING = "cat";
    public final int NONSENSE_AVERAGE_HEIGHT = -1; // who knows the height of "base cat" - so make nonsense?
    private String asleepMessage = ASLEEP_MESSAGE;
    protected String catSetting = CAT_SETTING;
    protected int averageHeight = NONSENSE_AVERAGE_HEIGHT;

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


}
