/*=========================================================
   ���� �÷��� �����ӿ�ũ(Collection Framework) ���� 
=========================================================*/
// �÷��� = �׸� 

/*
�� �÷��� �����ӿ�ũ(Collection Framework)

   == �÷��� (Collection) + �����ӿ�ũ (Framework)
      -------------------   ----------------------
	          |             ���, Ʋ(����, ����), ȯ��                   (�ܿ�)
              |
			���� �� ����ǰ, ����ǰ, (�����̳� �������) ����, ����. ����, ����
			------------------------------------------------------------------
			              ���ִ� �͵�... ��Ƴ��� �͵�...
                                      
==> �ڷ� ���� 

�� �ڷ�
   ���� ����κ��� �ܼ��� �����̳� ������ ���� ������
   ����̳� ������ ���� �Ǵ� �� ������ ����

   ��

�� �ڷᱸ��
   �ڷ� ó���� ���� �ڷ��� ǥ��, ����, ����, ���� ��
   �̿뿡 ���� ��� ���� ������ �����Ͽ� ���α׷��� ����ϰ�
   ��ǻ�Ϳ� ���� ó���Ǵ� �������� ������ �ڷ��� ǥ��, ����, ���� ��
   ó���� ���� �˰������� �ۼ� �� ���ð� �̿� ����� �����ϴ� �о�

�� �÷��� �����ӿ�ũ(Collection Framework)
   �÷���(��Ƴ��� �����͵�)�� ǥ���� ������ ���� ���ϵ� ��Ű��ó��
   �÷��� �����ӿ�ũ�� �����ϴ� ��Ҵ� ������ ����. (�� ����)

   1. �������̽�(Interface)      List, Set, Map
      �⺻������ �÷��ǿ� �ʿ��� ������ ���� ����� �����Ѵ�.
	  ���� ���, list �� �߰�, ����, �˻� ���� ����� �����ϴ�
	  �÷��� �������̽��� �����ϸ�
	  �� �÷��Ǹ��� ������ �������̽��� ���ǵǾ� �ִ�.

   2. ����(Implementation)
      �������̽��� ������ Ŭ������ �� �÷�����
	  ���� � �ڷᱸ���� �̿��Ͽ� ǥ���ߴ��Ŀ� ����
	  �÷����� ������ �޶����� �ȴ�.
	 
   3. �˰�����(Algorithms)
      �� �÷��ǵ鸶�� �����ϰ� ����� �� �ִ� �޼ҵ带 �ǹ��Ѵ�.

�� �ڹ� �÷����� �߰��� �÷��� �����ӿ�ũ ��� ���� ���ǵǾ� �����Ƿ�
   �� �÷��� �������� �����Ǵ� �޼ҵ��� �ϰ����� �ֱ� ������
   �� ���� �÷����� �����θ� �ٸ� �÷����� ����ϴµ� �����ϴ�.
*/

/*
�� ����(Stack)
   
   Stack Ŭ������ ������Ʈ ���Լ���(LIFO) ������ Stack �� ��Ÿ����. last input first out
   �̴� ����(Vector)�� �������� ó���ϴ� 5���� �޼ҵ��
   ����(Vector) Ŭ������ Ȯ���ϰ� �ȴ�.
   
   ����� push() �޼ҵ�� pop() �޼ҵ尡 �����Ǵ� �� �ܿ�
   ������ ���� �׸����� peek()�� �ǽ��ϴ� �޼ҵ�,
   ������ ����ִ����� ���θ� Ȯ���ϴ� isEmpty()
   �������� �׸��� ã�Ƽ� ���ηκ��� �� ��°������ ã�Ƴ��� �޼ҵ� ���� �����ȴ�.

   ������ ó������ �ۼ��Ǿ��� ��, �׸��� �������� �ʴ´�.

   - boolean empty()
     ������ ����ִ��� Ȯ���Ѵ�.
   - E Object peek()
     ������ �� ���� ��ü�� ���ÿ��� �������� �ʰ� ��ȯ�Ѵ�.
   - E Object pop()
     ������ �� ���� ��ü�� ��ȯ�ϰ� ���ÿ��� �����Ѵ�.
   - E Object push(E item)
     ��ü�� ���� �ڷᱸ���� �����Ѵ�.
   - int search(Object o)
     ������ �� ���������� �Ķ���� ������ �Ѱܹ��� ��ü������ �Ÿ��� ��ȯ�Ѵ�.
	 �� ���� ��ü�� ��� 1�� ��ȯ�ϰ�, �� �Ʒ� ��ü�� 2�� ��ȯ�ϴ� ����.


*/

import java.util.Stack;

public class Test149
{
	public static void main(String[] args)
	{
		// Stack �ڷᱸ�� ����
		Stack<Object> myStack = new Stack<Object>();

		String str1 = "������";
		String str2 = "�ڳ���";
		String str3 = "�̻���";
		String str4 = "������";

		// myStack �̶�� Stack �ڷᱸ�� �ȿ� str1 ~ str4 ���� ��Ƴ���
		myStack.add(str1);
		myStack.add(str2);
		myStack.add(str3);
		myStack.add(str4);

		// ��peek()�� : ���� �� ���� ��ü ��ȯ. �������� �ʴ´�.
		String val = (String)myStack.peek(); // ������ ����ȯ
        //                   --------------
        //                     Object
        //            ---------------------
        //                 String
		System.out.println("val : " + val);
		//--==>> val : ������

		val = (String)myStack.peek();
		System.out.println("val : " + val);
		//--==>> val : ������

		val = (String)myStack.peek();
		System.out.println("val : " + val);
		//--==>> val : ������

		System.out.println(); // ����

		// myStack �̶�� �̸��� ���� Stack �ڷᱸ����
		// �����Ͱ� ������� ���� ��Ȳ�̶��... (ä���� �ִ� ���¶��...)
		while (!myStack.isEmpty())
		{
			// ��pop�� : ���� �� ���� ��ü ��ȯ. �����Ѵ�.
			val = (String)myStack.pop();
			System.out.println("val : " + val);
		}
		//--==>> 
		/*
		val : ������
		val : �̻���
		val : �ڳ���
		val : ������
		*/


	}
}