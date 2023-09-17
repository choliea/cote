package cote;

import java.util.*;
import java.util.Map.Entry;

public class 다항식덧셈 {

		public String solution(String polynomial) {
			String answer = "";
			String[] a = polynomial.split(" ");
			int x = 0;
			int y = 0;
			for (int i = 0; i < a.length; i+=2) {
				if(a[i].contains("x")) {
					x+=Integer.parseInt((a[i].substring(0,a[i].length()-1).equals(""))?"1":a[i].substring(0,a[i].length()-1));
				}
				else y+=Integer.parseInt(a[i]);
			}
			return x == 0 ? y==0 ? "0" : y+"" : x==1 ? y==0 ? "x" : "x + "+y : y==0 ? x+"x" : x+"x + "+y;  
		}

	public static void main(String[] args) {
		int[] a = { 1, 2, 3, 3, 4 };
		String[] d = { "3 - 4 = -3", "5 + 6 = 11", "-19 - 6 = 13", "-5 + 66 = -71", "5 - 15 = 63", "3 - 1 = -2" };
		System.out.println(new 다항식덧셈().solution("x + 1"));
	}
}
