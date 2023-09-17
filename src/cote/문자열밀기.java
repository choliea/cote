package cote;

import java.util.*;
import java.util.Map.Entry;

public class 문자열밀기 {

	public int solution(String A, String B) {
        int answer = 0;
        int len = A.length();
        A=A+A;
        for (int i = 0; i < len; i++) {
			String t =A.substring(len-i,2*len-i);
			if(t.equals(B))return i;
		}
        return -1;
    }
	public int solution2(String A, String B) {
		return (B+B).indexOf(A);
	}

	public static void main(String[] args) {
		int[] a = { 1, 2, 3, 3, 4 };
		String[] d = { "3 - 4 = -3", "5 + 6 = 11", "-19 - 6 = 13", "-5 + 66 = -71", "5 - 15 = 63", "3 - 1 = -2" };
		System.out.println(new 문자열밀기().solution2("apple","elppa"));
	}
}
