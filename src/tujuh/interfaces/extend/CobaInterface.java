package tujuh.interfaces.extend;

import tujuh.interfaces.BentukKeliling;
import tujuh.interfaces.BentukLuas;
import tujuh.interfaces.Lingkaran;


public class CobaInterface {
	
	public static double hitungLuasBentuk(BentukLuas b) {
		return b.hitungLuas();
	}
	
	public static double hitungLuasKeliling(BentukKeliling b) {
		return b.hitungKeliling();
	}
	
	public static void main(String args[]) {
		Lingkaran bentuk = new Lingkaran(3);
		System.out.println(hitungLuasBentuk((BentukLuas) bentuk));
		System.out.println(hitungLuasKeliling((BentukKeliling)bentuk));
	}

}
