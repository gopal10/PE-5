package com.stackroute.pe5;

import java.util.HashMap;


public class FindCount {

    public HashMap check(String string, String [] input)
    {
        int array[]= new int[input.length];
        int len[]= new int[input.length];

        HashMap hashMap= new HashMap();


        for(int i=0; i<array.length;i++)
        {
            array[i]= string.length()-(string.replaceAll(input[i],"").length());
        }

        for(int i=0; i<array.length;i++)
        {
            len[i]= input[i].length();
        }

        for(int i=0; i<array.length;i++) {
            hashMap.put(input[i],(array[i]/len[i]));

        }

       // System.out.println(hashMap);

        return  hashMap;
    }

}
