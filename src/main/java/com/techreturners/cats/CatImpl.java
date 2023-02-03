package com.techreturners.cats;

public abstract class CatImpl implements Cat {

    private final String ASLEEP_MESSAGE = "Cat should be awake by default";
    private final String AWAKE_MESSAGE = "Cat should be awake now";
    private final String GO_TO_SLEEP_MESSAGE = "Cat should be snoozing";
    private String asleepMessage = ASLEEP_MESSAGE;

    public final String CAT_SETTING = "cat";
    protected String catSetting = CAT_SETTING;

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
        return 0;
    }


}
