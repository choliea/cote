package Sorting;

import java.util.Arrays;
import java.util.Scanner;

public class 좌표정렬 {

	public class Point implements Comparable<Point>{

		public int x, y;
		
		public Point(int x, int y) {
			this.x = x;
			this.y = y;
		}

		@Override
		public int compareTo(Point o) {
			if(o.x>this.x) {
				return 1;
			}else if(o.x==this.x&&o.y>this.y) {
				return 1;
			}
			return -1;
		}
		
	}
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		Point[] arr = new Point[n];
		for (int i = 0; i < arr.length; i++) {
				arr[i].x=s.nextInt();
				arr[i].y=s.nextInt();
		}
		Arrays.sort(arr);
		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i].x+" "+arr[i].y);
		}
	}
}
