import java.util.Scanner;

public class Lab2_RecognizeNumber_Odd_Even {
    public static void main(String[] args) {
        float number;
        Scanner in = new Scanner(System.in);
        System.out.print("Please input number is integer type \t");
        number=in.nextInt();
        if(number%2==0)
        {
            System.out.print("Number is Even");
        }
        else
        {
            System.out.print("Number is Odd");
        }
    }
}
