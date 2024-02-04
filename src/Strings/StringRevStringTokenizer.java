package Strings;

import java.util.Scanner;
import java.util.StringTokenizer;

public class StringRevStringTokenizer {

    public static void main(String[] args) {

        System.out.println("Printing the  String using the String tokenizer");

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your String :");

        String str = sc.nextLine();


        String newStr = " ";

        StringTokenizer st = new StringTokenizer(str, " ");

        while (st.hasMoreTokens()){
            newStr = st.nextToken() + " " + newStr;
        }

        System.out.println(newStr);

    }
}
