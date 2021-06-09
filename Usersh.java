import java.util.Scanner;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;
import java.util.Iterator;
import java.util.Timer;
import java.util.TimerTask;
import java.util.Date;
import java.lang.Thread;
import java.util.Hashtable;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/*
	Title	 : User
	Function : 
	author	 : ��ƺ�, �Ҽ���
*/

//-------------------------[ User Ŭ���� ]-------------------------

// ���� �޴� ���ð��� ��� Ŭ����
class UserMenus
{
	// ���ȭ�� ������(�޴�)
	public static final int RESERVE_TICKETS = 1;	//-- ��ȭ����
	public static final int CONFIRM_TICKETS = 2;	//-- ����Ȯ��
	public static final int BUY_SNACKS = 3;			//-- ����/���� ����
	public static final int SIGN_IN = 4;			//-- ȸ������				
	static final int ADMIN = 1004;					//-- ������ ����	
}

class Usersh extends Record													
{
	// ������ �����޼ҵ� ���� 
	//Admin.notice();
	
	// �޴� ��� �޼ҵ� 
	public static void menuDisp() throws InterruptedException, IOException
	{
      System.out.println("\n\n");
      System.out.println("\t   ���������޴�  ���æ�������");
      System.out.println("\t1. ��   ��ȭ ����    ��");
      System.out.println("\t2. ��     ���� Ȯ��  ��");
      System.out.println("\t3. �� ����/���� ���� ��");
      System.out.println("\t4. ��    ȸ�� ����   �� ");
      System.out.println("\t   ������������������������������������");
      // �����ڸ޴��� 1004��(����)

	}// end menuDisp()

	// �޴� ���� �޼ҵ�
	public static void menuSelect() throws InterruptedException, IOException
	{
		// �ֿ� ���� ���� �� �ν��Ͻ� ����
		Scanner sc = new Scanner(System.in);
		
		do
		{	
			System.out.print("\t>> �޴� ����(1~4) : "); 
			sel = sc.nextInt();
			
			if (sel==1004)
				Admin.pw();													

			if (sel>0)
			{
				if (sel==1 || sel==2 || sel==3 || sel==4)
					break;
				System.out.println("\t>> �߸��� ��ȣ�� �Է��߽��ϴ�. �ٽ� �Է����ּ���.\n");
			}
		}
		while (sel<UserMenus.RESERVE_TICKETS || sel>UserMenus.SIGN_IN);	
	}

	// ���� Ȯ��/��ȭ ����/����,���� ����/ȸ�� ����/�����ڸ��� �̵�(switch)
	public static void menuRun() throws InterruptedException, IOException
	{
		switch(sel)
		{
			//case UserMenus.RESERVE_TICKETS : ReserveTickets.�޼ҵ�(); break;
			case UserMenus.CONFIRM_TICKETS : ConfirmReservation.conNum(); break;
			case UserMenus.BUY_SNACKS : BuySnacks.snackMenuDisp(); break;
			case UserMenus.SIGN_IN : Members.mMenuDisp(); break;
			case UserMenus.ADMIN : Admin.pw(); break;				
		}
	}// end menuRun()
}