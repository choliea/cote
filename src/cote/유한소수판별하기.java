package cote;

import java.util.*;
import java.util.Map.Entry;

public class 유한소수판별하기 {

	 public int solution(int a, int b) {
	        int answer = 0;
	        while(b%2==0||b%5==0){
	            if(b%2==0){
	                b/=2;
	            }
	            if(b%5==0){
	                b/=5;
	            }
	        }
	        return (a%b==0)? 1:2;
	    }

	public static void main(String[] args) {
		int[] a = { 1, 2, 3, 3, 4 };
		String[] d = { "3 - 4 = -3", "5 + 6 = 11", "-19 - 6 = 13", "-5 + 66 = -71", "5 - 15 = 63", "3 - 1 = -2" };
		System.out.println(new 유한소수판별하기().solution(7,20));
	}
}
