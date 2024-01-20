package in.Rushi;

import java.util.Scanner;

public class PrimeNumberUptoGivenNumber {
    public static void main(String[] args) {
        System.out.println("Printing the prime numbers upTo a given number :");

        Scanner obj = new Scanner(System.in);
        System.out.print("Enter the Number :");
        int num = obj.nextInt();

        PrimeNumberUptoGivenNumber.primePrinter(num);
    }

    public  static void primePrinter(int num){

        int counter;

        for (int i = 2; i <= num ; i++) {

            counter =0;

            for (int j = 2; j <= i/2 ; j++) {

                if(i % j ==0){
                    counter++;
                    break;
//                    System.out.print(i + " ");
                }
            }
            if (counter == 0){
                System.out.print(i + " ");
            }
        }

    }
}
