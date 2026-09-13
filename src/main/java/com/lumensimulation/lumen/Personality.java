package com.lumensimulation.lumen;

public class Personality {

    private double curiosity;
    private double friendliness;
    private double caution;

    public Personality(double curiosity, double friendliness, double caution) {
        this.curiosity = curiosity;
        this.friendliness = friendliness;
        this.caution = caution;
    }

    public double getCuriosity() {
        return curiosity;
    }

    public double getFriendliness() {
        return friendliness;
    }

    public double getCaution() {
        return caution;
    }
}
