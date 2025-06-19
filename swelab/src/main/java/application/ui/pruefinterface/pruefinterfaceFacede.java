package application.ui.pruefinterface;

import application.statemachine.StateMachineFactory;
import application.statemachine.port.StateMachine;
import application.ui.pruefinterface.impl.pruefinterfaceImpl;
import application.ui.pruefinterface.port.pruefinterface;
public class pruefinterfaceFacede implements pruefInterfaceFactory, pruefinterface { 
 private pruefinterfaceImpl pruefinterfaceImpl;
 private StateMachine stateMachine;
 public pruefinterface pruefinterface(){
     if (this.pruefinterfaceImpl == null){                    // lazy initialization
          this.stateMachine = StateMachineFactory.FACTORY.stateMachine();
          this.pruefinterfaceImpl= new pruefinterfaceImpl(/* more args */);
     }
     return this;
 }

 // delegate to the right implementation
public void foo() {
      /*if 
     (!stateMachine.getState().isSubStateOf(...))//is the call allowed or not?
     Return;                                    
      this.xyImpl.foo();*/            
     }
}
