import java.util.Scanner;

public class Oddities {
    public static void main (String[]args){
        Scanner scanInput = new Scanner (System.in);
        int x = scanInput.nextInt();
        for(int i = 0; i < x; i++){
            int j = scanInput.nextInt();
            if(j%2 == 0){
                System.out.println(j + " is even");
            } else {
                System.out.println(j + " is odd");
            }
        }
    }
}
