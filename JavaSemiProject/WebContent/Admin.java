import java.util.Scanner;
import java.io.IOException;

/*
	Title	 : Admin
	Function : ��й�ȣ �Է� �� ������ �޴��� ����
	author	 : �輭��, ������
*/

// ���������ף�
// 21-03-19 2:40 ��������, �������� �޴� �� ������� �޴��� �����Ͽ� ����
//          3:45 ���� User �� �����Ϸ�

import java.util.InputMismatchException;

class AdminVO
{
	private static String notice = "\n\tȯ���մϴ�. CRG�Դϴ�!\n";
	
	public String getNotice()
	{ return notice;}

	public void setNotice(String notice)
	{ this.notice = notice; }
}


// ������ �޴� ���ð����� ��� Ŭ���� 
class AdminMenu
{
  // ���ȭ�� ������(�޴�)
  static final int ADMIN_CASH = 1;		// �������(���� ����) + �Ǹ� ���� �� ���� 
  static final int ADMIN_MOVIE = 2;		// ��ȭ ���
  static final int ADMIN_STOCKS = 3;	// ����+���� ������� �� ����! 
  static final int ADMIN_NOTICE = 4;	// ���� ����
  static final int ADMIN_SALES_ON = 5;	// ���� ����(�Ǹ� ����/����)
}

class Admin extends Record
{

	void pw() throws IOException, InterruptedException
	{
		System.out.println("\n\n");

		Scanner sc = new Scanner(System.in);
		System.out.print("\t������ ��й�ȣ�� �Է��ϼ��� : ");
		String pw = sc.next();

		do
		{
			if (pw.equals("1234"))
			{
				System.out.println("\t>> ������ �α��εǾ����ϴ�.");
				break;
			}
			System.out.println("\t>> �߸��� ��й�ȣ�� �Է��߽��ϴ�. �ٽ� �Է����ּ���.");
			System.out.print("\t������ ��й�ȣ�� �Է��ϼ��� : ");
			pw = sc.next();
		}
		while (true);

		do
		{
			AdminMenuDisp();		// ������ �޴� ��� �޼ҵ� 
			menuSelect();			// �޴� ���� �޼ҵ�
			AdminMenuRun();			// �޴� ���� �޼ҵ�
		}
		while (true);

	}

	// ������ �޴� ��� �޼ҵ�
	public static void AdminMenuDisp() throws IOException
	{
		System.out.println("\n\n\t[ ������ �޴� ]");
		System.out.println("\t====================================");
		System.out.println("\t1. ���� ����");
		System.out.println("\t2. ��ȭ ����");
		System.out.println("\t3. ��� ����");
		System.out.println("\t4. ���� ����");
		System.out.println("\t5. �Ǹ� ����/����\n");
	}

	// �޴� ���� �޼ҵ�
	public static void menuSelect()
	{
		Scanner sc = new Scanner(System.in);

		while (true)
		{
			try
			{
				System.out.print("\t>> �޴� ����(1~5) : ");
				sel = sc.nextInt();

				break;
			}
			catch (InputMismatchException e)
			{
				sc = new Scanner(System.in);
				System.out.println("\t>> �߸� �Է��ϼ̽��ϴ�. ������ �Է��� �ּ���.\n");
			}
		}
		
	}

	public static void AdminMenuRun() throws IOException, InterruptedException
    {
     	switch (sel)
		{
			case AdminMenu.ADMIN_CASH :  AdminCash.menuCash();break;				// ���� ����
			case AdminMenu.ADMIN_MOVIE : AdminMovie.movieMenuDisp(); break;			// ��ȭ ����
			case AdminMenu.ADMIN_STOCKS : Stocks.startStocks(); break;					// ��� ����
			case AdminMenu.ADMIN_NOTICE : editNotice(); break;						// ���� ����
			case AdminMenu.ADMIN_SALES_ON : adminSalesON(); break;					// ���� ����(�Ǹ� ����/����)
		}
    }

	// ���� ���� �޼ҵ�
	public static void editNotice() throws IOException
    {
		Scanner sc = new Scanner(System.in);
		AdminVO ad = new AdminVO();

		System.out.println("\n\n\t[ ���� ���� ]");
		System.out.println("\t====================================");
		System.out.println("\t***���� ����***");
		System.out.print(ad.getNotice());

		System.out.print("\n\t�����Ͻðڽ��ϱ�? (Y/N) : ");
		answer = (char)System.in.read();
		System.in.skip(2);
		
		if (answer=='Y' || answer=='y')
		{
			System.out.print("\t>> ������ ������ �Է����ּ��� : ");
			String edit = sc.nextLine();
			ad.setNotice(edit);
			System.out.println("\t====================================");
	    	System.out.println("\n\n\t[ ����� ���� ]");
			System.out.println("\t====================================");
			System.out.println("\n\t" + ad.getNotice()+"\n");
		}
	}

	// �Ǹ� ���� �޼ҵ� (�ǸŽ��� / ���� OFF)
	public static void adminSalesON() throws IOException, InterruptedException
    {
			Scanner sc = new Scanner(System.in);

		int sel, n=0;  //-- �޴� ������ ���� ����, do-while���� �ٽ� �����ϸ� ��±��� ������ ���� ���� 

		do
		{
			if (n>0)
				System.out.println("\t��ȿ���� ���� �޴��Դϴ�. �ٽ� �������ּ���.");

			System.out.println("\n\n");
			System.out.println("\t���� ����             0. ������ �޴�");
			System.out.println("\t====================================");
			System.out.println("\t1. �Ǹ� ����");
			System.out.println("\t2. ����");
			System.out.println();

			while (true)
			{
				try
				{
					System.out.print("\t>> �޴� ����(1, 2) : ");
					sel = sc.nextInt();

					break;
				}
				catch (InputMismatchException e)
				{
					sc = new Scanner(System.in);
					System.out.println("\t>> �߸� �Է��ϼ̽��ϴ�. ������ �Է��� �ּ���.\n");
				}		
			}
			

			n++;
		}
		while (sel != 0 && sel!=1 && sel!=2);	// 0, 1, 2�� �ƴ϶�� �ٽ� �޾ƶ� 
	

		// ���� ON
		if (sel == 1)
			User.startUser();
		// ���� OFF
		else if (sel == 2)		
			System.exit(0);

		// sel == 0 �� �� �߰� �۾� ���� �ڵ� �������� �޼ҵ� ���� Ȯ�� �Ϸ�...
	}
}
