package Strings;

import java.util.Scanner;

public class StringRev {

    public static void main(String[] args) {

        System.out.println("Printing The given String in the reverse order");

        Scanner sc =  new Scanner(System.in);

        System.out.print("Enter your String :");
        String str = sc.nextLine();

        String revStr = revStr(str);

        System.out.println("Your String reversed as : \n"+ revStr);


    }

    public static  String revStr(String str){
        String[] newStr = str.split("\\s");
        String charStr = " ";

        for (int i = newStr.length - 1; i >= 0 ; i--) {

            charStr = charStr + newStr[i] + " ";
        }
        return charStr;
    }
}
