/*==================================
     ���� Ŭ���� ��� ����
	 - ���(Inheritance)
==================================*/

/*
�� �޼ҵ� �������̵�(Method Overriding)�� Ư¡

	- �޼ҵ� �̸�, ���� Ÿ��, �Ķ���� ���� Ÿ���� ������ ��ġ�ؾ� �ȴ�.
	- �ݵ�� ��Ӱ��谡 �־�� �Ѵ�.
	- �����ǵ� ���� Ŭ������ �޼ҵ��� �������������ڴ�
	  ���� Ŭ������ �޼ҵ� �������������ں��� ������ ũ�ų� ���ƾ� �Ѵ�.
	  ���� ���, ���� Ŭ���� �޼ҵ��� �������������ڰ� ��protected���� ���
	  ���� Ŭ������ �� �޼ҵ带 �������̵�(Overriding)�ϴ� ���
	  �������������ڴ� ��protected�� �Ǵ� ��public���̾�� �Ѵ�.
	- ��static��, ��final��, ��private�� �޼ҵ�� �������̵�(Overriding)�� �� ����. + ��final���� �����Ӿƴ϶� �޼ҵ忡�� �����ϴ�
	- Exception�� �߰��� �Ұ����ϴ�.
	  ��, ���� Ŭ������ �޼ҵ尡 ������ �ִ� ������ ���� ���׿�
	  ���ο� Exception �� �߰��ϴ� ���� �Ұ����ϴ�.
*/

// ���� Ŭ����, �θ� Ŭ����, super class
class SuperTest109
{
	private int a = 5;
	protected int b = 10;
	public int c = 20;

	public void write()
	{
		System.out.println("Super write() �޼ҵ� : " + a + " : " + b + " : " + c);
	}



}

// ���� Ŭ����, �ڽ� Ŭ����, sub class
class SubTest109 extends SuperTest109
{
	/*
	protected int b = 10;
	public int c = 20;

	public void write()
	{
		System.out.println("Super write() �޼ҵ� : " + a + " : " + b + " : " + c);
	}
	*/

	protected int b = 100;


	public void print()
	{
		//System.out.println("Sub print() �޼ҵ� : " + a + " : " + b + " : " + c);
		//--==>> ���� �߻�(������ ����)
		//-- ���� Ŭ����(SuperTest109)���� ����� ���� a ���� ������ �� ����.
		//	 �� private �����̱� ������...

		System.out.println("Sub print() �޼ҵ� : " + b + " : " + c);
		//--==>> Sub print() �޼ҵ� : 100 : 20

		System.out.println("Sub print() �޼ҵ� : " + super.b + " : " + c);
		//--==>> Sub print() �޼ҵ� : 10 : 20
		//-- ���� Ŭ����(SuperTest109)���� ����� ���� a ���� ������ �� ����.
		// ��super�� Ű���带 ����ϸ� �ȴ�.

		System.out.println("Sub print() �޼ҵ� : " + c);
		System.out.println("Sub print() �޼ҵ� : " + this.c);
		System.out.println("Sub print() �޼ҵ� : " + super.c);
		//--==>>
		/*
		Sub print() �޼ҵ� : 20
		Sub print() �޼ҵ� : 20
		Sub print() �޼ҵ� : 20
		*/

		//-- ���� Ŭ����(SuperTest109)���� ����� ���� c �� �����ϴ� ������
		//   �ƹ��� ����� ������ ����.
	}

	@Override
	public void write()
	{
		//System.out.println("Sub write() �޼ҵ� : " + a + " : " + b + " : " + c);
		//											  ===
		System.out.println("Sub write() �޼ҵ� : " + b + " : " + c);
	}



}//end Subclass


// main() �޼ҵ带 �����ϰ� �ִ� �ܺ��� �ٸ� Ŭ����
public class Test109
{
	
	public static void main(String[] args)
	{
		// ���� Ŭ����(SubTest109) �ν��Ͻ� ����
		SubTest109 ob = new SubTest109();

		ob.print();
		//--==>> Sub print() �޼ҵ� : 100 : 20
		ob.write();
		//--==>> Super write() �޼ҵ� : 5 : 10 : 20
		// �� wirte() �޼ҵ� �������̵� ��
		//--==>> Sub write() �޼ҵ� : 100 : 20
		//-- ���� Ŭ����(SuperTest109)���� ����� ���� a �� ������ �� ����.
		//	 �� private �����̱� ������...
		//	 ����, �� �� ������ ���� b�� �θ�κ��� �������� b�� �ƴ�
		//	 �ڽ��� ���� b �� ���� Ȯ���� �� �ִ�.

		//----------------------------------------------------------------------------------

		System.out.println("------------------------------------------------------���м�");

		((SuperTest109)ob).write();					// check~!!!
		//--==>> Sub write() �޼ҵ� : 100 : 20

		System.out.println(ob.b);
		//--==>> 100

		System.out.println(((SuperTest109)ob).b);	// check~!!!
		//--==>> 10
		//					================
		// �� ���� �θ�(�������� �ش�) ��
		// �ܺ�Ŭ�������� �θ�Ŭ������ ������ ���� ���� ��!

		// �� �޼ҵ�� ������ �� �����Ͽ� ������ �� ��~!!!

	}
}