package chun.utama;

import chun.mobil.Sedan;
import chun.mobil.Truk;

public class MobilTest {
	
	public static void staterMobil(Mobil mobil){
		mobil.stater();
	}
	
	public static void main (String[] args) {
		Mobil sedan = new Sedan();
		Truk truk = new Truk();
		
		staterMobil(new Mobil());
		
		staterMobil(sedan);
		
		staterMobil(truk);
		
	}

}
