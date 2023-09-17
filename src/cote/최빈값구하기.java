package cote;

import java.util.*;
import java.util.Map.Entry;

public class 최빈값구하기 {

	public int solution(int[] array) {
		int answer = 0;
		Map<Integer,Integer> map = new HashMap<Integer,Integer>();
		for (int i = 0; i < array.length; i++) {
			map.put(array[i], map.getOrDefault(array[i], 0)+1);
		}
		Set<Entry<Integer,Integer>>a =map.entrySet();
		int maxV = 0;
		int maxK = -1;
		boolean isDuplicate = false;
		for (Iterator iterator = a.iterator(); iterator.hasNext();) {
			Entry<Integer, Integer> entry = (Entry<Integer, Integer>) iterator.next();
			if(entry.getValue()>maxV) {
				maxK=entry.getKey();
				maxV=entry.getValue();
				isDuplicate=false;
			}else if(entry.getValue()==maxV) {
				isDuplicate=true;
			}
		}
		if(isDuplicate)return -1;
		
		answer=maxK;
		return answer;
	}

	public static void main(String[] args) {
		int[]a = { 1,2,3,3,4 };
		String[] d = { "3 - 4 = -3", "5 + 6 = 11", "-19 - 6 = 13", "-5 + 66 = -71", "5 - 15 = 63", "3 - 1 = -2" };
		System.out.println(new 최빈값구하기().solution(a));
	}
}
