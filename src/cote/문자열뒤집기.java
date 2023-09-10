package cote;

public class 문자열뒤집기 {
	public String solution(String my_string) {
		String answer = "";
		char[] arr = my_string.toCharArray();
		for (int i = 0; i < arr.length/2; i++) {
			char temp = arr[i];
			arr[i] = arr[arr.length-i-1];
			arr[arr.length-1-i]=temp;
		}
		answer = String.valueOf(arr);
		return answer;
	}
	public String solution2(String my_string) {
		return new StringBuilder(my_string).reverse().toString();
	}
	public String solution3(String my_string) {
		String answer = "";
		for (int i = 0; i < my_string.length(); i++) {
			answer+=my_string.charAt(my_string.length()-1-i);
		}
		return answer;
	}
	public static void main(String[] args) {
		String my_string = "jaron";
		System.out.println(new 문자열뒤집기().solution3(my_string));
	}
}
