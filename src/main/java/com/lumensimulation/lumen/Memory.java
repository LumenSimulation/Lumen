package com.lumensimulation.lumen;

import java.util.ArrayList;
import java.util.List;

public class Memory {

    private final List<String> memories;

    public Memory() {
        memories = new ArrayList<>();
    }

    public void remember(String event) {
        memories.add(event);
    }

    public List<String> getMemories() {
        return memories;
    }

    public int getMemoryCount() {
        return memories.size();
    }
}
