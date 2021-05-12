/*=======================================
 ���� ���� �帧�� ��Ʈ��(���) ����
 - switch�� �ǽ�
=======================================*/

// ����ڷκ��� ������ �� ������ �����ڸ� �Է¹޾�
// �ش� ������ ó�� ����� ����ϴ� ���α׷��� �����Ѵ�.
// ��, switch���� Ȱ���Ͽ� ó���� �� �ֵ��� �ϸ�,
// ���� ����� ���ǻ� ���� ���·� ó���Ѵ�.

// ���� ��)
// ù ��° ���� �Է�	: 10
// �� ��° ���� �Է�	: 31
// ������ �Է�(+ - * /) : +

// >> 10 + 31 = 41
// ����Ϸ��� �ƹ� Ű�� ��������...

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Test042
{
	public static void main(String[] args) throws IOException
	{		
		
		/*
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int a, b, op;

		System.out.print("ù ��° ���� �Է�  :  ");
		a = Integer.parseInt(br.readLine());
		
		System.out.print("�� ��° ���� �Է�  :  ");
		b = Integer.parseInt(br.readLine());

		System.out.print("������ �Է�(+ - * /)		: ");
		op = System.in.read();

		System.in.skip(2);

		//������ �ƽ�Ű�ڵ� ��� �׽�Ʈ 
		System.out.println("op : " + op);
		// + �� 47, - �� 45, * �� 42, / �� 47
	

	
		switch (op)
		{
		case 42:
			System.out.printf(" >> %d * %d = %d\n", a, b, (a*b));
			break;

		case 43:
			System.out.printf(" >> %d + %d = %d\n", a, b, (a+b));
			break;

		case 45:
			System.out.printf(" >> %d - %d = %d\n", a, b, (a-b));
			break;

		case 47:
			System.out.printf(" >> %d / %d = %d\n", a, b, (a/b));
			break;
		
		*/
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int a, b, result;
		char op;

		System.out.print("ù ��° ���� �Է�		:   ");
		a = Integer.parseInt(br.readLine());
		System.out.print("�� ��° ���� �Է�		:   ");
		b = Integer.parseInt(br.readLine());
		System.out.print("������ �Է�(+ - * /)	  : ");
		op = (char)System.in.read();

		
		switch (op)
		{
			case '+': result=a+b; break;
			case '-': result=a-b; break;
			case '*': result=a*b; break;
			case '/': result=a/b; break;
			default : return;	//--�޼ҵ� ���� �� main() �޼ҵ� ���� �� ���α׷� ����
		}

		// �� ��return�� : 1. ���� ��ȯ
		//				   2. �޼ҵ��� ����

		System.out.println();
		System.out.printf(">> %d %c %d = %d\n", a, op, b, result);
		
	}
}