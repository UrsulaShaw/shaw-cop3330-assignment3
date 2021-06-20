package ex41.base;

/*
 *  UCF COP3330 Summer 2021 Assignment 3 Solution
 *  Copyright 2021 Ursula Shaw
 */

import java.io.File;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Reader {
    public List<List<String>> namesFromFile(File inputFile) {
        List<List<String>> unsortedNames = new ArrayList<List<String>>();
        try {
            Scanner read = new Scanner(inputFile);
            while (read.hasNextLine()) {
                String[] name = read.nextLine().split(", ");
                name[0].trim();
                name[1].trim();

                if (!name[0].equals("") && !name[1].equals("")) {
                    unsortedNames.add(Arrays.asList(name));
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return unsortedNames;
    }
}
