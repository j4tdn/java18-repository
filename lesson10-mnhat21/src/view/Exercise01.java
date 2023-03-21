package view;

import java.util.ArrayList;
import java.util.List;

public class Exercise01 {
	public static void main(String[] args) {
		ArrayList<Integer> list = new ArrayList<>(List.of(1,2,3,4,3,1));
//		list = findSame(list);
//		System.out.println(list);
//		System.out.println(comparing(list));
		System.out.println(findThird(list));
	}

	public static ArrayList<Integer> findSame(ArrayList<Integer> list){
		List<Integer> temp = new ArrayList<>();
		for(int i = 0; i < list.size() - 1; i++){
			boolean check = true;
			for(int j = 0; j < temp.size(); j++){
				if(temp.get(j) != null && temp.get(j) == list.get(i)){
					check = false;
				}
			}
			if(check == true){
				temp.add(list.get(i));
			}
		}
		for(int i = 0; i < temp.size(); i++){
			int count = 0;
			for(int j = 0; j < list.size(); j++){
				if(temp.get(i) == list.get(j)){
					count++;
				}
				if(count >= 2){
					int help = temp.get(i);
					for(int k = 0; k < list.size(); k++){
						if(list.get(k) == help){
							list.remove(list.get(k));
						}
					}
				}
			}
		}
		return list;
	}

	public static int comparing(ArrayList<Integer> list){
		int front = 0;
		int back = 0;
		for(int i = 0; i < list.size()/2; i++){
			front+= list.get(i);
			back+= list.get(list.size()-i-1);
		}
		return front/list.size() - back/list.size();
	}

	public static int findThird(ArrayList<Integer> list){
		List<Integer> temp = new ArrayList<>();
		for(int i = 0; i < list.size() - 1; i++){
			boolean check = true;
			for(int j = 0; j < temp.size(); j++){
				if(temp.get(j) != null && temp.get(j) == list.get(i)){
					check = false;
				}
			}
			if(check == true){
				temp.add(list.get(i));
			}
		}
		System.out.println(temp);
		temp.sort((o1, o2) -> o2 - o1);
		return temp.get(2);
	}
}
