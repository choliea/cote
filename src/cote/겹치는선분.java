package cote;

import java.util.ArrayList;
import java.util.Arrays;

public class 겹치는선분 {
	class Solution {
	    public int solution(int[][] lines) {
	        int answer = 0;
	        Arrays.sort(lines);
	        for (int i = 0; i < 2; i++) {
				for (int j = i+1; j <= 2; j++) {
					if(lines[i][0]==lines[j][0]) {
						if(lines[j][1]<=lines[i][1]) {
							answer += (lines[j][1]-lines[j][0]);
						}else if(lines[j][1]>lines[i][1]) {
							answer += (lines[i][1]-lines[i][0]);
						}
					}else if(lines[i][0]>lines[j][0]) {
						if(lines[j][1]>lines[i][0]) {
								answer += (lines[j][1]-lines[i][0]);
							}
					}else if(lines[i][0]<lines[j][0] && lines[j][0]<lines[i][1]) {
						answer += (lines[j][1]-lines[j][0]);
					}
						}
					}
//					if(lines[i][0]>=lines[j][0]) {
//			        	if(lines[i][0]>=lines[j][1])
//			        		answer = answer;
//			        	else {
//			        		if(lines[i][1]>lines[j][1]) {
//			        			answer = answer+ lines[i][1]-lines[j][1]-1;
//			        		}else if(lines[i][1]<=lines[j][1]) {
//			        			answer = answer+ lines[i][1]-lines[j][0]-1;
//			        		}
//			        	}
//			       
//			        }else if(lines[i][0]<lines[j][0]) {
//			        	if(lines[i][1]<=lines[j][0])
//			        		answer = answer;
//			        	else {
//			        		if(lines[j][1]<=lines[i][1])
//			        		answer = answer+ lines[i][1]-lines[j][0]-1;
//			        		else
//			        		answer = answer+ lines[i][1]-lines[j][0]-1;
//			        	}
//			        }
	        return answer;
				}
	    
			}
//	        if(lines[0][0]>=lines[1][0]) {
//	        	if(lines[0][0]>=lines[1][1])
//	        		answer = 0; //수정 0 아니고 그대로 
//	        	else {
//	        		if(lines[0][1]>lines[1][1]) {
//	        			answer = answer+ lines[0][1]-lines[1][1]-1;
//	        		}else if(lines[0][1]<=lines[1][1]) {
//	        			answer = answer+ lines[0][1]-lines[0][0]-1;
//	        		}
//	        	}
//	       
//	        }else if(lines[0][0]<lines[1][0]) {
//	        	if(lines[0][1]<=lines[1][0])
//	        		answer = 0;//수정 0 아니고 그대로 
//	        	else {
//	        		if(lines[1][1]<=lines[0][1])
//	        		answer = answer+ lines[0][1]-lines[1][0]-1;
//	        		else
//	        		answer = answer+ lines[1][1]-lines[1][0]-1;
//	        	}
//	        }

	



	public static void main(String[] args) {

	}

}
