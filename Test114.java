/*==================================
   ���� Ŭ���� ��� ����
   - �������̽�(Interface)
==================================*/

// �������̽�
interface Demo
{
	public void write();
	public void print();
}

// Ŭ����
//class DemoImpl
//  ��
// �������̽��� �����ϴ� �߻� Ŭ����
abstract class DemoImpl implements Demo
{
	@Override
	public void write()
	{
		System.out.println("write() �޼ҵ� ������...");
	}

	// public void print();
}


// Ŭ����
//class DemoImpSub
//   ��
// �߻� Ŭ������ ��ӹ��� �߻� Ŭ����
//abstract class DemoImpSub extends DemoImpl
//   ��
// �߻�Ŭ������ ��ӹ��� Ŭ����
class DemoImplSub extends DemoImpl
{
	@Override
	public void print()
	{
		System.out.println("print() �޼��� ������...");
	}
}


// main()�޼ҵ带 �����ϰ� �ִ� �ܺ��� �ٸ� Ŭ����
public class Test114
{
	public static void main(String[] args)
	{
		//Demo ob1 = new Demo();		   //-- �������̽� �� �ν��Ͻ� ���� �Ұ�
		//DemoImpl ob2 = new DemoImpl(); //-- �߻� Ŭ���� �� �ν��Ͻ� ���� �Ұ�
		DemoImplSub ob3 = new DemoImplSub();

		ob3.write();
		ob3.print();
		//--==>> write() �޼ҵ� ������...
		//		 print() �޼��� ������...
	}
}