/*===================================
    ���� ������(Operator) ����
 - ���� ������ == ���� ������
===================================*/

// ����ڷκ��� ������ ������ �Է¹޾�
// �Է¹��� ������... �������� ������� �Ǻ��Ͽ�
// ����� ����ϴ� ���α׷��� �����Ѵ�.
// ��, �Է��� BufferedReader �� readLine() �� Ȱ���ϰ�
// ������ ���� �����ڸ� Ȱ���� �� �ֵ��� �Ѵ�.

// ���� ��)
// ������ ���� �Է� : 2000
// 2000�� �� ����
// ����Ϸ��� �ƹ� Ű��...

// ������ ���� �Է� : 2011
// 2011�� �� ���
// ����Ϸ��� �ƹ� Ű��...

// �� ������ �Ǻ� ����
//	  ������ 4�� ����̸鼭 100�� ����� �ƴϰų�
//	  �Ǵ�, 400�� ����̸� ����~!!
//	  �׷��� ������... ���~!!!

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Test029
{
	public static void main(String[] args) throws IOException
	{
		/* ���� Ǯ���� ����

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		// �ֿ� ���� ����
		int n;
		String strResult;

		// ���� �� ó��
		
		System.out.print("������ ���� �Է� : ");
		n = Integer.parseInt(br.readLine());
		strResult = n % 4 == 0 ? (n % 100 == 0 ? (n % 400 == 0 ? "����" : "���") : "����") : "���" ;   

		// ��� ���

		System.out.println();
		System.out.println(n + "�� �� " + strResult);

		*/
		
		// �Բ� Ǯ���� ���� 

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		// �� �ֿ� ���� ����
		int year;
		String strResult;

		// �� ���� �� ó��
		System.out.print("������ ���� �Է� : ");
		year = Integer.parseInt(br.readLine());
		strResult = (year%4==0 && year%100!=0 || year%400==0) ? "����" : "���";

		//int n;
		//n = ((year%4==0 && year%100!=0 || year%400==0) ? 100 : 0);

		System.out.println(n);

		//���� 2���� 2�� �̻��� ������ ������ ��������!
		// ���� �������� ��ø!

		// �� ��� ���
		System.out.printf("%d�� �� %s\n", year, strResult);		
	}
}

/* [���� ���]

������ ���� �Է� : 2000
2000�� �� ����
����Ϸ��� �ƹ� Ű�� �����ʽÿ� . . .

������ ���� �Է� : 2021
2021�� �� ���
����Ϸ��� �ƹ� Ű�� �����ʽÿ� . . .

*/ 