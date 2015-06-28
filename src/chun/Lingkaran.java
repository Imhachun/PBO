package chun;

public class Lingkaran {      //kelas Lingkaran

	public double radius;
	private static double PHI = 3.14;
	
	public Lingkaran(double radius){
		
		this.radius = radius;
	}
	
	
	public double hitungLuas (){
		
		double luas;
		luas =PHI * radius * radius;
		return luas;
		
	}
	
	public double hitungKeliling(){
		
		double keliling;
		keliling =PHI * 2 * radius;
		return keliling;
		
	}
	
	public void cetak()
	{
	System.out.println("Radius Lingkaran : "+ radius);
	System.out.println("Keliling Lingkaran : "+hitungKeliling());
	System.out.println("Luas Lingkaran : "+hitungLuas());
	}
	
	
	
	public static void main(String args[]){
		
	Lingkaran Objekling= new Lingkaran(4);			
	Objekling.cetak();
	
	}
	
}
