package com.springination.springidol;

public class Magician implements MindReader{
    String thoughts;

    @Override
    public void interceptThoughts(String thoughts) {
        System.out.println("Intercepting volunteer’s thoughts");
        this.thoughts=thoughts;
    }

    @Override
    public String getThoughs() {
        return thoughts;
    }
}
