package ex43.base;

/*
 *  UCF COP3330 Summer 2021 Assignment 3 Solution
 *  Copyright 2021 Ursula Shaw
 */

import java.io.File;
import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        GetUserInfo getInfo = new GetUserInfo();
        MakeFolder makeFolder = new MakeFolder();
        CreateHTML createHTML = new CreateHTML();

        // get info from user
        String websiteName = getInfo.getWebsiteName();
        String author = getInfo.getAuthor();
        boolean makeJSFolder = getInfo.js();
        boolean makeCSSFolder = getInfo.css();

        // create website directory
        File webFile = makeFolder.websiteFolder(websiteName);
        String webDir = webFile.getAbsolutePath();
        if (!webFile.exists()) {
            if (webFile.mkdirs()) {
                System.out.printf("Created %s", webFile.getAbsolutePath());
            }
        }

        // create html
        File htmlFile = createHTML.writeHTML(createHTML.createHTMLtext(websiteName, author), webFile);
        if (!htmlFile.exists()) {
            if (htmlFile.mkdirs()) {
                System.out.printf("Created %s", htmlFile.getAbsolutePath());
            }
        }

        // create js folder (if applicable)
        if (makeJSFolder) {
            File jsFolder = makeFolder.jsFolder(webDir);
            if (!jsFolder.exists()) {
                if (jsFolder.mkdirs()) {
                    System.out.printf("Created %s", jsFolder.getAbsolutePath());
                }
            }
        }

        // create CSS folder (if applicable
        if (makeCSSFolder) {
            File cssFolder = makeFolder.cssFolder(webDir);
            if (!cssFolder.exists()) {
                if (cssFolder.mkdirs()) {
                    System.out.printf("Created %s", cssFolder.getAbsolutePath());
                }
            }

        }

    }
}
