import java.util.Scanner;

public class HangingOutOnTheTerrace {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int limit = sc.nextInt();
        int cases = sc.nextInt();
        int total = 0;
        int rejected = 0;
        for (int i = 0; i < cases; i++) {
            String act = sc.next();
            int person = sc.nextInt();
            if (act.equals("enter")) {
                total += person;
                if (total > limit) {
                    rejected++;
                    total -= person;
                }
            } else {
                total -= person;
            }
        }
        System.out.println(rejected);
    }
}
