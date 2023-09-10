package cote;

import java.util.HashSet;
import java.util.Set;

public class 배열유사도 {

	public int solution(String[] s1, String[] s2) {
		int answer = 0;
		for (int i = 0; i < s2.length; i++) {
			for (int j = 0; j < s1.length; j++) {
				if(s1[j].equals(s2[i])) {
					answer++;
				}
			}
		}
		return answer;
	}
	public int solution2(String[] s1, String[] s2) {
		int answer = 0;
		Set<String> set = new HashSet<String>();
		for (int i = 0; i < s1.length; i++) {
			set.add(s1[i]);
		}
		for (int i = 0; i < s2.length; i++) {
			set.add(s2[i]);
		}
		answer =s1.length+s2.length-set.size();
		
		return answer;
	}

	public static void main(String[] args) {
		String[] a1 = {"a", "b", "c"};
		String[] a2 = {"com", "b", "d", "p", "c"};
		System.out.println(new 배열유사도().solution2(a1, a2));
	}
}
