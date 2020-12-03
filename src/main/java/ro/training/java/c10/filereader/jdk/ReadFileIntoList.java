package ro.training.java.c10.filereader.jdk;

import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Collections;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

public class ReadFileIntoList {
    private static final Logger LOGGER = Logger.getLogger(ReadFileIntoList.class.getName());

    private static List<String> readFileIntoList(String filename) {

        try {
            return Files.readAllLines(Paths.get(filename),
                    StandardCharsets.UTF_8);
        } catch(IOException ioe) {
            LOGGER.log(Level.WARNING, ioe.getMessage(), ioe);
        }

        return Collections.emptyList(); // new ArrayList()
    }

    public static void main(String[] args) {
        List<String> readList = readFileIntoList("C:\\work\\docs\\test.txt");

        readList.forEach(System.out::println);
    }
}
