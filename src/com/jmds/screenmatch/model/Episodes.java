package com.jmds.screenmatch.model;

import com.jmds.screenmatch.calculator.Evaluable;

public class Episodes implements Evaluable {
    private int number;
    private String name;
    private TVShow tvShow;
    private int totalViews;

    public int getTotalViews() {
        return totalViews;
    }

    public void setTotalViews(int totalViews) {
        this.totalViews = totalViews;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public TVShow getTvShow() {
        return tvShow;
    }

    public void setTvShow(TVShow tvShow) {
        this.tvShow = tvShow;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    // The implemetation of the Interface doesn't need to be equal between Classes
    @Override
    public int getRating() {
        if (totalViews > 100){
            return 4;
        } else {
            return 2;
        }
    }
}
