package ex43.base;

/*
 *  UCF COP3330 Summer 2021 Assignment 3 Solution
 *  Copyright 2021 Ursula Shaw
 */

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Path;

public class CreateHTML {
    public String createHTMLtext(String websiteName, String authorName) {

        return String.format("<html>" +
                        "<head>" +
                        "<title>%s</title>" +
                        "<meta>%s</meta>" +
                        "</head>" +
                        "<body></body>" +
                        "</html>",
                websiteName, authorName);
    }
    public File writeHTML(String htmlText, File webFile) {
        String path = webFile.getAbsolutePath() + "/index.html";
        File f = new File(path);
        try {
            BufferedWriter bw = new BufferedWriter(new FileWriter(f));
            bw.write(htmlText);
            bw.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return f;
    }
}
