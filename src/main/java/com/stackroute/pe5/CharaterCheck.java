package com.stackroute.pe5;

import java.util.HashMap;

public class CharaterCheck {

    public HashMap check(String[] input)
    {

       // int array[]= new int[input.length];
        int len[]= new int[input.length];
        boolean output[]= new boolean[input.length];

        HashMap hashMap= new HashMap();


        for(int i=0; i<input.length;i++)
        {
            int count=0;
            for(int j=0; j<input.length-1;j++)
            {
                if(input[i].equals(input[j]))
                    len[i]=count++;
                if(len[i]>0)
                    output[i]=true;
                else output[i]=false;
            }

        }


        for(int i=0; i<len.length;i++) {
            hashMap.put(input[i],output[i]);

        }

        // System.out.println(hashMap);

        return  hashMap;
    }

}
