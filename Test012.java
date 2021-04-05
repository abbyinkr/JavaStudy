/*=====================================================
        ���� �ڹ� �⺻ ���α׷��� ����
 - ������ �ڷ���
 - �ڹ��� �⺻ ����� : BufferedReader Ŭ����
=====================================================*/

// ����ڷκ��� �������� ������ �������·� �Է¹޾�
// �� �Է¹��� �������� ����
// ���� ���̿� �ѷ��� ���ϴ� ���α׷��� �����Ѵ�.

// ���� ��)
// ���� ������ �Է� : 120
// ���� : xxxx.xx
// �ѷ� : xxxx.xx
// ����Ϸ��� �ƹ� Ű�� ��������...

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Test012
{
	public static void main(String[] args) throws IOException
	{
		// BufferedReader Ŭ���� �ν��Ͻ� ����
		// ��ǻ�� ��ü�� Ű���� ���� �� ���� �Է�
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		// �ֿ� ���� ����
		int r;           //-- ������
		double a, b;     //--����, �ѷ�

		// ���� �� ó��
		// �� ����ڿ��� �ȳ� �޼��� ���
		//System.out.println("���� ������ �Է� : ");
		System.out.print("���� ������ �Է� : ");
		
		// �� ����ڰ� �Է��� ��(���ڿ�)�� �� br.readLine()
		//    ������(������)���� ��ȯ��   �� Integer.parseInt()
		//    ������ ���� r �� ��Ƴ���
		r = Integer.parseInt(br.readLine());
		// r = Integer.parseInt("50");
		// r = 50;

		// �� ���� �� �ѷ� ����
		//    ���� ���� = ������ * ������ * 3.141592
		//    ���� �ѷ� = ������ * 2 * 3.141592
		a = r * r * 3.141592;
		b = r * 2 * 3.141592;

		// ��� ���
		//System.out.println(">> ���� : " + a);
		//System.out.println(">> �ѷ� : " + b);
		System.out.printf(">> ���� : %.2f\n", a);
		System.out.printf(">> �ѷ� : %.2f\n", b);
		//-- ��%f�� 10���� �Ǽ����� ��Ƴ��� �ɼǹ���
		//    ��%.2f���� �Ҽ��� ���� ��°�ڸ����� ǥ���ϰڴٴ� �ǹ��� �߰� �ɼ�

		}
}

/* [���� ���]
���� ������ �Է� : 20
>> ���� : 1256.64
>> �ѷ� : 125.66
����Ϸ��� �ƹ� Ű�� �����ʽÿ� . . .

*/