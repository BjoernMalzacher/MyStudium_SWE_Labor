package application.ui.karteikartenersteller;
import application.ui.karteikartenersteller.port.Karteikartenersteller;
public interface KarteikartenFactory {
 KarteikartenFactory  FACTORY = new KarteikartenFacede();            // static access to the facade
 Karteikartenersteller karteikartenersteller();             
   // return the implementation of the interface Xy
 }