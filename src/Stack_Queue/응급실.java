package Stack_Queue;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.Scanner;
import java.util.concurrent.ConcurrentLinkedQueue;

public class 응급실 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int input1 = in.nextInt();
		int input2 = in.nextInt();
		LinkedList<HashMap<Integer, Boolean>> arr = new LinkedList<HashMap<Integer, Boolean>>();

		for (int i = 0; i < input1; i++) {
			int a = in.nextInt();
			HashMap<Integer, Boolean> map = new HashMap<Integer, Boolean>();
			if (i == input2)
				map.put(a, true);
			else
				map.put(a, false);
			arr.offer(map);
		}

		System.out.println(solution(arr));
		return;
	}

	private static int solution(LinkedList<HashMap<Integer, Boolean>> arr) {
		int count = 0;
		int arrSize = arr.size();
		while (arr.size() > 0) {
			HashMap<Integer, Boolean> peek = arr.poll();
			boolean isBig = false;
			for (int i = 0; i < arr.size(); i++) {
				HashMap<Integer, Boolean> temp = arr.poll();
				arr.offer(temp);
				if (temp.keySet().iterator().next() > peek.keySet().iterator().next()) {
					isBig = true;
				}
			}
			if (isBig) {
				arr.offer(peek);
			} else {
				count++;
				if (peek.entrySet().iterator().next().getValue()) {
					return count;
				}
			}
		}
		return count;
	}

}
