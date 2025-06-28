package application.TakeCourseUnit.impl;

import application.TakeCourseUnit.port.Unit;

import java.time.LocalDateTime;
import java.util.Date;

public class UnitImpl implements Unit{
private LocalDateTime date;
private String path;
private float progress;
    public UnitImpl(LocalDateTime date, String pathToUnit){
        this.date = date;
        this.path = pathToUnit;
        this.progress = 0.0f;
    }

    public LocalDateTime getDate(){
        return this.date;
    }

    public float getProgress(){
        return this.progress;
    }

    public void setProgress(float newProg){
        this.progress = newProg;
    }

    public String getPath(){
        return this.path;
    }
}