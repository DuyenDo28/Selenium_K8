package lab6;

import java.util.Scanner;

public class Lab_6_2_AllowUserInputWrongPasswordMaximum3Times {

    public static void main(String[] args) {
        String myPassword = "password123";
        // declare how manytimes user input wrong password
        int TimesOfInputWrongPassWord=0;
        while(TimesOfInputWrongPassWord <= 3){
            Scanner in = new Scanner(System.in);
            System.out.printf("Please input ur password");
            String UserInput = in.nextLine();
            if(!UserInput.equals("password123"))
            {
                TimesOfInputWrongPassWord++;
            }
            if (TimesOfInputWrongPassWord==3)
            {
                System.out.printf("You already inputted wrong password 3 times so program must stop now ");
                break;
            }

        }

    }


}
