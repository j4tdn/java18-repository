package kt2;
/**
 Bài 3: Level của số tự nhiên
		Level của một số tự nhiên là số ước của nó. Ví dụ
		. 8 có level là 4 vì có 4 ước số: 1, 2, 4 ,8
		. 5 có level là 2 vì có 2 ước số: 1, 5
		. 9 có level là 3 vì có 3 ước số: 1, 3, 9
		. 20 có level là 6 vì có 6 ước số: 1, 2, 4, 5, 10, 20
		Cho một mảng số nguyên gồm n (3 < n < 20) phần tử. Viết chương trình sắp xếp mảng số nguyên
		theo level tăng dần
		Ví dụ: n = 4. Mảng số nguyên: 8 5 9 20
		Kết quả sau khi đã sắp xếp: 5 9 8 20
 */
public class Ex03 {
	public static void main(String[] args) {
		int[] numbers = { 8, 5, 9, 20 };
		for (int number : result(numbers)) {
			System.out.print(number + " ");
		}
	}

	private static int[] result(int[] numbers) {
		int[] numbersLevel = getLevel(numbers);
		for (int i = 0; i < numbers.length - 1; i++) {
			for (int j = i + 1; j < numbers.length; j++) {
				if (numbersLevel[i] > numbersLevel[j]) {
					int temp2 = numbersLevel[j];
					numbersLevel[j] = numbersLevel[i];
					numbersLevel[i] = temp2;

					int temp = numbers[j];
					numbers[j] = numbers[i];
					numbers[i] = temp;
				}
			}
		}
		return numbers;
	}

	private static int[] getLevel(int[] numbers) {
		int[] numbersLevel = new int[numbers.length];
		int index = 0;
		int count = 0;
		for (int number : numbers) {
			for (int i = 1; i <= number; i++) {
				if (number % i == 0) {
					count++;
				}
			}
			numbersLevel[index++] = count;
			count = 0;
		}
		return numbersLevel;
	}
}
