package in.Rushi;

import java.util.Scanner;

public class ReversString {
    public static void main(String[] args) {

        System.out.println("Printing the String in reverse format!!");
        Scanner obj = new Scanner(System.in);
        System.out.print("Enter Your String :");
        String str = obj.next();

        String revStr = revStr(str);
        System.out.printf("The %s is Reversed as -:- %s ", str,revStr);
    }

    public  static String revStr(String str){

        String revStr = " ";
        char ch;
        for (int i = 0; i < str.length(); i++) {

            ch = str.charAt(i);
            revStr = ch + revStr;

        }
        return revStr;

    }
}
