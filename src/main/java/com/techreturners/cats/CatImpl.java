package com.techreturners.cats;

public abstract class CatImpl implements Cat {

    private String asleepMessage = "Cat should be awake by default";

    public String isAsleep(){
        return asleepMessage;
    }
    public void goToSleep(){
        asleepMessage = "Cat should be snoozing";
    }
    public void wakeUp(){
        asleepMessage = "Cat should be awake now";

    }
}
