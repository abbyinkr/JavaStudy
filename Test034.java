/*=======================================
 ���� ���� �帧�� ��Ʈ��(���) ����
 - if ~ else�� �ǽ�
=======================================*/

// ����ڷκ��� ������ �� ������ �����ڸ� �Է¹޾�
// �ش� �����ڿ� �ش��ϴ� ������ ó�� ����� ����ϴ� ���α׷��� �����Ѵ�.
// ��, ���ǹ��� Ȱ���Ͽ� ó���� �� �ֵ��� �ϸ�,
// ������ ����� ���ǻ� ���� ���·� ó���� �� �ֵ��� �Ѵ�.

// ���� ��)
// ù ��° ���� �Է�	: 10
// �� ��° ���� �Է�	: 24
// ������ �Է�(+ - * /) : +

// >> 10 + 24 = 34
// ����Ϸ��� �ƹ� Ű��...

//-------------------------------

// ù ��° ���� �Է�	: 5
// �� ��° ���� �Է�	: 3
// ������ �Է�(+ - * /) : /

// >> 5 / 3 = 1
// ����Ϸ��� �ƹ� Ű��...

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Test034
{
	public static void main(String[] args) throws IOException
	{

		// Ǯ�̹�� ��
		/*
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int a, b;
		char op;
		System.out.print("ù ��° ���� �Է�  : ");
		a = Integer.parseInt(br.readLine());

		System.out.print("�� ��° ���� �Է�  : ");
		b = Integer.parseInt(br.readLine());

		System.out.print("������ �Է�(+ - * /) : ");
		// op = br.readLine(); (x)
		op = (char)System.in.read(); // check!!!!!!!!!!!!!

		if (op == '+')
		{
			System.out.printf("\n>> %d + %d = %d\n", a, b, (a+b));
		}
		else if (op == '-')
		{
			System.out.printf("\n>> %d - %d = %d\n", a, b, (a-b));
		}
		else if (op == '*')
		{
			System.out.printf("\n>> %d * %d = %d\n", a, b, (a*b));
		}
		else if (op == '/')
		{
			System.out.printf("\n>> %d / %d = %d\n", a, b, (a/b));
		}
		else 
		{
			System.out.println("�Է� ������ ������ �����մϴ�");
		}
		*/

		//  Ǯ�̹�� ��
		
		/*
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int a, b, op;

		System.out.print("ù ��° ���� �Է�	  : ");
		a = Integer.parseInt(br.readLine());
		
		System.out.print("�� ��° ���� �Է�	  : ");
		b = Integer.parseInt(br.readLine());

		System.out.print("������ �Է�(+ - * /)      : ");
		// op = Integer.parseInt(br.readLine()); �� Integer.parseInt("+") �� (X)
		op = System.in.read();

		//"1234" �� Integer.parseInt("1234") �� 1234
		//"ABCD" �� Integer.parseInt("ABCD") �� (X)

		// �׽�Ʈ(Ȯ��)
		// System.out.println("op : " + op);
		//--��+�� �� 43
		//--��-�� �� 45
		//--��*�� �� 42
		//--��/�� �� 47

		
		if (op == 43)
		{
			System.out.printf("\n>> %d + %d = %d\n", a, b, (a+b)); 
		}
		else if (op == 45)
		{
			System.out.printf("\n>> %d - %d = %d\n", a, b, (a-b)); 
		}
		else if (op == 42)
		{
			System.out.printf("\n>> %d * %d = %d\n", a, b, (a*b)); 
		}
		else if (op == 47)
		{
			System.out.printf("\n>> %d / %d = %d\n", a, b, (a/b)); 
		}
		else
			System.out.println("�Է� ������ ������ �����մϴ�");
		*/

		//  Ǯ�̹�� ��

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int a, b, result=0;
		char op;

		System.out.print("ù ��° ���� �Է�	:	");
		a = Integer.parseInt(br.readLine());

		System.out.print("�� ��° ���� �Է�	:	");
		b = Integer.parseInt(br.readLine());

		System.out.print("������ �Է�(+ - * /)	:	");
		op = (char)System.in.read();

		if (op == '+')
			result = a + b;
		else if (op == '-')
			result = a - b;
		else if (op == '*')
			result = a * b;
		else if (op == '/')
			result = a / b;

		System.out.printf("\n>> %d %c %d = %d\n", a, op, b, result); 

	}
}

/* [���� ���]

ù ��° ���� �Է�       :       25
�� ��° ���� �Է�       :       30
������ �Է�(+ - * /)    :       /

>> 25 / 30 = 0
����Ϸ��� �ƹ� Ű�� �����ʽÿ� . . .
*/