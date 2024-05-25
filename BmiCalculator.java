public class BmiCalculator {
    public static void main(String[] args) {
        double weight = 60;
        double height = 5.5;
        double heightinmeters = height*0.4536;
        double BMI = weight /(heightinmeters*heightinmeters);
        System.out.println("BMI:"+ BMI);
    }
}
