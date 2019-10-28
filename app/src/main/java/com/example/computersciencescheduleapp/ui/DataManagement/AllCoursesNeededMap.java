package com.example.computersciencescheduleapp.ui.DataManagement;

import android.content.Context;

import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class AllCoursesNeededMap {
	   public static HashMap<String,Course> AllCoursesNeeded_map=new HashMap<>();
	   
	   public AllCoursesNeededMap(HashMap<String,Course> allcoursesMap) throws IOException {
		   

			
			ArrayList<String> coursenamelist=new ArrayList<>();
			
			coursenamelist.add("CSE110");
			coursenamelist.add("CSE118");
			coursenamelist.add("ENG101");
			coursenamelist.add("MAT141");
			//*	Laboratory Science Elective
			coursenamelist.add("CSE148");
			coursenamelist.add("ENG102");
			coursenamelist.add("MAT142");
			//GYM
			
			coursenamelist.add("CSE218");
//			History Elective	3
//		 	Humanities Elective	3
//		*	Laboratory Science Elective
			coursenamelist.add("MAT205");
			
			coursenamelist.add("CSE222");
			coursenamelist.add("CSE248");
			coursenamelist.add("MAT210");
//			SUNY-GER Foreign Language or The Arts	3
//			***	Social Science Elective	3
//			 	Physical Education
			
			for(int i=0;i<coursenamelist.size();i++) {
				String courseid=coursenamelist.get(i);
				AllCoursesNeeded_map.put(courseid,
						allcoursesMap.get(courseid)
						);
			}
		//	printMap();
			
		   
	   }
	   
	   
	   
	   public static void printMap() {
			
			  // Getting an iterator 
	        Iterator hmIterator = AllCoursesNeeded_map.entrySet().iterator(); 
	  
	   
	  
	        while (hmIterator.hasNext()) { 
	            Map.Entry mapElement = (Map.Entry)hmIterator.next(); 
	            Course currentcourse = (Course)mapElement.getValue(); 
	            
	            
	            
	            System.out.println("id:"+currentcourse.getId()+
	            					"                name:"+currentcourse.getName()+
	            					"                Prereq:"+currentcourse.getPrereq()+
	            					"                Credit:"+currentcourse.getCredit()
	            					); 
	        } 
			
		}
	   
	   


}
