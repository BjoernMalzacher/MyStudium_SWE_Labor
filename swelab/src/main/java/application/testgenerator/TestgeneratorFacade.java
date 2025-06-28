package application.testgenerator;

import application.TakeCourseUnit.port.Exam;
import application.TakeCourseUnit.port.Unit;
import application.statemachine.StateMachineFactory;
import application.statemachine.port.State;
import application.statemachine.port.StateMachine;
import application.testgenerator.impl.TestgeneratorImpl;
import application.testgenerator.port.Testgenerator;

public class TestgeneratorFacade implements TestgeneratorFactory, Testgenerator {
    private TestgeneratorImpl TestgeneratorImpl;
    private StateMachine stateMachine;

    @Override
    public Testgenerator Testgenerator(){
        if (this.TestgeneratorImpl == null){ // lazy initialization
            this.stateMachine = StateMachineFactory.FACTORY.stateMachine();
            this.TestgeneratorImpl = new TestgeneratorImpl(/* more args */);}
        return this;
    }

    @Override
    public Exam GenerateTest(Unit unit) {
        if (!stateMachine.getState().isSubStateOf(State.S.GENERATE_TEST))
            return null;     
        return null;
    }
}