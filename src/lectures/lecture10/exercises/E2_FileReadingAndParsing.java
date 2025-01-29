package lectures.lecture10.exercises;

import java.io.*;

import java.util.Scanner;

public class E2_FileReadingAndParsing {

    public static void main(String[] args) {

        // manipulating this filename to make it valid/invalid
        String filePathUser = "out/exampleNumlist.txt";

        fileReader(filePathUser);
    }

    static void fileReader(String userFilePath) {

        try {
            // creating a scanner object that takes a file,
            // which takes the path to the user's file as argument
            Scanner sc = new Scanner(new File(userFilePath));

            try {
                String content = sc.nextLine();
                int numberStore = Integer.parseInt(content);
                double squareRoot = Math.sqrt(numberStore);
                System.out.println("The square root of " + numberStore + " is " + squareRoot);
            } catch (NumberFormatException exNFE) {
                System.out.println("Format is not an integer. Please fix your file and try again.");
            } finally {
                sc.close();
            }
        } catch (FileNotFoundException exFNF) {
            System.out.println("File not found. Please check your path to the file and try again.");
        }
    }
}
