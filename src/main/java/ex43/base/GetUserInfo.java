package ex43.base;

/*
 *  UCF COP3330 Summer 2021 Assignment 3 Solution
 *  Copyright 2021 Ursula Shaw
 */

import java.util.Scanner;

public class GetUserInfo {
    Scanner in = new Scanner(System.in);

    public String getWebsiteName() {
        System.out.println("Site name: ");
        return in.nextLine();
    }

    public String getAuthor() {
        System.out.println("Author: ");
        return in.nextLine();
    }

    public boolean js() {
        System.out.println("Do you want a folder for JavaScript? ");
        return in.nextLine().equalsIgnoreCase("y");
    }

    public boolean css() {
        System.out.println("Do you want a folder for CSS? ");
        return in.nextLine().equalsIgnoreCase("y");
    }
}
