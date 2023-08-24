package com.springination.springidol;

public class Vocalist implements Performer{
    private String song;

    public Vocalist() {

    }


    public String getSong() {
        return song;
    }

    public void setSong(String song) {
        this.song = song;
    }

    @Override
    public void perform() {
        System.out.println("Sing " + song);
    }
}
