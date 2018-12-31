package rmit.p1;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class Main {

    public static void main(String[] args){

        writeFile("Hello ", "P1","Congrat", "C://file.txt");
        //Exercise: write a method that write a string s to a file
        //signature: writeFile(String s, String fileName);

    }

    public static void  writeFile(String s, String fileName){
        FileOutputStream out = null;

        try {
            out = new FileOutputStream(fileName);
            out.write(s.getBytes());
            out.close();

        } catch (IOException e) {
            e.printStackTrace();
        }


    }
    public static void  writeFile(String s1, String s2, String s3, String fileName){
        FileOutputStream out = null;

        try {
            out = new FileOutputStream(fileName);
            out.write((s1+"\n").getBytes());
            out.write((s2+"\n").getBytes());
            out.write((s3).getBytes());
            out.close();

        } catch (FileNotFoundException e) {
            System.out.println("Not found");
        } catch (IOException e) {
            System.out.printf("IO exception");
        }
        finally {
            System.out.println("This is what is run in the finally");
        }

    }
    //Exercise 2: Write a method to write 3 string s1, s2, s3 to a file
    //signature: writeFile(String fileName, String s1, String s2, String s3)
    //try to catch 2 exceptions: FileNotFound and IOException

}
