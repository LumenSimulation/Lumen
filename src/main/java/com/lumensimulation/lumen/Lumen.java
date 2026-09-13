package com.lumensimulation.lumen;

public class Lumen {

    private final String version = "0.1.0";

    public void initialize() {
        System.out.println("Initializing Lumen AI...");
        System.out.println("Loading simulation...");
        System.out.println("Lumen " + version + " initialized.");
    }

    public String getVersion() {
        return version;
    }
}
