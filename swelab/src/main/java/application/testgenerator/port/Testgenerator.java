package application.testgenerator.port;

import application.TakeCourseUnit.port.Exam;
import application.TakeCourseUnit.port.Unit;

/* Factory for creating domain objects */ 

public interface Testgenerator {

    public Exam GenerateTest(Unit unit);
}