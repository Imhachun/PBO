package tujuh.bentuk;

public class Segitiga extends Bentuk{
	
	protected float alas;
	protected float tinggi;
	
	public Segitiga() {
		alas = 5;
		tinggi = 5;
	}
	
	public float hitungLuas() {
		return (alas*tinggi)/2;
	}


	public void tulis() {
		
		
	}

}
