package school;

import java.util.Date;

public class StudentTest {
    public static void main(String[] args) {
        Date date1 = new Date();

        VocationalAbstractStudent v1 = new VocationalAbstractStudent(12346,"veli",2021,new Date(),"Pyh");
        System.out.println(v1.toString());

        v1.register();

        RegistrationOffice rg = new RegistrationOffice();
        System.out.println(rg.getAStudent(v1).getName());

        System.out.println("*********");

        rg.registerStudent(v1);

        System.out.println("*********");

        System.out.println(v1.isRegister());

        System.out.println("*********");

        MasterAbstractStudent m1 = new MasterAbstractStudent(12347,"selim",2021,date1,"Kim","İbrahim","6g");

        System.out.println(m1.isRegister());

        rg.registerStudent(m1);

        System.out.println(m1.isRegister());

        System.out.println(m1.toString());

        System.out.println(rg.getAStudent(m1).getName());

        System.out.println("*********");

        rg.registerStudent(m1);


    }
}
