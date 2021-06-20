package ex41.base;

/*
 *  UCF COP3330 Summer 2021 Assignment 3 Solution
 *  Copyright 2021 Ursula Shaw
 */

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Sorter {
    public List<List<String>> sortNames(List<List<String>> unsortedNames) {
        for (List<String> name : unsortedNames) {
            Collections.swap(name, 0, 1);
        }
        List<List<String>> sorted = new ArrayList<>(unsortedNames);
        sorted.sort(Comparator.comparing(l -> l.get(0)));
        for (List<String> name : sorted) {
            Collections.swap(name, 0, 1);
            }
        sorted.sort((Comparator.comparing(l -> l.get(0))));
        return sorted;
        }
    }

