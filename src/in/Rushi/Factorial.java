package in.Rushi;

import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {
        System.out.println("Printing the factorial of a given number :");

        Scanner obj = new Scanner(System.in);
        System.out.print("Enter the number for factorial :");
        int num = obj.nextInt();
        System.out.println("Factorial of the " + num + " is : " + factorial(num));

    }

    public  static  long factorial(int num){

        Long fact = 1l;

        if(num < 2){
            return  1;

        }

        for (int i = 1; i <= num ; i++) {

            fact*= i;

        }


        return  fact;
    }
}
