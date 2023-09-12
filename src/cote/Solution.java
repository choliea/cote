package cote;

public class Solution {

	 public int solution(int[] array, int n) {
	        int answer = 0;
	        Number min=new Number();
	        min.data=0;
	        min.diff=Integer.MAX_VALUE;
	        Number num = new Number();
	        for (int i = 0; i < array.length; i++) {
	        	num.data=array[i];
	        	num.diff=Math.abs(num.data-n);
	        	if(min.diff> num.diff) {
	        		min=num;
	        	}else if(min.diff==num.diff) {
	        		if(min.data>num.data) {
	        			min=num;
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
		int[] a = { 3,10,28 };
		String[] d = { "def", "dww", "dzx", "loveaw" };
		System.out.println(new Solution().solution(a,20));
	}
}
