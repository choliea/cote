package cote;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.util.*;
import java.util.Map.Entry;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class 둘만의암호 {
	
	public String solution(String s, String skip, int index) {
		String answer = "";
		HashMap<String,String> map = new HashMap<String, String>();
		map.put("a", "b");
		map.put("b", "c");
		map.put("c", "d");
		map.put("d", "e");
		map.put("e", "f");
		map.put("f", "g");
		map.put("g", "h");
		map.put("h", "i");
		map.put("i", "j");
		map.put("j", "k");
		map.put("k", "l");
		map.put("l", "m");
		map.put("m", "n");
		map.put("n", "o");
		map.put("o", "p");
		map.put("p", "q");
		map.put("q", "r");
		map.put("r", "s");
		map.put("s", "t");
		map.put("t", "u");
		map.put("u", "v");
		map.put("v", "w");
		map.put("w", "x");
		map.put("x", "y");
		map.put("y", "z");
		map.put("z", "a");
		for (int i = 0; i < s.length(); i++) {
			String str = s.charAt(i)+"";
			int count = 0;
			str = rec(str, count, index, map,skip);
			answer+=str;
		}
		return answer;
	}
	String rec(String str,int count, int index,HashMap <String,String> map,String skip) {
		str=map.get(str);
		if(skip.contains(str))count--;
		count++;
		if(count==index) {
			return str;
		}else {
			return rec(str,count,index,map,skip);
		}
	}
	
	public static void main(String[] args) {
		int[] park = { 2, 1, 2, 6, 2, 4, 3, 3 };
		String[] routes = { "Z 3", "D 5" };
		String[] goal = { "2021.05.02 A", "2021.07.01 B", "2022.02.19 C", "2022.02.20 C" };
		String answer = new 둘만의암호().solution("aukks","wbqd",5);
		// for (int i = 0; i < answer.size(); i++) {
		System.out.print(answer + " ");
		// }
	}
}
