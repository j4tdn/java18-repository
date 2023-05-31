package model;
import java.util.Arrays;
import java.util.List;

import bean.SleepTime;

public class SleepTimeModal {
	public SleepTimeModal() {
		// TODO Auto-generated constructor stub
	}
	
	public static List<SleepTime> getSleepTime(){
		int[] matureAge = new int[64-18+1];
		int[] oldAge = new int[150-65+1];
		for(int i = 18;i<=64;i++) {
			matureAge[i-18] = i;
		}
		for(int j = 65;j<=150;j++) {
			oldAge[j-65] = j;
		}
		return Arrays.asList(
				new SleepTime("Trẻ mới sinh",new int[] {1,2,3},20),
				new SleepTime("Trẻ nhỏ",new int[] {4,5,6,7,8,9,10,11,12,13},11),
				new SleepTime("Thanh Thiếu Niên",new int[] {14,15,16,17},9),
				new SleepTime("Thanh Niên và người Trưởng Thành",matureAge,8),
				new SleepTime("Người lớn tuổi",oldAge,7)
				);
	}
}
