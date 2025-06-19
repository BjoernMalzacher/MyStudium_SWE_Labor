package application.ui.tagesplan.port;

public interface tagesplan {
    public String LoadLerneinheit(String LerneinheitID);
    public String[] LoadLerneinheitList();
    public boolean speichereFortschritt(String LerneinheitID, float progress);
    public void selectLerneinheit(String LerneinheitID);
    public void finishDay();
}
