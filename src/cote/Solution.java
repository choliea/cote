package cote;

import java.util.*;
import java.util.Map.Entry;

public class Solution {

	public int solution(int[] array, int n) {
        int answer = 0;
  
        Number min=new Number();
        min.data=0;
        min.diff=Integer.MAX_VALUE;
        Number num = new Number();
        for (int i = 0; i < array.length; i++) {
            if(array[i]==n)return array[i];
        	num.data=array[i];
        	num.diff=Math.abs(num.data-n);
        	if(min.diff> num.diff) {
        		min.diff=num.diff;
        		min.data=num.data;
        	}else if(min.diff==num.diff) {
        		if(min.data>num.data) {
        			min.data=num.data;
        			min.diff=num.diff;
        		}
        	}
        	
		}
        answer=min.data;
        return answer;
    }
 public class Number {
	 int data;
	 int diff;
 }
	public static void main(String[] args) {
		int[] board = { 3, 10, 28, 30};
		String[] d = { "left", "right", "up", "right", "right" };
		int a = new Solution().solution(board, 20);
		System.out.println(a);
	}
}
