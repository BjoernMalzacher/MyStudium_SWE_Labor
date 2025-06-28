package application.TakeCourseUnit;

import java.time.LocalDateTime;
import application.TakeCourseUnit.impl.TakeCourseUnitImpl;
import application.TakeCourseUnit.port.Unit;
import application.TakeCourseUnit.impl.Lernplan;

public interface TakeCourseUnitFactory {
  TakeCourseUnitFactory FACTORY = new TakeCourseUnitFacede();            // static access to the facade
  TakeCourseUnitImpl TakeCourseUnits(Lernplan plan);
  Unit Unit(LocalDateTime date, String path);
  Lernplan Lernplan(Unit[] units);
}