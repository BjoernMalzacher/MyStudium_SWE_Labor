package application.backend.lernplangenerator;

import application.backend.lernplangenerator.port.Lernplangenerator;

public interface LernplangeneratorFactory {
    LernplangeneratorFactory FACTORY = new LernplangeneratorFacade(); // static access to the facade
    Lernplangenerator Lernplangenerator(); // return the implementation of the interface Xy
}