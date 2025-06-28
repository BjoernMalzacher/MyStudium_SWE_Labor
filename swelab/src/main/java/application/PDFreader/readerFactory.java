package application.PDFreader;
import application.PDFreader.port.reader;
import application.PDFreader.readerFacede;

public interface readerFactory {
 readerFactory FACTORY = new readerFacede();            // static access to the facade
 reader reader();             
   // return the implementation of the interface Xy
 }