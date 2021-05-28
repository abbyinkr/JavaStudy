/*=============================================
     ���� �ڹ��� �ֿ�(�߿�) Ŭ���� ����
	 - Wrapper Ŭ����
=============================================*/

public class Test130
{
	public static void main(String[] args)
	{
		System.out.println(Integer.MAX_VALUE);
		System.out.println(Integer.MIN_VALUE);
		//--==>> 2147483647
		//       -2147483648

		System.out.println(Long.MAX_VALUE);
		System.out.println(Long.MIN_VALUE);
		//--==>> 9223372036854775807
		//       -9223372036854775808

		System.out.println(Double.MAX_VALUE);
		System.out.println(Double.MIN_VALUE);
		//--==>> 1.7976931348623157E308
		//       4.9E-324
		// �� e ǥ��� (IEEE 754)

		System.out.println();

		//System.out.println("1 : " + 3/0);
		//--==>> ���� �߻� (��Ÿ�� ���� ArithmeticException)

		System.out.println("2 : " + 3.0/0);
		//--==>> 2 : Infinity

		System.out.println("3 : " + -3.0/0);
		//--==>> 3 : -Infinity

		System.out.println("4 : " + (3.0/0 == 3.0/0));
		//--==>> 4 : true		// ���Ѵ볢�� '=='�� ũ�� �񱳰� �����ϴ�!!

		System.out.println("5 : " + (3.0/0 == -3.0/0));
		//--==>> 5 : false
	
		// ��Double.isInfinite()�� is�� �����ϴ� �޼ҵ�� �Ǻ��޼ҵ�� t/f �� ��ȯ
		// Ŭ���� �޼ҵ� ���� �� �� �ִ�!
		System.out.println("6 : " + Double.isInfinite(3.0/0));
		//--==>> 6 : true
		
		System.out.println("7 : " + Double.isInfinite(-3.0/0));
		//--==>> 7 : true
		

		System.out.println("8 : " + (3.0/0 + -3.0/0));
		//--==>> 8 : NaN (Not a Number)
		System.out.println("9 : " + 0.0/0);
		//--==>> 9 : NaN 

		System.out.println("10 : " + (0.0/0 == 0.0/0));
		//--==>> 10 : false
		System.out.println("11 : " + (0.0/0 != 0.0/0));
		//--==>> 11 : true

		// �� NaN(Not a Number) ���� ������ ���� 
		//    ��==�� �����ڸ� ���� �� ������ �����ϰ� �Ǹ�
		//    ����� ������ ��false���� ��ȯ�Ѵ�.

		System.out.println("12 : " + Double.isNaN(0.0/0));
		//--==>> 12 : true

		System.out.println("13 : " + -0.0/0);
		//--==>> 13 : NaN

	}
}