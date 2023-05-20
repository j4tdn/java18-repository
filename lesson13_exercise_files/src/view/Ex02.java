package view;

import java.io.File;

import utils.FileUtils;


public class Ex02 {

	private static final String dirPath = String.join(File.separator, "data", "images");

	public static void main(String[] args) {
		File dir = new File(dirPath);
		// TẠO 30 FILE
//		for (int i = 0; i < 30; i++) {
//			setTimeout(() -> {
//				File file = FileUtils.createFile(String.join(File.separator, path, releaseFileName()));
//				System.out.println(" -> "+file);
//			}, 1000);
//		}
//		File file = FileUtils.createFile(String.join(File.separator, dirPath, releaseFileName()));
//		System.out.println(" -> "+file);
		
		File[] filePNG = dir.listFiles(file -> file.isFile() && file.getName().substring(file.getName().lastIndexOf(".")).equals(".png"));
		File[] fileJPG = dir.listFiles(file -> file.isFile() && file.getName().substring(file.getName().lastIndexOf(".")).equals(".jpg"));
		for(int i = 0;i<filePNG.length;i++) {
			String extension =  filePNG[i].getName().substring(filePNG[i].getName().lastIndexOf("."));
			File newFile = new File(String.join(File.separator,dirPath,(i+1)+extension));
			if (filePNG[i].renameTo(newFile)) {
                System.out.println("Renamed file: " + filePNG[i].getName() + " to " + newFile.getName());
            } else {
                System.out.println("Failed to rename file: " + filePNG[i].getName());
            }
		}
		for(int i = 0;i<fileJPG.length;i++) {
			String extension =  fileJPG[i].getName().substring(fileJPG[i].getName().lastIndexOf("."));
			File newFile = new File(String.join(File.separator,dirPath,(i+1)+extension));
			if (fileJPG[i].renameTo(newFile)) {
                System.out.println("Renamed file: " + fileJPG[i].getName() + " to " + newFile.getName());
            } else {
                System.out.println("Failed to rename file: " + fileJPG[i].getName());
            }
		}
	}

	public static String releaseFileName() {
		String[] extension = { ".png", ".jpg" };
		int randomIndex = (int) Math.round(Math.random());
		String randomExtension = extension[randomIndex];
		return System.currentTimeMillis() + randomExtension;
	}

	// SETTIMEOUT JAVASCRIPT BẰNG CÁCH DÙNG THREAD TRONG JAVA
	public static void setTimeout(Runnable runnable, int delay) {
		new Thread(() -> {
			try {
				Thread.sleep(delay);
				runnable.run();
			} catch (Exception e) {
				System.err.println(e);
			}
		}).start();
	}
}
