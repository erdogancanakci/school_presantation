package school;

import java.util.Date;

public class MasterAbstractStudent extends GraduateAbstractStudent {
    public MasterAbstractStudent(int no, String name, int year, Date dob, String major, String advisor, String thesis) {
        super(no, name, year, dob, major, advisor, thesis);
    }

    @Override
    public void study() {
        System.out.println("Master st. is working");
    }
}
