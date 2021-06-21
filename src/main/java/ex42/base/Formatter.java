package ex42.base;

import java.util.List;

public class Formatter {
    public void format(List<List<String>> data) {
        for (List<String> entry : data) {
            String line = String.format("%-10s%-10s%-10s\n", entry.get(0), entry.get(1), entry.get(2));
            System.out.println(line);
        }
    }
}
