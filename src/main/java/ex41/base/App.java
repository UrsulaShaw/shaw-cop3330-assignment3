/*
 *  UCF COP3330 Summer 2021 Assignment 3 Solution
 *  Copyright 2021 Ursula Shaw
 */

package ex41.base;


import java.io.File;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;
import java.util.Scanner;


public class App {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Validator validator = new Validator();
        Reader fileReader = new Reader();
        Sorter sorter = new Sorter();
        Writer writer = new Writer();


        // ask user to enter file path
        System.out.println("Enter the file path: ");
        Path filePath = Paths.get(in.nextLine());

        // check if file path is valid
        System.out.println(validator.validatePath(filePath));

        // read in names from the file
        File ifo = new File(String.valueOf(filePath));
        List<List<String>> unsortedNames = fileReader.namesFromFile(ifo);
        System.out.println(unsortedNames);
        // sort the names
        List<List<String>> sortedNames = sorter.sortNames(unsortedNames);

        // write result to output file
        writer.createOutputFile(sortedNames);
    }
}
