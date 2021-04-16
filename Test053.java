/*=======================================
 ���� ���� �帧�� ��Ʈ��(���) ����
 - �ݺ��� (while��) �ǽ�
=======================================*/

// �� ����
// ����ڷκ��� ���ϴ� ��(������)�� �Է¹޾�
// �ش��ϴ� �������� ����ϴ� ���α׷��� �����Ѵ�.
// ��, 1�� ~ 9�� ������ ���� �Է¹��� ��Ȳ�� �ƴ϶��
// ���α׷��� �����ع��� �� �ֵ��� ó���Ѵ�. --> return �̿�

// ���� ��)
// ���ϴ� ��(������) �Է� : 8
// 8 * 1 = 8
// 8 * 2 = 16
//   :
// 8 * 9 = 72
// ����Ϸ��� �ƹ� Ű��...

// ���ϴ� ��(������) �Է� : 11
// 1���� 9������ ������ �Է� �����մϴ�.

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Test053
{
	public static void main(String[] args) throws IOException
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		// �ֿ� ���� ����
		int n, num;		// ���� ���� n, ����� �Է� ���� num
		n = 1;
		
		System.out.print("���ϴ� ��(������) �Է� : ");
		num = Integer.parseInt(br.readLine());

		if (num<=9)
		{
			while (n<=9)
			{
;
				System.out.printf("%d * %d = %d\n", num, n, (num*n));

				n++;
			}
		}
		else
			System.out.println("1���� 9������ ������ �Է� �����մϴ�.");
			return;
		
	}
}

/* [���� ���] 
���ϴ� ��(������) �Է� : 3
3 * 1 = 3
3 * 2 = 6
3 * 3 = 9
3 * 4 = 12
3 * 5 = 15
3 * 6 = 18
3 * 7 = 21
3 * 8 = 24
3 * 9 = 27
����Ϸ��� �ƹ� Ű�� �����ʽÿ� . . .

���ϴ� ��(������) �Է� : 11
1���� 9������ ������ �Է� �����մϴ�.
����Ϸ��� �ƹ� Ű�� �����ʽÿ� . . .


*/