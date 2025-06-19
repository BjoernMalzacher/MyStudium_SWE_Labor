package application.backend.timer.port;

public interface timer {
    
    public double stop();
    public boolean start();
    public double getTime();
    public boolean pause();
}
