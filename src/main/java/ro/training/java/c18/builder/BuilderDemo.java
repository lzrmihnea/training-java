package ro.training.java.c18.builder;

public class BuilderDemo {

    public static void main(String[] args) {
        // 1. StringBuilder for easiness and aesthetic purpose
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("ABC")
                .append(" ceva ")
                .append(" inca ceva");

        stringBuilder.append(" am uitat de asta ");

        System.out.println(stringBuilder);

        // 2. CarBuilder for encapsulation of data
//        Car newCar = new Car();
        // we want to avoid explicit setters
        CarBuilder builder = new CarBuilder();
        Car builtCar = builder.maxSpeed(190)
                .brand("Dacia")
                .model("Logan")
                .year(2018)
                .build();
        // we used setters implicitly (inside the Builder)


    }
}
