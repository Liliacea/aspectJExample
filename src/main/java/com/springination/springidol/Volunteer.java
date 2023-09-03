package com.springination.springidol;

public class Volunteer implements Thinker{
    String thoughts;
    @Override
    public void thinkSomething(String thoughts) {
    this.thoughts=thoughts;
    }

    public String getThoughts() {
        return thoughts;
    }
}
