package in.Rushi;

import java.util.Scanner;

public class PrimeNumber {
    public static void main(String[] args) {
        System.out.println("Number is prime or not!!");

        Scanner obj = new Scanner(System.in);
        System.out.print("Enter the number:");
        int num = obj.nextInt();

        boolean isPrime = isPrime(num);
        System.out.println("The given number is " + (isPrime ? "prime" : "Not Prime"));

    }

    public static boolean isPrime(int num){

        int i = 2;

        while (i < num){
            if(num % i == 0){
                return false;
            }
            i++;
        }

        return  true;

    }
}


