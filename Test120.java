/*==================================
      ���� Ŭ���� ��� ����
      - ��ø Ŭ����
==================================*/

/*
�� Annonymous Ŭ����(�͸��� Ŭ����, ���� Ŭ����)

   - AWT �� �ȵ���̵� �̺�Ʈ ó������ �Ϲ������� ���
   - ���� Ŭ���� �޼ҵ带 �ϳ� ���� �������� �ʿ伺�� ���� �� ���
   - Ŭ������ ��ü�� �ʿ��ϸ� �� �ٽ� Ŭ������ �����ؾ� �ϴ� 
     ���ŷο� ������ �͸��� Ŭ������ �����Ͽ� ó���Ѵ�.

�� ���� �� ����

   new ����Ŭ������ ������()
   {
		�������������� �ڷ��� �޼ҵ�()
		{
			// ...;
		}
   };    // �� �ݵ�� �����ݷ� �ʿ���~!!!

*/

// ��� Ŭ������ �Ʒ��� import ������ ����ִ�.
// import java.lang.*;

// �ܺ� Ŭ����
class Test //extends Object
{
	/*
	...
	.... Object Ŭ���� ���
	....
	...
	*/
	public Object getString()
	{
		// �͸��� Ŭ����
		return new Object()
		{
			@Override
			public String toString()
			{
				return "�͸��� Ŭ����...";
			}
		};	// �� �����ݷ�(�� �ۼ� �� ���� �߻�)
	}
}

// main()�޼ҵ带 �����ϴ� �ܺ��� �ٸ� Ŭ����
public class Test120
{
	public static void main(String[] args)
	{
		Test ob1 = new Test();
		Test ob2 = new Test();

		System.out.println(ob1.toString());
		//--==>> Test@15db9742

		System.out.println(ob1.getString());
		//--==>> �͸��� Ŭ����...
		
	}
}