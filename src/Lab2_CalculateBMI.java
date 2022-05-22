import java.util.Scanner;
import java.lang.Math;
public class Lab2_CalculateBMI {
    public static void main(String[] args) {
        float height, weight;
        Scanner in = new Scanner(System.in);
        System.out.print("Please input height \t");
        height = in.nextFloat();
        System.out.print("Please input weight \t");
        weight = in.nextFloat();
        float BMI = weight / (height * height);
        System.out.print("BMI is " + BMI + "\n");
        // Lab 2.3 Suggest user to increase/decrease weight
        String normalWeightMin = String.format("%.02f", Math.abs(weight-(18.5 * height * height)));
        String normalWeightMax = String.format("%.02f", Math.abs(weight-(24.9 * height * height)));
        if (BMI <= 18.5) {
            System.out.print("You are under weight, Please increase your weight from \t");
            System.out.print(normalWeightMin + "kg\t");
            System.out.print("to \t");
            System.out.print(normalWeightMax + "kg");
        } else if (BMI > 18.5 && BMI < 24.9) {
            System.out.print("You are normal weight");
        } else if (BMI >= 25 && BMI <= 29.9) {
            System.out.print("You are over weight, Please decrease your weight from \t");
            System.out.print(normalWeightMax + "kg\t");
            System.out.print("to \t");
            System.out.print(normalWeightMin + "kg");
        } else {
            System.out.print("You are over Obesity, Please decrease your weight from \t");
            System.out.print(normalWeightMax + "kg \t");
            System.out.print("to \t");
            System.out.print(normalWeightMin + "kg");
        }
    }
}
