/*==========================================
   ���� �ֹε�Ϲ�ȣ ��ȿ�� �˻� ����
==========================================*/

/*
�� �ֹι�ȣ ���� ����

	�� ������ �ڸ��� ������ ���ڸ� ���� ��Ģ�� �°� ���Ѵ�.

	123456-1234567 (�� �ֹι�ȣ)
	****** ******
	234567 892345  (�� �� �ڸ��� ������ ��)

	�� ��Ģ�� �°� ���� ������ ������ ����� ��� ���Ѵ�.

	ex) 7 6 0 6 1 5 - 1 8 6 2 1 3 3
	    * * * * * *   * * * * * *
		2 3 4 5 6 7   8 9 2 3 4 5
	----------------------------------
	�� 14 + 15 + 0 + 30 + 6 + 35 + 8 + 72 + 12 + 6 + 4 + 15

	   == 217

	�� ������ ������� 11�� ������ ������������ ���Ѵ�.
           19
		------
	 11| 217
	      11
		------
		 107
		  99
		------
		   8 �� ������

	�� 11���� �������� �� ������� ���Ѵ�.

		11 - 8 �� 3

	�߰�~

	�� �� ������ ��� 11�̳� 10�� ������ �Ǿ��� ���...
	��, �� �� ������ �������� 0�̳� 1�� ���...
	�ش� ���� 10���� ���� �������� ����.

	ex) 11 - 1 �� 10 �� 0 == �ֹι�ȣ ������ ���� 0
			 0 �� 11 �� 1 == �ֹι�ȣ ������ ���� 1



	�� �� ���� ó���� ���� ����� �ֹι�ȣ�� �����ϴ� ������ ���ڿ�
	   ��ġ�ϴ��� ���Ѵ�.

	   11 - 8 �� 3 == �ֹι�ȣ ������ ���� 3 

	�� ������ ���ڿ� ���� ��� ��ȿ�� �ֹι�ȣ~!!!

*/

// ���� ��)
// �ֹι�ȣ �Է�(xxxxxx-xxxxxxx) : 750615-1862133
// >> ��Ȯ�� �ֹι�ȣ~!!!
// ����Ϸ��� �ƹ� Ű��...

// �ֹι�ȣ �Է�(xxxxxxx-xxxxxx) : 750615-1234567
// >> �߸��� �ֹι�ȣ~!!!
// ����Ϸ��� �ƹ� Ű��...

// �ֹι�ȣ �Է�(xxxxxxx-xxxxxx) : 750615-18621		// �� �ڸ��� ������
// >> �Է� ����~!!!
// ����Ϸ��� �ƹ� Ű��...

// �迭.length �� �迭���� ����(ũ��, ����)

// �� ���ڿ�.length() �� ���ڿ��� ���� ��ȯ
//	  ���ڿ�.substring(n,m) �� n���� m-1���� ���ڿ� ����


//import java.util.Scanner;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;


public class Test101
{
	public static void main(String[] args) throws IOException
	{
		/* �׳� ���� �����ΰ�
		int[] a = {1,2,3,4,5,6};
		int[] b = {3,7,8,4,6,4};
		
		int c= a[1]*b[1];
		System.out.print(c);
		*/

		// �׽�Ʈ
		//String strTemp = "���ع�����λ��� ������⵵��";
		//System.out.println(strTemp.length());
		//--==>> 15

		// �׽�Ʈ
		//System.out.println("�������� �� �ҳ���".length());
		//--==>> 10

		// �׽�Ʈ
		//System.out.println("abcdefghijklmnopqrstuvwxyz".substring(3, 5));
		//--==>> de         01234  
		// substring(m, n) �� ���ڿ� �ε��� m��°���� n-1��°���� ����
		//					  �ε����� 0����...

		// �׽�Ʈ
		//System.out.println("abcdefghijklmnopqrstuvwxyz".substring(3, 24));
		//--==>> defghijklmnopqrstuvwx

		// �׽�Ʈ
		//System.out.println("abcdefghijklmnopqrstuvwxyz".substring(3, 25));
		//--==>> defghijklmnopqrstuvwxy

		// �׽�Ʈ
		//System.out.println("abcdefghijklmnopqrstuvwxyz".substring(3, 26));
		//--==>> defghijklmnopqrstuvwxyz
		// �׽�Ʈ
		//System.out.println("abcdefghijklmnopqrstuvwxyz".substring(3, 27));
		//--==>> ���� �߻�(��Ÿ�� ����)
		//		 java.lang.StringIndexOutOfBoundsException
		//System.out.println("abcdefghijklmnopqrstuvwxyz".length());
		//--==>> 26

		// �׽�Ʈ
		//System.out.println("���̿��������װڳ�".substring(4, 9));
		//System.out.println("�����װڳ�");
		//--==>> �����װڳ�
		// 		 �����װڳ�

		// �׽�Ʈ
		//System.out.println("������������".substring(3));
		//System.out.println("������������".substring(3, "������������".length()));
		//System.out.println("������������".substring(3,6));
		//System.out.println("������");
		//--==>> ������
		//		 ������
		// 		 ������
		// 	 	 ������

		//--------------------------------------------------------------------------

		/*
		// Scanner �ν��Ͻ� ����
		Scanner sc = new Scanner(System.in);

		// ����ڿ��� �ֹε�Ϲ�ȣ �Է� �ȳ��޼��� ��� �� ����
		System.out.print("�ֹι�ȣ �Է�(xxxxxx-xxxxxxx) : ");

		// �����ڷ� ������(-) ����
		sc = new Scanner(sc.next()).useDelimiter("\\s*-\\s*");

		String pre = sc.next();		// ���ڸ���ȣ�� ���ڿ� pre�� ����
		String post = sc.next();	// ���ڸ���ȣ�� ���ڿ� post�� ����
		
		
		//  �߸��� �ֹι�ȣ��ȣ �Է½� ���α׷� ����
		if (pre.length()!=6 || post.length()!=7 )
		{
			System.out.print("�Է� ����~!!!");
			return; // main �޼ҵ� ���� -> ���α׷� ���� 
		}	
		//             0 1 2 3 4 5 6 7 8 9 10 11 12
		//			   9 3 0 3 0 8 2 1 4 1 0  1  4
		int[] valid = {2,3,4,5,6,7,8,9,2,3,4,5};			// valid.length = 12
	
		int sum = 0;		// ������ 0 ���� ����

		// ���ڸ� �� ���ϱ�
		for (int i=0; i<6; i++)
		{
			sum += Integer.parseInt(pre.substring(i,i+1)) * valid[i];
			// sum += Integer.parseInt("9") * 2
			// sum += 9 * 2
		}
		
		// �׽�Ʈ
		//System.out.println("���ڸ� �������� " + sum);
		
		// ���ڸ� �� ���ϱ�
		for (int i=6; i<post.length()-1; i++)
		{
			sum += Integer.parseInt(post.substring(i,i+1)) * valid[i];
			//sum += Integer.parseInt("2")* 8;
		}
		
		// �׽�Ʈ
		//System.out.println("���ڸ����� �������� " + sum);

		int a = sum%11;
		int b = 11-a;
		
		if (b==0 || b==1)
			a = b%10;

		
		if (a==Integer.parseInt(post.substring(5,6)))
			System.out.println(">> ��Ȯ�� �ֹι�ȣ~!!");

		else if (a!=Integer.parseInt(post.substring(5,6)))
			System.out.println(">> �߸��� �ֹι�ȣ~!!");

		*/

		// [������ Ǯ��]

		// BufferedReader Ŭ���� �ν��Ͻ� ����
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		// �Է¹��� �ֹι�ȣ
		String str;

		// �ֹι�ȣ�� ������� �������� �� �迭 ����		// 123456-1234567
		int[] chk = {2, 3, 4, 5, 6, 7, 0, 8, 9, 2, 3, 4, 5}; 
		//							   - check~!!! (�����°� �������� ��!)

		// ���� ���� �� ������
		// int tot = 1;
		int tot = 0;

		// ����ڿ��� �ȳ� �޼��� ��� �� �ֹι�ȣ �Է¹ޱ�
		System.out.print("�ֹι�ȣ �Է�(xxxxxx-xxxxxxx) : ");
		str = br.readLine();

		if (str.length() != 14)
		{
			System.out.println(">> �Է� ����~!!!");
			return;	// �޼ҵ� ���� �� ���α׷� ����
		}

		// Ȯ��(�׽�Ʈ)
		//System.out.println(">> �ڸ����� ������ ��Ȳ~!!!");

		// 123456 - 123456 7
		// 234567 0 892345
		for (int i=0 ; i<13 ; i++) // i �� 0 1 2 3 4 5 6 7 8 9 10 11 12
		{
			if (i==6)
			{
				continue;			// �޺κ� �����ϰ�... ����ض�...
			}
			//chk[0] * Integer.parseInt(str.substring(0, 1));
			//chk[i] * Integer.parseInt(�ֹι�ȣ i��°�ڸ� ����);
			tot += chk[i] * Integer.parseInt(str.substring(i,i+1)); // �޺κ�

			// tot += chk[i] * Integer.parseInt(str.substring(i, i+1));
			// tot += chk[6] * Integer.parseInt(str.substring(6, 7));
			// tot += chk[6] * Integer.parseInt("123456-1234567".substirng(6, 7));
			// tot += chk[6] * Integer.parseInt("-"));
			//				   ----------------------- Error
		}
		// �ݺ��� ���� �������� ��ó�� �ִ� �� �Ẹ��

		//-- ������� �����ϸ� �� �� �� �� ��� ���� ��Ȳ�̸�
		//	 ��Ģ�� �°� ���� ������ ������ ����� ��� ���� ����
		//   ���� tot�� ����ִ� ���°� �ȴ�.

		int su = 11 - tot % 11;
		//			  ---------
		//       --------------
		// �׽�Ʈ(Ȯ��)
		//System.out.println(su);
		//--==>>
		/*
		�ֹι�ȣ �Է�(xxxxxx-xxxxxxx) : 750615-1862133
		3
		����Ϸ��� �ƹ� Ű�� �����ʽÿ� . . .
		*/

		// ���� ��� ��� ������ �߰� ���� �ʿ�~!!!
		// �� su �� ���� ���� ����� �� �ڸ��� ���� ���
		//	  �ֹι�ȣ ������ �ڸ����� ���� �� ���� ��Ȳ
		su = su % 10;		// su %= 10;

		// su�� 1�̳� 0�� �ƴ� ��(3)���� ���͵� 10���� ������ 3�̴ϱ� ���ǹ� �ʿ����
		//-- ������� �����ϸ� �� �� �� �� �߰� ���� ��� ���� ��Ȳ�̸�
		//   ���� ���� ����� ���� su �� ����ִ� ��Ȳ�� �ȴ�.

		// ���� ��� ���
		//if (su == Integer.parseInt(�ֹι�ȣ�������ڸ��ϳ�����))
		//if (su == Integer.parseInt(str�������ڸ��ϳ�����)
		if (su == Integer.parseInt(str.substring(13)))
			System.out.println(">> ��Ȯ�� �ֹι�ȣ~!!!");
		else
			System.out.println(">> �߸��� �ֹι�ȣ~!!!");

	}
}


/*
�ֹι�ȣ �Է�(xxxxxx-xxxxxxx) : 930308-2141014
>> ��Ȯ�� �ֹι�ȣ~!!
����Ϸ��� �ƹ� Ű�� �����ʽÿ� . . .

�ֹι�ȣ �Է�(xxxxxx-xxxxxxx) : 123456-1111111
>> �߸��� �ֹι�ȣ~!!
����Ϸ��� �ƹ� Ű�� �����ʽÿ� . . .
*/