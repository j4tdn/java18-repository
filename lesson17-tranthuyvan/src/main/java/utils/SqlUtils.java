package utils;

public class SqlUtils {

	private SqlUtils() {
	}

	public static void close(AutoCloseable... objectsNeedToBeClosed) {
		for (AutoCloseable closeableObject : objectsNeedToBeClosed) {
			try {
				closeableObject.close();
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
	}

}
