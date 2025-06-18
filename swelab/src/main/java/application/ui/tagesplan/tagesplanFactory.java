package application.ui.tagesplan;

import application.ui.tagesplan.port.tagesplan;
import application.ui.tagesplan.tagesplanFacede;
public interface tagesplanFactory {
   tagesplanFactory FACTORY = new tagesplanFacede();            // static access to the facade
  tagesplan tagesplan();             
   // return the implementation of the interface Xy
 }