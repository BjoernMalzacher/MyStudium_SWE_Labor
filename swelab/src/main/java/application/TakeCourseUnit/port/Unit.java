package application.TakeCourseUnit.port;
import java.time.LocalDateTime;
import java.util.Date;
public interface Unit {
    public LocalDateTime getDate();

    public float getProgress();

    public String getPath();

    public void setProgress(float f);
}
