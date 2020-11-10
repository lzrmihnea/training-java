package ro.training.java.c08._02try_catch;

import ro.training.java.c08.InvalidCnpException;

import java.util.Scanner;

public class CnpTryCatch {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        while (in.hasNext()) {
            String keyboardText = in.nextLine();

            try { // Added around a method that has a "throws" clause

                System.out.println("1. Buna ziua, urmeaza sa evaluam textul " + keyboardText);
                validateAndPrintCnp(keyboardText);
                System.out.println("2. Vesti bune, am terminat analiza!");

            } catch (InvalidCnpException caughtInvalidCnpException) {
                System.err.println(caughtInvalidCnpException.getMessage());
            } catch (IllegalStateException | NumberFormatException otherExceptionsCaught) {
                System.err.println("Illegal: " + otherExceptionsCaught.getMessage());
            }
        }
    }

    static void validateAndPrintCnp(String cnp) throws InvalidCnpException, IllegalStateException, NumberFormatException {
        if (cnp == null || cnp.isBlank() || cnp.equals("0")) {
            throw new InvalidCnpException("CNP is missing");
        }
        if (cnp.length() != 13) {
            throw new IllegalStateException("Lungimea CNP-ului trebuie sa fie de 13 caractere, s-au gasit " + cnp.length());
        }
        for (char cnpLetter : cnp.toCharArray()) {
            if (Character.isLetter(cnpLetter)) {
                throw new NumberFormatException("CNP-ul trebuie sa contina doar cifre, s-a gasit litera " + cnpLetter);
            }
        }
        System.out.println("CNP introdus: " + cnp);
    }
}
