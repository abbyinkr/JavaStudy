/*================================================
 ���� ���� �帧�� ��Ʈ��(���) ����
 - continue;
 	�� (�� �κ� �����ϰ�...) + ����ض�.
================================================*/

// ���� ��)
/*

1 : 1
3 : 4
5 : 9
7 : 16
  :
  :
99 : 2500
��� : 2500

*/

public class Test065
{
	public static void main(String[] args)
	{
		/*
		int n;
		int sum=0;
		
		for (n=1; n<=99; n++) 
		{
			if (n%2==0)
			continue;

			sum += n;
			System.out.printf("%2d : %4d\n", n, sum);

		}//end for��

		System.out.printf("��� : %d\n", sum);
		*/

		int n=0;
		int s=0;
		while (n<100)		// 0 ~ 99
		{
			n++;			// 100

			if (n%2==0)
				continue;	// (�޺κ� �����ϰ� +) ����ض�
			
			s+=n;									// �޺κ�
			System.out.println(n + " : " + s);		// �޺κ�
		}
		System.out.println("��� : " +s);
	
	
	}//end main
}// end class