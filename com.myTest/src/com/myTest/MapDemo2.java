package com.myTest;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Set;

public class MapDemo2 {
	
		
	
	public static void main(String[] args) {
	
			HashMap<Integer,String> hm = new HashMap<Integer,String>();
			hm.put(18, "Ram");
			hm.put(16, "Ramesh");
			hm.put(13, "Rohit");
			hm.put(14, "Sachin");
			Set set =hm.keySet();
			
			ArrayList ls=new ArrayList();
			ls.addAll(set);
			 
		 //System.out.println(mapDemo2.addStudent();
			 System.out.println(set);
			 Collections.sort(ls);
			 System.out.println(ls);

	} 
	
	}


