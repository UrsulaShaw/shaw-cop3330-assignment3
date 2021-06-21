package ex42.base;

import java.io.*;
import java.util.*;

public class FileHandler {

    public List<List<String>> readFile(File file) {
        List<List<String>> data = new ArrayList<List<String>>();
        try {
            Scanner read = new Scanner(file);
            while (read.hasNextLine()) {
                String[] entry = String.valueOf(read.nextLine()).split(",");
                entry[0] = entry[0].trim();
                entry[1] = entry[1].trim();
                entry[2] = entry[2].trim();

                if (!entry[0].equals("") && !entry[1].equals("") && !entry[2].equals("")) {
                    data.add(Arrays.asList(entry));
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return data;
    }

}
