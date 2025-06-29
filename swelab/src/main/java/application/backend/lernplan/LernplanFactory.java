package application.backend.lernplan;

import application.backend.lernplan.port.Lernplan;

public interface LernplanFactory {
    LernplanFactory FACTORY = new LernplanFacade(); // static access to the facade
    Lernplan Lernplan(); // return the implementation of the interface Xy
}