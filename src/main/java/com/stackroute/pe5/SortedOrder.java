package com.stackroute.pe5;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.TreeSet;

public class SortedOrder {

    public ArrayList<String>  check(ArrayList<String> arrayList)
    {
       // Collections.sort(arrayList);
        TreeSet<String> hashSet = new TreeSet<>(arrayList);

        ArrayList<String> arrayList1= new ArrayList<>(hashSet);
       // Collections.sort(arrayList1);
        return arrayList1;
    }
}
