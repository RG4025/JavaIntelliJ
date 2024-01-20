package in.Rushi;

import java.util.Scanner;

public class ReverseNumber {
    public static void main(String[] args) {
        System.out.println("Reversing the Given Number!!");

        Scanner obj = new Scanner(System.in);
        System.out.print("Enter the Number :");
        int num = obj.nextInt();

        System.out.printf("The number is reversed as %s", reverse(num));


    }

    public  static int reverse(int num){

        int rev = 0;

        while (num > 0){
            int digit = num % 10;
            rev = (rev * 10) + digit;
            num/= 10;
        }

        return  rev;
    }
}
