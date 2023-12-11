package cote;

import java.util.Scanner;

public class 멘토링 {
		public static void main(String[] args) {
			Scanner in = new Scanner(System.in);
			int studentNo = in.nextInt();
			int examNo = in.nextInt();
			int[][] arr = new int[examNo][studentNo];
			for (int i = 0; i < examNo; i++) {
				for (int j = 0; j < studentNo; j++) {
					arr[i][j] = in.nextInt();
				}
			}
			int count = 0;
			for (int j = 1; j <= studentNo; j++) {
				for (int m = 1; m <= studentNo; m++) {
					if(m==j)continue;
					boolean isSuperior= true;
					for (int i = 0; i < examNo; i++) {
						int firstRank =-1;
						int secondRank=-1;
						
						for (int k = 0; k < studentNo; k++) {
							if(arr[i][k]==j) {
								firstRank=k;
							}else if(arr[i][k]==m) {
								secondRank=k;
							}
						}
						if(firstRank>secondRank) {
							isSuperior=false;
							break;
						}
						
					}
					if(isSuperior) {
						count++;
					}
				}
				
			}
			
			
			System.out.println(count);
			return;
		}
}
