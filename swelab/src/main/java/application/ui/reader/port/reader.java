package application.ui.reader.port;

public interface reader {
    public boolean loadFile(String Path);
    //Specialized readers as private functions in impl
    public String getTypeOfLerneinheit(String LerneinheitID);
    public boolean closeCurrentFile();
}
