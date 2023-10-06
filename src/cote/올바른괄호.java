package cote;

import java.util.*;

public class 올바른괄호 {
	boolean solution(String s) {
        boolean answer = true;
        Stack<Character> stack = new Stack<>();
        if(s.startsWith(")")||s.endsWith("(")||s.length()%2==1)return false;
        char[] arr = s.toCharArray();
        for(int i=0; i<arr.length;i++){
            if(!stack.isEmpty()&&stack.peek()=='('&&arr[i]==')')stack.pop();
            else stack.add(arr[i]);
        }
        if(stack.size()!=0)answer=false;
        return answer;
    }
	 boolean solution2(String s) {
	        boolean answer = false;
	        int count = 0;
	        for(int i = 0; i<s.length();i++){
	            if(s.charAt(i) == '('){
	                count++;
	            }
	            if(s.charAt(i) == ')'){
	                count--;
	            }
	            if(count < 0){
	                break;
	            }
	        }
	        if(count == 0){
	            answer = true;
	        }
	        return answer;
	    }
	public static void main(String[] args) {
		String s = ")()(";
		System.out.println(new 올바른괄호().solution(s));
	}
}
