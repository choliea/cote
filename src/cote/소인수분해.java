package cote;

import java.util.*;
import java.util.Map.Entry;

public class 소인수분해 {

	 public int[] solution(int n) {
	       List<Integer>set = new ArrayList<>();
	        for (int i = 2; i <= n; i++) {
				while(n%i==0) {
					n/=i;
				}
				set.add(i);
			} 
	        int[] a = new int[set.size()];
	        Iterator<Integer> it = set.iterator();
	        for (int i = 0; i < a.length; i++) {
				a[i]=it.next();
			}
	        Arrays.sort(a);
	        return a;
	    }
	public static void main(String[] args) {
		int[][] board = { {1, 1}, {2, 1}, {2, 2}, {1, 2} };
		String[] d = { "left", "right", "up", "right", "right" };
		System.out.println(new 소인수분해().solution(12));
	}
}
