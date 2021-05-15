/*===================================
    ���� ������(Operator) ����
 - ��Ʈ ���� ������
===================================*/

// ��Ʈ shift ������

public class Test026 
{
	public static void main(String[] args)
	{
		int x=128;
		// 128			 �� 00000000 00000000 00000000 10000000

		// 128<<3		 �� 00000000 00000000 00000100 00000000

		
		// 128			 �� 00000000 00000000 00000000 10000000

		// 128>>3		 �� 00000000 00000000 00000100 00010000

		System.out.printf("x << 3 = %d\n", (x<<3));
		System.out.printf("x * 8 = %d\n", (x*8));

		System.out.printf("x >> 3 = %d\n", (x>>3));
		System.out.printf("x / 8 = %d\n", (x/8));

		//x << 3 = 1024
		//x * 8 = 1024
		//x >> 3 = 16
		//x / 8 = 16

		System.out.printf(" x << 24 = %d\n", (x<<24));

		// 10000000 00000000 00000000 00000000
		//--==>> x << 24 = -2147483648
	
		System.out.printf(" x << 25 = %d\n", (x<<25));
		// 1	00000000 00000000 00000000 00000000
		//--==>> x << 25 = 0

		System.out.printf(" x << 26 = %d\n", (x<<26));
		System.out.printf(" x << 31 = %d\n", (x<<31));

		System.out.printf(" x << 32 = %d\n", (x<<32));
		System.out.printf(" x << 33 = %d\n", (x<<33));
		System.out.printf(" x << 34 = %d\n", (x<<34));
		System.out.printf(" x << 35 = %d\n", (x<<35));
	}
}

/*
x << 3 = 1024
x * 8 = 1024
x >> 3 = 16
x / 8 = 16
 x << 24 = -2147483648
 x << 25 = 0
 x << 26 = 0
 x << 31 = 0
 x << 32 = 128
 x << 33 = 256
 x << 34 = 512
 x << 35 = 1024
����Ϸ��� �ƹ� Ű�� �����ʽÿ� . . .
*/