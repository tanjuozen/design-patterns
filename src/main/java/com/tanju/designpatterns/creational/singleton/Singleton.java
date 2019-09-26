package com.tanju.designpatterns.creational.singleton;

public class Singleton {

    private String value;

    // Fetch each time from the memory
    private static volatile Singleton instance;

    private Singleton(String value) {
        this.value = value;
    }

    public static Singleton getInstance(String key) {

        Singleton result = instance;

        if (result == null) {
            // lock the thread here and do another check
            synchronized (Singleton.class) {
                result = instance;
                if (result == null) {
                    result = instance = new Singleton(key);
                }
            }
        }
        return result;
    }

    public String getValue() {
        return value;
    }
}
