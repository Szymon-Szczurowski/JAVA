public class Main {
    public static void main(String[] args) {
        double weight = 70;
        float height = 1.75f;

        float bmi  = (float)(weight / Math.pow(height, 2));

        System.out.println("BMI: " + bmi);

        int bmiConverted = (int)bmi;

        System.out.println("BMI int: " + bmiConverted);
    }
}
