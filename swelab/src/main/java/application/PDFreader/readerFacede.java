package application.PDFreader;
import application.statemachine.StateMachineFactory;
import application.statemachine.port.State;
import application.statemachine.port.StateMachine;
import application.PDFreader.readerFactory;
import application.PDFreader.impl.readerImpl;
import application.PDFreader.port.PDF;
import application.PDFreader.port.reader;
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
 @Override
 public PDF loadFile(String Path) {
   if (!stateMachine.getState().isSubStateOf(State.S.LOAD_UNIT))
         return null;     
   return null;
 }
   }