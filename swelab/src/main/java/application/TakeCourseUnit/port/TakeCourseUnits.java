package application.TakeCourseUnit.port;

import java.time.LocalDateTime;
import java.util.Date;

public interface TakeCourseUnits {
    
    public Unit[] LoadUnitsForDay(LocalDateTime currentDay);
    public Unit chooseUnit(String id);
    public Exam EvaluateExam(Exam finishedExam);
    public PlanEvaluation adjustPlan(Unit[] progressedUnits);
    


}
