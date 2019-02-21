package com.stackroute.pe5;

import java.util.Comparator;

public class StudentSorter implements Comparator <Student> {


//    @Override
//    public int compare(Object o, Object t1) {
//
//        String s1= ((Student)o).name;
//        String s2= ((Student) t1).name;
//        return  s1.compareTo(s2);
//    }


    @Override
    public int compare(Student student, Student t1) {
        int s1= student.age;
        int s2= t1.age;

        if(s1>s2)
            return -1;
        else if(s1<s2)
            return +1;
        else
        {
            String s11= ((Student)student).name;
            String s22= ((Student) t1).name;
            return s11.compareTo(s22);
        }
    }
}

