package ex43.base;

/*
 *  UCF COP3330 Summer 2021 Assignment 3 Solution
 *  Copyright 2021 Ursula Shaw
 */

import java.io.File;

public class MakeFolder {
    public File websiteFolder(String websiteName) {
        String webDirectory = "./website/"+websiteName;
        return new File(webDirectory);
    }
    public File htmlFolder(String websiteDirectory) {
        String str = websiteDirectory + "/index.html";
        return new File(str);
    }

    public File jsFolder(String websiteDirectory) {
        String str = websiteDirectory + "/js/";
        return new File(str);
    }

    public File cssFolder(String websiteDirectory) {
        String str = websiteDirectory + "/css/";
        return new File(str);
    }
}
