package application.backend.lernplan;

import application.backend.lernplan.impl.LernplanImpl;
import application.backend.lernplan.port.Lernplan;
import application.statemachine.StateMachineFactory;
import application.statemachine.port.StateMachine;

public class LernplanFacade implements LernplanFactory, Lernplan {
    private LernplanImpl LernplanImpl;
    private StateMachine stateMachine;
    @Override
    public Lernplan Lernplan(){
        if (this.LernplanImpl == null){ // lazy initialization
            this.stateMachine = StateMachineFactory.FACTORY.stateMachine();
            this.LernplanImpl = new LernplanImpl(/* more args */);}
        return this;
    }
    // delegate to the right implementation
    public void foo(){
        /*if (!stateMachine.getState().isSubStateOf(...))//is the call allowed or not?
            return; // not allowed
        this.xyImpl.foo(); // allowed*/
    }
}