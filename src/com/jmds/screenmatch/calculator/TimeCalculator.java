package com.jmds.screenmatch.calculator;

import com.jmds.screenmatch.model.Title;

public class TimeCalculator {
    private int totalTimeMinutes;

    public int getTotalTimeMinutes() {
        return totalTimeMinutes;
    }

    public void insert(Title title){
        totalTimeMinutes += title.getDurationMinutes();
    }

}
