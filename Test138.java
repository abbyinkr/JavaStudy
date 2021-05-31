/*=============================================
     ���� �ڹ��� �ֿ�(�߿�) Ŭ���� ����
	 - Calendar Ŭ���� 
=============================================*/
/*
�� java.util.Calendar Ŭ������
   ��¥�� �ð��� ��ü �𵨸�ȭ �� Ŭ������
   ��, ��, ��, ����, ��, ��, �� ������
   �ð��� ��¥�� ���õ� ������ �����Ѵ�.
   �׸���, Calendar Ŭ������ �߻�Ŭ�����̹Ƿ� ���� ��ü�� ������ �� ������
   �������� �޼ҵ� ������ Calendar Ŭ������ ���� Ŭ������
   ��GregorianCalendar�� Ŭ������ ���ǵǾ� �ִ�.

   �ý������κ��� ���� �ý��� �ð� ������ ���� ��
   ��getInstance()����� ����(static) �޼ҵ带 �̿��Ͽ� ��ü�� ������ �� �ִ�.
	������ Calendar Ŭ���� ��ü�� �ý����� ���� ��¥�� �ð� ������ ������,
	�� ��ü�� �����Ǹ� ���� �ִ� �ð� ��������
	��get()���޼ҵ带 �̿��Ͽ� ���� ������(�����) �� �ִ�.

	��getInstance()�� �޼ҵ�� ���������� GregorianCalendar ��ü�� �����Ͽ�
	�����ֱ� ������ GregorianCalendar ��ü�� ���� �����Ͽ� ��¥ �ð� ������
	���� ���� �ִ�.
*/

// �� �ǽ� ����
//    ����ڷκ��� ��, ���� �Է¹޾�
//    �ش� �� ���� �޷��� �׷��ִ�(����ϴ�) ���α׷��� �����Ѵ�.
//    ��, Calendar Ŭ������ Ȱ���Ͽ� �ۼ��� �� �ֵ��� �Ѵ�.

// ���� ��)
// ���� �Է�: 0
// ���� �Է� 2021
// �� �Է� : -2 
// �� �Է� : 16
// �� �Է� : 7
/*
        [2021�� 7��]

  ��  ��  ȭ  ��  ��  ��  ��
============================
                   1   2   3
   4   5   6   7   8   9  10
  11  12  13  14  15  16  17
  18  19  20  21  22  23  24
  25  26  27  28  29  30  31 
============================

*/

import java.util.Calendar;
import java.util.GregorianCalendar;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Test138
{
	public static void main(String[] args) throws IOException
	{
		// [���� Ǯ��]
		/*
		// BufferedReader �ν��Ͻ� ����
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		// �ֿ亯������
		int y, m;


		do
		{
			System.out.print("���� �Է� : ");
			y = Integer.parseInt(br.readLine());

		}
		while (y < 1);

		do
		{
			System.out.print("�� �Է� : ");
			m = Integer.parseInt(br.readLine());
		}
		while (m < 1 || m > 12);

		// GregorianCalendar(int year, int month, int dayOfMonth)

		Calendar ob = new GregorianCalendar(y, m-1, 1);

		int firstday = ob.get(Calendar.DAY_OF_WEEK);		

		//System.out.println("���� ������ : " + firstday); // 1 -> ��

		int monthdays = ob.getActualMaximum(Calendar.DAY_OF_MONTH);
		//System.out.println("Calendar.DAY_OF_MONTH : " + Calendar.DAY_OF_MONTH);
		//System.out.println("�ش�� ������ ��: " + monthdays); 

		// getActualMaximum �޼ҵ� Ȯ�� 
		//System.out.println(ob.getActualMaximum(Calendar.DAY_OF_WEEK)); 
		//-->> 7 
		// Calendar DAY_OF_WEEK �� ������ �ִ� �ִ� : 7 (�����)

		// ���
		System.out.println();
		System.out.printf("        [%4d�� %2d��]        ", y, m);
		System.out.println();
		System.out.println("  ��  ��  ȭ  ��  ��  ��  ��");
		System.out.println("============================");

		for (int i=1; i<firstday; i++)
		{
			System.out.print("    ");
		}
		for (int j=1; j<=monthdays; j++)
		{
			System.out.printf("%4d", j);
			firstday++;
			if ((firstday-1)%7==0)
				System.out.println();
		}
		if ((firstday-1)%7!=0)
			System.out.println();
		
		System.out.println("============================");

		*/

		// [������ Ǯ��]
		
		// BufferedReader Ŭ���� �ν��Ͻ� ����
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		// Calendar �ν��Ͻ� ����
		Calendar cal = Calendar.getInstance();

		// �ֿ� ���� ����
		int y, m;	//--��, ��
		int w;		//-- ����
		int i;		//-- ��������

		do
		{
			System.out.print("���� �Է� : ");
			y = Integer.parseInt(br.readLine());
		}
		while (y<1);

		do
		{
			System.out.print("�� �Է� : ");
			m = Integer.parseInt(br.readLine());
		}
		while (m<1 || m>12);

		// ����ڷκ��� �Է¹��� ������ ����(y), ��(m)�� �̿��Ͽ�
		// �޷��� ��¥ ����
		// cal.set(����, ��, ��)
		cal.set(y, m-1, 1); //1��
		//-- �� ���� �� �Է°�(m)�� �״�� ����ϴ� ���� �ƴ϶�
		//   �Է°����� 1�� �� ������ ���� �����ؾ� �Ѵ�.
		//-- �� ������ �Է¹��� ��, ���� �ش��ϴ� 1�Ϸ� �����ؾ� �Ѵ�.
		
		// ���õ� �޷��� ���� ��������
		w = cal.get(Calendar.DAY_OF_WEEK);

		// Ȯ��(�׽�Ʈ)
		//System.out.println("���� : " + w);
		//--=>> 2 �� 2021�� 3�� ���� �� ������ �� 2021�� 3�� 1�� : ������


		// �� Calendar Ŭ������ ��getActualMaximum()�� �޼ҵ� check~!!!

		// Ȯ��(�׽�Ʈ)
		//System.out.printf("%d\n", cal.getActualMaximum(Calendar.YEAR));
		//--==>> 292278994
		//System.out.printf("%d\n", cal.getActualMinimum(Calendar.YEAR));
		//--==>> 1
		//System.out.printf("%d\n", cal.getActualMaximum(Calendar.MONTH)+1);
		//--==>> 12
		//System.out.printf("%d\n", cal.getActualMaximum(Calendar.DATE));
		//--==>> 31 �� 2021�� 3�� ����
		//--==>> 28 �� 2021�� 2�� ����
		//--==>> 29 �� 2020�� 2�� ����(����)
		//System.out.printf("%d\n", cal.getActualMaximum(Calendar.DAY_OF_WEEK));
		//--==>> 7


		// ��� ��� �� �޷� �׸���
		System.out.println();
		System.out.println("\t [ " + y + "��" + m + "�� ]\n");
		System.out.println("  ��  ��  ȭ  ��  ��  ��  ��");
		System.out.println("============================");
		
		// ��¥ �׸��� �����ϴ� �������� ���� �߻�
		for (i=1; i<w; i++)
			System.out.print("    "); // ���� 4ĭ

		// Ȯ��(�׽�Ʈ)
		//System.out.printf("%4d", 1);

		// ��¥ �׸���
		for (i=1; i<=cal.getActualMaximum(Calendar.DATE); i++)
		{
			System.out.printf("%4d", i);
			w++;	// �ݺ����� �����ϸ� ��¥�� ������ ������
					// ���ϵ� �Բ� ������ �� �ֵ��� ó��.
			
			if (w%7==1)	//-- ������ ������ �Ͽ����� �ɶ����� ������ ���
				System.out.println();
		}
		if(w%7!=1)
			System.out.println(); // ����

		System.out.println("============================");
	}
}

/*
���� �Է� : 2021
�� �Է� : 7

         [ 2021��7�� ]

  ��  ��  ȭ  ��  ��  ��  ��
============================
                   1   2   3
   4   5   6   7   8   9  10
  11  12  13  14  15  16  17
  18  19  20  21  22  23  24
  25  26  27  28  29  30  31
============================
����Ϸ��� �ƹ� Ű�� �����ʽÿ� . . .
*/