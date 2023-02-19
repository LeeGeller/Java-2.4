import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        BmiService service = new BmiService();
        int hight = 160;
        int weight = 45;

        int bmi = service.bmiService(hight, weight);
        System.out.println(bmi);

    }
}