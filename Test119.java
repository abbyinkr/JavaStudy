/*==================================
      ���� Ŭ���� ���� ����
      - ��ø Ŭ����
==================================*/

// �ܺ� Ŭ����(outer)
class InnerOuterTest
{
	static int a = 10;
	int b = 20;
	
	// ���� Ŭ����(inner)
	class InnerNested
	{
		int c = 30;

		// �� inner�� write() �޼ҵ�
		void write()
		{
			System.out.println("inner�� write()...");
			System.out.println("a : " + a);
			System.out.println("b : " + b);
			System.out.println("c : " + c);	
		}
	}

	// �� outer�� write() �޼ҵ�
	void write()
	{
		System.out.println("outer�� write()...");

		// ���� Ŭ������ �ν��Ͻ� ����
		InnerNested ob1 = new InnerNested();

		// inner �� write() �޼ҵ� ȣ��
		ob1.write();
	}
	
}


// main() �޼ҵ带 �����ϰ� �ִ� �ܺ��� �ٸ� Ŭ����
public class Test119
{
	
	public static void main(String[] args)
	{
		// �ܺ� Ŭ����(outer)�� �ν��Ͻ� ����
		InnerOuterTest ob2 = new InnerOuterTest();
	
		// outer�� write() �޼ҵ� ȣ��
		ob2.write();
		//--==>>
		//		outer�� write()...
		//		inner�� write()...
		//		a : 10
		//		b : 20
		//		c : 30
		
		//InnerNested ob3 =new InnerNested();
		//--==>> ���� �߻�(������ ����)

		//InnerOuterTest.InnerNested ob4 = new InnerOuterTest.InnerNested();
		//--==>> ���� �߻�(������ ����) �̰� static ���� Ŭ���� �ν��Ͻ������Ҷ�


		// �� ��ø ���� Ŭ����(static ���� Ŭ����)�ʹ� �޸�
		//	  �ܺ� Ŭ������ �ν��Ͻ�(��ü)�� ������� �ʰ�
		//	  �ܵ����� ���� Ŭ������ �ν��Ͻ��� �����ϴ� ����
		//	  �Ұ����ϴ�.


		// �� Test117.java �� ���� ��~!!!!

		InnerOuterTest.InnerNested ob5 = ob2.new InnerNested();
		ob5.write();
		//--==>> 
		/*
		inner�� write()...
		a : 10
		b : 20
		c : 30
		*/

		InnerOuterTest.InnerNested ob6 = new InnerOuterTest().new InnerNested();
		ob6.write();

		//--==>>
		/*
		inner�� write()...
		a : 10
		b : 20
		c : 30
		*/
 
	}
}
