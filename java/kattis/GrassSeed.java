import java.util.Scanner;
public class GrassSeed {
    public static void main(String[]args) {
        Scanner scanInput = new Scanner (System.in);
        double seed_cost = scanInput.nextDouble();
        int lawn_number = scanInput.nextInt();
        double cost_sow = 0;
        for (int i = 0 ; i < lawn_number; i++){
            double lawn_width = scanInput.nextDouble();
            double lawn_length = scanInput.nextDouble();
            cost_sow += lawn_width * lawn_length * seed_cost;
        }
        System.out.println(cost_sow);
    }
}
