package ro.training.java.c08._05hierarchy;

public class ExceptionDemo {
    public static void main(String[] args) {

        // the checked way, where we should either surround the method call with try-catch or add "throws..." to psvm
        try{
            System.out.println(calculateCircleAreaChecked(-35.4));
        } catch(Exception e){
            System.out.println("Nu putem calcula aria: " + e.getMessage());
        }

        // the unchecked way, where we don't care
        System.out.println(calculateCircleAreaUnchecked(-35.23));
    }

//    with checked exception
    static double calculateCircleAreaChecked(double radius) throws Exception {
        if (radius < 0) {
            throw new Exception("radius should be positive");
        }
        return Math.PI * radius * radius;
    }

    // with unchecked exception
    static double calculateCircleAreaUnchecked(double radius) {
        if (radius < 0) {
            throw new RuntimeException("radius should be positive");
        }
        return Math.PI * radius * radius;
    }

}
