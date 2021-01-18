import java.util.Scanner;
import java.util.Calendar;

/**
https://open.kattis.com/problems/datum
*/

public class Datum{
    public static void main(String[]args){
	Scanner scanInput = new Scanner(System.in);
	Calendar cal = Calendar.getInstance();
	
	int D = scanInput.nextInt();
	int M = scanInput.nextInt();
	
	String[] dayOfTheWeek = new String[]{"","Sunday","Monday","Tuesday","Wednesday","Thursday","Friday","Saturday"};
	cal.set(2009, M - 1, D);
	
	System.out.println(dayOfTheWeek[cal.get(Calendar.DAY_OF_WEEK)]);
    }
}
