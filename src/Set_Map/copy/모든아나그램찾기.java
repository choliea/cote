package Set_Map.copy;

import java.util.HashMap;
import java.util.Scanner;

public class 모든아나그램찾기 {
	 public static void main(String[] args){
		    Scanner in=new Scanner(System.in);
		    String s = in.next();
		    String t = in.next();
		    System.out.println(solution(s,t));
		    return ;
		  }

	private static int solution(String s, String t) {
		int count=0;
		//t의 아나그램 찾기: map으로 t구성 문자와 그 수 찾아서 배열 
		HashMap<String, Integer> tmap = new HashMap<String,Integer>();
		for (int i = 0; i < t.length(); i++) {
			tmap.put(t.charAt(i)+"", tmap.getOrDefault(t.charAt(i)+"", 0)+1);
		}
		//s for문 돌리면서 t의 길이만큼 잘라서 t의 아나그램과 일치 확인 : count++
		//s 잘라서 아나그램 구했을때 tmap과 일치하면 count++
		for (int i = 0; i < s.length()-t.length()+1; i++) {
			String substringS = s.substring(i,i+t.length());
			HashMap<String, Integer> subSmap = new HashMap<String,Integer>();
			for (int j = 0; j < substringS.length(); j++) {
				subSmap.put(substringS.charAt(j)+"", subSmap.getOrDefault(substringS.charAt(j)+"", 0)+1);
			}
			if(tmap.equals(subSmap))count++;
		}
		
		return count;
	}
}
