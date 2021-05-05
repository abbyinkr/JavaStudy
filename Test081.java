/*=============================
   ���� �迭 (array) ����
   - �迭�� ����� �ʱ�ȭ
   - �迭�� �⺻���� Ȱ��
=============================*/

// �� �ǽ� ����
// ������ �������� ����ִ� �迭�� ���� �����͵� ��
// ¦���� ��Ҹ� ��� ����ϰ�
// 3�� ����� ��Ҹ� ��� ����ϴ� ���α׷��� �����Ѵ�.

// �� �迭�� �����ϴ� ������ ����
//	  �� 4 7 9 1 3 2 5 6 8

// ���� ��)
// �迭 ��� ��ü ���
// 4 7 9 1 3 2 5 6 8
// ¦�� ������ ���
// 4 2 6 8
// 3�� ��� ������ ���
// 9 3 6 
// ����Ϸ��� �ƹ� Ű��...



public class Test081
{

/*
	int[] a = {4, 7, 9, 1, 3, 2, 5, 6, 8};

	void printAll()
	{
		System.out.println("�迭 ��� ��ü ���");
		for (int i=0; i<9; i++)
				System.out.printf("%d ", a[i]);
		System.out.println();
	}
	
	void printEven()
	{
		System.out.println("¦�� ������ ���");
	
		for (int i=0; i<9; i++)
		{
			if (a[i]%2==0)
			{
				System.out.printf("%d ", a[i]);
			}
		}
		System.out.println();

	}

	void printThree()
	{
		System.out.println("3�� ��� ������ ���");
		for (int i=0; i<9; i++)
		{
			if (a[i]%3==0)
			{
				System.out.printf("%d ", a[i]);
			}
		}System.out.println();

	}
*/

	// [������ Ǯ��]
	public static void main(String[] args)
	{
		/*
		
		Test081 ob = new Test081();
		ob.printAll();
		ob.printEven();
		ob.printThree();
		*/

		// �迭 ���� �� �ʱ�ȭ
		// ��� ��
		/*
		int [] arr = new int[9];
		arr[0] = 4;
		arr[1] = 7;
		arr[2] = 9;
		arr[3] = 1;
		      :
		arr[8] = 8;

		*/

		// ��� ��
		int[] arr = {4, 7, 9, 1, 3, 2, 5, 6, 8};

		//System.out.println(arr);
		//--==>> [I@15db9742
		// �� �Ϲ����� ������ ��� ������ ����ϴ� ���(����)���δ�
		//    �迭�� ��� �����͵��� ����� �� ����.

		/*
		System.out.println("�迭 ��� ��ü ���");
		for (int i=0; i<9; i++)
		{
			System.out.print(arr[i] + " ");
		}
		System.out.println();
		//--==>> �迭 ��� ��ü ���
		//		 4 7 9 1 3 2 5 6 8
		*/


		// �� �迭 arr �� ����(���� ����) ���� 
		//    ��arr.length��

		System.out.println("�迭 arr�� ���� : " + arr.length);
		System.out.println("�迭 ��� ��ü ���");
		for (int i=0; i<arr.length; i++)
		{
			System.out.print(arr[i] + " ");
		}
		System.out.println();
		//--==>> �迭 ��� ��ü ���
		//		 4 7 9 1 3 2 5 6 8


		/* �ñ�
		int[] b = new int[arr.length];
		for (int j=0; j<arr.length; j++)
		{
			b[j] = arr[j];
			System.out.println(b[j]);  
		}
		*/ 

		System.out.println("¦�� ������ ���");
		for (int i=0; i<arr.length; i++)
		{
			/*
			if (i%2==0)		//-- i�� ¦����� �� ¦����°�� �ش��ϴ� ��Ҷ��... (��, ���ȣ�� ¦�����)
			{
				System.out.print(arr[i] + " ");
			}
			*/

			if (arr[i]%2==0)	// i��° ���� ¦�����...
			{
				System.out.print(arr[i] + " ");
			}
		}
		System.out.println();

		System.out.println("3�� ��� ������ ���");

		for (int i=0; i<arr.length; i++)
		{
			if (arr[i]%3==0)	
			{
				System.out.print(arr[i] + " ");
			}
		}
		System.out.println();

		// forEach��
		//System.out.println("-----forEach��-----");
		//for (int n: arr)
		//	System.out.print(n + " ");
		//System.out.println();

	}
}


/* [���� ���]

�迭 ��� ��ü ���
4 7 9 1 3 2 5 6 8
¦�� ������ ���
4 2 6 8
3�� ��� ������ ���
9 3 6
����Ϸ��� �ƹ� Ű�� �����ʽÿ� . . .

*/