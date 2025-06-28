package application;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.time.LocalDateTime;

import application.domain.DomainFactory;
import application.domain.port.Domain;
import application.statemachine.StateMachineFactory;
import application.statemachine.port.Observer;
import application.statemachine.port.State;
import application.statemachine.port.StateMachine;
import application.statemachine.port.Subject;
import application.statemachine.port.State.S;
import application.usecase.UseCaseFactory;
import application.usecase.port.UseCase;
import application.TakeCourseUnit.impl.TakeCourseUnitImpl;
import application.TakeCourseUnit.TakeCourseUnitFacede;
import application.TakeCourseUnit.impl.Lernplan;
import application.TakeCourseUnit.impl.UnitImpl;
import application.TakeCourseUnit.port.TakeCourseUnits;
import application.TakeCourseUnit.port.Unit;

class InitTest implements Observer {

	State s;

	@Test
	void test() {
		StateMachine stateMachine = StateMachineFactory.FACTORY.stateMachine();
		Assertions.assertNotNull(stateMachine);
		Subject subject = StateMachineFactory.FACTORY.subject();
		Assertions.assertEquals(stateMachine, subject);
		subject.attach(this);

		Assertions.assertTrue(stateMachine.getState().isSubStateOf(S.INITIAL_STATE));
		Assertions.assertEquals(S.INITIAL_STATE, this.s);
		subject.detach(this);

		Domain domain = DomainFactory.FACTORY.domain();
		Assertions.assertNotNull(domain);

		UseCase usecase = UseCaseFactory.FACTORY.usecase();
		Assertions.assertNotNull(usecase);

		usecase.sysop("test");
		Assertions.assertTrue(true);

	}
	@Test
	void test2() {
		TakeCourseUnitFacede TakeCourseUnitFacede= new TakeCourseUnitFacede();
		LocalDateTime date = LocalDateTime.now();
		LocalDateTime nextWeek = LocalDateTime.now().plusWeeks(1);
		Unit U1 = new UnitImpl(date, "Path/to/death");
		Unit U2 = new UnitImpl(date, "Path/to/death");
		Unit U3 = new UnitImpl(date, "Path/to/death");
		Unit U4 = new UnitImpl(date, "Path/to/death");
		Unit U5 = new UnitImpl(nextWeek, "Path/to/death");

		Unit[] list = new Unit[] {U1,U2,U3,U4};
		
		Unit[] emptylist = new Unit[] {};
		

		Unit[] list_Units = new Unit[] {U1,U2,U3,U5};
		
		Lernplan plan = new Lernplan(list);
		TakeCourseUnits TakeCourseUnitImpl = TakeCourseUnitFacede.TakeCourseUnits(plan);
		Unit[] filteredList = TakeCourseUnitImpl.LoadUnitsForDay(date);
		Assertions.assertEquals(filteredList.length, list.length);
	}

		@Test
	void test3() {
		TakeCourseUnitFacede TakeCourseUnitFacede= new TakeCourseUnitFacede();
		LocalDateTime date = LocalDateTime.now();
		LocalDateTime nextWeek = LocalDateTime.now().plusWeeks(1);
		Unit U1 = new UnitImpl(date, "Path/to/death");
		Unit U2 = new UnitImpl(date, "Path/to/death");
		Unit U3 = new UnitImpl(date, "Path/to/death");
		Unit U4 = new UnitImpl(date, "Path/to/death");
		Unit U5 = new UnitImpl(nextWeek, "Path/to/death");

		//Unit[] list = new Unit[] {U1,U2,U3,U4,U5};
		
		Unit[] emptylist = new Unit[] {};
		

		//Unit[] list_Units = new Unit[] {U1,U2,U3,U4,U5};
		
		Lernplan plan = new Lernplan(emptylist);
		TakeCourseUnits TakeCourseUnitImpl = TakeCourseUnitFacede.TakeCourseUnits(plan);
		Unit[] filteredList = TakeCourseUnitImpl.LoadUnitsForDay(date);


		Assertions.assertEquals(filteredList.length, 0);
	}


	@Test
	void test4() {
		TakeCourseUnitFacede TakeCourseUnitFacede= new TakeCourseUnitFacede();
		LocalDateTime date = LocalDateTime.now();
		LocalDateTime nextWeek = LocalDateTime.now().plusWeeks(1);

		Unit U1 = new UnitImpl(date, "Path/to/death");
		Unit U2 = new UnitImpl(date, "Path/to/death");
		Unit U3 = new UnitImpl(date, "Path/to/death");
		Unit U4 = new UnitImpl(date, "Path/to/death");
		Unit U5 = new UnitImpl(nextWeek, "Path/to/death");

		Unit[] list = new Unit[] {U1,U2,U3,U4,U5};
		
		Unit[] emptylist = new Unit[] {};
		

		Unit[] list_Units = new Unit[] {U1,U2,U3,U5};
		
		Lernplan plan = new Lernplan(list);
		TakeCourseUnits TakeCourseUnitImpl = TakeCourseUnitFacede.TakeCourseUnits(plan);
		Unit[] filteredList = TakeCourseUnitImpl.LoadUnitsForDay(nextWeek);

		
		Assertions.assertEquals(filteredList.length, 1);
	}


		@Test
	void test5() {
		TakeCourseUnitFacede TakeCourseUnitFacede= new TakeCourseUnitFacede();
		LocalDateTime date = LocalDateTime.now();
		LocalDateTime nextWeek = LocalDateTime.now().plusWeeks(1);

		Unit U1 = new UnitImpl(date, "Path/to/death");
		Unit U2 = new UnitImpl(date, "Path/to/death");
		Unit U3 = new UnitImpl(date, "Path/to/death");
		Unit U4 = new UnitImpl(nextWeek, "Path/to/death");
		Unit U5 = new UnitImpl(nextWeek, "Path/to/death");

		Unit[] list = new Unit[] {U1,U2,U3,U4,U5};
		
		Lernplan plan = new Lernplan(list);
		TakeCourseUnits TakeCourseUnitImpl = TakeCourseUnitFacede.TakeCourseUnits(plan);
		Unit[] filteredList = TakeCourseUnitImpl.LoadUnitsForDay(nextWeek);

		
		Assertions.assertEquals(filteredList.length, 2);
	}

			@Test
	void test6() {
		TakeCourseUnitFacede TakeCourseUnitFacede= new TakeCourseUnitFacede();
		LocalDateTime date = LocalDateTime.now();
		LocalDateTime nextWeek = LocalDateTime.now().plusWeeks(1);
		LocalDateTime nextWeek_times3 = LocalDateTime.now().plusWeeks(3);
		Unit U1 = new UnitImpl(date, "Path/to/death");
		Unit U2 = new UnitImpl(date, "Path/to/death");
		Unit U3 = new UnitImpl(nextWeek, "Path/to/death");
		Unit U4 = new UnitImpl(nextWeek, "Path/to/death");
		Unit U5 = new UnitImpl(nextWeek, "Path/to/death");
		Unit U6 = new UnitImpl(nextWeek_times3, "Path/to/death");
		Unit U7 = new UnitImpl(nextWeek_times3, "Path/to/death");
		Unit U8 = new UnitImpl(nextWeek_times3, "Path/to/death");
		Unit[] list = new Unit[] {U1,U2,U3,U4,U5,U6,U7,U8};
		
		Lernplan plan = new Lernplan(list);
		TakeCourseUnits TakeCourseUnitImpl = TakeCourseUnitFacede.TakeCourseUnits(plan);

		Unit[] filteredList = TakeCourseUnitImpl.LoadUnitsForDay(date);
		
		Assertions.assertEquals(filteredList.length, 2);
	}


	
	@Override
	public void update(State currentState) {
		this.s = currentState;
	}

}
