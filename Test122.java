/*=============================================
     ���� �ڹ��� �ֿ�(�߿�) Ŭ���� ����
	 - Object Ŭ����
=============================================*/

// �� Test121.java �� ��~!!!

// import.java.lang.*;

public class Test122 // extends Object
{
	/*
	Object ����� ���
	*/
	
	// object Ŭ�����κ��� �������� toString() �޼ҵ� ������
	@Override
	public String toString()
	{
		//return Ŭ������@�ؽ��ڵ�;
		//       ------------------ String

		return "�������� toString()...";
	}

	public static void main(String[] args)
	{
		Test122 ob = new Test122();
		
		System.out.println("ob.toString : " + ob.toString());
		//--==>> ob.toString : Test122@15db9742

		System.out.println("ob          : " + ob);
		//--==>> ob          : Test122@15db9742

		// �޼ҵ� ������ ��...
		//--==>>
		/*
		ob.toString : �������� toString()...
		ob          : �������� toString()...
		����Ϸ��� �ƹ� Ű�� �����ʽÿ� . . .
		*/


	}
}