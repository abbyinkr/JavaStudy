/*==================================
     ���� Ŭ���� ��� ����
	 - �߻� Ŭ����(Abstract)
==================================*/

/*
�� �߻� Ŭ����(abstract)��
   ���� �ְ� ���ǰ� ���� �ϳ� �̻��� �޼ҵ�(�߻� �޼ҵ�)�� ���� Ŭ������
   ���� Ŭ�������� �������̵�(Overriding)�� ������ ����Ǵ� �޼ҵ忡 ����
   �޸� ������� �̸� ȣ�� ��ȹ�� �����α� ���� �����.

�� ���� �� ����
   [��������������] abstract class Ŭ������
   {				========
		[��������������] abstract �ڷ��� �޼ҵ��([�Ű�����], ...);
						 ========
   }

   [] : ��������
 
�� Ư¡
   Ŭ������ ��� �ϳ� �̻��� �߻� �޼ҵ带 ������ ��
   �� Ŭ������ Ŭ���� �̸� �տ� ��abstract�� Ű���带 �ٿ�
   �߻� Ŭ������ ����ؾ� �ϸ�,
   �߻� Ŭ������ ����ؼ� ������ ��쿡��
   �ҿ����� ������ Ŭ�����̹Ƿ� ��ü�� ������ �� ����.
   �߻� �޼ҵ尡 �������� �ʴ� �߻� Ŭ����������
   ��ü�� ������ �� ���� ���̴�.

   ��, �߻� Ŭ������ ���������� ������ �� ���� ������
   ����� ���ؼ��� �����ϸ�,
   �߻� Ŭ�������� ��ӹ��� ���� Ŭ����������
   �ݵ�� �߻� �޼ҵ带 �������̵�(Overriding)�ؾ� �Ѵ�.

�� ��abstract�� Ű�����
	Ŭ������ �޼ҵ忡���� ����� �� ������
	��� ������ ���� ���������� ��� �Ұ����ϴ�.
*/

// �θ� Ŭ���� SortInt
abstract class SortInt
{
	private int[] value;

	protected void sort(int[] value)
	{
		this.value = value;
		sorting();
	}

	// �߻� �޼ҵ�(abstract)
	protected abstract void sorting();

	protected int dataLength()
	{
		return value.length;
	}

	// compare() �޼ҵ�� ũ�� �� �޼ҵ�
	// ��final�� Ű����� ���� �� Ŭ����(SortInt)�� ��ӹ޴� Ŭ��������
	//  �� �޼ҵ带 �������� �� ����.
	protected final int compare(int i, int j)
	{
		int x = value[i];
		int y = value[j];
		if (x==y)
			return 0;
		else if(x>y)
			return 1;
		else
			return -1;
	}
	
	// swap() �޼ҵ�� �ڸ� �ٲ� �޼ҵ�
	// ��final�� Ű����� ���� �� Ŭ����(SortInt)�� ��ӹ޴� Ŭ��������
	//  ��� �� �޼ҵ常ŭ�� ���������� ���ƶ�~!!!
	//  ��� �ǹ� ����
	protected final void swap(int i, int j)
	{
		int temp = value[i];
		value[i] = value[j];
		value[j] = temp;
	}
}

// SortInt(�߻�Ŭ����)�� ��ӹ��� Ŭ���� �� �߻�Ŭ���� �� �߻�޼ҵ� ������ �� �Ϲ� ���� Ŭ����
//public abstract class Test110 extends SortInt
public class Test110 extends SortInt
{
	int i, j;

	static int[] data = {7, 10, 3, 8, 7};

	//-----------------------------------------------------------
	//  [���� Ǯ��]
	/*
	// �߻� �޼ҵ� sorting()�� �������ϰڴٴ� ǥ�÷� @Override ���ֱ�
	@Override	
	protected void sorting()
	{			
		// �⺻ �������ķ� �ڸ��ٲٱ�
		for (i=1; i<dataLength(); i++)
		{
			for (j=0; j<dataLength()-i; j++)					// ���ǽĿ��� �ٷ� dataLength()�� �� �� �ִ�.
			{
				if (compare(j,j+1)==1)
					swap(j,j+1);
			}
		}
		
		// ���� �������ķ� �ڸ��ٲٱ�
		/*
		boolean flag;

		for (i=1; i<k; i++)
		{
			flag = false;
			for (j=0; j<k-i; j++)
			{
				if (compare(j,j+1)==1)
				{
					swap(j,j+1);
					flag = true;			// true : �ڸ� �ٲ� �ߴ�.
				}
			}
			if (flag==false)				// false : �ڸ� �ٲ� �������� �ݺ� �׸���~!
				break;							
		}
	
	}// end sorting()
	*/

	// [������ Ǯ��]
	
	// protected abstract void sorting()

	@Override
	protected void sorting()
	{
		// Selection Sort
		for (i=0; i<dataLength()-1; i++)
		{
			for (j=i+1; j<dataLength(); j++)
			{
				if (compare(i, j) > 0)	// ũ�� ��(���� ����)
					swap(i, j);			// �ڸ� �ٲ�
			}

			// ���� ���� �׽�Ʈ
			/*
			System.out.print((i+1) + "Round Data : ");
			for (int n: data)
				System.out.print(n + " ");
			System.out.println();
			*/
		}
	}

	//-----------------------------------------------------------


	public static void main(String[] args)
	{
		System.out.print("Sourced Data : ");
		for (int n: data)
			System.out.print(n + " ");
		System.out.println();

		Test110 ob = new Test110();
		ob.sort(data);
		// data = {7, 10, 3, 8, 7} �� �ʱ�ȭ
		// sorting �޼ҵ� ȣ��

		System.out.print("Sorted Data : ");
		for (int n: data)
			System.out.print(n + " ");
		System.out.println();
		
	}

}