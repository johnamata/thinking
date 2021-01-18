import java.util.Scanner;

public class NastyHacks {
    public static void main (String[]args){
        Scanner scanInput = new Scanner (System.in);
        int n = scanInput.nextInt();
        for (int i = 0; i < n; i++){
            int r = scanInput.nextInt();
            int e = scanInput.nextInt();
            int c = scanInput.nextInt();
            int x = e-c;
            if (x == r) {
                System.out.println("does not matter");
            } else if (x < r){
                System.out.println("do not advertise");
            } else if(x > r){
                System.out.println("advertise");
            }
        }
    }
}
