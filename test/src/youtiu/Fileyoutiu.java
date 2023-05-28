package youtiu;

import java.io.File;
import java.io.IOException;
import java.util.Random;
import java.util.function.Supplier;

import common.Ectension;

public class Fileyoutiu {
	
	private static final Random rd = new Random();
	
	private Fileyoutiu() {
		
	}
	
	public static File create(String path) {
		boolean isValid = false;
		File file = new File(path);
		if(!file.exists()) {
			File parent = file.getParentFile();
			if(!parent.exists()) {
				parent.mkdirs();
			}
			try {
				isValid = file.createNewFile();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		return isValid ? file : null;
	}

	public static boolean[] create(String dirpath, int nof, Ectension[] values) {
		boolean[] result = new boolean[nof];
		
		File dirFile = new File(dirpath);
		if(!dirFile.exists()) {
			dirFile.mkdirs();
		}
		int length = values.length;
		for(int i=0;i<nof;i++) {
			
			String name = "" + i + values[rd.nextInt(length)].val();
			File file = new File(dirFile,name);
			try {
				result[i] = file.createNewFile();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
		return result;
		
	}

	public static void printf(File[] listFile) {
		for(File file : listFile) {
			System.out.println(file);
		}
		
	}
	public static void close(AutoCloseable ...closeables) {
		for(AutoCloseable closeable : closeables) {
			if(closeable != null) {
				try {
					closeable.close();
				} catch (Exception e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		}
	}
}
