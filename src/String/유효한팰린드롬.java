package String;
import java.util.Scanner;

public class 유효한팰린드롬 {
	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
	    String input1 = in.nextLine();
	    System.out.println(solution(input1));
	    return ;
	}

	private static String solution(String input1) {
		String reverseStr =reverse(input1);
		input1 = input1.replaceAll(" ", "");
		reverseStr = reverseStr.replaceAll(" ", "");
		reverseStr = removeS(reverseStr);
		input1 = removeS(input1);
		//리버스랑 원본이랑 특수문자,공백 없이 비교 
		if(reverseStr.equalsIgnoreCase(input1))
			return "YES";
		return "NO";
	}

	private static String removeS(String reverseStr) {
		char[] arr = reverseStr.toCharArray();
		String answer="";
		for (int i = 0; i < arr.length; i++) {
			if(Character.isAlphabetic(arr[i])) {
				answer=answer+String.valueOf(arr[i]);
			}
		}
		
		return answer;
	}

	private static String reverse(String input1) {
		char[] arr = input1.toCharArray();
		for (int i = 0; i < arr.length/2; i++) {
			char temp = arr[i];
			arr[i] = arr[arr.length-i-1];
			arr[arr.length-i-1]=temp;
		}
		
		return String.valueOf(arr);
	}
}
