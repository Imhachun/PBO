package chun;

public class Laporan2 {
	
	static boolean bool;
	static byte by;
	static double d ;
	static String \u0073\u0074\u0072 = "Nilai Default dan unicode";
	
	public static void main(String[] args)
	{
		if (str == null) {		
			System.out.println("nilai default boolean " + bool);	
			System.out.println("nilai default Byte " + by);
			System.out.println("nilai default Double " + d);
			System.out.println(str);
			
		}
		else {
			System.out.println(str);
			
			Boolean refBoolean = new Boolean(true);
			boolean bool = refBoolean.booleanValue();		
			System.out.println("bool " + bool);
			
			Byte refByte = new Byte((byte) 123);
			byte b = refByte.byteValue();		
			System.out.println("Byte " + b);
			
			Double refDouble = new Double(12.3D);
			double d = refDouble.doubleValue();
			System.out.println("Double " + d);
			
			
		}		
	}

}
