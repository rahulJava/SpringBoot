import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.Scanner;

public class DaYOnWhichTuesdayFalls 
{
	
	  
	// Driver Program to test above function 
	public static void main(String arg[]) 
	{ 
		Calendar one ;
		Scanner sc = new Scanner(System.in);
		int year = sc.nextInt();
		int count=0;
	
		int i;
		for( i=0;i<31;i++)
		{
			one =  new GregorianCalendar(year, Calendar.OCTOBER, i);
			int day = one.get(Calendar.DAY_OF_WEEK);
			if(day==3)
			{
				count++;
				if(count==2)
				{
					
					break;
				}
			}
		}
	   
	    System.out.print(i); 
	} 

}
