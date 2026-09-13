package com.lumensimulation.lumen;

public class NPC {

    private String name;
    private String personality;
    private int memoryCapacity;

    public NPC(String name, String personality) {
        this.name = name;
        this.personality = personality;
        this.memoryCapacity = 100;
    }

    public String getName() {
        return name;
    }

    public String getPersonality() {
        return personality;
    }

    public int getMemoryCapacity() {
        return memoryCapacity;
    }
}
