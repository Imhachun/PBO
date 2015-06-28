package chun;

public class Laporan1 {
	
static String cun= "Welcome Laporan 1 \n";			//deklarasi variabel class
	
public static void main(String[] args) {			//method utama
        
	System.out.println(cun);				//mencetak teks lalu enter
       
        biodata();						//memanggil method biodata
        aritmatika();						//memanggil method Aritmatika

    }
	
	public static void aritmatika()				//method aritmatika
	{
	
		int a=3,b=4,c=1;				//membuat variabel local untuk menampung data
	        double d=0;
	       
	        System.out.println("\n=== Operasi Aritmatika ===\n");
	       	
	       	//melakukan operasi aritmatika
	        c=a+b;								//menambahkan a dengan b
	        System.out.println("Hasil dari "+a+"+"+b+"="+c);
	        
	        c=a-b;								//mengurangkan b dari a
	        System.out.println("Hasil dari "+a+"-"+b+"="+c);
	        
	        c=a*b;								//mengalikan a dengan b
	        System.out.println("Hasil dari "+a+"*"+b+"="+c);
	        
	        d=(double)a/b;							//membagi a dengan b
	        System.out.println("Hasil dari "+a+"/"+b+"="+d);
	        
	        c=a%b;								//menghitung sisa dari pembagian a dan b
	        System.out.println("Hasil dari "+a+"mod"+b+"="+c);
	        
	}
	
	public static void biodata()						//method biodata
	{
		String name ="Rasimah";						//deklarasi variabel lokal
		String nim ="60200112028";
		System.out.println("Nama "+name+ "\nNim  "+nim);		//mencetak nama dan nim
	}

}

