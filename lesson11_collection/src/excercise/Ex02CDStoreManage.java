package excercise;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

import bean.CD;

public class Ex02CDStoreManage {
	public static void main(String[] args) {
		List<CD> cdStore = new ArrayList<>(List.of(new CD(123, "single", "MTP", 10, 5000d),
				new CD(456, "album", "MONO", 6, 3000d), new CD(789, "album", "MCK", 15, 7000d)));
		addCD(cdStore, new CD(349, "single", "WEAN", 8, 6000d));
		System.out.println("Tổng số CD trong store: " + cdStore.stream().count());
		System.out.println("Tổng giá tất cả CD: "+cdStore.stream().mapToDouble(cd->cd.getPrice()).sum());
		List<CD> sortedStore = cdStore.stream().sorted(Comparator.comparing(CD::getPrice,Comparator.reverseOrder())).collect(Collectors.toList());
		cdStore.forEach(System.out::println);
		System.out.println("After sort =============");
		sortedStore.forEach(System.out::println);
	}

	public static void addCD(List<CD> cdStore, CD newCd) {
		if (cdStore.stream().anyMatch(cd -> cd.getId().equals(newCd.getId()))) {
			System.out.println("CD đã tồn tại");
		} else {
			cdStore.add(newCd);
			System.out.println("Đã thêm CD thành công");
		}
		;
	}
}