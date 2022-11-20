package school;

public class RegistrationOffice {
    public RegistrationOffice() {
    }

    public void registerStudent (Student student) {
        student.register();
    }

    public Student getAStudent(Student student) {
        if (student instanceof VocationalAbstractStudent) {
            VocationalAbstractStudent v1 = (VocationalAbstractStudent) student;
            return v1;
        } else if (student instanceof MasterAbstractStudent) {
            MasterAbstractStudent m1 = (MasterAbstractStudent) student;
            return m1;
        } else if (student instanceof GraduateAbstractStudent) {
            GraduateAbstractStudent g1 = (GraduateAbstractStudent) student;
            return g1;
        } else {
            return student;
        }
    }
}
