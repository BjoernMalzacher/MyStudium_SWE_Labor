package application.TakeCourseUnit.impl;

import application.TakeCourseUnit.port.Unit;

public class Lernplan {
private Unit[] allUnits;

    public Lernplan(Unit[] units){
        this.allUnits = units;
    }
    
    public Unit[] getUnitList(){
        return this.allUnits;
    }
}
