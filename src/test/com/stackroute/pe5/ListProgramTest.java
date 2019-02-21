package com.stackroute.pe5;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.io.IOException;
import java.util.ArrayList;

import static org.junit.Assert.*;

public class ListProgramTest {

    ListProgram app;

    @Before
    public void setUp() throws Exception {
        app = new ListProgram();
    }

    @After
    public void tearDown() throws Exception {
        app = null;
    }

    @Test
    public void TestOfListFirst() throws IOException {


        ArrayList<String> Expected= new ArrayList<String>();
        Expected.add("Kiwi");
        Expected.add("Grape");
        Expected.add("Mango");
        Expected.add("Berry");

        ArrayList<String> arrayList= new ArrayList<String>();
        arrayList.add("Apple");
        arrayList.add("Grape");
        arrayList.add("Melon");
        arrayList.add("Berry");

        ArrayList actual= app.check(arrayList);
        assertEquals(Expected,actual);
        // assertNotEquals(unexpected,actual);
        assertNotNull(app);

    }

    @Test
    public void TestOfListSecond() throws IOException {


        ArrayList<String> Expected= new ArrayList<String>();

        ArrayList<String> arrayList= new ArrayList<String>();
        arrayList.add("Apple");
        arrayList.add("Grape");
        arrayList.add("Mango");
        arrayList.add("Berry");

        ArrayList actual= app.check2(arrayList);
        assertEquals(Expected,actual);
        // assertNotEquals(unexpected,actual);
        assertNotNull(app);

    }

}