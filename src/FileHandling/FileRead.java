package FileHandling;

import java.io.FileReader;
import java.io.IOException;

public class FileRead {



    public static void main(String[] args) {

        System.out.println("Accessing the reserved file using fileRead");

        String fileName = "FirstFile.txt";

        try(FileReader reader = new FileReader(fileName)){

            int re = 0;

            do {
                re = reader.read();
                System.out.print((char) re);

            }while (re != -1);


        }catch (IOException e){
            System.out.printf("Exception is Occurred %s", e.getMessage());
        }

    }
}
