package String.copy;
import java.util.Scanner;
public class 중복문자제거 {
	  public static void main(String[] args){
		    Scanner in=new Scanner(System.in);
		    String input1 = in.next();
		    System.out.println(solution(input1));
		    return ;
		  }

	private static String solution(String input1) {
		
		for (int i = 0; i < input1.length(); i++) {
			String temp =String.valueOf(input1.charAt(i));
			input1 = input1.replaceAll(temp,"");
			input1 = temp+input1;
		}
		char[] arr = input1.toCharArray();
		for (int i = 0; i < arr.length/2; i++) {
			char temp = arr[i];
			arr[i] = arr[arr.length-i-1];
			arr[arr.length-i-1] = temp;
		}
		String answer = String.valueOf(arr);
		return answer;
	}
}
