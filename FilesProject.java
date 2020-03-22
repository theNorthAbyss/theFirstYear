
package filesproject;

/**
 * Student Name: Christopher John Bowen LSU ID: 898737154 Lab Section:
 * Assignment: Lab Assignment 1 Submission Time:
 *
 * This program populates a file with n random integers in the interval
 * [1000,2000]. And it reports the mean and max number and filename.
 *
 * @author cbowe13
 */
import java.io.FileNotFoundException;
import java.io.File;
import java.io.PrintWriter;
import java.util.Scanner;
import java.util.Random;

public class FilesProject {

    static Scanner in = new Scanner(System.in);
    
//this is the main method of the program and it ask the user for a string input(fileName)and a int input (fileSize)
    
    public static void main(String[] args) throws FileNotFoundException {

        System.out.println("Enter your file name:");
        String fileName = in.nextLine();

        System.out.println("Enter your file size(between 1000 and 2000):");
        int fileSize = in.nextInt();

        populateFile(fileName, fileSize);

        System.out.printf("File: %s.txt\t Mean:%8.2f Max: %d\n", fileName, getMean(fileName), getMax(fileName));

    }
    
//this is a method that creates a file (text) and populated it with random integers
    
    public static void populateFile(String fileName, int fileSize) throws FileNotFoundException {

        Random rand = new Random();
        PrintWriter outFile = new PrintWriter(fileName);

        for (int i = 0; i <= fileSize; i++) {
            outFile.println(rand.nextInt((2000 - 1000) + 1) + 1000);
        }

        outFile.close();
    }

    //this method gets the mean of all of the integers on the text file
    public static double getMean(String fileName) throws FileNotFoundException {
        double sum = 0;
        double counter = 0;
        File inputFile = new File(fileName);
        Scanner in = new Scanner(inputFile);

        while (in.hasNextInt()) {
            counter++;
            sum += in.nextInt();

        }

        in.close();
        return sum / counter;
    }

    //this method gets the max number of all of the integers on the text file
    public static int getMax(String fileName) throws FileNotFoundException {
        int max = 0;
        File inputFile = new File(fileName);
        Scanner in = new Scanner(inputFile);

        while (in.hasNextInt()) {
            if (max < in.nextInt()) {
                max = in.nextInt();

            }
        }
        in.close();
        return max;
    }

}
