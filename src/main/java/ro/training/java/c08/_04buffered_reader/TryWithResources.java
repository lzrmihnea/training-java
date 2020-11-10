package ro.training.java.c08._04buffered_reader;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class TryWithResources {
    public static void main(String[] args) {

        // Java 8 Autocloseable: try() {}
        // try ( anObjectThatExtendsAutoCloseable ) {}
        // whatever is found inside the try ( HERE ) will automatically be closed, whether or not an exception is thrown.
        try(BufferedReader reader = new BufferedReader(new FileReader("text.txt"))) {
            String text = reader.readLine();
        } catch (IOException ioe) {
            System.err.println("Cannot read line " + ioe.getMessage());
        }
    }
}
