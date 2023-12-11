package String;
import java.util.ArrayList;
import java.util.Scanner;
/*
 * 알파벳 대문자로 이루어진 문자열을 입력받아 
 * 같은 문자가 연속으로 반복되는 경우 반복되는 
 * 문자 바로 오른쪽에 반복 횟수를 표기하는 방법으로 
 * 문자열을 압축하는 프로그램을 작성하시오.
 * 단 반복횟수가 1인 경우 생략합니다.
 */
public class 문자열압축 {
	 public static void main(String[] args){
		    Scanner in=new Scanner(System.in);
		    String input1 = in.next();
		    System.out.println(solution(input1));
		    return ;
		  }

	private static String solution(String input1) {
		ArrayList<Character> list = new ArrayList<Character>();
		for (int i = 0; i < input1.length(); i++) {
			list.add(input1.charAt(i));
		}
		int count=1;//48=0
		for (int i = 0; i < list.size()-1; i++) {
			if(list.get(i)==list.get(i+1)) {
				count++;
				list.remove(i+1);
				i--;
			}else {
				list.add(i+1, (char)(48+count));
				count=1;
				i++;
			}
		}
		if(count!=1) {
			list.add((char)(48+count));
		}
		String answer="";
		for (int i = 0; i < list.size(); i++) {
			if(list.get(i)=='1') {
				list.remove(i);
				i--;
			}else {
				answer+=list.get(i);
			}
		}
		return answer;
	}
}
