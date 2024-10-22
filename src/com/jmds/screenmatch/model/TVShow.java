package com.jmds.screenmatch.model;

public class TVShow extends Title{
    private int seasons;
    private int epsPerSeason;
    private boolean running;
    private int minutesPerEp;

    @Override
    public int getDurationMinutes(){
        return seasons*epsPerSeason*minutesPerEp;
    }

    public int getSeasons() {
        return seasons;
    }

    public void setSeasons(int seasons) {
        this.seasons = seasons;
    }

    public int getEpsPerSeason() {
        return epsPerSeason;
    }

    public void setEpsPerSeason(int epsPerSeason) {
        this.epsPerSeason = epsPerSeason;
    }

    public boolean isRunning() {
        return running;
    }

    public void setRunning(boolean running) {
        this.running = running;
    }

    public int getMinutesPerEp() {
        return minutesPerEp;
    }

    public void setMinutesPerEp(int minutesPerEp) {
        this.minutesPerEp = minutesPerEp;
    }
}
