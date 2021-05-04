/*=============================
   ���� �迭 (array) ����
   - �迭�� �⺻���� Ȱ��
=============================*/

// �� ����
// ����ڷκ��� �ο� ���� �Է¹ް�
// �̷��� �Է¹��� �ο��� ��ŭ�� �л� �̸��� ��ȭ��ȣ�� �Է¹޾�
// �Է¹��� ������ ��ü ����ϴ� ���α׷��� �����Ѵ�.
// ��, �迭�� Ȱ���Ͽ� ó���� �� �ֵ��� �Ѵ�.

// ���� ��)
// �Է� ó���� �л� �� �Է�(��, 1~10) : 3
// �̸�, ��ȭ��ȣ �Է�[1](���� ����) : ������ 010-1111-1111
// �̸�, ��ȭ��ȣ �Է�[2](���� ����) : ������ 010-1111-1111
// �̸�, ��ȭ��ȣ �Է�[3](���� ����) : �Ҽ��� 010-1111-1111 // �̸� �迭�� ��ȭ��ȣ �迭�� �����ؼ� ó��

// --------------------
// ��ü �л� �� : 3��
// --------------------
// �̸�       ��ȭ��ȣ
// ������ 010-1111-1111				// 0���� �����ϴ� ���ڴ� �Էµ� ���� ����Ÿ��(����,�Ǽ�)�� ������ �ȵ�!!
// ������ 010-1111-1111 
// �Ҽ��� 010-1111-1111 
// --------------------
// ����Ϸ��� �ƹ� Ű��...

import java.util.Scanner;
import java.io.IOException;

public class Test083
{

	public static void main(String[] args) throws IOException
	{
		/*
		// �ֿ� ���� ����
		int n;
		// sc �ν��Ͻ� ����
		Scanner sc = new Scanner(System.in);	// ���鱸���ؼ� �޾ƿ��°Ŵ� Scanner!! �ƽ�Ű�ڵ�� System.in.read~~~ �ܿ���
	
		// �л� �� �Է� �ȳ� �޼��� �� ����

		System.out.print("�Է� ó���� �л� �� �Է�(��, 1~10) : ");
		n = sc.nextInt();				// int n = 3

		// �迭 �����Ͽ� �̸�, ��ȭ��ȣ ����
		String[] name = new String[n];	  // String[] name = new String[3];			 �� String�� Spring���� ���°���... ����!
		String[] number = new String[n];  // String[] number = new String[3];
		// �׽�Ʈ System.out.println("name.length : "+ name.length);

		for (int i=0 ; i<n; i++)	// for�� ���� ()�ȿ� �ڷ��� ����! ex) int										
		{
			System.out.printf("�̸�, ��ȭ��ȣ �Է�[%d](���� ����) : ", (i+1));
			name[i] = sc.next();
			number[i] = sc.next();
		}

		// ��� ���

		System.out.println("--------------------");
		System.out.printf("��ü �л� �� : %2d��\n", n);
		System.out.println("--------------------");
		System.out.println(" �̸�      ��ȭ��ȣ ");
		for (int i=0; i<n; i++)
		{
			System.out.printf("%3s %13s\n", name[i], number[i]);
		}
		System.out.println("--------------------");
		*/

		// ���� Ǭ ����

		// Scanner Ŭ���� ��� �ν��Ͻ� ����
		Scanner sc = new Scanner(System.in);

		// ����ڰ� �Է��ϴ� �л����� ��Ƶ� ����
		int memCount = 0;

		// �� ����� �Է°� �޾ƿ���

		do
		{
			System.out.print("�Է� ó���� �л� �� �Է�(��, 1~10) : ");
			memCount = sc.nextInt();
		}
		while (memCount <1 || memCount>10);				// 1~10 ������ �� �Է��϶�� ���� ���;; 

		// �׽�Ʈ
		//System.out.println("�Է� ó���� �л� �� �Է�(��, 1~10) : " + menCount);

		// �� �̸� ���� �迭 ���� �� �Է¹��� �ο� �� ��ŭ�� �迭�� ����
		String[] names = new String[memCount];

		// �� ��ȭ ��ȣ �迭 ���� �� �Է¹��� �ο� �� ��ŭ�� �迭�� ����
		String[] tels = new String[memCount]; // String[] tels = new String[names.length];
		
		// �� �ݺ����� Ȱ���Ͽ� ������� �Էµ����͸� �迭�� ��Ƴ���
		for (int n=0; n<memCount; n++) // memCount == names.length == tels.length
		{
			System.out.printf("�̸�, ��ȭ��ȣ �Է�[%d](���� ����) : ",(n+1));
			// ������ 010-1111-1111
			names[n] = sc.next();
			tels[n] = sc.next();
		}

		// �� ���� ���(�̸�, ��ȭ��ȣ) ���
		System.out.println("----------------------");
		System.out.printf("��ü �л� �� : %2d��\n", memCount);
		System.out.println("----------------------");
		System.out.println(" �̸�      ��ȭ��ȣ ");

		for (int m=0; m<memCount; m++)
		{
			System.out.printf("%3s %14s\n", names[m], tels[m]);
		}
		System.out.println("----------------------");

		

	}//end main
}//end class Test083

/* [���� ���]

�Է� ó���� �л� �� �Է�(��, 1~10) : 2
�̸�, ��ȭ��ȣ �Է�[1](���� ����) : �谡�� 111-2222-3333
�̸�, ��ȭ��ȣ �Է�[2](���� ����) : �̻��� 000-1111-2222
----------------------
��ü �л� �� :  2��
----------------------
 �̸�      ��ȭ��ȣ
�谡��  111-2222-3333
�̻���  000-1111-2222
----------------------
����Ϸ��� �ƹ� Ű�� �����ʽÿ� . . .

*/