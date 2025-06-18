package application.ui.reader;
import application.statemachine.StateMachineFactory;
import application.statemachine.port.StateMachine;
import application.ui.reader.readerFactory;
import application.ui.reader.impl.readerImpl;
import application.ui.reader.port.reader;
public class readerFacede implements readerFactory, reader { 
 private readerImpl readerImpl;
 private StateMachine stateMachine;
 public reader reader(){
    if 
(this.readerImpl == null){                    // lazy initialization
 this.stateMachine = StateMachineFactory.FACTORY.stateMachine();
 this.readerImpl= new readerImpl(/* more args */);

}
 return this;
 }
 // delegate to the right implementation
 public void foo(){
      if (!stateMachine.getState().isSubStateOf(...))//is the call allowed or not?
          return this.readerImpl.foo();            
     }
   }