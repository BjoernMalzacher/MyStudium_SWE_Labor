package application.backend.lernplangenerator.port;

import java.sql.Date;

import application.backend.lernplan.port.Lernplan;

/* Factory for creating domain objects */ 

public interface Lernplangenerator {

    public Lernplan AdjustCurrentLernplan(Date[] daysOff);

    public Lernplan Generate(Date[] pruefungen, String[] materialienPfade);
}