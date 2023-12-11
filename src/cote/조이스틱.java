package cote;

import java.util.HashMap;

public class 조이스틱 {
	public int solution(String name) {
		int answer = 0;
		int firstAidx = 0;
		int lastAidx = name.length()-1;
		HashMap<Character,Integer> map = new HashMap<>();
		if(name.contains("A")) {
			firstAidx = name.indexOf("A");
			lastAidx = name.lastIndexOf("A");
		}
		for(int i=firstAidx; i<=lastAidx; i++) {
			
		}
		
		
		return answer;
	}

	public static void main(String[] args) {
		System.out.println(new 조이스틱().solution("JEROEN"));
	}
}
