/*============================================
   ���� Ŭ������ �ν��Ͻ� ����
   - Ŭ���� ���� ���� �� Ŭ���� ���� �ǽ�
============================================*/

// ����ڷκ��� ������ ������ �Է¹޾�
// 1���� �Է¹��� �� ������ ���� �����Ͽ�
// ����� ����ϴ� ���α׷��� �����Ѵ�.

// ��, Ŭ������ �ν��Ͻ��� ������ Ȱ���Ͽ� ó���� �� �ֵ��� �Ѵ�.
// ����, �Է� ó�� �������� BufferedReader �� readLine()�� ����ϸ�,
// �Է¹��� �����Ͱ� 1���� �۰ų� 1000���� ū ���
// �ٽ� �Է¹��� �� �ִ� ó���� �����Ͽ� ���α׷��� ������ �� �ֵ��� �Ѵ�.

// ���� ��)
// ������ ���� �Է�(1~1000) : 1002
// ������ ���� �Է�(1~1000) : -20
// ������ ���� �Է�(1~1000) : 100
// >> 1 ~ 100������ �� : 5050
// ����Ϸ��� �ƹ� Ű��...

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

class Hap
{
	/* -- ���� Ǯ���� ����
	int num;
	int sum;
	
	void input() throws IOException			// �Է� �޼ҵ�
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		do
		{
			System.out.print("������ ���� �Է�(1~1000) : ");
			num = Integer.parseInt(br.readLine());
		}
		while (num<1 || num>1000);
	}

	int plus()								// 1 ~ �Է¹��� �� ���ϱ� �޼ҵ�
	{
		// sum=0;  ���������� �ڹٰ� �˾Ƽ� 0���� �ʱ�ȭ����!

		for (int i=1; i<=num; i++)
		{
			sum += i;
		}
		return sum;
	}

	void print(int s) // ��� �޼ҵ�
	{
		System.out.printf(">> 1 ~ %d ������ �� : %d\n", num, sum);
	}
	*/

	// �Բ� Ǯ���� ����
		
	// �� �ֿ� ���� ����(������� �Է°��� ��Ƶ� ����)
	int su;
	// int result; <-��������, 0���� �ʱ�ȭ��

	// �� �Է� �޼ҵ� ����
	void input() throws IOException
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		do
		{
			System.out.print("������ ���� �Է�(1~1000) : ");
			su = Integer.parseInt(br.readLine());
		}
		while (su<1 || su>1000); 
	} //--������� �Է����� �� �����ȳ��� su�� ����� ���� ��� ��.

	// �� ���� �޼ҵ� ����
	int caculate()
	{
		int result = 0;

		for (int i=1 ; i<=su ; i++)
			result += i;

		return result;
	}

	// ��� ��� �޼ҵ� ����
	// >> 1 ~ 100 ������ �� : 5050
	void print(int sum)
	{
		System.out.printf(">> 1 ~ %d ������ �� : %d\n", su, sum);
	}

}//end class Hap

// Ŭ������ ���̿� import �������� �� ����~!!

public class Test072
{
	public static void main(String[] args) throws IOException

	{
		/* -- ���� Ǯ���� ����
		Hap h = new Hap();
		h.input();
		int tot = h.plus();			
		//�� int tot = sum <- ���� �����
		h.print(tot);
		*/ 

		// ���� Ǯ���� ����

		// Hap Ŭ���� ����� �ν��Ͻ� ���� (ob)
		Hap ob = new Hap();		// ob �� ��������

		// ������ �ν��Ͻ��� ���� �Է� �޼ҵ� ȣ��~!! �� throws IOException ó��
		ob.input();
		
		// ������ �ν��Ͻ��� ���� ���� �޼ҵ� ȣ��~!! �� int�� ����� ��ȯ �� �޾� �� �� �ִ� ó��
		int s = ob.caculate();

		// ������ �ν��Ͻ��� ���� ��� �޼ҵ� ȣ��~!! �� �Ű����� ����
		ob.print(s);

		
	}//end main

}//end class Test072


/* [���� ���]

������ ���� �Է�(1~1000) : -5
������ ���� �Է�(1~1000) : 2000
������ ���� �Է�(1~1000) : 500
>> 1 ~ 500 ������ �� : 125250
����Ϸ��� �ƹ� Ű�� �����ʽÿ� . . .

*/
