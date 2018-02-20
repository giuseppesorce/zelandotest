package com.giuseppesorce.zelandonew.stampa;

/**
 * @author Giuseppe Sorce
 */

public class Debug {
    private static final Debug ourInstance = new Debug();

    public static Debug getInstance() {
        return ourInstance;
    }

    private Debug() {
    }
}
