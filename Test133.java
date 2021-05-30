/*=============================================
     ■■■ 자바의 주요(중요) 클래스 ■■■
	 - StringBuffer 클래스
=============================================*/

/*
○ StringBuffer 클래스는
   문자열을 처리하는 클래스로 String 클래스와의 차이점은
   String 클래스는 내부 문자열 데이터의 수정이 불가능하지만
   StringBuffer 클래스는 문자열을 사용할 때
   내부 문자열을 실행 단계에서 변경할 수 있다는 점이다.

   즉, StringBuffer 객체는 가변적인 길이를 가지므로
   객체를 생성하는 시점에서 미리 그 크기나 값을 지정하거나
   실행 시점에서 버퍼 크기를 바꿀수 있는 기능을 제공하는 것이다.

   또한 JDK 1.5 이후부터는
   문자열을 처리하는 StringBuilder 라는 클래스도 제공한다.
   StringBuilder 클래스의 기능은 StringBuilder 클래스와 동일하지만
   가장 큰 차이점은 multi-thread unsafe 라는 점이다.
   즉, Syncronization 이 없기 때문에
   StringBuffer 보다 빠르며 동시성(동기화) 문제가 없다면
   StringBuilder 를 사용하는 것이 성능을 향상시킬 수 있다.
*/


// import 안함 → java.lang. 패키지구나~~

public class Test133
{
	public static void main(String[] args)
	{
		StringBuffer sb1 = new StringBuffer("korea");
		StringBuffer sb2 = new StringBuffer("korea");

		System.out.println(sb1 == sb2);
		//--==>> false (주소값이 다름)
		System.out.println(sb1.equals(sb2));
		//--==>> false → equals메소드는 오버라이딩안해서 Object에서 정의한대로 주소값을 비교 그래서 false

		//sb1.toString();
		//============== string타입
		
		System.out.println(sb1.toString().equals(sb2.toString()));
		//System.out.println("korea".equals("korea"));
		//--==>> true

		//System.out.println(sb1.toString());
		//--==>> korea
		// → toString메소드는 StringBuffer 클래스에서 Object 클래스에서 물려받은 Overriding 했음을 알 수 있다.

		/*
		아래 구문과 같다.
		String str1 = sb1.toString();
		String str2 = sb2.toString();

		System.out.println(str1.equals(str2));
		*/

		StringBuffer sb3 = new StringBuffer();
		//-- StiringBuffer 기본 생성자 호출시(인스턴스 생성 과정)
		//   기본적으로 생성되는 버퍼 크기 『16』
		
		System.out.println("버퍼 크기 : " + sb3.capacity());
		//--==>> 버퍼 크기 : 16

		///////////////////////////////////////////////////////////////////////////////////////////////////////////////////
		
		System.out.println(sb3);
		//--==>> 無
		
		//sb3 = "seoul"; (Ⅹ)
		sb3.append("seoul");	// String클래스 입장에서는 sb3 += "seoul"; → sb3 = sb3 + "seoul";
		sb3.append("korea");
		sb3.append("우리나라");
		sb3.append("대한민국");

		System.out.println(sb3);
		//--==>> seoulkorea우리나라대한민국

		System.out.println(sb3.toString());
		//--==>> seoulkorea우리나라대한민국
		
		System.out.println("버퍼 크기 : " + sb3.capacity());
		//--==>> 버퍼 크기 : 34
		// 담겨진 문자열이 늘어나면 동적으로 알아서 버퍼 크기를 늘려줌을 확인가능

		///////////////////////////////////////////////////////////////////////////////////////////////////////////////////

		String temp1 = "java and oracle";
		System.out.println(temp1.toUpperCase());
		//--==>> JAVA AND ORACLE

		String temp2 = "JAVA AND ORCLE";
		System.out.println(temp2.toLowerCase());
		//--==>> java and orcle

		//System.out.println(sb3.toUpperCase());
		//System.out.println(sb3.LowerCase());
		//--> toUpperCase() 와 toLowerCase() 는 String클래스에서 정의된 메소드

		String temp3 = sb3.toString(); 
		System.out.println(temp3.toUpperCase());
		System.out.println(temp3.toLowerCase());
		//--==>> SEOULKOREA우리나라대한민국
		//       seoulkorea우리나라대한민국
		System.out.println(sb3.toString().toUpperCase());
		//--==>> SEOULKOREA우리나라대한민국

		// seoulKorea우리나라대한민국
		// ○ 대상 문자열(sb3) 중 seoul 문자열 ^앞^에
		//    『한국』이라는 문자열 추가
		sb3.insert(0,"한국");
		// sb3 자체가 바뀜
		System.out.println("seoul 앞에 『한국』 추가 : " + sb3.toString());
		//--==>> seoul 앞에 『한국』 추가 : 한국seoulkorea우리나라대한민국

		// 한국seoulkorea우리나라대한민국


		// 『insert() 메소드』 : 문자열 추가
		
		// ○ 대상 문자열(sb3) 중 seoul 문자열 뒤에
		//    『사랑』이라는 문자열 추가
		//     단, 대상 문자열의 인덱스를 직접 확인하지 말고...

		/* [나의 풀이]
		// 테스트
		//System.out.println(sb3.indexOf("seoul"));
		//--==>> 2

		System.out.println(sb3.insert(sb3.indexOf("seoul")+"seoul".length(), "사랑"));
		*/

		// step 1 
		System.out.println(sb3.toString());
		//--==>> 한국seoulkorea우리나라대한민국

		// step 2
		//sb3.insert(7, "사랑");
		
		// step 3
		//System.out.println(sb3.indexOf("seoul"));
		//--==>> 2
		
		// step 4
		//sb3.insert(sb3.indexOf("seoul"), "사랑");
		//System.out.println(sb3.toString());
		//--==>> 한국사랑seoulkorea우리나라대한민국

		// step 5
		//sb3.insert(sb3.indexOf("seoul")+5, "사랑");
		//System.out.println(sb3.toString());
		//--==>> 한국seoul사랑korea우리나라대한민국

		// step 6

		//sb3.insert(sb3.indexOf("seoul")+("seoul"의 길이"), "사랑");
		//System.out.println(sb3.toString());

		// step 7
		sb3.insert(sb3.indexOf("seoul")+"seoul".length(), "사랑");
		System.out.println(sb3.toString());
		//--==>> 한국seoul사랑korea우리나라대한민국

		// 『delete() 메소드』 : 문자열 삭제
		
		// ○ 『우리나라』 문자열 삭제
		//sb3.delete(14, 18);
		//System.out.println(sb3.toString());
		//--==>> 한국seoul사랑korea대한민국

		
		//System.out.println(sb3.indexOf("우리나라"));
		//--==>> 14
		System.out.println(sb3.delete(sb3.indexOf("우리나라"),sb3.indexOf("우리나라")+"우리나라".length()));
		//--==>> 한국seoul사랑korea대한민국

		// ○ 대상 문자열(sb3)에서
		//    『korea』부터 문자열 삭제(korea 포함)
		//sb3.delete(sb3의 "korea"문자열 시작위치, sb3의 문자열길이)
		//System.out.println(sb3.delete(sb3.indexOf("korea"),sb3.toString().length()));
		sb3.delete(sb3.indexOf("korea"),sb3.length());
		System.out.println(sb3.toString());
		//--==>> 한국seoul사랑

		// ○ 대상 문자열(sb3)에서
		//    『seoul』 이후 문자열 삭제 (seoul 제외)
		sb3.delete(sb3.indexOf("seoul")+"seoul".length(), sb3.length());
		System.out.println(sb3.toString());
		//--==>> 한국seoul

		System.out.println("버퍼 크기 : " + sb3.capacity());
		//--==>> 버퍼 크기 : 34
		// capacity는 자동으로 줄어들지 않는다.
		
		// 문자열(sb3)는 길이 확인
		System.out.println("문자열의 길이 : " + sb3.length());
		//--==>> 문자열의 길이 : 7

		// 버퍼 크기 조절 → 현재 문자열을 담아둘 수 있는 버퍼 크기로...
		sb3.trimToSize();

		System.out.println("버퍼 크기 : " + sb3.capacity());
		//--==>> 버퍼 크기 : 7

	}
}