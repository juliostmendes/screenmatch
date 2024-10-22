package com.jmds.screenmatch.model;

public class Title {
    private String name;
    private int releaseYear;
    private boolean inPlan;
    private double sumRating;
    private int quantityRating;
    private int durationMinutes;

    public String getName() {
        return name;
    }

    public int getReleaseYear() {
        return releaseYear;
    }

    public boolean isInPlan() {
        return inPlan;
    }

    public int getDurationMinutes() {
        return durationMinutes;
    }

    public int getQuantityRating() {
        return quantityRating;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setDurationMinutes(int durationMinutes) {
        this.durationMinutes = durationMinutes;
    }

    public void setInPlan(boolean inPlan) {
        this.inPlan = inPlan;
    }

    public void setReleaseYear(int releaseYear) {
        this.releaseYear = releaseYear;
    }

    public void showData(){
        System.out.println("Name: " + name);
        System.out.println("Release year: " + releaseYear);
        System.out.println("Duration: " + durationMinutes + " minutes");
        System.out.println("Is available: " + inPlan);
    }

    public void rate(double newRating){
        sumRating += newRating;
        quantityRating += 1;
    }

    public double getAverageRate(){
        return sumRating / quantityRating;
    }

}
