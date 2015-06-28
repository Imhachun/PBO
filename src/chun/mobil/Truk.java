package chun.mobil;

import chun.Mesin;
import chun.utama.Mobil;

public class Truk extends Mobil {
	
	
	public void tongkang(){
		
		mesin = new Mesin();
		stater();
		
		nama ="Truk";
		System.out.println("Tongkang");
	}
	
	public void stater(){
		System.out.println("Stater Truk");
	}
	
	public static void main(String args[]){
		Truk truk = new Truk();
		truk.tongkang();
	}
	
	

}
