package laporan8;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class CobaCheckedExpection {
	
	
	public static void main(String args[]) {
		
		try {
			FileInputStream file = new FileInputStream("D:/coba.txt");
			System.out.println("FileNotFoundException tidak terjadi");
			file.close();
			} catch (FileNotFoundException e) {
				System.out.println("FileNotFoundException terjadi");
			} catch (IOException e) {
				System.out.println("IOExpection terjadi");
			} catch (Exception e) {
				System.out.println("Exception terjadi");
			}
		}
	
	

}
