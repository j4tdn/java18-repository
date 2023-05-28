package demo;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

import utils.CollectionUtils;

public class Ex08 {
	public static void main(String[] args) {
		List<Integer> number = Arrays.asList(1, 2, 1, 3, 3, 2, 4);
		// number.stream().
		List<Integer> evenNumber = number.stream()
				.filter(s -> s % 2 == 0)
				.distinct()
				.collect(Collectors.toList());
		CollectionUtils.printf(evenNumber);
	}
}
