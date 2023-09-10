package cote;

import java.util.*;

public class A로B만들기 {
	public int solution(String before, String after) {
		Map<Character,Integer> map = new HashMap<Character, Integer>();
		for (int i = 0; i < before.length(); i++) {
			map.put(before.charAt(i), map.getOrDefault(before.charAt(i), 0)+1);
		}
		for (int i = 0; i < after.length(); i++) {
			if(!(map.containsKey(after.charAt(i)))||map.size()==0) {
				return 0;
			}
			if(map.get(after.charAt(i))==1) {
				map.remove(after.charAt(i));
			}else {
				map.put(after.charAt(i), map.get(after.charAt(i))-1);
			}
		}
		return 1;
	}
	public int solution2(String before, String after) {
		Map<Character,Integer> map = new HashMap<Character, Integer>();
		Map<Character,Integer> map2 = new HashMap<Character, Integer>();
		for (int i = 0; i < before.length(); i++) {
			map.put(before.charAt(i), map.getOrDefault(before.charAt(i), 0)+1);
		}
		for (int i = 0; i < after.length(); i++) {
			map2.put(after.charAt(i), map2.getOrDefault(after.charAt(i), 0)+1);
		}
		if(map.equals(map2))
		return 1;
		else return 0;
	}
	public int solution3(String before, String after) {
		char[] arr = before.toCharArray();
		char[] arr2 = after.toCharArray();
		Arrays.sort(arr);
		Arrays.sort(arr2);
		if(arr.equals(arr2))return 1;
		return 0;
	}

	public static void main(String[] args) {
		int[] arr = { 1, 2, 3, 4, 5, 6, 7, 8 };
		System.out.println(new A로B만들기().solution("ohell","hello"));
	}
}
