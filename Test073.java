/*============================================
   ���� Ŭ������ �ν��Ͻ� ����
   - Ŭ���� ���� ���� �� Ŭ���� ���� �ǽ�
============================================*/

// ����ڷκ��� ������ �� ������ �����ڸ� �Է¹޾�
// ��Ģ ������ �����ϴ� ���α׷��� �����Ѵ�.
// ��, Ŭ������ �ν��Ͻ��� ������ �����Ͽ� �ۼ��� �� �ֵ��� �Ѵ�.

// ���� ��)
// ������ �� ���� �Է�(���� ����) : 30 15
// ������ ������ �Է�(+ - * /)    : +
// >> 30 + 15 = 45
// ����Ϸ��� �ƹ� Ű��...


import java.util.Scanner;
import java.io.IOException; // <- System.in.read() ���

class Calculate
{

	/*
	// �� �ֿ� �Ӽ� ����
	int su1, su2;
	char op;

	void input() throws IOException			// �Է� �޼ҵ�
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("������ �� ���� �Է�(���� ����) : ");
		su1 = sc.nextInt();
		su2 = sc.nextInt();
		System.out.print("������ ������ �Է�(+ - * /)    : ");
		op = (char)System.in.read();
	}

	int operate()		// ���� �޼ҵ� 
	{
		int result=0;

		if (op=='+')
		{
			result = su1 + su2;
		}
		else if (op=='-')
		{
			result = su1 - su2;
		}
		else if (op=='*')
		{
			result = su1 * su2;
		}
		else if (op=='/')
		{
			result = su1 / su2;
		}

		return result;
	}

	void print(int r)			// ��� �޼ҵ�
	{
		System.out.printf(">> %d %c %d = %d\n", su1, op, su2, r);
	}
	*/
	
	// �� �ֿ� �Ӽ� ����
	int su1, su2;
	char op;

	// �� �Է� �޼ҵ� ����
	void input() throws IOException // <- System.in.read() ���
	{
		Scanner sc = new Scanner(System.in);

		System.out.print("������ �� ���� �Է�(���� ����) : ");
		su1 = sc.nextInt();
		su2 = sc.nextInt();

		System.out.print("������ ������ �Է�(+ - * /)    : ");
		op = (char)System.in.read();
	}

	// �� ���� �޼ҵ� ����
	int cal()
	{
		int result = 0;

		switch (op)								// if�� ��� switch������ �� �� ����! check!
		{
		case '+': result=su1+su2; break;
		case '-': result=su1-su2; break;
		case '*': result=su1*su2; break;
		case '/': result=su1/su2; break;
		}
		return result;
	}
	// �� ��� �޼ҵ� ����

	void print(int r)
	{
		System.out.printf(">> %d %c %d = %d\n", su1, op, su2, r);
	}

}//end class Calculate


public class Test073
{
	public static void main(String[] args) throws IOException
	{
		/*
		// �ν��Ͻ� ����
		Calculate cal = new Calculate();

		cal.input();
		int sum = cal.operate();		// int result = cal.operate() �� �� (��������)
		cal.print(sum);					// cal.print(result)
		*/

		// Caculate Ŭ���� ����� �ν��Ͻ� ����
		Calculate ob = new Calculate();

		// ������ �ν��Ͻ��� ���� �Է� �޼ҵ� ȣ��
		ob.input();

		// ������ �ν��Ͻ��� ���� ���� �޼ҵ� ȣ��
		int result = ob.cal();

		// ������ �ν��Ͻ��� ���� ��� �޼ҵ� ȣ��
		ob.print(result);
	}
}

/* [���� ���}
������ �� ���� �Է�(���� ����) : 10 25
������ ������ �Է�(+ - * /)    : +
>> 10 + 25 = 35
����Ϸ��� �ƹ� Ű�� �����ʽÿ� . . .

������ �� ���� �Է�(���� ����) : 2
5
������ ������ �Է�(+ - * /)    : +
>> 2 + 5 = 7
����Ϸ��� �ƹ� Ű�� �����ʽÿ� . . .

*/