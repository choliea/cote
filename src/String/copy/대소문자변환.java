package String.copy;
import java.util.Scanner;
/*
 * 대문자와 소문자가 같이 존재하는 문자열을 입력받아 
 * 대문자는 소문자로 소문자는 대문자로 변환하여 출력하는 프로그램을 작성하세요.
 */
public class 대소문자변환 {
	  
	public static String solution(String input1) {
		char[] list =input1.toCharArray();
		String answer = "";
		for (int i = 0; i < list.length; i++) {
			if(list[i]>='a'&&list[i]<='z') {
				answer = answer+String.valueOf(list[i]).toUpperCase();
			}else {
				answer = answer+String.valueOf(list[i]).toLowerCase();
			}
		}
		return answer;
	}
	
	  public static void main(String[] args){
	    Scanner in=new Scanner(System.in);
	    String input1 = in.next();
	    String answer = solution(input1);
	    System.out.println(answer);
	    return ;
	  }

	
}
