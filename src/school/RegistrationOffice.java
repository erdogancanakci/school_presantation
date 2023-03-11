package school;

public class RegistrationOffice {
    public RegistrationOffice() {
    }

    public void registerStudent (AbstractStudent student) {
        if(student.isRegister()) {
            System.out.println(student.getName()+" already registired");
        }
        else {
            student.register = true;
            System.out.println(student.getName()+" is registired.");
        }
    }



    public Student getAStudent(AbstractStudent student) {
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
