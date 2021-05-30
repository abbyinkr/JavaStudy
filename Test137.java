/*=============================================
     ���� �ڹ��� �ֿ�(�߿�) Ŭ���� ����
	 - Calendar Ŭ���� -- API ��ť��Ʈ Ȯ�� �ʼ���
=============================================*/
/*
�� Calendar Ŭ������ �߻� Ŭ�����̱� ������ ��ü�� ������ �� ����.
   (�߻� Ŭ���� : �̿ϼ��� Ŭ����)

   ��, ��Calendar ob = new Calendar();�� �� �̿� ���� ������ ���� �ν��Ͻ� ������ �Ұ�

�� Calendar Ŭ���� ��ü(�ν��Ͻ�)�� ������ �� �ִ� ���

   1. Calendar ob1 = Calendar.getInstance();

   2. Calendar ob2 = new GregorianCalendar(); // ��ĳ����

   3. GregorianCalendar ob3 = new GregorianCalendar();

   (�� GregorianCalender : Calendar Ŭ������ ����(�ڽ�) Ŭ����)

*/

// ��, ��, ��, ������ Calendar Ŭ�����κ��� ������ ���


import java.util.Calendar;
import java.util.GregorianCalendar;

public class Test137
{
	public static void main(String[] args)
	{
		//Calendar rightNow = new Calendar();

		// Calendar Ŭ���� �ν��Ͻ� ����
		Calendar rightNow = Calendar.getInstance();	

		// ������ �޷�(Calendar) �ν��Ͻ��� ����
		// ��¥ ���� ������ �� �� �ִ� �޼ҵ� �� get()

		int y = rightNow.get(Calendar.YEAR);
		int m = rightNow.get(Calendar.MONTH)+1; // MONTH�� �ε������� ��ȯ�ϹǷ� +1
		int d = rightNow.get(Calendar.DATE);
		int w = rightNow.get(Calendar.DAY_OF_WEEK);

		System.out.println(y + "-" + m + "-" + d + " " + w);
		//--==>> 2021-3-5 6 �� ��

		//�׽�Ʈ 
		/*
		System.out.println(Calendar.SUNDAY);      //--==>> 1 �� �Ͽ��� 
		System.out.println(Calendar.MONDAY);      //--==>> 2 �� ������
		System.out.println(Calendar.TUESDAY);     //--==>> 3 �� ȭ����
        System.out.println(Calendar.WEDNESDAY);   //--==>> 4 �� ������
        System.out.println(Calendar.THURSDAY);    //--==>> 5 �� �����
        System.out.println(Calendar.FRIDAY);      //--==>> 6 �� �ݿ���
		System.out.println(Calendar.SATURDAY);    //--==>> 7 �� �����
        */

		String week = "";
		switch (w)
		{
			//case 1: week= "�Ͽ���"; break;
			case Calendar.SUNDAY: week= "�Ͽ���"; break;
			//case 2: week= "������"; break;
			case Calendar.MONDAY: week= "������"; break;
			//case 3: week= "ȭ����"; break;
			case Calendar.TUESDAY: week= "ȭ����"; break;
			//case 4: week= "������"; break;
			case Calendar.WEDNESDAY: week= "������"; break;
			//case 5: week= "�����"; break;
			case Calendar.THURSDAY: week= "�����"; break;
			//case 6: week= "�ݿ���"; break;
			case Calendar.FRIDAY: week= "�ݿ���"; break;
			//case 7: week= "�����"; break;
			case Calendar.SATURDAY: week= "�����"; break;
		}
	
		System.out.println(y + "-" + m + "-" + d + " " + week);
		//--==>> 2021-3-5 �ݿ���

		System.out.println("\n////////////////////////////////////////////////////////\n");

		// Calendar Ŭ���� �ν��Ͻ� ����

		Calendar rightNow2 = new GregorianCalendar();

		String[] week2 = {"�Ͽ���", "������", "ȭ����", "������", "�����", "�ݿ���", "�����"};

		// �޷��� ��¥ ���� �� ��set()�� �޼ҵ� Ȱ��
		rightNow2.set(2021, 6, 9); // 7��-1 check~!!!

		System.out.println(rightNow.get(Calendar.DAY_OF_WEEK));
		//--==>> 6 �� �ݿ���

		System.out.println(week2[rightNow2.get(Calendar.DAY_OF_WEEK)-1]);
		//--==>> �ݿ���

		System.out.println();

		// ������� ����
		rightNow2.set(1993, 2, 8); // 1993�� 3�� 8��
		// ���� Ȯ��
		System.out.println(week2[rightNow2.get(Calendar.DAY_OF_WEEK)-1]);
		//--==>> ������

	}

}