package com.capg.corejava.Lab6;
import java.util.*;
import java.util.Map.Entry;

public class CollectionFrameworkDemo1 {

	public static void main(String[] args) {
		HashMap<String , Integer> map = new HashMap<String, Integer>();
		map.put("one", 1);
		map.put("eleven", 11);
		map.put("ten", 10);
		
		map.put("twelve", 12);
		map.put("five", 5);
		map.put("nine", 9);
        List<Map.Entry<String , Integer>> list = new ArrayList<>(map.entrySet());
        System.out.println(list);
        Collections.sort(list, new Comparator<Map.Entry<String , Integer>>()
        		{
        	
					@Override
					public int compare(Entry<String, Integer> o1, Entry<String, Integer> o2) {
						// TODO Auto-generated method stub
						return o1.getValue()-o2.getValue();
					}
        		});
        for(Map.Entry<String,Integer> e : list)
        {
        	System.out.println("Key : "+e.getKey()+" Value : " +e.getValue());
        }
        
	}

}
