package application.backend.testgenerator;

import application.backend.testgenerator.impl.TestgeneratorImpl;
import application.backend.testgenerator.port.Testgenerator;
import application.statemachine.StateMachineFactory;
import application.statemachine.port.StateMachine;

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
    // delegate to the right implementation
    public void foo(){
        /*if (!stateMachine.getState().isSubStateOf(...))//is the call allowed or not?
            return; // not allowed
        this.xyImpl.foo(); // allowed*/
    }
    @Override
    public String GenerateTest(String lerneinheitID) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'GenerateTest'");
    }
    @Override
    public float evaluateTest() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'evaluateTest'");
    }
}