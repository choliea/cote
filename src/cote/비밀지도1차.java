package cote;

import java.util.*;
import java.util.Map.Entry;

public class 비밀지도1차 {

	 public String[] solution(int n, int[] arr1, int[] arr2) {
	        String[] answer = new String[arr1.length];
	        String[] sarr1 = new String[arr1.length];
	        String[] sarr2 = new String[arr2.length];
	        for (int j = 0; j < arr2.length; j++) {
	        	String temp = "";
		        sarr1[j] = Integer.toBinaryString(arr1[j]);
		        sarr2[j] = Integer.toBinaryString(arr2[j]);
		        while(sarr1[j].length()<n) {
		        	sarr1[j]="0"+sarr1[j];
		        }
		        while(sarr2[j].length()<n) {
		        	sarr2[j]="0"+sarr2[j];
		        }
		        sarr1[j] = sarr1[j].replaceAll("0", " ");
		        sarr1[j] = sarr1[j].replaceAll("1", "#");
		        sarr2[j] = sarr2[j].replaceAll("0", " ");//####0
		        sarr2[j] = sarr2[j].replaceAll("1", "#");//0#00#
		        for (int i = 0; i < sarr2[j].length(); i++) {
					if(sarr1[j].charAt(i)!=sarr2[j].charAt(i)) {
						temp+="#";
					}else {
						temp+=sarr1[j].charAt(i);
					}
				}
		        answer[j] = temp;
	        }
	        return answer;
	    }
	public static void main(String[] args) {
		int[] park = { 9, 20, 28, 18, 11 };
		int[] routes = {30, 1, 21, 17, 28};
		int[][] command = {{2, 5, 3}, {4, 4, 1}, {1, 7, 3}};
		//"#####","# # #", "### #", "# ##", "#####"답
		String[] answer= new 비밀지도1차().solution(5,park,routes);
		for (int i = 0; i < answer.length; i++) {
			System.out.print(answer[i] + " ");
		}
	}
}
