package application.ui.tagesplan;

import application.statemachine.StateMachineFactory;
import application.statemachine.port.StateMachine;
import application.ui.tagesplan.tagesplanFactory;
import application.ui.tagesplan.impl.tagesplanImpl;
import application.ui.tagesplan.port.tagesplan;

public class tagesplanFacede implements tagesplanFactory, tagesplan { 
 private tagesplanImpl tagesplanImpl;
 private StateMachine stateMachine;
 public tagesplan tagesplan(){
    if 
(this.tagesplanImpl == null){                    // lazy initialization
 this.stateMachine = StateMachineFactory.FACTORY.stateMachine();
 this.tagesplanImpl = new tagesplanImpl(/* more args */);
 
 }
 return this;
}
 // delegate to the right implementation
 public void foo(){
      if (!stateMachine.getState().isSubStateOf(...))//is the call allowed or not?
          return tagesplanImpl.foo();            
     }
   }