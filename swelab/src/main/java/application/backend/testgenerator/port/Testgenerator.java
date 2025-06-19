package application.backend.testgenerator.port;


/* Factory for creating domain objects */ 

public interface Testgenerator {

    public String GenerateTest(String lerneinheitID);
    public float evaluateTest();
}