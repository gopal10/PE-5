package com.stackroute.pe5;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;

import static org.junit.Assert.*;

public class ReplaceValuesTest {


    ReplaceValues app;

    @Before
    public void setUp() throws Exception {
        app = new ReplaceValues();
    }

    @After
    public void tearDown() throws Exception {
        app = null;
    }

    @Test
    public void TestOfListFirst() throws IOException {

        HashMap<String,String> actual= new HashMap<String,String>();
        HashMap<String,String> Expected= new HashMap<String,String>();
       Expected.put("val1"," ");
        Expected.put("val2","java");

        HashMap<String, String> input= new HashMap<String, String>();
        input.put("val1","java");
        input.put("val2","c++");

         actual= app.check(input);
        Assert.assertEquals(Expected,actual);
        // assertNotEquals(unexpected,actual);
        assertNotNull(app);
    }
}
