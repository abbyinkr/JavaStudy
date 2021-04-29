/*=============================
   ���� �迭 (array) ����
   - �迭�� ����
=============================*/

// �� �ǽ� ����
// ������ �迭(a, b)�� ����ִ� ���ڵ��� �������� ����ϴ� ���α׷��� �����Ѵ�.
// ��, �ߺ��� ���ŵ� ������ �������� ����� �� �ֵ��� �Ѵ�.
// ����, �迭 ���� ������ ������� ó���� �� �ֵ��� �Ѵ�.

// ex) ������ �� �迭
// int[] a = {2, 3, 7, 10, 11}
// int[] b = {3, 6, 10, 14}

// ���� ��)
/*
// ù ��° �迭 ��Ҹ� �Է��ϼ���(���� ����) : 2 3 7 10 11
// �� ��° �迭 ��Ҹ� �Է��ϼ���(���� ����) : 3 6 10 14
*/

// 2 3 7 10 11 6 14
// ����Ϸ��� �ƹ� Ű��..

import java.util.Scanner;

public class Test099
{
	public static void main(String[] args)
	{
		/*
		int[] a = {2, 3, 7, 10, 11};
		int[] b = {3, 6, 10, 14};  
		
		
		Scanner sc = new Scanner(System.in);

		
		System.out.print("ù ��° �迭 ��Ҹ� �Է��ϼ���(5��, ���� ����) :");
		for (int i=0; i<a.length; i++)
			a[i] = sc.nextInt();
		
		
		System.out.print("�� ��° �迭 ��Ҹ� �Է��ϼ���(4��, ���� ����) :");
		for (int i=0; i<b.length; i++)
			b[i] = sc.nextInt();


		// �ߺ��� ���� �� ������ �迭 ���� ���ϱ�
		int n1 = a.length + b.length;
		
		for (int i=0; i<a.length; i++)
		{
			for (int j=0; j<b.length; j++)
			{
				if (a[i]==b[j])
				{
					a[i]=0;
					b[i]=0;

				}
			}
		}

		int[] temp;
		temp = copyArray(a);

		for (int i=0 ; i<temp.length; i++)
		{
			System.out.print(temp[i] + " ");
		}

		//  ����迭 2�� ���� 0���� ����ϸ� �ɰŰ�����...
		*/

		// [������ Ǯ��]
		// ������ �� �迭
		int[] a = {2, 3, 7, 10, 11};
		int[] b = {3, 6, 10, 14};

		// ��� ��
		/*
		// - ���� a �� ��ü ��� ���
		for (int i=0; i<a.length; i++)
			System.out.printf("%3d", a[i]);

		// - ���� b �� ��� ���
		//	 ��, ���� b�� ���� a�� ��ҿ� �ߺ��Ǵ� �����͸� 
		//	 �����ϸ鼭 ���
		for (int i=0 ; i<b.length ; i++)		// 4ȸ�� �� 3, 6, 10, 14 (������ ���)
		{
			boolean flag = false;

			for (int j=0; j<a.length; j++)		// 5ȸ�� �� 2, 3, 7, 10, 11
			{
				if (b[i]==a[j])	
				{
					flag = true;
					break;						// ����� �׸��� ����������(j ���� �ݺ���)
				}
			}

			if (flag)							// flag�� true���...
				continue;						// �޺κ� �����ϰ� ����ض�
	
			System.out.printf("%3d", b[i]);		// �޺κ�!
		}
		System.out.println();
		*/
		
		// ��� ��
		// - �ӽ� �迭�� �����
		//int[] temp = new int[????];
		int[] temp = new int[a.length + b.length]; // �ߺ����� �ϳ��� ������ �� ǥ���Ҽ��ֵ���

		// - ������� �ӽ� �迭�� �ߺ����� ���� �迭 ��Ҹ� ä�� ����
		// check~!!!
		int n;							//-- ������ ���� ��ġ �߿�~!!

		for (n=0; n<a.length; n++)
			temp[n] = a[n];
		// �׽�Ʈ 
		//System.out.println(n);
		//--==>> 5

		for (int k=0; k<b.length; k++)
		{
			boolean flag = false;

			for (int m=0; m<a.length; m++)
			{
				if (b[k] == a[m])
				{
					flag = true;
					break;
				}
			}

			if(flag)
				continue;

			temp[n]= b[k];		//-- �޺κ�~!!!
			n++;				//
		}

		// - �׷��� ������ �ӽ� �迭�� ���(ä������ŭ...)

		for (int h=0; h<n; h++)
			System.out.printf("%4d", temp[h]);

		System.out.println();

	}

	/*
	public static int[] copyArray(int[] os)
	{
		int[] temp= new int[os.length];
		for (int i=0; i<os.length; i++)
		{
			temp[i] = os[i];
		}
		return temp;
	}
	*/

}

/* [���� ���]
   2   3   7  10  11   6  14
����Ϸ��� �ƹ� Ű�� �����ʽÿ� . . .
*/