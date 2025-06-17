package application.ui.karteikartenersteller;

import application.statemachine.StateMachineFactory;
import application.statemachine.port.StateMachine;

public class KarteikartenFacede implements KarteikartenFactory,port.Karteikartenersteller { 
 private impl.KarteikartenImpl KarteikartenImpl;
 private StateMachine stateMachine;
 public application.ui.karteikartenersteller.port.Karteikartenersteller Karteikartenersteller(){
    if 
(this.KarteikartenImpl == null){                    // lazy initialization
 this.stateMachine = StateMachineFactory.FACTORY.stateMachine();
 this.KarteikartenImpl = new port.KarteikartenImpl(/* more args */);
 return this;
 }
 // delegate to the right implementation
 public void foo(){
      if 
(!stateMachine.getState().isSubStateOf(...))//is the call allowed or not?
 Return;                                    
      this.xyImpl.foo();            
     }
 @Override
 public port.karteikartenersteller karteikartenersteller() {
  // TODO Auto-generated method stub
  throw new UnsupportedOperationException("Unimplemented method 'karteikartenersteller'");
 }
   }
 // not allowed
                 // allowed