package cote;

import java.util.*;
import java.util.Map.Entry;

public class 성격유형검사 {

	 public String solution(String[] survey, int[] choices) {
	        String answer = "";
	        Map<String,Integer> map = new HashMap<String,Integer>();
	        
	        for (int i = 0; i < choices.length; i++) {
	        	String before =survey[i].charAt(0)+"";
	        	String after =survey[i].charAt(1)+"";
				if(choices[i]==1) {
					map.put(before, map.getOrDefault(before, 0)+3);
				}else if(choices[i]==2) {
					map.put(before, map.getOrDefault(before, 0)+2);
				}else if(choices[i]==3) {
					map.put(before, map.getOrDefault(before, 0)+1);
				}else if(choices[i]==4) {
					
				}else if(choices[i]==5) {
					map.put(after, map.getOrDefault(after, 0)+1);
				}else if(choices[i]==6) {
					map.put(after, map.getOrDefault(after, 0)+2);
				}else if(choices[i]==7) {
					map.put(after, map.getOrDefault(after, 0)+3);
				}
			}
	        if(map.getOrDefault("T",0)>map.getOrDefault("R",0)) {
	        	answer+="T";
	        }else {
	        	answer+="R";
	        }
	        if(map.getOrDefault("F",0)>map.getOrDefault("C",0)) {
	        	answer+="F";
	        }else {
	        	answer+="C";
	        }
	        if(map.getOrDefault("M",0)>map.getOrDefault("J",0)) {
	        	answer+="M";
	        }else {
	        	answer+="J";
	        }
	        if(map.getOrDefault("N",0)>map.getOrDefault("A",0)) {
	        	answer+="N";
	        }else {
	        	answer+="A";
	        }
	        
	        return answer;
	    }
	 //1, 7 = 3점  2,6= 2점  3,5 = 1점 4 = 0점
	 //AN이면 1이 A 7이 N
	 //[RT][CF][JM][AN] 

	public static void main(String[] args) {
		String[] park = { "AN", "CF", "MJ", "RT", "NA" };
		int[] routes = { 5, 3, 2, 7, 5};
		String answer= new 성격유형검사().solution(park,routes);
		//for (int i = 0; i < answer.length; i++) {
			System.out.print(answer + " ");
		//}
	}
}
