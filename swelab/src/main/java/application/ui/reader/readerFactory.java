package application.ui.reader;

public class readerFactory {
    
}
public interface readerFactory {
 XyFactory FACTORY = new XyFacade();            // static access to the facade
 port.Xy xy();             
   // return the implementation of the interface Xy
 }