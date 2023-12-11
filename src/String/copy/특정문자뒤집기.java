package String.copy;
import java.util.Scanner;
/*
 * 영어 알파벳과 특수문자로 구성된 문자열이 주어지면 영어 알파벳만 뒤집고,
특수문자는 자기 자리에 그대로 있는 문자열을 만들어 출력하는 프로그램을 작성하세요.
 */
public class 특정문자뒤집기 {
	public static void main(String[] args){
	    Scanner in=new Scanner(System.in);
	    String input1 = in.next();
	    String answer = solution(input1);
	    System.out.println(answer);
	    return ;
	  }
	public static String solution(String input1) {
		String answer="";
		char[] arr = input1.toCharArray();
		int j=arr.length-1;
		for (int i = 0; i < arr.length; i++) {
			if(i>=j)
				break;
			while(!Character.isAlphabetic(arr[i])) {
				i++;
			}
			while(!Character.isAlphabetic(arr[j])) {
				j--;
			}
			char temp = arr[i];
			arr[i] = arr[j];
			arr[j] = temp;
			
			j--;
		}
		answer=String.valueOf(arr);
		
		return answer;
	}
}
