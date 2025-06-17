package application.ui.pruefinterface;

public interface pruefInterfaceFactory {
 XyFactory FACTORY = new XyFacade();            // static access to the facade
 port.Xy xy();             
   // return the implementation of the interface Xy
 }