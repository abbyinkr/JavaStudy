/*=========================================
     ���� ����(Sort) �˰��� ����
=========================================*/

// �� �ǽ� ����
//	  ����ڷκ��� ���� �л��� ���� �����͸� ���� ���·� �Է¹޾�
//	  ������ ���� ������ ����� �ο��Ͽ� ����� ����ϴ� ���α׷��� �����Ѵ�.
//    ��, �迭�� ���� �˰����� Ȱ���Ͽ� �ۼ��� �� �ֵ��� �Ѵ�.

// ���� ��)
// �ο� �� �Է� : 5
// �̸� ���� �Է�(1) : ������ 90
// �̸� ���� �Է�(2) : ������ 80
// �̸� ���� �Է�(3) : �Ҽ��� 85
// �̸� ���� �Է�(4) : ������ 75
// �̸� ���� �Է�(5) : ������ 95

//==================
// 1�� ������ 95
// 2�� ������ 90
// 3�� �Ҽ��� 85
// 4�� ������ 80
// 5�� ������ 75
//==================
// ����Ϸ��� �ƹ� Ű��...

import java.util.Scanner;

public class Test105
{
	public static void main(String[] ags)
	{
		Scanner sc = new Scanner(System.in);
		
		int inwon;			// �ο���
		String[] names;		// �̸� �迭(String)
		int[] scores;		// ���� �迭(int)
		
		// ����ڿ��� �ο��� �Է� �ȳ� �޼��� ��°� �迭�� �� ���� ����
		do
		{
			System.out.print("�ο� �� �Է� : ");
			inwon = sc.nextInt();
			names = new String[inwon];
			scores = new int[inwon];
		}
		while (inwon<1);
		
		
		// �̸��� �����迭�� ���� �� ���
		for (int i=0; i<inwon ; i++)
		{
			System.out.printf("�̸� ���� �Է�(%d) : ", i+1);
			names[i] = sc.next();
			scores[i] = sc.nextInt();
		}

		//------------������� �ϸ� �̸��̶� ���� ���� �Ϸ�~!!!
		
		// ���� ���� ���� Ȱ��
		int pass=0;
		boolean flag=false;
		String temp;
		// String temp = new String[inwon]; 
		// temp�� ��¾��ؼ� �ʱ�ȭ���ص� ��������.

		do
		{
			pass++;
			flag = false;
			for (int j=0; j<scores.length-pass; j++)
			{
				if (scores[j] < scores[j+1])		// �������� ����
				{
					scores[j] = scores[j]^scores[j+1];
					scores[j+1] = scores[j]^scores[j+1];
					scores[j] = scores[j]^scores[j+1];

					/* ��Ʈ�� ������ ���ڿ��̴ϱ� �ȵ�!
					names[i] = names[i]^names[i+1];
					names[i+1] = names[i+1]^names[i];
					names[i] = names[i]^names[i+1];
					*/
					

					temp = names[j];
					names[j] = names[j+1];
					names[j+1] = temp;

					// ������ �̷������ flag�� true�� ����
					flag = true;
				}
			}
		}
		while (flag);

		// �׽�Ʈ
		//System.out.print("Sorted Data ���� : ");
		//for (int n : scores)
		//	System.out.print(n + " ");
		//System.out.println();

		//System.out.print("Sorted Data �̸� : ");
		//for (String n : names)
		//	System.out.print(n + " ");
		//System.out.println();

		// ��� ���
		
		/*
		System.out.println("===================");
		for (int j=0; j<inwon; j++)
			System.out.printf("%3d�� %3s %3d\n", (j+1), names[j], scores[j]);
		System.out.println("===================");
		*/



	}
}