package ro.training.java.c06._05_immutable;

import java.time.LocalDate;

public class ImmutableDateDemo {
    public static void main(String[] args) {
        LocalDate thisDate = LocalDate.now(); // the inner value cannot change (immutable)
        System.out.println("first print: " + thisDate);

        thisDate.plusDays(5);
        System.out.println("second print: " + thisDate);

        LocalDate fiveDaysInTheFuture = thisDate.plusDays(5);
        System.out.println("5 days in the future: " + fiveDaysInTheFuture);
    }
}
