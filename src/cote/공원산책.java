package cote;

import java.util.*;
import java.util.Map.Entry;

public class 공원산책 {
	
	 public int[] solution(String[] park, String[] routes) {
	        int[] position= new int[2];//S 찾아서 바꿔줘
	        for (int i = 0; i < park.length; i++) {//시작위치 설정
				if(park[i].contains("S")) {
					position[0] = i;
					position[1] = park[i].indexOf("S");
					break;
				}
			}
	        int[][] parkArr = new int[park.length][park[0].length()];
	        for (int i = 0; i < parkArr.length; i++) {
				for (int j = 0; j < parkArr[0].length; j++) {
					if(park[i].charAt(j)=='X')parkArr[i][j]=1;
				}//park 정수행렬로 변경
			}
	        for (int i = 0; i < routes.length; i++) {
				if(isPossible(parkArr,position,routes[i]))position=move(position,routes[i]);
			}
	        return position;
	    }
	 public boolean isPossible(int[][] parkArr, int[] position, String route) {
		 String direction = route.split(" ")[0];
		 int distance = Integer.valueOf(route.split(" ")[1]);
		 //장애물이 있는지, 길이 있는지
		 if(direction.equals("E")) {
			 if(position[1]+distance>parkArr[0].length-1)return false;
			 for (int i = 1; i <= distance; i++) {
				if(parkArr[position[0]][position[1]+i]==1)return false;
			}
		 }else if(direction.equals("W")) {
			 if(position[1]-distance<0)return false;
			 for (int i = 1; i <= distance; i++) {
				if(parkArr[position[0]][position[1]-i]==1)return false;
			}
		 }else if(direction.equals("N")) {
			 if(position[0]-distance<0)return false;
			 for (int i = 1; i <= distance; i++) {
				if(parkArr[position[0]-i][position[1]]==1)return false;
			}
		 }else if(direction.equals("S")) {
			 if(position[0]+distance>parkArr.length-1)return false;
			 for (int i = 1; i <= distance; i++) {
				if(parkArr[position[0]+i][position[1]]==1)return false;
			}
		 }
		 
		 
		 return true;
	 }
	 public int[] move(int[] position,String route) {
		 String direction = route.split(" ")[0];
		 String distance = route.split(" ")[1];
		 if(direction.equals("E")) {
			 position[1]+=Integer.valueOf(distance);
		 }else if(direction.equals("W")) {
			 position[1]-=Integer.valueOf(distance);
		 }else if(direction.equals("N")) {
			 position[0]-=Integer.valueOf(distance);
		 }else if(direction.equals("S")) {
			 position[0]+=Integer.valueOf(distance);
		 }
		 return position;
	 }
	 public static void main(String[] args) {
		String[] park = {"OSO","OOX","OOX"};
		String[] routes = {"E 1","S 2","W 1"};
		int[] answer = new 공원산책().solution(park, routes);
		for (int i = 0; i < answer.length; i++) {
			System.out.print(answer[i]+" ");
		}
	}
}
