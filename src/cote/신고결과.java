package cote;

import java.util.*;
import java.util.Map.Entry;

public class 신고결과 {
	public int[] solution2(String[] id_list, String[] report, int k) {
		int[] answer = new int[id_list.length];
		ArrayList<User> users = new ArrayList<>();
		HashMap<String, Integer> suspendedList = new HashMap<>(); // <이름>
		HashMap<String, Integer> idIdx = new HashMap<String, Integer>(); // <이름, 해당 이름의 User 클래스 idx>
		int idx = 0;

		for (String name : id_list) {
			idIdx.put(name, idx++);
			users.add(new User(name));
		}

		for (String re : report) {
			String[] str = re.split(" ");
			users.get(idIdx.get(str[0])).reportList.add(str[1]);
			users.get(idIdx.get(str[1])).reportedList.add(str[0]);
		}

		for (User user : users) {
			if (user.reportedList.size() >= k)
				suspendedList.put(user.name, 1);
		}

		for (User user : users) {
			for (String nameReport : user.reportList) {
				if (suspendedList.get(nameReport) != null) {
					answer[idIdx.get(user.name)]++;
				}

			}
		}
		return answer;

	}



	 public int[] solution(String[] id_list, String[] report, int k) {
	        int[] answer = new int[id_list.length];
	        Map<String,Set<String>> reportedMap = new HashMap<String,Set<String>>();
	        ArrayList<String> id = new ArrayList<String>();
	        for (int i = 0; i < id_list.length; i++) {
				id.add(id_list[i]);
			}
	        for(int i=0; i<report.length;i++){
	        	Set<String> thoseReporting = reportedMap.getOrDefault(report[i].split(" ")[1],new HashSet<String>()); 
	        	thoseReporting.add(report[i].split(" ")[0]);
	            reportedMap.put(report[i].split(" ")[1],thoseReporting);
	        }
	        Set<String> reportedSet = reportedMap.keySet();
	        for (Iterator iterator = reportedSet.iterator(); iterator.hasNext();) {
				String string = (String) iterator.next();
				Set<String> a = reportedMap.get(string);
				if(a.size()>=k) {
					for (Iterator iterator2 = a.iterator(); iterator2.hasNext();) {
						String string2 = (String) iterator2.next();
						answer[id.indexOf(string2)]++;
						
					}
				}
			}
	       
	        return answer;
	    }
	public static void main(String[] args) {
		int[] board = { 3, 10, 28, 30};
		String[] id_list = { "muzi", "frodo", "apeach", "neo"};
		String[] report = { "muzi frodo","apeach frodo","frodo neo","muzi neo","apeach muzi"};
		int k = 2;
		int[] a = new 신고결과().solution(id_list,report,k);
		for(int i=0; i<a.length;i++) {
			System.out.println(a[i]);
			
		}
	}
	
}
class User{
    String name;
    HashSet<String> reportList;
    HashSet<String> reportedList;
    public User(String name){
        this.name = name;
        reportList = new HashSet<>();
        reportedList = new HashSet<>();
    }
}