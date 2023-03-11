package school;

import java.util.*;
import java.util.Date;
import java.util.Iterator;
import java.util.TreeSet;

public class StudentTest {
    public static void main(String[] args) {
        Date date1 = new Date();

        VocationalAbstractStudent v1 = new VocationalAbstractStudent(12346,"veli",2021,new Date(),"Pyh");
        System.out.println(v1.toString());

        System.out.println(v1.getName() + " is register? " +v1.isRegister());

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

        Scanner kb = new Scanner(System.in);
        VocationalAbstractStudent v2 = new VocationalAbstractStudent(12346,"zeynep",2021,new Date(),"Pyh");
        VocationalAbstractStudent v3 = new VocationalAbstractStudent(121346,"ali",2021,new Date(),"Pyh");
        VocationalAbstractStudent v4 = new VocationalAbstractStudent(123246,"abdullah",2021,new Date(),"Pyh");

        TreeSet<Student> student = new TreeSet<Student>(new StudentNameComparator());

        student.add(m1);
        student.add(v1);
        student.add(v2);
        student.add(v3);
        student.add(v4);

        System.out.println("*********");

        Iterator<Student> iterator = student.iterator();
        int i = 1;
        while (iterator.hasNext())
        {
            System.out.println(i++ +". student: "+iterator.next().getName());
        }

    }

}

