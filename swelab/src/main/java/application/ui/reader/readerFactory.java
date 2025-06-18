package application.ui.reader;
import application.ui.reader.port.reader;

public interface readerFactory {
 readerFactory FACTORY = new readerFacede();            // static access to the facade
 reader reader();             
   // return the implementation of the interface Xy
 }