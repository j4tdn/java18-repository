
public class EX03 {
	public static void main(String[] args) {
        String s1 = "Word"; // Chuỗi s1
        String s2 = "worrd"; // Chuỗi s2

        // Xóa các kí tự trống và chuẩn hóa chuỗi sang chữ thường
        s1 = s1.toLowerCase().replaceAll("\\s", "");
        s2 = s2.toLowerCase().replaceAll("\\s", "");

        // Sử dụng mã ASCII để đếm số lượng kí tự
        int[] count = new int[256];
        for (int i = 0; i < s1.length(); i++) {
            count[s1.charAt(i)]++;
            count[s2.charAt(i)]--;
        }

        // Kiểm tra xem số lượng kí tự có bằng nhau không
        boolean isAnagram = true;
        for (int i = 0; i < count.length; i++) {
            if (count[i] != 0) {
                isAnagram = false;
                break;
            }
        }

        if (isAnagram) {
            System.out.println("Hai chuỗi là đảo ngữ của nhau");
        } else {
            System.out.println("Hai chuỗi không phải là đảo ngữ của nhau");
        }
    }
}
