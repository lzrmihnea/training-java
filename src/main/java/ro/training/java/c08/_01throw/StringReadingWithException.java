package ro.training.java.c08._01throw;

import java.util.Scanner;

public class StringReadingWithException {
    public static void main(String[] args) throws Exception {
        Scanner in = new Scanner(System.in);

        String s = in.nextLine();
        printeazaSauCrapa(s); // if exception is thrown, program does not run any further

        String text2 = in.nextLine();
        printeazaSauCrapa(text2);
    }

    static void printeazaSauCrapa(String textTastatura) throws Exception {
        if (textTastatura.equals("gata")) {
            //throw new String("asdasd"); // will not work because String does not extend Throwable
            throw new Exception("gata programul"); // syntax for throwing exception
        } else {
            System.out.println(textTastatura);
        }
    }
}
