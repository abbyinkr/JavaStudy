/*===================================
   ���� Ŭ������ �ν��Ͻ� ����
   - Ŭ������ �ν��Ͻ� �ҿ�
===================================*/

// �� �ǽ�����
// 1 ~ 3 ������ ���� ������ ������ �߻�����
// ����, ����, �� ���� ���α׷��� �����Ѵ�.
// ��, Ŭ������ ������ Ȱ���Ͽ� ó���� �� �ֵ��� �Ѵ�.
// ����, �迭�� Ȱ���Ͽ� ó���� �� �ֵ��� �Ѵ�.

// ���� ������ �� 1: ����, 2: ����, 3:��

// ���� ��)
// 1:����, 2:����, 3:�� �� �Է�(1~3) : 4
// 1:����, 2:����, 3:�� �� �Է�(1~3) : -10
// 1:����, 2:����, 3:�� �� �Է�(1~3) : 2
// - ����   : ����
// - ��ǻ�� : ��	// ���������� ��ǻ�Ͱ� ���°� �ƴ϶� ��ǻ�Ͱ� ����!
// >> �º�������� : ��ǻ�Ͱ� �̰���ϴ�~!!!
// ����Ϸ��� �ƹ� Ű��...

import java.util.Random;
import java.util.Scanner;

class RpsGame
{
	int user;
	int com;

	/*
	String[] rps = {"����", "����", "��"};
	String result = "���º�";

	private void comRps()
	{
		Random rd = new Random();			
		com = rd.nextInt(3)+1;		// com = 1 2 3 �� �������� �ϳ��� ���.
	}

	
	// ����� �Է� �ȳ� �� ����� ���������� �� ���� �޼ҵ�
	public void input()
	{

		Scanner sc = new Scanner(System.in);
		//����ڿ��� �Է� �ȳ� �޼��� ���

		do
		{
			System.out.print("1:����, 2:����, 3:�� �� �Է�(1~3) : ");
			user = sc.nextInt(); 
			
		}
		while (user<1 || user>3); 

	}//end input()

	// ������ 1(����) ��ǻ�Ͱ� 3(��) �� �̱�� 1-2�� ��
	// ������ 2(����) �̰� ��ǻ�Ͱ� 3=�̸� ��, 1�̸� �̱�
	// ������ 3(��)�̰� ��ǻ�Ͱ� 1�̸� �� 2�̸� �̱�

	public void print()
	{
		System.out.printf("- ����    : %s\n", rps[user-1]);
		System.out.printf("- ��ǻ��  : %s\n", rps[com-1]);

		if (user==1 && com==3 || user==3 && com==2 || user==2 && com==1)
		{
			result = "������ �̰���ϴ�~!!";
			System.out.printf(">> �º�������� : %s\n", result);
		}
		else if (user==1 && com==2 || user==2 && com==3 || user==3 && com==1)
		{
			result = "��ǻ�Ͱ� �̰���ϴ�~!!";
			System.out.printf(">> �º�������� : %s\n", result);
		}
		else if (user==com)
			System.out.printf(">> �º�������� : %s�Դϴ�~!!\n", result);


	}//end print()
	*/ 

	// [�Բ� Ǯ���� ����]

	// ��ǻ�� ���������� �޼ҵ� private!
	private void runCom()
	{
		Random rd = new Random();
		com = rd.nextInt(3)+1;		// 0 1 2 �� 1 2 3 
	}

	// ����� ���������� �Է� �޼ҵ�
	public void input()
	{
		runCom();	// �� ��ǻ�Ͱ� ����� ���� ���� ��!

		Scanner sc = new Scanner(System.in);

		do
		{
			System.out.print("1:����, 2:����, 3:�� �� �Է�(1~3) : ");
			user = sc.nextInt();
		}
		while (user<1 || user>3);
	}

	// ������ ��ǻ�Ͱ� �� �� �� ���� ���� ���� ġȯ�ϴ� �޼ҵ�
	public void middleCalc()
	{
		String[] str = {"����","����","��"};

		System.out.println("- ����   : " + str[user-1]);
		System.out.println("- ��ǻ�� : " + str[com-1]);
	}

	// ��� �Ǻ� �޼ҵ�
	public String resultCalc()
	{
		String result = "���º�";

		if (user==1&&com==3 || user==2&&com==1 || user==3&&com==2)
			result = "����� �¸��߽��ϴ�~!!!";
		if (user==1&&com==2 || user==2&&com==3 || user==3&&com==1)		
			result = "��ǻ�Ͱ� �¸��߽��ϴ�~!!!";
		// result = "���º�"�� �ʱ�ȭ�����ϱ� �Ѵ� ���ߵ�. else if (X)

		return result;
	}

	// �º�������� ��� �޼ҵ�
	public void print(String result)
	{
		System.out.println(">> �º�������� : " + result);
	}


}

// ~���� ��Ű�� ��~

public class Test095
{
	public static void main(String[] args)
	{
		/*
		// �ν��Ͻ� ����
		RpsGame ob = new RpsGame();
		// �޼ҵ� ȣ�� 
		ob.comRps();
		ob.input();
		ob.print();
		*/

		RpsGame ob = new RpsGame();
		ob.input();
		ob.middleCalc();
		String result = ob.resultCalc();
		ob.print(result);


	}
}

/* [���� ���]

1:����, 2:����, 3:�� �� �Է�(1~3) : 2
- ����   : ����
- ��ǻ�� : ����
>> �º�������� : ����� �¸��߽��ϴ�~!!!
����Ϸ��� �ƹ� Ű�� �����ʽÿ� . . .

1:����, 2:����, 3:�� �� �Է�(1~3) : 3
- ����   : ��
- ��ǻ�� : ����
>> �º�������� : ��ǻ�Ͱ� �¸��߽��ϴ�~!!!
����Ϸ��� �ƹ� Ű�� �����ʽÿ� . . .

1:����, 2:����, 3:�� �� �Է�(1~3) : 1
- ����   : ����
- ��ǻ�� : ��
>> �º�������� : ����� �¸��߽��ϴ�~!!!
����Ϸ��� �ƹ� Ű�� �����ʽÿ� . . .

1:����, 2:����, 3:�� �� �Է�(1~3) : 2
- ����   : ����
- ��ǻ�� : ����
>> �º�������� : ���º�
����Ϸ��� �ƹ� Ű�� �����ʽÿ� . . .
*/