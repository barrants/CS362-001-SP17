package edu.osu.cs362;
/**
 *  This class provides a basic set of test cases for the
 *  CalDay class.
 */
import java.util.Calendar;
import java.util.GregorianCalendar;


import org.junit.Test;

import static org.junit.Assert.*;

public class CalDayTest {

	 @Test
	  public void test01()  throws Throwable  {
		CalDay calday = new CalDay ();
		calday.iterator();
		calday.toString();
	 }
	 @Test
	 public void test02()  throws Throwable  {
	 	//GregorianCalendar calendar = new GregianCalendar(pdt);	 
		 int startHour=3;
                 int startMinute=-30;
                 int startDay=-10;
                 int startMonth=-4;
                 int startYear=-2017;
                 String title="Birthday Party";
                 String description="This is my birthday party.";
                //Construct a new Appointment object with the initial data       
                 Appt appt = new Appt(startHour,
                          startMinute,
                          startDay,
                          startMonth,
                          startYear,
                          title,
                         description);

		GregorianCalendar cal = new GregorianCalendar();
		CalDay calday = new CalDay(cal);
		assertNotNull(calday.iterator());
		calday.addAppt(appt);
		assertTrue(calday.isValid());
		calday.getAppts();
		assertNotNull(calday.getSizeAppts());
		assertNotNull(calday.getDay());
		assertNotNull(calday.getMonth());
		assertNotNull(calday.getYear());
		assertNotNull(calday.toString());
		assertNotNull(calday.iterator());
	 }
	@Test
	 public void test03()  throws Throwable  {
	 	//GregorianCalendar calendar = new GregianCalendar(pdt);	 
		
		 int startHour=3;
                 int startMinute=-30;
                 int startDay=-10;
                 int startMonth=-4;
                 int startYear=-2017;
                 String title="Birthday Party";
                 String description="This is my birthday party.";
                //Construct a new Appointment object with the initial data       
                 Appt appt = new Appt(startHour,
                          startMinute,
                          startDay,
                          startMonth,
                          startYear,
                          title,
                         description);
		Appt appt2 = new Appt(7,
                          22,
                          4,
                          4,
                          2017,
                          "memes meeting",
                         "these are  the best memes");
		Appt appt3 = new Appt(8,
                          23,
                          4,
                          4,
                          2017,
                          "memes meeting2",
                         "these are not the best memes");
		Appt appt4 = new Appt(21,
                          4,
                          8,
                          3,
                          2017,
                          "ok memes meeting",
                         "the ok memes of the memes");
		Appt appt5 = new Appt(20,
                          4,
                          8,
                          3,
                          2017,
                          "sad memes meeting",
                         "the saddest of the memes");
		Appt appt6 = new Appt(21,
                          4,
                          8,
                          3,
                          2017,
                          "meme memes meeting",
                         "the memest of the memes");
		GregorianCalendar cal = new GregorianCalendar();
		CalDay calday = new CalDay(cal);
		assertNotNull(calday.iterator());
		calday.addAppt(appt);
		assertTrue(calday.isValid());
		assertNotNull(calday.getAppts());
		calday.addAppt(appt2);
		calday.addAppt(appt3);
		calday.addAppt(appt4);
		calday.addAppt(appt5);
		calday.addAppt(appt6);
		assertNotNull(calday.getAppts());
		assertNotNull(calday.getSizeAppts());
		assertNotNull(calday.getDay());
		assertNotNull(calday.getMonth());
		assertNotNull(calday.getYear());
		assertNotNull(calday.toString());
		assertNotNull(calday.iterator());
	 }
}
