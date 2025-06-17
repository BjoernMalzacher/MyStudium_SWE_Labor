package application.ui.karteikartenersteller;

public interface KarteikartenFactory {
 KarteikartenFactory  FACTORY = new KarteikartenFacede();            // static access to the facade
 port.karteikartenersteller karteikartenersteller();             
   // return the implementation of the interface Xy
 }