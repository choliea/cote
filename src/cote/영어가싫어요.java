package cote;

import java.util.LinkedList;
import java.util.Queue;

public class 영어가싫어요 {

	public long solution(String numbers) {
        long answer = 0; 
        int len = numbers.length();
        while(numbers.length()>2){
         
        if(numbers.startsWith("zero")){
            answer= answer*10;
           numbers= numbers.replaceFirst("zero","");
        }else if(numbers.startsWith("one")){
            answer= answer*10+1;
            numbers=numbers.replaceFirst("one","");
        }else if(numbers.startsWith("two")){
            answer= answer*10+2;
            numbers=numbers.replaceFirst("two","");
        }else if(numbers.startsWith("three")){
            answer= answer*10+3;
            numbers=numbers.replaceFirst("three","");
        }else if(numbers.startsWith("four")){
            answer= answer*10+4;
            numbers= numbers.replaceFirst("four","");
        }else if(numbers.startsWith("five")){
            answer= answer*10+5;
            numbers= numbers.replaceFirst("five","");
        }else if(numbers.startsWith("six")){
            answer= answer*10+6;
            numbers= numbers.replaceFirst("six","");
        }else if(numbers.startsWith("seven")){
            answer= answer*10+7;
            numbers=  numbers.replaceFirst("seven","");
        }else if(numbers.startsWith("eight")){
            answer= answer*10+8;
            numbers= numbers.replaceFirst("eight","");
        }else if(numbers.startsWith("nine")){
            answer= answer*10+9;
            numbers= numbers.replaceFirst("nine","");
        }
            if(numbers.length()<3)break;
            }
        return answer;
    }
public long solution3(String numbers) {
	String[] numbers_arr = {"zero", "one", "two", "three", "four", "five", "six", "seven", "eight", "nine"};

    for (int i = 0; i < numbers_arr.length; i++) {
        numbers = numbers.replaceAll(numbers_arr[i], String.valueOf(i));
    }

    long answer = Long.parseLong(numbers);
    return answer;
}
public long solution2(String numbers) {
	 return Long.parseLong(
             numbers.replaceAll("zero", "0")
                     .replaceAll("one", "1")
                     .replaceAll("two", "2")
                     .replaceAll("three", "3")
                     .replaceAll("four", "4")
                     .replaceAll("five", "5")
                     .replaceAll("six", "6")
                     .replaceAll("seven", "7")
                     .replaceAll("eight", "8")
                     .replaceAll("nine", "9")
     );
}
	public static void main(String[] args) {
		int[] a = { 1, 2, 3, 4, 5, 6 };
		String[] d = { "def", "dww", "dzx", "loveaw" };
		System.out.println(new 영어가싫어요().solution("onetwoonefouronesixseveneightnine"));
	}
}
