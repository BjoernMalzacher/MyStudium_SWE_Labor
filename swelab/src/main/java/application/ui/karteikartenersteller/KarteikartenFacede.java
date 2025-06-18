package application.ui.karteikartenersteller;

import application.statemachine.StateMachineFactory;
import application.statemachine.port.StateMachine;
import application.ui.karteikartenersteller.port.Karteikartenersteller;
import application.ui.karteikartenersteller.impl.karteikartenerstellerImpl;

public class KarteikartenFacede implements KarteikartenFactory,Karteikartenersteller { 
 private karteikartenerstellerImpl KarteikartenImpl;
 private StateMachine stateMachine;
 public Karteikartenersteller Karteikartenersteller(){
    
  if (this.KarteikartenImpl == null){                    // lazy initialization
 this.stateMachine = StateMachineFactory.FACTORY.stateMachine();
 this.KarteikartenImpl = new karteikartenerstellerImpl(/* more args */);
  } 
 return this;
 

} // delegate to the right implementation
 public void foo(){
      //if (!stateMachine.getState().isSubStateOf(...))//is the call allowed or not?
        //return KarteikartenImpl.foo();            
     }
 @Override
 public application.ui.karteikartenersteller.port.Karteikartenersteller karteikartenersteller() {
  // TODO Auto-generated method stub
  throw new UnsupportedOperationException("Unimplemented method 'karteikartenersteller'");
 }
    }
 // not allowed
                 // allowed