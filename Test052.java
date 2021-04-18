/*=======================================
 ���� ���� �帧�� ��Ʈ��(���) ����
 - �ݺ��� (while��) �ǽ�
=======================================*/
// �� ����
// ����ڷκ��� ������ ������ �Է¹޾�
// 1���� �� �� ������ ��ü �հ�, ¦���� �հ�, Ȧ���� ���� 
// ���� ��������� ����ϴ� ���α׷��� �����Ѵ�.

// ���� ��)
// ������ ���� �Է� : 284
// >> 1 ~ 284 ���� ������ �� : xxx
// >> 1 ~ 284 ���� ¦���� �� : xxx
// >> 1 ~ 284 ���� Ȧ���� �� : xxx
// ����Ϸ��� �ƹ� Ű��...

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Test052
{
	public static void main(String[] args) throws IOException
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		// �ֿ� ���� ����
		int n=1;		// 1�� ������ ����,
		int num;		//  ����� �Է°� ���� ����
		int sum, even, odd;
		sum=even=odd=0;	// ������

		System.out.print(" ������ ���� �Է� : ");
		num = Integer.parseInt(br.readLine());
	
		while (n<=num)
		{
			sum += n;
			if (n%2==0)			// ¦�� ������
				even += n;
			else				// Ȧ�� ������
				odd += n;
			n++;
		}

		System.out.printf(" >> 1 ~ %d ���� ������ �� : %d\n", num, sum);
		System.out.printf(" >> 1 ~ %d ���� ¦���� �� : %d\n", num, even);
        System.out.printf(" >> 1 ~ %d ���� Ȧ���� �� : %d\n", num, odd);
	}
}

/* [���� ���]
 ������ ���� �Է� : 10
 >> 1 ~ 10 ���� ������ �� : 55
 >> 1 ~ 10 ���� ¦���� �� : 30
 >> 1 ~ 10 ���� Ȧ���� �� : 25
����Ϸ��� �ƹ� Ű�� �����ʽÿ� . . .
*/