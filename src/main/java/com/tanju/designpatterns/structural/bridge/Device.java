package com.tanju.designpatterns.structural.bridge;

public interface Device {

    boolean isEnabled();

    void enable();

    void disable();

    int getChannel();

    void setChannel(int channel);

    int getVolume();

    void setVolume(int percent);

}
