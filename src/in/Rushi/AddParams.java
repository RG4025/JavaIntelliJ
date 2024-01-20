package in.Rushi;

import java.util.Scanner;

public class AddParams {

    public static void main(String[] args) {
        System.out.println("Adding the two numbers using the parametarized merhod:");

        Scanner obj = new Scanner(System.in);
        System.out.print("Enter the first number :");
        int num1 = obj.nextInt();

        System.out.print("Enter the second number :");
        int num2 = obj.nextInt();

       int sum =  AddParams.add(num1,num2);
        System.out.print("Addition is :" + sum);


    }

    public static int add(int num1, int num2){
        return num1 + num2;
    }
}
