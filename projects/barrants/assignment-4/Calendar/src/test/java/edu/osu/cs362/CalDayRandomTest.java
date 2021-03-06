package edu.osu.cs362;


import org.junit.Test;
import java.util.Random;
import java.util.Calendar;
import java.util.GregorianCalendar;


import static org.junit.Assert.*;



/**
 * Random Test Generator  for CalDay class.
 */

public class CalDayRandomTest {
	private static final long TestTimeout = 60 * 500 * 1; /* Timeout at 30 seconds */
        private static final int NUM_TESTS=100;	
/*
    public static String RandomSelectMethod(Random random){
        String[] methodArray = new String[] {"setTitle","setDescription"};// The list of the of methods to be tested in the Appt class

        int n = random.nextInt(methodArray.length);// get a random number between 0 (inclusive) and  methodArray.length (exclusive)

        return methodArray[n] ; // return the method name 
        }  
*/
    /**
     * Generate Random Tests that tests CalDay Class.
     */
	 @Test
	  public void radnomtest()  throws Throwable  {
                 long startTime = Calendar.getInstance().getTimeInMillis();
                 long elapsed = Calendar.getInstance().getTimeInMillis() - startTime;		 
	 	 System.out.println("Start testing...");
		for (int iteration = 0; elapsed < TestTimeout; iteration++) {		
			GregorianCalendar cal = new GregorianCalendar();
			CalDay calday = new CalDay(cal);

			long randomseed = 10;//System.currentTimeMillis();
			Random random = new Random(randomseed);

			 int startHour=13;
			 int startMinute=30;
			 int startDay=10;
			 int startMonth=4;
			 int startYear=2017;

			 String title="Birthday Party";
			 String description="This is my birthday party.";
			 //Construct a new Appointment object with the initial data      
			 Appt appt1 = new Appt(startHour,
				  startMinute ,
				  startDay ,
				  startMonth ,
				  startYear ,
				  title,
				 description);
			 for (int i = 0; i < NUM_TESTS; i++) {
				 String newTitle=(String) ValuesGenerator.getString(random);
				 startHour=random.nextInt(60)-30;
				 startMinute=random.nextInt(200)-100;
				 startDay=random.nextInt(100)-50;
				 startMonth=random.nextInt(50)-25;
				 startYear=random.nextInt(5000)-2000;
				 appt1.setTitle(newTitle);
				 appt1.setStartDay(startDay);
				 appt1.setStartHour(startHour);
				 appt1.setStartMinute(startMinute);
				 appt1.setStartMonth(startMonth);
				 appt1.setStartYear(startYear);

				 Appt appt2 = new Appt(startHour,
					  startMinute ,
					  startDay ,
					  startMonth ,
					  startYear ,
					  title,
					 description);
				 startHour=random.nextInt(60)-30;
				 startMinute=random.nextInt(200)-100;
				 startDay=random.nextInt(100)-50;
				 startMonth=random.nextInt(50)-25;
				 startYear=random.nextInt(5000)-2000;
				 appt2.setTitle(newTitle);
				 appt2.setStartDay(startDay);
				 appt2.setStartHour(startHour);
				 appt2.setStartMinute(startMinute);
				 appt2.setStartMonth(startMonth);
				 appt2.setStartYear(startYear);

				 Appt appt3 = new Appt(startHour,
					  startMinute ,
					  startDay ,
					  startMonth ,
					  startYear ,
					  title,
					 description);
				 startHour=random.nextInt(60)-30;
				 startMinute=random.nextInt(200)-100;
				 startDay=random.nextInt(100)-50;
				 startMonth=random.nextInt(50)-25;
				 startYear=random.nextInt(5000)-2000;
				 appt3.setTitle(newTitle);
				 appt3.setStartDay(startDay);
				 appt3.setStartHour(startHour);
				 appt3.setStartMinute(startMinute);
				 appt3.setStartMonth(startMonth);
				 appt3.setStartYear(startYear);

				 calday.addAppt(appt1);		
				 calday.addAppt(appt2);		
				 calday.addAppt(appt3);

			}
				elapsed = (Calendar.getInstance().getTimeInMillis() - startTime);
                                if((iteration%10000)==0 && iteration!=0 )
                                      System.out.println("elapsed time: "+ elapsed + " of "+TestTimeout);
		}
	}
}
