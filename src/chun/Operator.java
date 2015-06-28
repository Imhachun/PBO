package chun;

public class Operator {
	
	
	public static void main(String[] args)
	{
		byte angka = 5;
		byte angka2 = -5;
		byte a = 3;
		byte b = 2;										/* perhitungan dimulai sesuai dengan nilai presedennya  */
		int hasil1 = angka++ >> 4 + 5 * 4 | 5 << angka2;     /*  ++ --> * --> + --> <<>> --> |  */
		int hasil2 = a + b << b | 3 >> angka;				/* * --> >> << --> |  */

		System.out.println(hasil1); /*  6 >> 24 | 5 << -5   -->   0 | 671088640 ---> = 671088640 */ 
		System.out.println(hasil2); /*  5 << 2 | 3 >> 5  --> 20 | 0 = 20 */
		
	}


}
