import java.util.Scanner;
public class R2 {

    public static void main(String[] args) {
        // write your code here
        Scanner scanInput = new Scanner (System.in);
        int x;
        x = scanInput.nextInt();
        int y; //the mean
        y = scanInput.nextInt();
        int r2 = (y*2)-(x);

        System.out.println(r2);
    }
}
