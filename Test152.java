/*===================================
  ���� �÷��� (Collection) ���� 
===================================*/

import java.util.Queue;
import java.util.LinkedList;

public class Test152
{
    // ���� ���ڿ� �迭 ���� �� �ʱ�ȭ
	private static final String[] colors = {"����", "���", "�ʷ�", 
	                                        "�Ķ�", "����", "����"};

	public static void main(String[] args)
	{
		/*
		// Queue �ڷᱸ�� ����

		Queue<String> myQue = new LinkedList<String>();

		// �ش� �ڷᱸ���� colors ������ �Է�

		for (String color : colors)
			myQue.offer(color);

		// �ش� �ڷᱸ���� ��� ������ ���

		
		//while (myQue.peek() != null)
		//	System.out.println("��� : " + myQue.poll());
		

		while (true)
		{
			if (myQue.peek() == null)
				break;
			else 
				System.out.println("��� : " + myQue.poll());
		}
		*/
		
		// Queue �ڷᱸ�� ����
		//-- Queue �������̽� ����� �ν��Ͻ��� �����ϱ� ���ؼ���
		//   new �����ڸ� �̿��Ͽ� Queue �������̽��� implements �� 
		//   ���� Ŭ������ �����ڸ� ȣ���ؾ� �Ѵ�.
		Queue<String> qu = new LinkedList<String>();

		// qu��� �ش� �ڷᱸ��(Queue)�� colors ������ �Է�
		for (String color : colors)
			qu.offer(color);

		// qu��� �ش� �ڷᱸ��(Queue)�� ��� ������ ���
		while (qu.peek() != null)
			System.out.print(qu.poll() + " ");
		System.out.println();
		//--==>> ���� ��� �ʷ� �Ķ� ���� ����
	}
}