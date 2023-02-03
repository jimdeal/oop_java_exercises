package com.techreturners.cats;

public abstract class CatImpl implements Cat {

    private String asleepMessage = "Cat should be awake by default";
    private String awakeMessage = "Cat should be awake now";
    private String goToSleepMessage = "Cat should be snoozing";
    public final String CAT_SETTING = "cat";
    protected String catSetting = CAT_SETTING;

    public String isAsleep(){
        return asleepMessage;
    }
    public void goToSleep(){
        asleepMessage = goToSleepMessage;
    }
    public void wakeUp(){
        asleepMessage = awakeMessage;
    }
    public String getSetting(){
        return catSetting;
    }

}
