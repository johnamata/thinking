import java.util.*;

public class ProvincesAndGold{
    public static void main(String[]args){
	Scanner sc = new Scanner(System.in);
	int g,s,c;
	g = sc.nextInt();
	s = sc.nextInt();
	c = sc.nextInt();
	int buy = (g*3) + (s*2) + c;

	if(buy >= 8){
	    System.out.println("Province or Gold");
	} else if(buy >= 6){
	    System.out.println("Duchy or Gold");
	} else if (buy >= 5){
	    System.out.println("Duchy or Silver");
	} else if (buy>=3){
	    System.out.println("Estate or Silver");
	} else if (buy >= 2){
	    System.out.println("Estate or Copper");
	} else if (buy >= 0){
	    System.out.println("Copper");
	}
    }
}
