/*============================================
   ���� Ŭ������ �ν��Ͻ� ����
============================================*/

// �� �ǽ� ����
// ���� ���̿� �ѷ� ���ϱ�

// ���� ���̿� �ѷ��� ���� �� �ִ� Ŭ������ ����������(������) �����Ѵ�.
// (Ŭ������ : CircleTest) �� CircleTest.java


// ���� ���� = ������ * ������ * 3.141592
// ���� �ѷ� = ������ * 2 * 3.141592

// ���� ��)
// ������ �Է� : xx

// >> �������� xx �� ����
// >> ���� : xxx.xx
// >> �ѷ� : xxx.xx
// ����Ϸ��� �ƹ� Ű��...

// ���� ��ġ(��Ű��)�� �ֱ⶧���� import ���ص� �ȴ�. 

import java.io.IOException;

public class Test071
{
	public static void main(String[] args) throws IOException
	{
		/*
		// CircleTest �ν��Ͻ� ����
		CircleTest ct = new CircleTest();

		ct.input();					// �Է¸޼ҵ� ���� -> 
		double a = ct.calArea();    // ���̰�� �޼ҵ带 ���� ��ȯ�� ���� �� ������ ����
		double l = ct.calLength();  // �ѷ���� �޼ҵ带 ���� ��ȯ�� ���� �� ������ ����
		ct.print(a, l);
		*/	
		
		CircleTest ob = new CircleTest();
		ob.input();
		double area = ob.calArea();			// �޼ҵ� �����Ҷ� �� ���� �̸�(a,l)�� ����
		double length = ob.calLength();		// �ʾƵ� �ȴ�. �ڷ����� ���� ok~~!
		
		/*
		System.out.println("area : " + area);
		System.out.println("length : " + length);
		*/

		ob.print(area, length);
	}
}

/*
������ �Է� : 2

>> �������� 2�� ����
>> ���� : 12.57
>> �ѷ� : 12.57
����Ϸ��� �ƹ� Ű�� �����ʽÿ� . . .
*/