/*=============================================
     ¡á¡á¡á ÀÚ¹ÙÀÇ ÁÖ¿ä(Áß¿ä) Å¬·¡½º ¡á¡á¡á
	 - Wrapper Å¬·¡½º
=============================================*/

// check~!! 
// Å¬·¡½º À§Ä¡
// ¸Å°³º¯¼ö ¹®ÀÚ¿­ 
import java.math.BigInteger;

public class Test127
{
	public static void main(String[] args)
	{
		//int a1 = 123456789123456789;

		//long b1 = 123456789123456789L;
		//long c1 = 123456789123456789123456789L;
		
		BigInteger a = new BigInteger("123456789123456789");
		BigInteger b = new BigInteger("123456789123456789");

		//System.out.println(a + b);
		//BigInteger c = a + b; 
		//System.out.println(c);

		// ¡Ø ÀÏ¹ÝÀûÀÎ »ê¼ú¿¬»êÀÚ¸¦ ÅëÇÑ ¿¬»ê ºÒ°¡´É

		// ´õÇÏ±â

		BigInteger c = a.add(b);
		System.out.println("µ¡¼À °á°ú : " + c);
		//-->> µ¡¼À °á°ú : 246913578246913578

		// »©±â

		BigInteger d = a.subtract(b);
		System.out.println("»¬¼À °á°ú : " + d);
		//--==>> »¬¼À °á°ú : 0

		// °öÇÏ±â
		BigInteger e = a.multiply(b);
		System.out.println("°ö¼À °á°ú : " + e);
		//--==>> °ö¼À °á°ú : 15241578780673678515622620750190521

		// ³ª´©±â
		BigInteger f = a.divide(b);
		System.out.println("³ª´°¼À °á°ú : " + f);
		//--==>> ³ª´°¼À °á°ú : 1

		//Áö¼ö½Â
		BigInteger g = new BigInteger("2");
		System.out.println("2ÀÇ 3½Â : " + g.pow(3));
		//--==>> 2ÀÇ 3½Â : 8


	}
}