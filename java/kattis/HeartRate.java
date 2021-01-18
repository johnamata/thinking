import java.util.Scanner;
public class HeartRate {
    public static void main (String[]args){
        Scanner scanInput = new Scanner (System.in);
        int n = scanInput.nextInt();
        for(int i = 0; i < n; i++){
            double b = scanInput.nextDouble();
            double p = scanInput.nextDouble(); //time

            double calbpm = (60*b)/p;
            double minabpm = (calbpm - (60/p));
            double maxabpm = calbpm + (60/p);
            System.out.printf("%.4f %.4f %.4f", minabpm, calbpm, maxabpm); //cut to 4 decimal places
            System.out.println();
        }
    }
}
