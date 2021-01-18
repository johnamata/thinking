import java.util.Scanner;
/**
https://open.kattis.com/problems/cetvrta
 */
 
public class Cetvrta{
    public static void main(String[]args){
    Scanner scanInput = new Scanner(System.in);
        int x = 0;
        int y = 0;
        for (int i = 0; i < 3; i++) {
            //using xor
            x ^= scanInput.nextInt();
            y ^= scanInput.nextInt();
        }
        System.out.println(x + " " + y);
    }
}
