/*==========================================
   ■■■ 주민등록번호 유효성 검사 ■■■
==========================================*/

/*
○ 주민번호 검증 공식

	① 마지막 자리를 제외한 앞자리 수를 규칙에 맞게 곱한다.

	123456-1234567 (→ 주민번호)
	****** ******
	234567 892345  (→ 각 자리에 곱해질 수)

	② 규칙에 맞게 곱셈 연산을 수행한 결과를 모두 더한다.

	ex) 7 6 0 6 1 5 - 1 8 6 2 1 3 3
	    * * * * * *   * * * * * *
		2 3 4 5 6 7   8 9 2 3 4 5
	----------------------------------
	→ 14 + 15 + 0 + 30 + 6 + 35 + 8 + 72 + 12 + 6 + 4 + 15

	   == 217

	③ 더해진 결과물을 11로 나누어 『나머지』를 구한다.
           19
		------
	 11| 217
	      11
		------
		 107
		  99
		------
		   8 → 나머지

	④ 11에서 나머지를 뺀 결과값을 구한다.

		11 - 8 → 3

	추가~

	④ 를 수행한 결과 11이나 10이 나오게 되었을 경우...
	즉, ③ 의 수행결과 나머지가 0이나 1일 경우...
	해당 값을 10으로 나눈 나머지를 얻어낸다.

	ex) 11 - 1 → 10 → 0 == 주민번호 마지막 숫자 0
			 0 → 11 → 1 == 주민번호 마지막 숫자 1



	⑤ ④ 에서 처리한 연산 결과가 주민번호를 구성하는 마지막 숫자와
	   일치하는지 비교한다.

	   11 - 8 → 3 == 주민번호 마지막 숫자 3 

	※ 마지막 숫자와 같은 경우 유효한 주민번호~!!!

*/

// 실행 예)
// 주민번호 입력(xxxxxx-xxxxxxx) : 750615-1862133
// >> 정확한 주민번호~!!!
// 계속하려면 아무 키나...

// 주민번호 입력(xxxxxxx-xxxxxx) : 750615-1234567
// >> 잘못된 주민번호~!!!
// 계속하려면 아무 키나...

// 주민번호 입력(xxxxxxx-xxxxxx) : 750615-18621		// → 자릿수 부적합
// >> 입력 오류~!!!
// 계속하려면 아무 키나...

// 배열.length → 배열방의 길이(크기, 갯수)

// ※ 문자열.length() → 문자열의 길이 반환
//	  문자열.substring(n,m) → n부터 m-1까지 문자열 추출


//import java.util.Scanner;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;


public class Test101
{
	public static void main(String[] args) throws IOException
	{
		/* 그냥 내가 끄적인거
		int[] a = {1,2,3,4,5,6};
		int[] b = {3,7,8,4,6,4};
		
		int c= a[1]*b[1];
		System.out.print(c);
		*/

		// 테스트
		//String strTemp = "동해물과백두산이 마르고닳도록";
		//System.out.println(strTemp.length());
		//--==>> 15

		// 테스트
		//System.out.println("남산위의 저 소나무".length());
		//--==>> 10

		// 테스트
		//System.out.println("abcdefghijklmnopqrstuvwxyz".substring(3, 5));
		//--==>> de         01234  
		// substring(m, n) → 문자열 인덱스 m번째부터 n-1번째까지 추출
		//					  인덱스는 0부터...

		// 테스트
		//System.out.println("abcdefghijklmnopqrstuvwxyz".substring(3, 24));
		//--==>> defghijklmnopqrstuvwx

		// 테스트
		//System.out.println("abcdefghijklmnopqrstuvwxyz".substring(3, 25));
		//--==>> defghijklmnopqrstuvwxy

		// 테스트
		//System.out.println("abcdefghijklmnopqrstuvwxyz".substring(3, 26));
		//--==>> defghijklmnopqrstuvwxyz
		// 테스트
		//System.out.println("abcdefghijklmnopqrstuvwxyz".substring(3, 27));
		//--==>> 에러 발생(런타임 에러)
		//		 java.lang.StringIndexOutOfBoundsException
		//System.out.println("abcdefghijklmnopqrstuvwxyz".length());
		//--==>> 26

		// 테스트
		//System.out.println("봄이오니졸려죽겠네".substring(4, 9));
		//System.out.println("졸려죽겠네");
		//--==>> 졸려죽겠네
		// 		 졸려죽겠네

		// 테스트
		//System.out.println("졸려도좀참자".substring(3));
		//System.out.println("졸려도좀참자".substring(3, "졸려도좀참자".length()));
		//System.out.println("졸려도좀참자".substring(3,6));
		//System.out.println("좀참자");
		//--==>> 좀참자
		//		 좀참자
		// 		 좀참자
		// 	 	 좀참자

		//--------------------------------------------------------------------------

		/*
		// Scanner 인스턴스 생성
		Scanner sc = new Scanner(System.in);

		// 사용자에게 주민등록번호 입력 안내메세지 출력 및 저장
		System.out.print("주민번호 입력(xxxxxx-xxxxxxx) : ");

		// 구분자로 하이픈(-) 설정
		sc = new Scanner(sc.next()).useDelimiter("\\s*-\\s*");

		String pre = sc.next();		// 앞자리번호를 문자열 pre로 저장
		String post = sc.next();	// 뒷자리번호를 문자열 post로 저장
		
		
		//  잘못된 주민번호번호 입력시 프로그램 종료
		if (pre.length()!=6 || post.length()!=7 )
		{
			System.out.print("입력 오류~!!!");
			return; // main 메소드 종료 -> 프로그램 종료 
		}	
		//             0 1 2 3 4 5 6 7 8 9 10 11 12
		//			   9 3 0 3 0 8 2 1 4 1 0  1  4
		int[] valid = {2,3,4,5,6,7,8,9,2,3,4,5};			// valid.length = 12
	
		int sum = 0;		// 누적합 0 으로 설정

		// 앞자리 수 곱하기
		for (int i=0; i<6; i++)
		{
			sum += Integer.parseInt(pre.substring(i,i+1)) * valid[i];
			// sum += Integer.parseInt("9") * 2
			// sum += 9 * 2
		}
		
		// 테스트
		//System.out.println("앞자리 누적합은 " + sum);
		
		// 뒷자리 수 곱하기
		for (int i=6; i<post.length()-1; i++)
		{
			sum += Integer.parseInt(post.substring(i,i+1)) * valid[i];
			//sum += Integer.parseInt("2")* 8;
		}
		
		// 테스트
		//System.out.println("뒷자리까지 누적합은 " + sum);

		int a = sum%11;
		int b = 11-a;
		
		if (b==0 || b==1)
			a = b%10;

		
		if (a==Integer.parseInt(post.substring(5,6)))
			System.out.println(">> 정확한 주민번호~!!");

		else if (a!=Integer.parseInt(post.substring(5,6)))
			System.out.println(">> 잘못된 주민번호~!!");

		*/

		// [선생님 풀이]

		// BufferedReader 클래스 인스턴스 생성
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		// 입력받은 주민번호
		String str;

		// 주민번호를 대상으로 곱해지는 수 배열 구성		// 123456-1234567
		int[] chk = {2, 3, 4, 5, 6, 7, 0, 8, 9, 2, 3, 4, 5}; 
		//							   - check~!!! (하이픈과 곱해지는 수!)

		// 곱셈 연산 후 누적합
		// int tot = 1;
		int tot = 0;

		// 사용자에게 안내 메세지 출력 및 주민번호 입력받기
		System.out.print("주민번호 입력(xxxxxx-xxxxxxx) : ");
		str = br.readLine();

		if (str.length() != 14)
		{
			System.out.println(">> 입력 오류~!!!");
			return;	// 메소드 종료 → 프로그램 종료
		}

		// 확인(테스트)
		//System.out.println(">> 자릿수가 적합한 상황~!!!");

		// 123456 - 123456 7
		// 234567 0 892345
		for (int i=0 ; i<13 ; i++) // i → 0 1 2 3 4 5 6 7 8 9 10 11 12
		{
			if (i==6)
			{
				continue;			// 뒷부분 무시하고... 계속해라...
			}
			//chk[0] * Integer.parseInt(str.substring(0, 1));
			//chk[i] * Integer.parseInt(주민번호 i번째자리 추출);
			tot += chk[i] * Integer.parseInt(str.substring(i,i+1)); // 뒷부분

			// tot += chk[i] * Integer.parseInt(str.substring(i, i+1));
			// tot += chk[6] * Integer.parseInt(str.substring(6, 7));
			// tot += chk[6] * Integer.parseInt("123456-1234567".substirng(6, 7));
			// tot += chk[6] * Integer.parseInt("-"));
			//				   ----------------------- Error
		}
		// 반복문 감이 안잡힐때 맨처음 넣는 값 써보기

		//-- 여기까지 수행하면 ① 과 ② 를 모두 끝낸 상황이며
		//	 규칙에 맞게 곱셈 연산을 수행한 결과를 모두 더한 값은
		//   변수 tot에 담겨있는 상태가 된다.

		int su = 11 - tot % 11;
		//			  ---------
		//       --------------
		// 테스트(확인)
		//System.out.println(su);
		//--==>>
		/*
		주민번호 입력(xxxxxx-xxxxxxx) : 750615-1862133
		3
		계속하려면 아무 키나 누르십시오 . . .
		*/

		// 최종 결과 출력 이전에 추가 연산 필요~!!!
		// → su 에 대한 연산 결과가 두 자리로 나올 경우
		//	  주민번호 마지막 자릿수와 비교할 수 없는 상황
		su = su % 10;		// su %= 10;

		// su가 1이나 0인 아닌 수(3)으로 나와도 10으로 나눠도 3이니깐 조건문 필요없음
		//-- 여기까지 수행하면 ③ 과 ④ 와 추가 까지 모두 끝낸 상황이며
		//   최종 연산 결과는 변수 su 에 담겨있는 상황이 된다.

		// 최종 결과 출력
		//if (su == Integer.parseInt(주민번호마지막자리하나추출))
		//if (su == Integer.parseInt(str마지막자리하나추출)
		if (su == Integer.parseInt(str.substring(13)))
			System.out.println(">> 정확한 주민번호~!!!");
		else
			System.out.println(">> 잘못된 주민번호~!!!");

	}
}


/*
주민번호 입력(xxxxxx-xxxxxxx) : 930308-2141014
>> 정확한 주민번호~!!
계속하려면 아무 키나 누르십시오 . . .

주민번호 입력(xxxxxx-xxxxxxx) : 123456-1111111
>> 잘못된 주민번호~!!
계속하려면 아무 키나 누르십시오 . . .
*/