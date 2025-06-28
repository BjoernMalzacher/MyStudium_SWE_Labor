package application.TakeCourseUnit;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Date;

import application.TakeCourseUnit.impl.Lernplan;
import application.TakeCourseUnit.impl.TakeCourseUnitImpl;
import application.TakeCourseUnit.impl.UnitImpl;
import application.TakeCourseUnit.port.Exam;
import application.TakeCourseUnit.port.PlanEvaluation;
import application.TakeCourseUnit.port.TakeCourseUnits;
import application.TakeCourseUnit.port.Unit;
import application.statemachine.StateMachineFactory;
import application.statemachine.port.State;
import application.statemachine.port.StateMachine;
import application.TakeCourseUnit.impl.TakeCourseUnitImpl;

public class TakeCourseUnitFacede implements TakeCourseUnitFactory, TakeCourseUnits { 

private TakeCourseUnitImpl TakeCourseUnitImpl;
private StateMachine stateMachine;
private Lernplan correspondingPlan;

public TakeCourseUnitFacede(){
     if (this.TakeCourseUnitImpl == null){
          this.stateMachine = StateMachineFactory.FACTORY.stateMachine();
     }
}

@Override
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
    return (Unit[]) filteredList.toArray();
}

@Override
public Unit chooseUnit(String id) {
        if (!stateMachine.getState().isSubStateOf(State.S.SELECT_UNIT))
            return null;     
    return null;
}

@Override
public Exam EvaluateExam(Exam finishedExam) {
    if (!stateMachine.getState().isSubStateOf(State.S.EVALUATE_TEST))
        return null;     
    return null;
}

@Override
public PlanEvaluation adjustPlan(Unit[] progressedUnits) {
    if (!stateMachine.getState().isSubStateOf(State.S.ADJUST_PLAN))
        return null;     

    return null;
}

@Override
public TakeCourseUnitImpl TakeCourseUnits(Lernplan plan) {
    return new TakeCourseUnitImpl(plan);
}

@Override
public Unit Unit(LocalDateTime date, String path) {
    return new UnitImpl(date, path);
}

@Override
public Lernplan Lernplan(Unit[] units) {
    return new Lernplan(units);
}
}
