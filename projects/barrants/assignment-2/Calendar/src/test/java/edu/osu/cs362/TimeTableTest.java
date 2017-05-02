package edu.osu.cs362;
/**
 *  This class provides a basic set of test cases for the
 *  TimeTable class.
 */
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.LinkedList;
import java.util.List;


import org.junit.Test;

import static org.junit.Assert.*;

public class TimeTableTest {

	 @Test
	  public void test01()  throws Throwable  {
                TimeTable timetable = new TimeTable();
	 }

        @Test 
	public void test02()  throws Throwable  {
                 TimeTable timetable = new TimeTable();
		//GregorianCalendar calendar = new GregianCalendar(pdt);         
                 int startHour=-1;
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
                          2014,
                          "sad memes meeting",
                         "the saddest of the memes");
                Appt appt6 = new Appt(-21,
                          -4,
                          -8,
                          -3,
                          -2017,
                          "meme memes meeting",
                         "the memest of the memes");
                GregorianCalendar cal = new GregorianCalendar();
         	GregorianCalendar cal2 = new GregorianCalendar();
	        cal2.set(GregorianCalendar.YEAR, 2018);
		CalDay calday = new CalDay(cal);
        	CalDay calday2 = new CalDay(cal);
		calday2.addAppt(appt3);
		calday2.addAppt(appt5);
	        calday.addAppt(appt);
                calday.addAppt(appt2);
                calday.addAppt(appt3);
                calday.addAppt(appt4);
                calday.addAppt(appt5);
                calday.addAppt(appt6);
		LinkedList<Appt> appts = new LinkedList<Appt>();
		LinkedList<Appt> appts2 = new LinkedList<Appt>();
		timetable.getApptRange(calday.getAppts(), cal, cal2);
		timetable.getApptRange(calday2.getAppts(), cal, cal2);
		timetable.deleteAppt(appts, null);
		appts.add(appt);
		appts.add(appt4);
         	appts.add(null);
		appts2.add(appt3);
		appts2.add(appt5);
		timetable.deleteAppt(appts2, appt3);
		timetable.deleteAppt(appts2, appt5);
	}
}



