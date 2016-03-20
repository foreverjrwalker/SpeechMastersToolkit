package com.infynity.smu.toastmasterstk.Timer;

import android.graphics.Color;

public abstract class TimeFormatHelper {

    public static int determineColor(int seconds, int greenWarningTime, int yellowWarningTime, int redWarningTime) {
        if (seconds <= redWarningTime) {
            return Color.RED;
        }else if (seconds <= yellowWarningTime) {
            return Color.YELLOW;
        }else if (seconds <= greenWarningTime) {
            return Color.GREEN;
        } else {
            return Color.BLUE;
        }
    }
    
    public static String formatTime(int seconds) {
        return Integer.toString(seconds / 60) + ":" + padWithZeros(seconds % 60);
    }

    public static String formatTime(float seconds) {
        return formatTime((int) seconds);
    }

    private static String padWithZeros(int seconds) {
        return seconds < 10 ? "0" + seconds : Integer.toString(seconds);
    }
}
