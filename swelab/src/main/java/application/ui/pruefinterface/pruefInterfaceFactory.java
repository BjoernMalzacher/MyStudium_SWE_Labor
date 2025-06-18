package application.ui.pruefinterface;

import application.ui.pruefinterface.port.pruefinterface;

public interface pruefInterfaceFactory {
 pruefInterfaceFactory FACTORY = new pruefinterfaceFacede();            // static access to the facade
 pruefinterface pruefinterface();             
   // return the implementation of the interface Xy
 }