package ro.training.java.c08._04buffered_reader;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class TryCatchFinally {
    public static void main(String[] args) throws IOException {

        // Before Java8: try {}
        BufferedReader r = new BufferedReader(new FileReader("text.txt"));
        try {
            String firstLine = r.readLine();
        } catch (IOException e) {
            System.out.println("Cannot read first line from text.txt: " + e.getMessage());
        } finally {
            r.close();
        }

    }
}
