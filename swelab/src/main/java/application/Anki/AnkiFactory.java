package application.Anki;
import application.Anki.port.Anki;
public interface AnkiFactory {
 AnkiFactory  FACTORY = new AnkiFacede();            // static access to the facade
 Anki Anki();             
   // return the implementation of the interface Xy
 }