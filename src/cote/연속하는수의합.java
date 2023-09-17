package cote;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class 연속하는수의합 {

	  public int[] solution(int num, int total) {
	        int[] answer = new int[num];
	        //(a+a+num-1)*num/2=total
	        //2*a+num-1= total*2/num
	        //2*a = total*2/num+1-num
	        int a = (total*2/num+1-num)/2;
	        for(int i=0; i<num; i++){
	            answer[i] = a++;
	        }
	        return answer;
	    }

	
	public static void main(String[] args) {
		int[][] a = { {80, 70}, {90, 50}, {40, 70}, {50, 80} };
		String[] d = { "def", "dww", "dzx", "loveaw" };
		System.out.println(new 연속하는수의합().solution(3,12));
	}
}
