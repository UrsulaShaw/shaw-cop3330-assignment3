package ex42.base;

/*
 *  UCF COP3330 Summer 2021 Assignment 3 Solution
 *  Copyright 2021 Ursula Shaw
 */

import java.io.File;
import java.nio.file.Path;
import java.util.List;

public class App {
    public static void main(String[] args) {
        FileHandler fileHandler = new FileHandler();
        Formatter formatter = new Formatter();

        String filePath = "exercise42_input.txt";
        try {
            File inputFile = new File(filePath);
        } catch (Exception e) {
            System.out.println("File not found.");
        }

        // read in the file
        File inputFile = new File(filePath);

        // parse the lines
        List<List<String>> data = fileHandler.readFile(inputFile);

        System.out.printf("%-10s%-10s%-10s\n" +
                "--------------------------\n",
                "Last", "First", "Salary");
        // format
        formatter.format(data);
    }

}
