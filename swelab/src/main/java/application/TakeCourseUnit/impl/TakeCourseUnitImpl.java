package application.TakeCourseUnit.impl;

import java.util.ArrayList;
import java.time.LocalDateTime;

import application.TakeCourseUnit.port.Exam;
import application.TakeCourseUnit.port.PlanEvaluation;
import application.TakeCourseUnit.port.TakeCourseUnits;
import application.TakeCourseUnit.port.Unit;

public class TakeCourseUnitImpl implements TakeCourseUnits {
private Lernplan correspondingPlan;
    public TakeCourseUnitImpl(Lernplan plan){
        this.correspondingPlan = plan;
    }

    public Unit[] LoadUnitsForDay(LocalDateTime currentDay){
        Unit[] list = correspondingPlan.getUnitList();
        return filterBy(currentDay,list);

    }

    private Unit[] filterBy(LocalDateTime currentDay, Unit[] list) {
        ArrayList<Unit> filteredList = new ArrayList<Unit>();
        for (int i = 0; i < list.length; i++) {
            if(list[i].getDate().getYear() == currentDay.getYear() && 
            list[i].getDate().getDayOfYear() == currentDay.getDayOfYear()){
                filteredList.add(list[i]);
            }
        }
        return filteredList.toArray(new Unit[0]);
    }

    @Override
    public Unit chooseUnit(String id) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'chooseUnit'");
    }

    @Override
    public Exam EvaluateExam(Exam finishedExam) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'EvaluateExam'");
    }

    @Override
    public PlanEvaluation adjustPlan(Unit[] progressedUnits) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'adjustPlan'");
    };
}
