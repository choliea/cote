package String;
import java.util.Scanner;

public class 회문문자열 {
	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
	    String input1 = in.next();
	    System.out.println(solution(input1));
	    return ;
	}

	private static String solution(String input1) {
		String reverseStr =reverse(input1);
		if(reverseStr.equalsIgnoreCase(input1))
			return "YES";
		return "NO";
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
