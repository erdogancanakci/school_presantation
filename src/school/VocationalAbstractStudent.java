package school;

import java.util.Date;

public class VocationalAbstractStudent extends AbstractStudent {
    public VocationalAbstractStudent() {
    }

    public VocationalAbstractStudent(int no, String name, int year, Date dob, String major) {
        super(no, name, year, dob, major);
    }

    @Override
    public void study() {
        System.out.println("Vocational student is working");
    }


    @Override
    public String toString() {
        return "Vocational Student{" +
                "no=" + no +
                ", name='" + name + '\'' +
                ", year=" + year +
                ", date=" + dob +
                ", major='" + major+ '\'' +
                '}';
    }
}
