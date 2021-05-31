/*=============================================
     ���� �ڹ��� �ֿ�(�߿�) Ŭ���� ����
	 - Calendar Ŭ���� 
=============================================*/

// �� �ǽ� ����
//    ������ ��������...
//    �Է¹޴� ��¥��ŭ ���� ��, ��, ��, ������ Ȯ���Ͽ�
//    ����� ����ϴ� ���α׷��� �����Ѵ�.
//    ��, Calendar Ŭ������ Ȱ���Ͽ� ó���Ѵ�.

// ���� ��)
// ���� ��¥ : 2021-3-8 ������
// �� �� ���� ��¥�� Ȯ���ϰ��� �Ͻʴϱ�? : 200

// =========[Ȯ�ΰ��]==========
// 200�� �� : 2021��-xx-xx x���� 
// =============================

// �� Ư�� ��¥�� �������� �� ���� ���ϴ� ���� �޼ҵ�
//   ����¥��ü.add(Calendar.DATE, �� ��)��

import java.util.Calendar;
import java.util.Scanner;

public class Test139 
{
	public static void main(String[] args)
	{
		/*
		// Calendar Ŭ���� ����
		Calendar cal = Calendar.getInstance();
		// ���� �����ѹٷδ� Calendar.getInstance()�ϸ� 
		// GregorianCalendar�� �ν��Ͻ� �����Ͽ� Calendar�� ��ĳ�����ϴ� �Ű���.
		// �׷��� add() �޼ҵ带 ����Ҽ� �ִµ�!

		// �ֿ� ���� ���� 
		int y, m, d, w;
		// �׽�Ʈ
		System.out.println("���� : " + cal.get(Calendar.YEAR));

		y = cal.get(Calendar.YEAR);
		m = cal.get(Calendar.MONTH)+1;
		d = cal.get(Calendar.DATE);
		w = cal.get(Calendar.DAY_OF_WEEK); // 1 �� �Ͽ���
		
		String day = "";
		
		switch (w)
		{
			case 1: {day = "�Ͽ���"; break;}
			case 2: {day = "������"; break;}
			case 3: {day = "ȭ����"; break;}
			case 4: {day = "������"; break;}
			case 5: {day = "�����"; break;}
			case 6: {day = "�ݿ���"; break;}
			case 7: {day = "�����"; break;}
		}

		System.out.printf("���� ��¥ : %4d-%d-%d %3s\n", y, m, d, day);

		// Scanner �ν��Ͻ� ����
		Scanner sc = new Scanner(System.in);

		System.out.print("�� �� ���� ��¥�� Ȯ���ϰ��� �Ͻʴϱ� ? : ");
		int afterday = sc.nextInt();
		
		// add() �޼ҵ�� ���õ� ��¥�� ����
		cal.add(Calendar.DATE, afterday);

		// �� ������ ����� ��¥�� �� ���
		y = cal.get(Calendar.YEAR);
		m = cal.get(Calendar.MONTH)+1;
		d = cal.get(Calendar.DATE);
		w = cal.get(Calendar.DAY_OF_WEEK); // 1 �� �Ͽ���

		switch (w)
		{
			case 1: {day = "�Ͽ���"; break;}
			case 2: {day = "������"; break;}
			case 3: {day = "ȭ����"; break;}
			case 4: {day = "������"; break;}
			case 5: {day = "�����"; break;}
			case 6: {day = "�ݿ���"; break;}
			case 7: {day = "�����"; break;}
		}
		
		System.out.printf("\n=========[Ȯ�ΰ��]==========\n");
		System.out.printf(" %d�� �� : %4d-%d-%d %3s\n", afterday, y, m, d, day);
		System.out.println("=============================");
		*/

		// [������ Ǯ��]

		// Scanner Ŭ���� �ν��Ͻ� ����
		Scanner sc = new Scanner(System.in);

		// Calendar Ŭ���� �ν��Ͻ� ����

		Calendar now = Calendar.getInstance();

		// �ֿ� ���� ����
		int nalsu;		//-- ����ڷκ��� �Է¹��� �� ��
		int y, m, d, w;	//-- ��, ��, ��, ����
		String[] week = {"��", "��", "ȭ", "��", "��", "��", "��"};

		// ������ ��, ��, �� ���� Ȯ��(�������� : get())
		y = now.get(Calendar.YEAR);
		m = now.get(Calendar.MONTH)+1;   //check~!!
		d = now.get(Calendar.DATE);
		w = now.get(Calendar.DAY_OF_WEEK);
		
		// ������ ��, ��, ��, ���� Ȯ�ΰ�� ���
		//System.out.println("���� ��¥ : " + y + "-" + m + "-" + d + " "
		//					+ week[w-1] + "����");
		//--==>> ���� ��¥ : 2021-3-8 ������
		System.out.printf("���� ��¥ : %tF %tA\n", now, now);
		//--==>> ���� ��¥ : 2021-03-08 ������
		
		do
		{
			System.out.print("�� �� ���� ��¥�� Ȯ���ϰ��� �Ͻʴϱ�? : ");
			nalsu = sc.nextInt();
		}
		while (nalsu<0);

		// �� �� ���ϱ� ����
		now.add(Calendar.DATE, nalsu);

		// ��� ���
		System.out.println();
		System.out.println("=========[Ȯ�ΰ��]==========");
		System.out.printf("%d�� �� : %tF %tA\n", nalsu, now, now);
		System.out.println("=============================");
		
	}
}

/* [���� ���]
���� ��¥ : 2021-03-08 ������
�� �� ���� ��¥�� Ȯ���ϰ��� �Ͻʴϱ�? : 200

=========[Ȯ�ΰ��]==========
200�� �� : 2021-09-24 �ݿ���
=============================
����Ϸ��� �ƹ� Ű�� �����ʽÿ� . . .

*/