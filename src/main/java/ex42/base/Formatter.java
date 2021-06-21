package ex42.base;

/*
 *  UCF COP3330 Summer 2021 Assignment 3 Solution
 *  Copyright 2021 Ursula Shaw
 */

import java.util.List;

public class Formatter {
    public void format(List<List<String>> data) {
        for (List<String> entry : data) {
            String line = String.format("%-10s%-10s%-10s\n", entry.get(0), entry.get(1), entry.get(2));
            System.out.println(line);
        }
    }
}
