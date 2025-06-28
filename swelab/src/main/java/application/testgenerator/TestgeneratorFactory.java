package application.testgenerator;

import application.testgenerator.port.Testgenerator;

public interface TestgeneratorFactory {
    TestgeneratorFactory FACTORY = new TestgeneratorFacade(); // static access to the facade
    Testgenerator Testgenerator(); // return the implementation of the interface Xy
}