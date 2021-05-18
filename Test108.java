/*==================================
     ���� Ŭ���� ��� ����
	 - ���(Inheritance)
==================================*/

// �� �ǽ� ����
//	  ������ ���� ���α׷��� �����Ѵ�.
//	  ��, ����� ������ �����Ͽ� �ۼ��� �� �ֵ��� �Ѵ�.

// ���� ��)
// ������ �� ���� �Է�(���� ����) : 20 15 
// ������ �Է�(+ - * /) : -
// >> 20 - 15 = 5
// ����Ϸ��� �ƹ� Ű��...

//import java.util.Scanner;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

// �θ�Ŭ����
class AClass
{
	protected int x, y;
	protected char op;

	// default ������
	AClass()
	{
		
	}

	void write(double result)
	{
		System.out.printf(">> %d %c %d = %.2f\n", x , op, y, result);
	}
}

// �ڽ�Ŭ����
class BClass extends AClass
{
	// ��ӹޱ�
	/*
	protected int x, y;
	protected char op;

	void write(double result)
	{
		System.out.printf(">> %d %c %d = %.2f\n", x , op, y, result);
	}
	*/

	// [���� Ǯ��]
	/*void input() throws IOException
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("������ �� ���� �Է�(���� ����) : ");
		x = sc.nextInt();
		y = sc.nextInt();
		System.out.print("������ �Է�(+ - * /) : ");
		op = (char)System.in.read();
	}
	
	double calc()
	{	
		double result=0.0;
		switch (op)
		{
			case '+' : result = x + y; break;
			case '-': result = x - y; break;
			case '*': result = x * y; break;
			case '/': result = (double)x / y; break;
		}

		return result;
	}
	*/

	// [������ Ǯ��] -- ���ο� ���ٹ�!!!!

	boolean input() throws IOException
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		System.out.print("������ �� ���� �Է�(���� ����) : ");					// 20 15
		String temp = br.readLine();											// "20 15"
		String[] str = temp.split("\\s");										// ������ �� ���� ex) \\s*\\s (������ *)
		// �� ���ڿ�.split("������");
		//	  ex) "��� ���� �ٳ��� ���� ����".spilt();
		//	  ��ȯ �� �迭 �� {"���", "����", "�ٳ���", "����", "����"}
		//	  ex) "1 23 456 7".split(����);
		//    ��ȯ �� �迭 �� {"1", "23", "456", "7"}

		//--==>> String[] str = {"20", "15"};

		if (str.length != 2)
			return false;	// ���� ��ȯ �� false �׸��� ... �޼ҵ� ����~!!! (���θ޼ҵ尡 �ƴϴϱ� ���α׷� ����� �ȵ�)
		//  ======			   false(����)�� ��ȯ�ϸ� �޼ҵ� ����
		// 1. ���� ��ȯ 2. �޼ҵ����� 
		// ^���ÿ�^ �ϴ°Ű�, return �ڿ� ��ȯ�� ���� ������ �޼ҵ� ���Ḹ�� �ǹ��Ѵ�!!

		// �� �� ���ǹ��� ������ ��� �Ʒ��� �ڵ尡 �����ִ� ��Ȳ�̴���
		//	  �� �̻� �������� �ʰ� ������� ��ȯ�ϸ� �޼ҵ�� ����ȴ�.
		
		x = Integer.parseInt(str[0]);
		y = Integer.parseInt(str[1]);

		System.out.print("������ �Է�(+ - * /) : ");
		op = (char)System.in.read();
		
		if (op!='+' && op!='-' && op!='*' && op!='/')	// check~!! �� �����̴ϱ� �������� && ���
			return false;

		return true;
		
		/*
		if (op =='+' || op=='-' ||  op=='*' || op=='/')
			return true;
		return false;
		*/

	}//end input()

	double calc()
	{
		double result = 0;
		
		switch (op)
		{
			case '+': result = x + y; break;
			case '-': result = x - y; break;
			case '*': result = x * y; break;
			case '/': result = (double)x / y; break;
		}
		return result;
	
	}//end calc()
}

// main()�޼ҵ带 �����ϰ� �ִ� �ܺ��� �ٸ� Ŭ����
public class Test108
{
	public static void main(String[] args) throws IOException
	{
		/*
		BClass ob = new BClass();
		ob.input();
		double result = ob.calc();
		ob.write(result);
		*/

		// [������ Ǯ��]

		BClass ob = new BClass();
		
		
		if (!ob.input()) // �� (!false)== true
		{
			System.out.println("Error...");
			return;		// ���θ޼ҵ��� ���� �� ���α׷� ����~!!!
		}

		double result = ob.calc();
		ob.write(result);



	
	}

}

/* [���� ���]
������ �� ���� �Է�(���� ����) : 4 2
������ �Է�(+ - * /) : -
>> 4 - 2 = 2.00
����Ϸ��� �ƹ� Ű�� �����ʽÿ� . . .

������ �� ���� �Է�(���� ����) : 2 8
������ �Է�(+ - * /) : *
>> 2 * 8 = 16.00
����Ϸ��� �ƹ� Ű�� �����ʽÿ� . . .
*/