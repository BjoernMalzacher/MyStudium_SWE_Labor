package application.backend.timer;

import application.backend.timer.port.timer;
public interface timerFactory {
    timerFactory FACTORY = new timerFacade(); // static access to the facade
    timer timer(); // return the implementation of the interface Xy
}