package in.Rushi;

import java.util.Scanner;

public class LCM {

    public static void main(String[] args) {
        System.out.println("Printing the Least common divider of two numbers!!");

        Scanner obj = new Scanner(System.in);
        System.out.print("Enter the first number :");
        int num1 = obj.nextInt();

        System.out.print("Enter the Second number :");
        int num2 = obj.nextInt();

        int lcm = lcm(num1,num2);
        System.out.println("The LCM is :" + lcm);

    }

    public  static int lcm(int num1, int num2){

        int i =1;

        while (true){
            int factor = num2*i;
            if (factor % num1 == 0 ){
                return factor;
            }
            i++;
        }
    }
}
