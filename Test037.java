/*=======================================
 ���� ���� �帧�� ��Ʈ��(���) ����
 - if ~ else�� �ǽ�
=======================================*/

// ����ڷκ��� ������ ������ �� �� �Է¹޾�
// ���� �� ���� ū �� ������ ����ϴ� ���α׷��� �����Ѵ�.
// ��, �Է� �����͸� �� ���� ó���� �� �ֵ��� �����ϸ� (Scanner ���)
// ��xor�������ڸ� Ȱ���Ͽ� ���� ó�� �Ҽ� �ֵ��� �Ѵ�.

// ���� ��)
// ������ �� ���� �Է�(���� ����) : 54 23 31

// >> ���� ��� : 23 31 54
// ����Ϸ��� �ƹ� Ű��...


import java.util.Scanner;

public class Test037
{
	public static void main(String[] args)
	{ 
		/* ���� Ǯ���� ���� 
		// Scanner �ν��Ͻ� ����
		Scanner sc = new Scanner(System.in);

		int a, b, c;
		System.out.print("������ �� ���� �Է�(���� ����) : ");
		a = sc.nextInt();
		b = sc.nextInt();
		c = sc.nextInt();

		if (a>b)
		{
			a = a^b;
			b = b^a;
			a = a^b;
		}
		if (b>c)
		{
			b = b^c;
			c = c^b;
			b = b^c;
		}
		if (a>b)
		{
			a = a^b;
			b = b^a;
			a = a^b;
		}
		System.out.printf("\n >> ���� ��� : %d %d %d\n",a,b,c);

		*/

		// ���� Ǯ���� ����

		Scanner sc = new Scanner(System.in);

		int a, b, c;

		System.out.print("������ �� ���� �Է�(���� ����) : ");
		a = sc.nextInt();
		b = sc.nextInt();
		c = sc.nextInt();

		if(a>b)
		{
			a=a^b; b=b^a; a=a^b;
		}
		if(b>c)
		{
			b=b^c; c=c^b; b=b^c;
		}
		if(a>b)
		{
			a=a^b; b=b^a; a=a^b;
		}

		System.out.printf("\n >> ���� ��� : %d %d %d\n",a,b,c);
	}
}


/* [���� ���] 
������ �� ���� �Է�(���� ����) : 25 13 27

 >> ���� ��� : 13 25 27
����Ϸ��� �ƹ� Ű�� �����ʽÿ� . . .
*/