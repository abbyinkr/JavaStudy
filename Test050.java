/*=======================================
 ���� ���� �帧�� ��Ʈ��(���) ����
 - �ݺ��� (while��) �ǽ�
=======================================*/

// ����ڷκ��� ������ ������ �Է¹޾�
// �Է¹��� ������... �Ҽ����� �ƴ����� �Ǻ��Ͽ�
// ����� ����ϴ� ���α׷��� �����Ѵ�.

// ���� ��)
// ������ ���� �Է� : 10
// 10 �� �Ҽ� �ƴ�
// ��� �Ϸ��� �ƹ� Ű��

// ������ ���� �Է� : 11
// 11 �� �Ҽ�
// ����Ϸ��� �ƹ� Ű��..

// �� �Ҽ� : 1 �Ǵ� �ڱ� �ڽ��� �� �̿��� � ���ε� ���� �� ���� ��.
//			 ��, 1�� �Ҽ� �ƴ�.

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Test050
{
	public static void main(String[] args) throws IOException
	{
	
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int n; //�Էµ� ���� ���� ����
		int i=2; // 1�� ������ ����
		boolean flag = true;	// true : �Ҽ�~!!!
		
		//String result="�Ҽ�";	// �Ǻ������ ���� ����

		// ����ڿ��� �Է¾ȳ� �޽��� ��� �� �Է��� �� ���
		System.out.print("������ ���� �Է� : ");
		
		n= Integer.parseInt(br.readLine()); // 5

		
		while (i<n)
		{
			if (n%i==0)
			{
				flag = false;
				break;
			}
			i++;
		}


		if (flag && n!=1)
			System.out.printf("%d �� �Ҽ�~!!!\n", n);
		else
			System.out.printf("%d �� �Ҽ� �ƴ�~!!!\n", n);

		/*
		// �Բ� Ǭ ����

		// �� �ֿ� ���� ����

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int num;		//-- ����ڰ� �Է��ϴ� ������ ������ ��Ƶ� ����

		// �� ���� �� ó��
		System.out.print("������ ���� �Է� : ");
		num = Integer.parseInt(br.readLine());	// 50

		int n=2;		//-- ������� �Է°��� �������
						//	 ������ ������ ������ ����(1�� ���� ����);
		// 2 3 4 ... 49

		//String temp = "�Ҽ���~!!!";
		boolean flag = true;		//--�Ҽ���~!!!
		
		while (n<num)
		{
			if (num%n==0)		//string���� �ϸ� t/f �Ǻ� �Ұ�!!!
			{
				flag =false;		//--�Ҽ� �ƴϴ�~!!!
				//System.out.println(n);
				break;				//--while�� Ż��~!!
			}

			n++;
		}
		
		// �� ��� ���
		if (flag && num!=1)
		{
			System.out.printf("%d ��Ҽ�~!!!\n", num);
		}
		else
		{
			System.out.printf("%d ��Ҽ� �ƴ�~!!!\n", num);
		}

		*/
	}
}
	



/* [���� ���]

������ ���� �Է� : 3
3 ��Ҽ�~!!!
����Ϸ��� �ƹ� Ű�� �����ʽÿ� . . .
*/