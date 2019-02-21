package com.stackroute.pe5;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;

import static org.junit.Assert.*;

public class SortedOrderTest {


    SortedOrder app;

    @Before
    public void setUp() throws Exception {
        app = new SortedOrder();
    }

    @After
    public void tearDown() throws Exception {
        app = null;
    }

    @Test
    public void TestOfListFirst() throws IOException {

        ArrayList<String> actual = new ArrayList<>();
        ArrayList<String> input = new ArrayList<>();
        input.add("harry");
        input.add("alice");
        input.add("bluto");
        input.add("eugen");

        ArrayList<String> Expected = new ArrayList<>();
        Expected.add("alice");
        Expected.add("bluto");
        Expected.add("eugen");
        Expected.add("harry");


        actual= app.check(input);
        Assert.assertEquals(Expected,actual);
        // assertNotEquals(unexpected,actual);
        assertNotNull(app);
    }
}