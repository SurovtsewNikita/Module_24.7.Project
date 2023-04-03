import enums.StudyProfile;
import models.Student;
import models.University;

public class Main {
    public static void main(String[] args) {
        University university = new University("1134-7514","Higher School of Economics","HSE",1992, StudyProfile.JAVA);
        Student student = new Student("Maks","1GT5-4YS8",3,(float)(3.75));
        System.out.println(university);
        System.out.println(student);

    }
}
