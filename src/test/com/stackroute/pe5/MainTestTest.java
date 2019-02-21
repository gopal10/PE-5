package com.stackroute.pe5;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.io.IOException;
import java.util.ArrayList;

import static org.junit.Assert.*;

public class MainTestTest {


    MainTest app;

    @Before
    public void setUp() throws Exception {
        app = new MainTest();
    }

    @After
    public void tearDown() throws Exception {
        app = null;
    }

    @Test
    public void TestOfListFirst() throws IOException {


        ArrayList<Student> Expected= new ArrayList<>();
        Expected.add(new Student(4,"saunak", 27));
        Expected.add(new Student(1,"gopal", 24));
        Expected.add(new Student(2,"abhinav", 23));
        Expected.add(new Student(3,"biswa", 22));

        Expected.add(new Student(5,"boss", 19));


        ArrayList actual= app.check();
        assertEquals(Expected.toString(),actual.toString());
        // assertNotEquals(unexpected,actual);
        assertNotNull(app);
}

}