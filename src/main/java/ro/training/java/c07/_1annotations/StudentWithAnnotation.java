package ro.training.java.c07._1annotations;

// we do not have to import anything from java.lang

/**
 * In this way, we know that the Student class is
 * intended for the FastTrackIT class, and
 * it should not be used for Production.
  */
@Educational(intendedFor = "fasttrackIT", forProduction = false)
public class StudentWithAnnotation {

    @Override
    public String toString() {
        return super.toString();
    }
}
