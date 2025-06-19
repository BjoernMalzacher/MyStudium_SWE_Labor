package application.backend.lernplangenerator;

import java.sql.Date;

import application.backend.lernplan.port.Lernplan;
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
    @Override
    public Lernplan AdjustCurrentLernplan(Date[] daysOff) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'AdjustCurrentLernplan'");
    }
    @Override
    public Lernplan Generate(Date[] pruefungen, String[] materialienPfade) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'Generate'");
    }
}