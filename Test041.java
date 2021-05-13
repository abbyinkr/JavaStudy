/*=======================================
 ���� ���� �帧�� ��Ʈ��(���) ����
 - switch�� �ǽ�
=======================================*/

// 1���� 3������ ���� �� �ϳ��� ����ڷκ��� �Է¹޾�
// �Է¹��� ������ŭ ������(��)�� ��µǴ� ���α׷��� �ۼ��Ѵ�.
// ��, �ΰ����� ������� ������ �� �ֵ��� �Ѵ�.

// �� switch ���� �Ϲ� ���� Ȱ���Ѵ�.
// �� switch ���� �⺻ ���� Ȱ���ϵ�, (=case ���� ���� ����ؼ� ����)
//	  ��break���� �� �� ���� ����� �� �ֵ��� �Ѵ�.

// ���� ��)
// ������ ���� �Է�(1~3): 3
// �ڡڡ�
// ����Ϸ��� �ƹ� Ű��...

// ������ ���� �Է�(1~3): 1
// ��
// ����Ϸ��� �ƹ� Ű��...

// ������ ���� �Է�(1~3): 7
// �Է� ����~!!!
// ����Ϸ��� �ƹ� Ű��...

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Test041
{
	public static void main(String[] args) throws IOException
	{
		// ��
		/*
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int n;
		System.out.print("������ ���� �Է�(1~3) : ");
		n = Integer.parseInt(br.readLine());

		// switch ���� �Ϲ� ��
		switch (n)
		{
		case 1:
			System.out.println("��");
			break;
		case 2:
			System.out.println("�ڡ�");
			break;
		case 3:
			System.out.println("�ڡڡ�");
			break;
		default:
			System.out.println("�Է� ����~!!!");
			break;
		}
		*/

		// ��� �� switch ���� �⺻ ���� Ȱ���ϵ�, break 1�� ��� 
		//         (=case ���� ���� ����ؼ� ����)
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int n;
		System.out.print("������ ���� �Է�(1~3) : ");
		n = Integer.parseInt(br.readLine());

		switch (n)
		{
		case 3:
			System.out.print("��");
		case 2: 
			System.out.print("��");
		case 1:
			System.out.print("��");
			break;
		default:
			System.out.println("�Է� ����~!!!");
		}
		System.out.println(); // ����
	
		/*

		// ������ Ǯ�̹�� 

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int n;
		System.out.print("������ ���� �Է�(1~3) : ");
		n = Integer.parseInt(br.readLine());

		// ��
		/*
		switch (n)
		{
			case 1: System.out.println("��"); break;
			case 2: System.out.println("�ڡ�"); break;
			case 3: System.out.println("�ڡڡ�"); break;
			default : System.out.println("�Է� ����~!!!"); //break;
		}
		*/

		// ��

		/*
		switch (n)
		{
			case 3: System.out.print("��");
			case 2: System.out.print("��");
			case 1: System.out.print("��"); 
					break;
			
			default: System.out.print("�Է� ����~!!!");
		}
		System.out.println();
		
	
		//default�� ������ ���͵� ��, ��, break �� switch ���̿� ����
		switch (n)
		{
			default: System.out.print("�Է� ����~!!!");
					break;
			case 3: System.out.print("��");
			case 2: System.out.print("��");
			case 1: System.out.print("��"); 
					
		}
		System.out.println();
		*/

	}
}

/* [���� ���]
������ ���� �Է�(1~3) : 1
��
����Ϸ��� �ƹ� Ű�� �����ʽÿ� . . .

������ ���� �Է�(1~3) : 2
�ڡ�
����Ϸ��� �ƹ� Ű�� �����ʽÿ� . . .

������ ���� �Է�(1~3) : 3
�ڡڡ�
����Ϸ��� �ƹ� Ű�� �����ʽÿ� . . .

������ ���� �Է�(1~3) : 4
�Է� ����~!!!
����Ϸ��� �ƹ� Ű�� �����ʽÿ� . . .

*/