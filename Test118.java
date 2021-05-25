/*==================================
      ���� Ŭ���� ��� ����
      - ��ø Ŭ����
==================================*/

// �ܺ� Ŭ����
class Test
{
	static int a = 10;		// �������� ������� static ����(Ŭ��������)
	int b = 20;				// �������� ������� instance ����(�ν��Ͻ� ����)

	// �� ù��° write() �޼ҵ�
	void write()
	{
		System.out.println("write()...��");

		final int c = 30;	// �������� ���ȭ�� ����(���� ������ �ʴ� ����)
		int d = 40;			// �������� ���� ���÷� ���� �� �ִ� ����

		// ���� Ŭ����
		// �޼ҵ� �ȿ� �����ϴ� �Ǵٸ� Ŭ����(local class)
		class LocalTest
		{
			// �� �� ��° write() �޼ҵ�
			void write()
			{
				System.out.println("Write()...��");

				System.out.println("a : " + a);
				System.out.println("b : " + b);
				System.out.println("c : " + c);	  // c�� ������ �ʴ� ���
				//System.out.println("d : " + d); d���� Ȯ���� �� ���� ����. �ڿ��� ��� �ٲ� �� ����.
			}
		}

		// c = 20;
		d = 30;

		// ù ��° write() �޼ҵ忡�� ������ ���� Ŭ������ �ν��Ͻ�
		LocalTest ob1 = new LocalTest();

		// d = 10;

		// �� ��° write() �޼ҵ� ȣ��
		ob1.write();
	}
}

// main() �޼ҵ带 �����ϰ� �ִ� �ܺ��� �ٸ� Ŭ����
public class Test118
{
	public static void main(String[] args)
	{
		// �ܺ� Ŭ������ ���� �ν��Ͻ� ����
		Test ob2 = new Test();

		// ù ��° write() �޼ҵ� ȣ��
		ob2.write();

	}
}

/* [���� ���]
write()...��
Write()...��
a : 10
b : 20
c : 30
����Ϸ��� �ƹ� Ű�� �����ʽÿ� . . .
*/