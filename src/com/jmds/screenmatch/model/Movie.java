package com.jmds.screenmatch.model;

import com.jmds.screenmatch.calculator.Evaluable;

public class Movie extends Title implements Evaluable {
    private String director;

    public String getDirector() {
        return director;
    }

    public void setDirector(String director) {
        this.director = director;
    }

    @Override
    public int getRating() {
        return (int) getAverageRate()/2;
    }
}
