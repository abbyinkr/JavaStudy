/*=============================================
     ■■■ 자바의 주요(중요) 클래스 ■■■
	 - StringBuffer 클래스
=============================================*/

public class Test134
{
	public static void main(String[] args)
	{
		
		String s1 = "123456789";
		s1 = (s1 + "123").replace('2','A');
		// 123456789
		// 123456789123
		// 1A34567891A3
		System.out.println(s1);
		//--==>> 1A34567891A3


		StringBuffer s2 = new StringBuffer("123456789");
		s2.delete(0,3).replace(1, 3, "24").delete(4, 6);
		/* [나의 풀이]-- 틀림 ㅠ  delete(n, m) → n ~ (m-1)번 인덱스까지 삭제
		//123456789
		//    56789
		//     5678
		*/

		//123456789
		// 456789
		// 424789 (replace 1,3 -> 1~(3-1)번째 인덱스를 "24"로 replace)
		// 4247

		System.out.println(s2);
		//--==>> 4247

		StringBuffer s3 = new StringBuffer("123456789");
		String s4 = s3.substring(3, 6);
		// 123456789
		// 123456789.substring(3, 6);
		// 456
	

		System.out.println(s4);
		//--==>> 456

		StringBuffer s5 = new StringBuffer("123456789");
		s5.delete(0, 3).delete(1, 3).delete(2, 5).insert(1, "24");
		/* 내 풀이
		//123456789
		// 456789
		// 4789
		// 47
		// 4247
		*/

		//123456789
		// 456789
		// 4789
		// 47
		// 4247
		System.out.println(s5);
		//--==>> 4247

		// StringBuffer는 String과 달리 java.lang.StringIndexOutOfBoundsException 에러안남 확인

		StringBuffer s6 = new StringBuffer("123456789");
		s6.delete(3, 20);
		System.out.println(s6);
		//--==>> 123

	}
}
