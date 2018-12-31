package rmit.p1;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Random;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws IOException {
        writePoem();

        String haiku = readFile("haiku.txt");
        System.out.println(haiku);

        generate();
    }

    public static String readFile(String fileName) throws IOException {
        FileInputStream input = new FileInputStream(fileName);
        String str = "";
        int c;
        while( (c=input.read()) !=-1){
            str +=(char)c; //not a good way
        }
        return str;
    }
    //Ex1: Write a method that ask user to enter a sentence
    //write this sentence into a file
    //read the file

    //Ex2: Write a method that generate a random string 100 characters
    //write this to a file and read the file to show it

    public static void generate(){
        //String random ="";
        StringBuilder builder = new StringBuilder();

        for (int i = 0; i < 100; i++) {
            int c = (int) (Math.random()*26)+65;
            builder.append((char)c); //not a good way
        }
        System.out.println(builder.toString());
    }

    public static void write5times(){
        Scanner scanner = new Scanner(System.in);
        StringBuilder builder = new StringBuilder();
        for (int i = 0; i < 5 ; i++) {
            System.out.println("Please enter "+i+1+" sentence:");
            String s = scanner.nextLine();
            builder.append(s);
        }
        System.out.println(builder.toString());

    }

    //Ex3: build a method to ask user 5 times for 5 sentences
    //Write them to a file using StringBuilder

    public static void writeFile(String s, String fileName) throws IOException {
        FileOutputStream output = new FileOutputStream(fileName);
        output.write(s.getBytes());

        output.close();
    }

    public static void writePoem() {
        String haiku = "A little stream\n";
        haiku += "A little crab\n";
        haiku += "Go and pass me";

        try {
            writeFile(haiku, "haiku.txt");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
