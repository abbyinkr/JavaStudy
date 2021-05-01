/*================================================
        ���� ����(Sort) �˰��� ����
   - ���� ���� ����(Bubble Sort : ��ǰ ����)
================================================*/

/*
�� �ռ� ������ Selection Sort �� Bubble Sort �� ������ ����. (�ݺ�Ƚ���� ����)
   ������, ���� Bubble Sort�� ����� �Ǵ� �������� ������ ����
   �Ϲ� Bubble Sort �� Slection Sort ���� ������ ���� �� �ִ�.

���� ������ = 61 15 20 22 30
			  15 20 22 30 61	-- 1ȸ�� (���� �߻�)      �� ���� ȸ�� ��
			  15 20 22 30 61	-- 2ȸ�� (���� �߻� ����) �� ���� ȸ�� ��

==> 1ȸ�� ����...2ȸ�� ����...�� �� ���Ҵ���...
	2ȸ���� �����ϴ� �������� ����(�ڸ��ٲ�)�� ���� �Ͼ�� �ʾұ� ������
	���ʿ��� �߰� ����(ȸ��:�ݺ�)�� �������� �ʴ´�.
	��, ���̻��� �ݺ��� ���ǹ��� ������ �Ǵ��Ѵ�.

*/


public class Test104
{
	
	public static void main(String[] args)
	{
		int[] a = {10, 50, 20, 33, 40};

		/*
		10, 50, 20, 33, 40			�� 0 1
		======

		10, 20, 50, 33, 40			�� 1 2
			======
			
		10, 20, 33, 50, 40			�� 2 3
		        ======

		10, 20, 33, 40, 50			�� 3 4
		            ======

		----------------------------------- 1ȸ��

		10, 20, 33, 40, 50			�� 0 1
		======
			======					�� 1 2
				======				�� 2 3
		----------------------------------- 2ȸ��
		X
		X
		X
   
		*/

		/*
		// �ʱ� ������ ���
		System.out.print("Source Data : ");
		for (int n : a)
			System.out.print(n + " ");
		System.out.println();

		// ���� Bubble Sort ����
		
		int i, j;
		boolean flag;

		for (i=1; i<a.length; i++)
		{	
			//System.out.println("��~");
			flag = false;				// ȸ�� ��ĥ ������ �ʱ�ȭ
			for (j=0; j<a.length-i ; j++)
			{	
				//System.out.println("��");
				if (a[j] > a[j+1])
				{
					a[j] = a[j]^a[j+1];
					a[j+1] = a[j+1]^a[j];
					a[j] = a[j]^a[j+1];
					flag = true;		// true �� �ѹ��̶� ������ �Ȱ���
				}
			}
			// �׽�Ʈ
			//System.out.println(flag);
			if (flag==false)
				break;
		}

		// ��� ������ ���
		System.out.print("Sorted Data : ");
		for (int n : a)
			System.out.print(n + " ");
		System.out.println();
		*/

		// [������ Ǯ��]

		// �ʱ� ������ ���
		System.out.print("Source Data : ");
		for (int n : a)
			System.out.print(n + " ");
		System.out.println();

		// ���� Bubble Sort ����
		int pass=0;
		boolean flag;

		do
		{
			pass++;
			flag = false;

			for (int i=0; i<a.length-pass; i++)
			{
				if (a[i] > a[i+1])
				{
					// �ڸ� �ٲٱ�
					a[i] = a[i]^a[i+1];
					a[i+1] = a[i]^a[i+1];
					a[i] = a[i]^a[i+1];

					flag = true;	// �ڸ� �ٲ��� �Ͼ�ٴ� ��� Ȯ��~!!!
				}
			}
		}
		while (flag);
		// ȸ���� ���������� �߻��ϴµ���(��~) ����(�ڸ��ٲ�)�� �Ͼ�� ��������
		// ���̻��� �ݺ��� ������ ���ǹ��� ������ �Ǵ�~!!!

		System.out.print("Sorted Data : ");
		for (int n : a)
			System.out.print(n + " ");
		System.out.println();
	
	}
}