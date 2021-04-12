/*=======================================
 ■■■ 실행 흐름의 컨트롤(제어문) ■■■
 - if문 실습
=======================================*/

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Test032
{
	public static void main(String[] args) throws IOException
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int n;

		System.out.print("임의의 정수 입력 : ");
		n = Integer.parseInt(br.readLine());

		/*  (Ⅹ)
		if (n%2==0)
		{
			System.out.println(n + " → 짝수");
		}
		else if (n==0)
		{
			System.out.println(n + "→ 영");
		}
		else
		{
			System.out.println(n + "→ 홀수");
		}
		*/

		/*	(Ⅹ)
		if (n%2!=0)
		{
			System.out.println(n + " → 홀수");
		}
		else if (n%2==0)
		{
			System.out.println(n + "→ 짝수");
		}
		else
		{
			System.out.println(n + "→ 영");
		}
		*/

		// (○)

		/*
		if (n==0)
		{
			System.out.println(n + " → 영");
		}
		else if (n%2==0)
		{
			System.out.println(n + "→ 짝수");
		}

		else if (n%2!=0)
		{
			System.out.println(n + "→ 홀수");
		}
		else
		{
			System.out.println(n + "→ 판정이 불가능한 상황");
		}
		*/

		/*
		System.out.print("아이스크림 종류 선택(1.딸기, 2.포도) : ");
		n = Integer.parseInt(br.radeLine());

		if (n==1)
		{
			System.out.println("딸기 아이스크림을 선택하셨습니다~!!");
		}
		else
		{
			System.out.println("포도 아이스크림을 선택하셨습니다~!!")
		}
		*/

		/*

		System.out.print("아이스크림 종류 선택(1.딸기, 2.포도) : ");
		n = Integer.parseInt(br.readLine());

		if (n==1)
		{
			System.out.println("딸기 아이스크림을 선택하셨습니다~!!");
		}
		else if (n==2)
		{
			System.out.println("포도 아이스크림을 선택하셨습니다~!!");
		}
		else 
		{
			System.out.println("딸기, 포도 이외의 선택불가~!!");
			System.out.println("판정 불가~!!!!");
		}

		*/

	}
}