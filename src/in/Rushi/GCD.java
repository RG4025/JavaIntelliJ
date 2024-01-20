package in.Rushi;

import java.util.Scanner;

public class GCD {
    public static void main(String[] args) {
        System.out.println("Calculating the greatest common divisor among two numbers!! ");

        Scanner obj = new Scanner(System.in);
        System.out.print("Enter First Number :");
        int num1 = obj.nextInt();

        System.out.print("Enter Second Number :");
        int num2 = obj.nextInt();
        int gcd = gcd(num1,num2);
        System.out.println("The common divisor of " + num1 + " And " + num2 + " is :" + gcd);

    }

    public static int gcd(int num1, int num2){

        int small = smallDigit(num1,num2);
        int gcd =0;
        for (int i = 1; i < small ; i++) {

            if((num1 % i == 0) && ( num2 % i ==0)){
                gcd = i;
            }
        }

        return gcd;

    }

    public static int smallDigit(int num1, int num2){

        if (num1 > num2){
            System.out.println(num2);
            return  num2;
        }
        return num1;
    }
}
