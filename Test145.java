/*==========================================
     ���� ����(Exception) ó�� ���� 
==========================================*/

// Test146.java ���ϰ� ��~!!!

class Demo1
{
	// �Ʒ� ������ �����α�
	// �ֿ� �Ӽ� ����
	private int value;	// 0���� �⺻������ �ʱ�ȭ������ �׷��� �����

	// setter (���� �־���)
	public void setValue(int value)
	{
		if(value<=0)
			return;		//-- ���� �� �޼ҵ� ����

		this.value = value;
	}

	// getter (���� ������)
	public int getValue()
	{
		return value;
	}
}


public class Test145
{
	public static void main(String[] args)
	{
		Demo1 ob = new Demo1();
		ob.setValue(-10);
		int result = ob.getValue();
		System.out.println(result);
	}
}