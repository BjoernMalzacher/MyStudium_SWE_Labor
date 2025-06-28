package application.Anki;

import application.Anki.impl.AnkiImpl;
import application.Anki.port.Anki;
import application.Anki.port.AnkiCards;
import application.statemachine.StateMachineFactory;
import application.statemachine.port.State;
import application.statemachine.port.StateMachine;

public class AnkiFacede implements AnkiFactory,Anki { 
 private AnkiImpl KarteikartenImpl;
 private StateMachine stateMachine;
 public Anki Anki(){
    
  if (this.KarteikartenImpl == null){                    // lazy initialization
 this.stateMachine = StateMachineFactory.FACTORY.stateMachine();
 this.KarteikartenImpl = new AnkiImpl(/* more args */);
  } 
 return this;
 

} // delegate to the right implementation
 @Override
 public AnkiCards[] getAnkiCards() {
    if (!stateMachine.getState().isSubStateOf(State.S.LOAD_UNIT))
        return null;     
    return null; 
  }
}
 // not allowed
                 // allowed