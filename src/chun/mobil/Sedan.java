package chun.mobil;

import chun.utama.Mobil;

public class Sedan extends Mobil {
	
	public String nama;
	
	public Sedan(){
		super();
	}
	
	public void cetak(String nama){
		super.nama = nama;
		this.nama = "Sedan lokal";
		
		System.out.println(nama);
		System.out.println(this.nama);
	}
	
	public void stater(){
		System.out.println("Stater Sedan");
	}
	
	public static void main(String args[]){
		Sedan sedan = new Sedan();
		sedan.cetak("Sedan");
	}

}
