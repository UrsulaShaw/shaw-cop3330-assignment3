package ex41.base;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Scanner;

public class Validator {
    public String validatePath(Path path) {
        String str;
        // check if path is valid
        if (Files.exists(path)) {
            str = "File exists.\n";
        } else {
            str = "File does not exist.\n";
        }
        return str;
    }
}
