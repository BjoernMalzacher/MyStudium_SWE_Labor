package application.ui.tagesplan;

public class pruefinterfaceFacede implements XyFactory, port.Xy { 
 private impl.XyImpl xyImpl;
 private StateMachine stateMachine;
 public port.Xy xy(){
    if 
(this.xyImpl == null){                    // lazy initialization
 this.stateMachine = StateMachineFactory.FACTORY.stateMachine();
 this.xyImpl = new port.XyImpl(/* more args */);
 return this;
 }
 // delegate to the right implementation
 public void foo(){
      if 
(!stateMachine.getState().isSubStateOf(...))//is the call allowed or not?
 Return;                                    
      this.xyImpl.foo();            
     }
   }