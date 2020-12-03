package ro.training.java.c10.filereader.jdk;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.sql.Date;
import java.time.Instant;
import java.util.logging.Logger;

public class ReadFromFileBr {
    private static final Logger LOGGER =
            Logger.getLogger(ReadFromFileBr.class.getName());

    public static void main(String[] args) throws IOException {
        File file =
                new File("C:\\work\\docs\\test.txt");
        if (!file.exists()) {
            file.createNewFile();
            LOGGER.info("File was created!");
        }
        BufferedWriter writer = new BufferedWriter(
                new FileWriter(file));

        writer.append("Este ora: " + Date.from(Instant.now()));
        writer.append("\nHello!");

        writer.close();
    }
}
