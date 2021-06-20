package ex41.base;

/*
 *  UCF COP3330 Summer 2021 Assignment 3 Solution
 *  Copyright 2021 Ursula Shaw
 */

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.List;


public class Writer {
    public void createOutputFile(List<List<String>> sortedNames) {
        try {
            FileWriter writer = new FileWriter("exercise41_output.txt");
            BufferedWriter out = new BufferedWriter(writer);

            String str = String.format("Total of %d names\n" +
                    "-----------------\n", sortedNames.size());
            out.write(str);


            for (List<String> name : sortedNames) {
                out.write(name.get(0) + ", " + name.get(1) +
                        "\n");
            }
            System.out.println("Output file created.\n");

            out.flush();
            out.close();

        } catch (IOException e) {
            System.out.println("Error");
            e.printStackTrace();
        }
    }

}
