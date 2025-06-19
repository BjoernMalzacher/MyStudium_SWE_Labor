package application.backend.lernplangenerator;

import application.backend.lernplangenerator.impl.LernplangeneratorImpl;
import application.backend.lernplangenerator.port.Lernplangenerator;
import application.statemachine.StateMachineFactory;
import application.statemachine.port.StateMachine;

public class LernplangeneratorFacade implements LernplangeneratorFactory, Lernplangenerator {
    private LernplangeneratorImpl LernplangeneratorImpl;
    private StateMachine stateMachine;
    @Override
    public Lernplangenerator Lernplangenerator(){
        if (this.LernplangeneratorImpl == null){ // lazy initialization
            this.stateMachine = StateMachineFactory.FACTORY.stateMachine();
            this.LernplangeneratorImpl = new LernplangeneratorImpl(/* more args */);}
        return this;
    }
    // delegate to the right implementation
    public void foo(){
        /*if (!stateMachine.getState().isSubStateOf(...))//is the call allowed or not?
            return; // not allowed
        this.xyImpl.foo(); // allowed*/
    }
}