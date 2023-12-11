package String;
import java.util.Scanner;

public class 문자찾기 {
	/*
	 * 한 개의 문자열을 입력받고, 
	 * 특정 문자를 입력받아 해당 특정문자가 입력받은 문자열에 
	 * 몇 개 존재하는지 알아내는 프로그램을 작성하세요.
	 */
	  public static int solution(String input1, String input2) {
		  input1 =input1.toUpperCase();
		  int input1Length = input1.length();
		  input2 = input2.toUpperCase();
		  input1 =input1.replaceAll(input2, "");
		  int input1Length1 = input1.length();
		  int answer = input1Length-input1Length1;
		  return answer;
	  }

	  public static void main(String[] args){
	    Scanner in=new Scanner(System.in);
	    String input1 = in.next();
	    String input2 = in.next();
	    int a = solution(input1,input2);
	    System.out.println(a);
	    return ;
	  }
	
}
