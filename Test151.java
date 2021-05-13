/*===================================
  ���� �÷��� (Collection) ���� 
===================================*/

/*
�� ť(queue)
	//�籸�� ť��

   ť(queue)�� FIFO(First Input First Output) ������ 
   ���� �Էµ� �ڷḦ ���� ����ϸ�
   Queue �������̽��� ������ Ŭ������ ť�� ���õ� �پ��� ����� �����Ѵ�.

�� ť(Queue) �������̽� �ν��Ͻ��� �����ϱ� ���ؼ���
   new �����ڸ� �̿��Ͽ� Queue �������̽��� ������(implements)
   Ŭ������ �����ڸ� ȣ���Ѵ�.

   ex) Queue ob = new LinkedList();

�� �ֿ� �޼ҵ�
	// E �� <T> element��� �ϼ̴��Ű���..
   - E element()
     ť�� head ��Ҹ� ��ȯ�ϸ� �������� �ʴ´�.
   - boolean offer(E o)
     ������ ��Ҹ� ť�� �����Ѵ�.
   - E peek()
     ť�� head ��Ҹ� ��ȯ�ϰ� �������� ������
	 ť �ڷᱸ���� empty �� ��� null �� ��ȯ�Ѵ�.
   - E poll()
     ť�� head ��Ҹ� ��ȯ�ϰ� �����ϸ�
	 ť �ڷᱸ���� empty�� ��� null�� ��ȯ�Ѵ�.
   - E remove()
     ť�� head ��Ҹ� ��ȯ�ϰ� �����Ѵ�. 

*/

import java.util.Queue;
import java.util.LinkedList;

public class Test151
{
	
	public static void main(String[] args)
	{
		// Queue �ڷᱸ�� ����
		//Queue myQue = new Queue(); 
		// �̷��Դ� ���� �ȵȴ�~~
		Queue<Object> myQue = new LinkedList<Object>();

		String str1 = "�弭��";
		String str2 = "�ڹ���";
		String str3 = "������";
		String str4 = "���ϸ�";
		
		// myQue ��� Queue �ڷᱸ���� ������ �߰�
		myQue.offer(str1);
		myQue.offer(str2);
		myQue.offer(str3);
		myQue.offer(str4);

		// ��element()�� : ť �ڷᱸ������ ��Ҹ� ���������ʰ� head ��Ҹ� ��ȯ
		System.out.println("��1 : " + myQue.element());
		//--==>> ��1 : �弭��

		System.out.println("��2 : " + myQue.element());
		//--==>> ��2 : �弭��

		System.out.println();

		
		/* [���� ���]
		String val = "";

		while (!myQue.isEmpty())
			val += myQue.poll()+" ";
		System.out.println(val);
		*/

		String val;

		// �� 
		/*
		// ��peek()�� : ť�� head ��� ��ȯ. ���� ����.
		//              ť�� empty �� ��� null�� ��ȯ.
		while (myQue.peek() != null)
		{
			// ��poll()�� : ť�� head ��� ��ȯ. ������.
			//				ť�� empty �� ��� null�� ��ȯ.
			val = (String)myQue.poll();
			System.out.println("��� : " + val);
		}
		//--==>> ��� : �弭��
		//		 ��� : �ڹ���
		//		 ��� : ������
		//		 ��� : ���ϸ�
		*/

		// �׽�Ʈ(Ȯ��)
		/*
		while (myQue.poll() != null)
		{
			val = (String)myQue.poll();
			System.out.println("��� : " + val);
		}
		//--==>> ��� : �ڹ���
		// 		 ��� : ���ϸ�
		*/

		// �� 
		while (true)
		{
			val = (String)myQue.poll();
			if (val==null)		// null���� �ƴ��� Ȯ���� ����ؾ��ϴϱ� 
				break;			// ���� if�� �˻��Ѵ�.
			else
				System.out.println("��� : " + val);
		}
		//--==>> ��� : �弭��
        //       ��� : �ڹ���
        //       ��� : ������
        //       ��� : ���ϸ�

		// ��
        /*
		while (!myQue.isEmpty())
		{
			val = (String)myQue.poll();
			System.out.println("��� : " + val);
		}
		//--==>> ��� : �弭��
		//		 ��� : �ڹ���
		//		 ��� : ������
		//		 ��� : ���ϸ�
        */

	}
}