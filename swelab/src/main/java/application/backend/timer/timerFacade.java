package application.backend.timer;

import application.backend.timer.impl.timerImpl;
import application.backend.timer.port.timer;
import application.statemachine.StateMachineFactory;
import application.statemachine.port.StateMachine;

public class timerFacade implements timerFactory, timer {
    private timerImpl timerImpl;
    private StateMachine stateMachine;
    public timer timer(){
        if (this.timerImpl == null){ // lazy initialization
            this.stateMachine = StateMachineFactory.FACTORY.stateMachine();
            this.timerImpl = new timerImpl(/* more args */);}
        return this;
    }
    // delegate to the right implementation
    public void foo(){
        /*if (!stateMachine.getState().isSubStateOf(...))//is the call allowed or not?
            return; // not allowed
        this.xyImpl.foo(); // allowed*/
    }
    @Override
    public double stop() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'stop'");
    }
    @Override
    public boolean start() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'start'");
    }
    @Override
    public double getTime() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'getTime'");
    }
    @Override
    public boolean pause() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'pause'");
    }
}