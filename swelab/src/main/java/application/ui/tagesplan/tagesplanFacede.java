package application.ui.tagesplan;

import application.statemachine.StateMachineFactory;
import application.statemachine.port.StateMachine;
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
      /*if (!stateMachine.getState().isSubStateOf(...))//is the call allowed or not?
          return tagesplanImpl.foo();            
     }*/
   }
 @Override
 public String LoadLerneinheit(String LerneinheitID) {
  // TODO Auto-generated method stub
  throw new UnsupportedOperationException("Unimplemented method 'LoadLerneinheit'");
 }
 @Override
 public String[] LoadLerneinheitList() {
  // TODO Auto-generated method stub
  throw new UnsupportedOperationException("Unimplemented method 'LoadLerneinheitList'");
 }
 @Override
 public boolean speichereFortschritt(String LerneinheitID, float progress) {
  // TODO Auto-generated method stub
  throw new UnsupportedOperationException("Unimplemented method 'speichereFortschritt'");
 }
 @Override
 public void selectLerneinheit(String LerneinheitID) {
  // TODO Auto-generated method stub
  throw new UnsupportedOperationException("Unimplemented method 'selectLerneinheit'");
 }
 @Override
 public void finishDay() {
  // TODO Auto-generated method stub
  throw new UnsupportedOperationException("Unimplemented method 'finishDay'");
 }
}