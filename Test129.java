/*=============================================
     ���� �ڹ��� �ֿ�(�߿�) Ŭ���� ����
	 - Wrapper Ŭ����
=============================================*/

public class Test129
{
	public static void main(String[] args)
	{
		byte b = 3;
		int i = 256;

		Byte b2 = new Byte(b);			//--boxing
		Integer i2 = new Integer(i);	//--boxing

		//System.out.println(b2);			//--==>> 3
		//System.out.println(i2);			//--==>> 256

		// ���� Ǯ�� 
		//Object obj = b2;		// �ڵ� ��ĳ����(����ȯ)�ǹǷ�
		//Object obj2 = i2;		// �� �κ� �Ƚ��൵ ��!!!

		print(b2);
		print(i2);
	}
	
	// �Ű������� �� �ֵ�..�� ���� ����������
	/*
	static void print(Object obj)
	{

		System.out.println(obj);
	}
	*/
	
	// [������ Ǯ��]

	// Object : ��ü�̱⸸ �ϸ� �� �� �� �������� �������� ��Ȯ����, �����ؾ���
	// Number
	// �� java.lang.Number Ŭ����(�߻� Ŭ����)��
	//    ��� Wrapper Ŭ�������� �θ� Ŭ����(���� Ŭ����, ����Ŭ����)�̴�.
	//    b2, i2 �ڷ����� Number n�� �Ѿ���鼭
	//    �� ĳ������ �Ͼ�� �ȴ�.       (Auto-Boxing ����)
	static void print(Number n)
	{
		System.out.println(n);
	}

	// [�ڵ� ��ĳ���� ����]
	/*
	void set(int n)
	{
	}

	byte b = 5;
    set(b); <- byteŸ���� �ڵ����� int�� �ٲ��� ��
	
	1. ������ü ���� �Ǿ�����
	2. ���� = ���� ->  ��ĳ���� ���������� �̷���� �̷��� �����ϸ� �ȴ�

	*/

}