package cote;

public class 숨어있는숫자더하기 {

	public int solution(String my_string) {
		int answer = 0;
		char[] arr = my_string.toCharArray();
		int temp = 0;
		if (Character.isDigit(arr[0])) {
			temp = temp + arr[0] - '0';
		}
		for (int i = 1; i < my_string.length(); i++) {
			if (Character.isDigit(arr[i]) && Character.isDigit(arr[i - 1])) {
				temp = temp * 10 + arr[i] - '0';
			} else if (Character.isDigit(arr[i])) {
				temp = temp + arr[i] - '0';
			} else {
				answer += temp;
				temp = 0;
			}
		}
		answer += temp;
		return answer;
	}

	 public int solution2(String my_string) {
	        int answer = 0;

	        String[] str = my_string.replaceAll("[a-zA-Z]", " ").split(" ");

	        for(String s : str){
	            if(!s.equals("")) answer += Integer.parseInt(s);
	        }

	        return answer;
	    }
	public static void main(String[] args) {
		String[] a = { "z", "d", "x" };
		String[] d = { "def", "dww", "dzx", "loveaw" };
		System.out.println(new 숨어있는숫자더하기().solution2("aAb1B2cC34oOp"));
	}
}
