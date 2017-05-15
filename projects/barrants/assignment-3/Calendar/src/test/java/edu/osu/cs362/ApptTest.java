package edu.osu.cs362;
/**
 *  This class provides a basic set of test cases for the
 *  Appt class.
 */
import org.junit.Test;

import static org.junit.Assert.*;

public class ApptTest {
    /**
     * Test that the gets methods work as expected.
     */
	 @Test
 	public void test01()  throws Throwable  {
		 int startHour=13;
		 int startMinute=30;
		 int startDay=10;
		 int startMonth=4;
		 int startYear=2017;
		 String title="Birthday Party";
		 String description="This is my birthday party.";
		//Construct a new Appointment object with the initial data	 
		 Appt appt = new Appt(startHour,
		          startMinute ,
		          startDay ,
		          startMonth ,
		          startYear ,
		          title,
		         description);
		 // assertions
		 assertTrue(appt.getValid());
		 assertEquals(13, appt.getStartHour());
		 assertEquals(30, appt.getStartMinute());
		 assertEquals(10, appt.getStartDay());
		 assertEquals(04, appt.getStartMonth());
		 assertEquals(2017, appt.getStartYear());
		 assertEquals("Birthday Party", appt.getTitle());
		 assertEquals("This is my birthday party.", appt.getDescription());         		
		 appt.toString();
	}
 	 @Test
	public void test02() throws Throwable  {
		 int startHour=3;
		 int startMinute=-30;
		 int startDay=-10;
		 int startMonth=-4;
		 int startYear=-2017;
		 String title="Birthday Party";
		 String description="This is my birthday party.";
		//Construct a new Appointment object with the initial data	 
		 Appt appt = new Appt(startHour,
		          startMinute ,
		          startDay ,
		          startMonth ,
		          startYear ,
		          title,
		         description);
		 // assertions
		 appt.setStartHour(startHour);
		 appt.setStartMinute(startMinute);
		 appt.setStartDay(startDay);
		 appt.setStartMonth(startMonth);
		 appt.setStartYear(startYear);
		 appt.setDescription("Hello");
		 appt.setDescription(null);
		 appt.setTitle(null);
	         appt.toString();
	 	 appt.setStartHour(0);
		 appt.toString();
		 appt.setStartHour(-3);
		 appt.setStartMinute(-3);
		 appt.setStartDay(-3);
		 appt.setStartMonth(-3);
		 appt.setStartYear(-3);
		 appt.toString();
		appt.setStartHour(10);
		appt.setStartMinute(10);
		appt.toString();
		appt.setStartDay(10);
		appt.toString();
		}
	 @Test
	public void test03() throws Throwable {
		 int startHour=3;
                 int startMinute=30;
                 int startDay=-10;
                 int startMonth=4;
                 int startYear=2017;
                 String title="Birthday Party";
                 String description="This is my birthday party.";
                //Construct a new Appointment object with the initial data       
                 Appt appt = new Appt(startHour,
                          startMinute ,
                          startDay ,
                          startMonth ,
                          startYear ,
                          title,
                         description);
		appt.toString();
	}
	 @Test
	public void test04() throws Throwable {
		 int startHour=3;
                 int startMinute=30;
                 int startDay=10;
                 int startMonth=-4;
                 int startYear=2017;
                 String title="Birthday Party";
                 String description="This is my birthday party.";
                //Construct a new Appointment object with the initial data       
                 Appt appt = new Appt(startHour,
                          startMinute ,
                          startDay ,
                          startMonth ,
                          startYear ,
                          title,
                         description);
		appt.toString();
	}
	public void test05() throws Throwable {
		 int startHour=20;
                 int startMinute=30;
                 int startDay=10;
                 int startMonth=4;
                 int startYear=2017;
                 String title="Birthday Party";
                 String description="This is my birthday party.";
                //Construct a new Appointment object with the initial data       
                 Appt appt = new Appt(startHour,
                          startMinute ,
                          startDay ,
                          startMonth ,
                          startYear ,
                          title,
                         description);
		appt.toString();
		appt.setStartHour(0);
		appt.toString();
	}
	 @Test
	public void test06()  throws Throwable  {
		 int startHour=0;
		 int startMinute=30;
		 int startDay=10;
		 int startMonth=4;
		 int startYear=2017;
		 String title="Birthday Party";
		 String description="This is my birthday party.";
		//Construct a new Appointment object with the initial data	 
		 Appt appt = new Appt(startHour,
		          startMinute ,
		          startDay ,
		          startMonth ,
		          startYear ,
		          title,
		         description);
		 // assertions
		 appt.toString();
		assertTrue(appt.getValid());
		 assertEquals(30, appt.getStartMinute());
		 assertEquals(10, appt.getStartDay());
		 assertEquals(04, appt.getStartMonth());
		 assertEquals(2017, appt.getStartYear());
		 assertEquals("Birthday Party", appt.getTitle());
		 assertEquals("This is my birthday party.", appt.getDescription());         		
		 appt.toString();
	}






}
