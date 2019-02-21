package com.stackroute.pe5;

import java.util.*;

public class MainTest {

    public  ArrayList<Student>  check()
    {
        ArrayList<Student> treeSet= new ArrayList<>();

        treeSet.add(new Student(1,"gopal", 24));
        treeSet.add(new Student(2,"abhinav", 23));
        treeSet.add(new Student(3,"biswa", 22));
        treeSet.add(new Student(4,"saunak", 27));
        treeSet.add(new Student(5,"boss", 19));



        StudentSorter studentSorter= new StudentSorter();
        Collections.sort(treeSet,studentSorter);

//        Iterator itr= treeSet.iterator();
//
//        while(itr.hasNext())
//        {
//            Student str= (Student) itr.next();
//            System.out.println(str.age+" "+str.id +""+ str.name);
//        }
//        System.out.println(treeSet.toString());

        return treeSet;
    }
}
