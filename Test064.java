/*================================================
 ���� ���� �帧�� ��Ʈ��(���) ����
 - break;
   �� ���߰� + ���� ����� �ݺ��� Ż��
================================================*/

// ������ ���� ó���� �̷������ ���α׷��� �����Ѵ�.
// ��, �Է¹޴� ������ 1 ~ 1000 ���� �ȿ�����
// �����ϵ��� �ۼ��Ѵ�.

// ���� ��)
// ������ ���� �Է�(1~1000) : -10
// ������ ���� �Է�(1~1000) : 0
// ������ ���� �Է�(1~1000) : 2021
// ������ ���� �Է�(1~1000) : 10
// >> 1 ~ 10 ������ ��: 55
// ����Ͻðڽ��ϱ�(Y/N)? : y		(�ҹ���)

// ������ ���� �Է�(1~1000) : 100
// >> 1 ~ 10 ������ ��: 5050
// ����Ͻðڽ��ϱ�(Y/N)? : N		(�빮��)
// ����Ϸ��� �ƹ� Ű��...

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Test064
{
	public static void main(String[] args) throws IOException
	{
		/*
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int num;
		int sum=0;
		int answer;
		 
		do
		{
			System.out.print("������ ���� �Է�(1~1000) : ");
			num = Integer.parseInt(br.readLine());
		}
		while (num<1 || num>1000);

		for (int n=1; n<=num; n++)
		{
			sum += n;
		}

		System.out.printf("1 ~ %d ������ �� : %d\n", num, sum);

		do
		{
			System.out.print("����Ͻðڽ��ϱ�(Y/N)? : ");
			answer = System.in.read();
			// Y : 89, y: 121 / N: 78, n: 110
			if (answer==89 || answer==121)			// ����Ѵ�
			{
				
				do
				{
					System.out.print("������ ���� �Է�(1~1000) : ");
					num = Integer.parseInt(br.readLine());
				}
				while (num<1 || num>1000);

				for (int n=1; n<=num; n++)
				{
					sum += n;
				}


			}
			else if (answer==78 || answer==110)
			{
				return;
			}
		}
		while (answer!=89 || answer!=121 || answer!=78 || answer!= 110);

		*/
		
		// �Բ� Ǭ ����
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		//int n, s=0, i;					//--����� �Է°�, ������, ��������
		int n, s, i;
		char ch;						//--��� ���� �Է°�
		
		while (true)					//--���� ����(�ݺ�)
		{
			do
			{
				System.out.print("������ ���� �Է�(1~1000) : ");
				n = Integer.parseInt(br.readLine()); //"\r\n" "200"
			}
			while (n<1 || n>1000);		// �ݺ��� ������ ����~ ���ǽ�=true�϶� �ݺ��ض�

			// �׽�Ʈ
			//System.out.println("�Է��� ���� : " + n);

			
			// �ʱ�ȭ ��ġ check~!! (����ڰ� ���������� �ݺ��ؾ��ϱ� ������ ������ ���� �� �ʱ�ȭ!)
			s = 0;

			for (i=1; i<=n; i++)
			{
				s += i;
			}

			// �׽�Ʈ
			//System.out.println("������ : " + s);
			System.out.printf("\n>> 1 ~ %d ������ �� : %d\n", n, s);

			
			System.out.print("����Ͻðڽ��ϱ�(Y/N)? : ");
			ch =(char)System.in.read();		// y + \r + \n
			// �׽�Ʈ
			//System.out.println("��ӿ��� : " + ch);

			// �Է°��� �ҹ��� y�� �ƴϴ�. �Է°��� �빮�� Y�� �ƴϴ�.
			// �� ch!='y'                  �� ch!='Y'

			// SCE
			if (ch!='y' && ch!='Y')
			{
				// �ݺ��� �� ��while(true)���� �������� �� �ִ� �ڵ� �ۼ� �ʿ�
				//-- ���� ���� �ǻ�ǥ���� �ߴٸ�
				//	 �׵��� �����ߴ� �ݺ����� ���߰� ���������� �Ѵ�.
				break;
				//-- �����. (+ �׸��� ����������.) check~!!!
			}

			// ���Ͱ�(\r\n) �߰� ó��
			System.in.skip(2);
			

		}//end while(true)
		
	}//end main()
}


/* [���� ���]
������ ���� �Է�(1~1000) : -1
������ ���� �Է�(1~1000) : 10000
������ ���� �Է�(1~1000) : 10

>> 1 ~ 10 ������ �� : 55
����Ͻðڽ��ϱ�(Y/N)? : y
������ ���� �Է�(1~1000) : 20

>> 1 ~ 20 ������ �� : 210
����Ͻðڽ��ϱ�(Y/N)? : n
����Ϸ��� �ƹ� Ű�� �����ʽÿ� . . .
*/