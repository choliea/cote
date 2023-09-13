package cote;

import java.util.LinkedList;
import java.util.Queue;

public class 공던지기 {

    public int solution(int[] numbers, int k) {
        Queue<Integer> list = new LinkedList<>();
        for (int j = 0; j < numbers.length; j++) {
        	list.offer(numbers[j]);
		}
        for (int i = 0; i < k-1; i++) {
			list.offer(list.poll());
			list.offer(list.poll());
		}
        return list.peek();
    }
    public int solution2(int[] numbers, int k) {
    	
    	return numbers[(2*k-2)%numbers.length];
    }
	
	
	public static void main(String[] args) {
		int[] a = { 1, 2, 3, 4, 5, 6 };
		String[] d = { "def", "dww", "dzx", "loveaw" };
		System.out.println(new 공던지기().solution2(a,5));
	}
}
