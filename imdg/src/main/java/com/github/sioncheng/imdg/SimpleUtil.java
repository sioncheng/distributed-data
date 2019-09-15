package com.github.sioncheng.imdg;


class SimpleUtil {

    static void sleepInSeconds(long seconds) {
        try {
            Thread.sleep(1000 * seconds);
        } catch (InterruptedException ie) {
            ie.printStackTrace();
        }
    }
}
