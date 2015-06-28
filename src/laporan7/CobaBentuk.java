package laporan7;

import tujuh.bentuk.Bentuk;
import tujuh.bentuk.BujurSangkar;
import tujuh.bentuk.SegitigaSamaKaki;
import tujuh.bentuk.SegitigaSamaSisi;

public class CobaBentuk {
	
	public static void cetakBangun(Bentuk b) {
		
		System.out.println(b.hitungLuas());
		b.tulis();
		b.geser(5,5);
		
	}
	
	public static void main(String args[]) {
		
		cetakBangun(new BujurSangkar());
		cetakBangun(new SegitigaSamaKaki());
		cetakBangun(new SegitigaSamaSisi());
		
	}

}
