package cote;

public class 중앙값구하기 {
	class Solution {
	    public int solution(int[] array) {
	        int answer = 0;
	        for (int i = 0; i < array.length-1; i++) {
	        	int count = 0;
				for (int j = 0; j < array.length-i-1; j++) {
					if(array[j]>array[j+1]) {
						int t = array[j];
						array[j] = array[j+1];
						array[j+1] = t;
						count++;
					}
				}
				if(count==0)
					break;
			}
	        answer = array[array.length/2];
	        
	        
	        
	        return answer;
	    }
	}
}
