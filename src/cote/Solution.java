package cote;

public class Solution {

	public int solution(String my_string) {
        int answer = 0;
        char[] arr = my_string.toCharArray();
        for (int i = 0; i < arr.length; i++) {
			if(Character.isDigit(arr[i])) {
				answer+=arr[i]-'0';
			}
		}
        return answer;
    }

	public static void main(String[] args) {
		System.out.println(new Solution().solution("aAb1B2cC34oOp"));
	}
}
