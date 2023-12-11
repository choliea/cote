package cote;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

public class 나선형배열채우기 {
	static class Solution {
	    public int solution(String[] strArr) {
	    	HashMap<Integer,Integer> frequency = new HashMap<Integer,Integer>();
	    	for (String string : strArr) {
	    		int fre = strArr.length;
				frequency.put(fre, frequency.getOrDefault(fre, 0)+1);
			}
	    	int max = 0;
	        for(Integer values:frequency.values()) {
	        	max = Math.max(max, values);
	        }
	        return max;
	    }
	}
	public static void main(String[] args) {

		Solution a = new Solution();
		String[] picture = {"aa",
				"aa",
				"bca",
				"d",
				"efg",
				"hi"
				};
		// ArrayList<Integer> list = new ArrayList<Integer>();
		int answer = a.solution(picture);
		System.out.println(answer);
		
	}

}
