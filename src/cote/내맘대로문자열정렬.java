package cote;

import java.util.*;
import java.util.Map.Entry;

public class 내맘대로문자열정렬 {

    public String[] solution(String[] strings, int n) {
        
        for (int i = 0; i < strings.length-1; i++) {
			for (int j = 0; j < strings.length-i-1; j++) {
				if(compareTo(strings[j],strings[j+1],n)>0) {
					String temp =strings[j];
					strings[j]=strings[j+1];
					strings[j+1]=temp;
				}
			}
		}
        return strings;
    }
    public int compareTo(String a, String b, int n) {
    	if(a.charAt(n)>b.charAt(n)) {
    		return 1;
    	}else if(a.charAt(n)==b.charAt(n)) {
    		return a.compareTo(b); //??
    	}else {
    		return -1;
    	}
    }
    public String[] solution2(String[] strings, int n) {
        for (int i = 0; i < strings.length; i++) {
        	strings[i] = strings[i].charAt(n)+strings[i];
        }
        Arrays.sort(strings);
        for (int i = 0; i < strings.length; i++) {
			strings[i] = strings[i].substring(1);
		}
        return strings;
    }
    public String[] solution3(String[] strings, int n) {
        Arrays.sort(strings, new Comparator<String>(){
            @Override
            public int compare(String s1, String s2){
                if(s1.charAt(n) > s2.charAt(n)) return 1;
                else if(s1.charAt(n) == s2.charAt(n)) return s1.compareTo(s2);
                else if(s1.charAt(n) < s2.charAt(n)) return -1;
                else return 0;
            }
        });
        return strings;
    }
	public static void main(String[] args) {
		String[] park = { "sun", "bed", "car" };
		int[] routes = { 5, 3, 2, 7, 5};
		String[] answer= new 내맘대로문자열정렬().solution2(park,1);
		for (int i = 0; i < answer.length; i++) {
			System.out.print(answer[i] + " ");
		}
	}
}
