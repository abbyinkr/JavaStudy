/*=======================================
 ���� ���� �帧�� ��Ʈ��(���) ����
 - �ݺ��� (while��) �ǽ�
=======================================*/

// ����ڷκ��� ������ �� ������ �Է¹޾�
// ���� �� ���� ū �� ������ ���� ���Ͽ�
// ����� ����ϴ� ���α׷��� �����Ѵ�.

// ���� ��)
// ù ��° ���� �Է� : 10
// �� ���� ���� �Է� : 10
// >> 10 ~ 20 ������ �� : xxxx
// ����Ϸ��� �ƹ� Ű��...

// ù ��° ���� �Է� : 10
// �� ��° ���� �Է� : 2
// 2 ~ 10������ �� : xxx

// ù ��° ���� �Է� : 10
// �� ��° ���� �Է� : 10
// 10 ~ 10������ �� : 10

// ����Ϸ��� �ƹ� Ű��...

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Test051
{
	public static void main(String[] args) throws IOException
	{

		// ���� Ǭ ��� 
		/*
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		 int n1, n2; // 1, 6
		// ����ڿ��� �Է� �ȳ� �޼��� ��� �� �Էµ� �� ���� �� ����
		System.out.print("ù ��° ���� �Է� : ");
		n1 = Integer.parseInt(br.readLine());
		System.out.print("�� ��° ���� �Է� : ");
		n2 = Integer.parseInt(br.readLine());

		if (n1>n2)
		{
			n1=n1^n2; n2=n2^n1; n1=n1^n2;		// n1>n2 �ϰ�� �� �¹ٲٱ�
		}

		int c = n1;		// �� ó�� �Էµ� n1 �� ���

		int sum = n1;	// sum = 1              
		
		// �ݺ��� ���� 
		while (n1<n2)	// 1 < 6        2<6
		{	
			n1++;		// 2			3
			sum+= n1;	// 1 += 2      (1+2)+=3
		}

		sum += n2;
		System.out.printf(" >> %d ~ %d ������ �� : %d\n", c, n2, sum);

		if (n1==n2)
		{
			System.out.printf(" >> %d ~ %d ������ �� : %d\n", n1, n2, n1);
		}
		*/

		//  ���� Ǭ ���

		// �� �ֿ� ���� ����
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int n, su1, su2, result=0;
		//-- ��������, ù ��° �Է°�, �� ��° �Է°�, �����(������ ���� ���)

		// �� ���� �� ó��
		//	 ������ڿ��� �ȳ� �޼��� ��� �� �Է°� ��Ƴ���
		System.out.print("ù ��° ���� �Է� : ");
		su1 = Integer.parseInt(br.readLine());
			System.out.print("�� ��° ���� �Է� : ");
		su2 = Integer.parseInt(br.readLine());

		//	 �� ������ ���꿡 ���� �ռ�
		//		�Է¹��� �� ���� ũ�� �� �� �ڸ� �ٲ�
		//		��, su1 �� su2 ���� Ŭ ��� �� ���� �ڸ��� �ٲ� �� �ֵ��� ó��
		if (su1>su2)
		{
			// �� ���� �ڸ� �ٲ�
			su1=su1^su2; su2=su2^su1; su1=su1^su2;
		}

		n = su1; // �ڡ�

		while (n<=su2)     // 1 6
		{
			result += n;
			n++;
		}

		// �� ��� ���

		System.out.printf(" >> %d ~ %d ������ �� : %d\n", su1, su2, result);
		
	}
}


/*
ù ��° ���� �Է� : 1
�� ��° ���� �Է� : 100
 >> 1 ~ 100 ������ �� : 5050
����Ϸ��� �ƹ� Ű�� �����ʽÿ� . . .

ù ��° ���� �Է� : 10
�� ��° ���� �Է� : 10
 >> 10 ~ 10 ������ �� : 10
����Ϸ��� �ƹ� Ű�� �����ʽÿ� . . .

ù ��° ���� �Է� : 20
�� ��° ���� �Է� : 10
 >> 10 ~ 20 ������ �� : 165
����Ϸ��� �ƹ� Ű�� �����ʽÿ� . . .


*/