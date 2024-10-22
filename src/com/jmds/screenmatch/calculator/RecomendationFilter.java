package com.jmds.screenmatch.calculator;

public class RecomendationFilter {

    public void filter(Evaluable evaluable){
        if(evaluable.getRating() >= 4) {
            System.out.println("It is a recomendation");
        } else if (evaluable.getRating() >= 2){
            System.out.println("Very well rated");
        } else {
            System.out.println("Put in your favorites to see it later");
        }


    }
}
