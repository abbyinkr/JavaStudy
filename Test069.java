/*============================================
   ���� ���������� �������� ����
   - ���������� �ʱ�ȭ �׽�Ʈ
============================================*/

// Test068.java�� ��~!!!

public class Test069
{
	// ���� ���� ���� : class �ȿ��� ����
	int a;
	//-- ���� ������ ����ϴ� �������� �ʱ�ȭ�� �������� �ʾ��� ���
	//   �ڵ����� 0���� �ʱ�ȭ ����

	boolean b;

	char c;

	double d;

	String s;

	public static void main(String[] args)
	{
		// Test069 �ν��Ͻ� ����
		Test069 ob = new Test069();

		System.out.println("ob.a : " + ob.a);
		//--==>> ob.a : 0

		System.out.println("ob.b : " + ob.b);
		//--==>> ob.b : false

		System.out.println("ob.c : " + ob.c);
		//--==>> ob.c : 
		System.out.println("ob.d : " + ob.d);
		//--==>> ob.d : 0.0

		// �ٸ� ������Ÿ�Ե� Ȯ���غ���

		System.out.println("ob.s : " + ob.s);
		//--==>> ob.s : null

	}
}