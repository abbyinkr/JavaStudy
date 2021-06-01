/*==========================================
   ���� �ڹ��� �ֿ�(�߿�) Ŭ���� ����
   - Random Ŭ���� 
==========================================*/

/*
�� java.util.Random Ŭ������ 

   ���� ������ ������ �߻����� �����ϴ� Ŭ�����̴�.
   Math Ŭ������ ���� �޼ҵ��� random() �޼ҵ嵵 ������ �����ϴ� �޼ҵ�����
   0.0 ~ 1.0 ������ �Ǽ� ���¸� �߻��ϰ� �ǹǷ�
   �ʿ��� ���� ������ ������ ������ ���ؼ��� �߰����� ������� �����ؾ� �Ѵ�.
   �׷��� �ڹٴ� ���� ������ ������ �߻������ִ� 
   ���� Ŭ������ Random Ŭ������ ������ �����ϰ� �ִ�.

*/

// �ζ� ��ȣ ������ (���� �߻� ���α׷�)

// ���α׷��� ����Ǹ� �⺻������ �ζǸ� 5���� �����ϴ� ���α׷��� �����Ѵ�.

// ���� ��)
// 1 3 4 17 23 44
//11 2 8 16 28 42
//    : 
// ����Ϸ��� �ƹ� Ű��...

import java.util.Random;
import java.util.Arrays;

class Lotto
{
	/*
	private int[] arr = new int[6];
	int w = 1;
	*/

	// [������ Ǯ��]
	// �迭 ���� ���� �� �޸� �Ҵ� �� �ζ� ��ȣ�� ��Ƶ� �迭�� 6��
	private int[] num = new int[6];

	// getter 
	public int[] getNum()
	{
		return num;
	}

	// 6���� ������ �߻���Ű�� �޼ҵ� ����
	public void start()
	{
		int cnt = 0;
		Random rd = new Random();
		int n;
		

		//continue label
		jump:
		while (cnt<6)  // cnt �� 0 1 2 3 4 5
		{
			n = rd.nextInt(45)+1; // 1 ~ 45  �� 27 3 14
			for (int i = 0; i<cnt; i++)
			{
				// Ȯ�� (�׽�Ʈ)
				//System.out.println("i : " + i + ", cnt : " + cnt);
				if (num[i]== n)	// ���� �߻��� n�� �������̶� �ߺ��̶��
					continue jump;	// jump label�� ����!
					
			}

			num[cnt++] = n;  // num[0] 27 num[1] 3 num[2] 14 .. num[5] 30

		}
		
		// ���� �޼ҵ� ȣ��
		sorting();
		
	}// end start()

	// ���� �޼ҵ� ����
	private void sorting()
	{
		Arrays.sort(num);
	}
	
	/*
	public void cal()
	{
		Random rd = new Random();

		// �迭 �� �ʱ�ȭ 
		for (int i=0; i<6; i++)
		{	
			arr[i] = rd.nextInt(45)+1; // 1 ~ 45	// ��¥��¥ �������� int�� �켱 ��ƵѰ�..

			for (int j=0; j<i; j++)   // i: 2 j: 1 �϶� ���� ������ arr[i] ���ʱ�ȭ
			{
				if (arr[i]==arr[j])
					arr[i] = rd.nextInt(45)+1;
			}
		}

		// �迭 ���
		for (int n : arr)
		{
			System.out.printf("%3d", n);
			if (w%6==0)
				System.out.println();
			w++;	
		}
	}
	*/


}

public class Test141
{
	public static void main(String[] args)
	{
		Lotto lotto = new Lotto();
		
		for (int i=1; i<=5; i++)
		{

			//lotto.cal();
			
			// Ȯ��(�׽�Ʈ)
			//lotto.start();

			 ��� ���
			for (int n : lotto.getNum())
				System.out.printf("%4d", n);
			System.out.println();
		}
	}
}

/* [���� ���]
  10  14  24  30  39  44
   5   6   7  13  25  32
   4  12  19  37  40  45
   2   3   5  10  23  43
   7  12  18  23  36  40
����Ϸ��� �ƹ� Ű�� �����ʽÿ� . . .
*/