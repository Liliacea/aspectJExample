package com.springination.springidol;

import org.springframework.beans.factory.annotation.Configurable;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

@Configurable ("pianist")

public class Instrumentalist implements Performer{
    public String song;
    public Instrument instrument;

    public Instrumentalist() {

    }





    @Override
    public void perform() {
        System.out.print("Playing " + song + " : ");
        getInstrument().play();
    }

    public Instrument getInstrument(){
        return instrument;
    };


    private  String getSong(){
        return song;
    }
    private String screamSong(){
        return song;
    }
    public void setInstrument (Instrument instrument){
        this.instrument = instrument;
    }

    public void setSong(String song) {
        this.song = song;
    }


}
