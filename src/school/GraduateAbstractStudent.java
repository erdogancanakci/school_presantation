package school;

import java.util.Date;

public class GraduateAbstractStudent extends AbstractStudent {
    protected String advisor;
    protected String thesis;

    public GraduateAbstractStudent(int no, String name, int year, Date dob, String major, String advisor, String thesis) {
        super(no, name, year, dob, major);
        this.advisor = advisor;
        this.thesis = thesis;
    }

    @Override
    public void study() {
        System.out.println("Graduate student is working");
    }

    @Override
    public void register() {
        if (!register) {
            register = true;
            System.out.println("Graduate Student is registered");
        }
        else
            System.out.println("Vocational student have already registered");

    }

    @Override
    public String toString() {
        return "Vocational Student{" +
                "no=" + no +
                ", name='" + name+ '\'' +
                ", year=" + year +
                ", date=" + dob +
                ", major='" + major + '\'' +
                ", advisor=" + advisor +
                '}';
    }
}
