package application.statemachine.port;

public interface StateMachine {

	State getState();
	boolean setState(State state);
	
		
}
