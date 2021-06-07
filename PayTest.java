import java.util.Scanner;
import java.util.Timer;
import java.util.TimerTask;
import java.util.Date;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;
import java.util.Iterator;

import java.lang.Thread;
import java.io.IOException;

class Record
{
	static Integer sel;      //-- �޴� ���� ���� ��� ����
	static Scanner sc;       //-- Scanner �޸� �Ҵ�
	static int snackPayTot, moviePayTot, payCash, payCard, payHap;	//-- ����/���ܿ����� �ѱݾ�, ��ȭ������ �ѱݾ�
	static int rNum;						//-- ���Ź�ȣ
}

//===============================================================================================================

/*
	Title	 : Admin
	Function : ��й�ȣ �Է� �� ������ �޴��� ����
	author	 : �輭��, ������
*/

class AdminVO
{
	private static String notice = "ȯ���մϴ�. CGV�Դϴ�!\n";
	
	public String getNotice()
	{ return notice; }

	public void setNotice(String notice)
	{ this.notice = notice; }

	public void addNotice(String notice)
	{ this.notice += notice; }
}


// ������ �޴� ���ð����� ��� Ŭ���� 
class AdminMenu
{
  // ���ȭ�� ������(�޴�)
  static final int ADMIN_CASH = 1;		// �������(���� ����)
  static final int ADMIN_MOVIE = 2;		// ��ȭ ���
  static final int ADMIN_ADDPAPER = 3;	// ���� ����
  static final int ADMIN_SELPRICE = 4;	// �Ǹ� ����
  static final int ADMIN_SNACK = 5;		// ����/���� ����
  static final int ADMIN_NOTICE = 6;	// ���� ����
  static final int ADMIN_SALES_ON = 7;	// ���� ����
}

class Admin extends Record
{
	void pw() throws IOException
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
			AdminMenuDisp();
			menuSelect();
			AdminMenuRun();
		}
		while (true);	
	}

	// ������ �޴� ��� �޼ҵ�
	public static void AdminMenuDisp()
	{
        
		System.out.println("\n\n\t[ ������ �޴� ]");
		System.out.println("\t====================================");
		System.out.println("\t1. ���� ����");
		System.out.println("\t2. ��ȭ ����");
		System.out.println("\t3. ���� ����");
		System.out.println("\t4. �Ǹ� �ݾ� ����");
		System.out.println("\t5. ���� ����");
		System.out.println("\t6. ���� ����");
		System.out.println("\t7. �Ǹ� ����/����\n");

		System.out.print("\t>> �޴� ����(1~6) : ");
	}

	// �޴� ���� �޼ҵ�
	public static void menuSelect()
	{
		Scanner sc = new Scanner(System.in);
		sel = sc.nextInt();
	}

	public static void AdminMenuRun() throws IOException
    {
		AdminCash ac = new AdminCash();

        switch (sel)
        {
        /*
			case 2 : break;
			case 3 : break;
			case 4 : break;
			case 5 : break;
		*/
		case 1 : ac.menuCash(); break;
        case 6 : editNotice(); break;
        case 7 : adminSalesON(); break;
	    default: System.out.println("\t�߸��� �޴��� �Է��߽��ϴ�. �ٽ� �Է����ּ���.");      
        }
    }


	// ���� ���� �޼ҵ�
	public static void editNotice() throws IOException
    {
		Scanner sc = new Scanner(System.in);
		AdminVO ad = new AdminVO();

		char answer;

		System.out.println("\n\n\t[ ���� ���� ]");
		System.out.println("\t====================================");
		System.out.println("\t***���� ����***");
		System.out.print("\t" + ad.getNotice());

		System.out.print("\n\t�����Ͻðڽ��ϱ�? (Y/N) : ");
		answer = (char)System.in.read();
		System.in.skip(2);
		
		if (answer=='Y' || answer=='y')
		{
			System.out.print("\t>> ������ ������ �Է����ּ���\n\t : ");
			String edit = sc.nextLine();
			ad.setNotice(edit);
			System.out.println("\t====================================");
	    	System.out.println("\n\n\t[ ����� ���� ]");
			System.out.println("\t====================================");
			System.out.println("\t" + ad.getNotice());
		}
	}

	// �Ǹ� ���� �޼ҵ� (�ǸŽ��� / ���� OFF)
	public static void adminSalesON()
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
			System.out.print("\t>> �޴� ����(1, 2) : ");
			sel = sc.nextInt();

			n++;
		}
		while (sel != 0 && sel!=1 && sel!=2);	// 0, 1, 2�� �ƴ϶�� �ٽ� �޾ƶ� 
		

		// ���� ON
		if (sel == 1)
			System.out.println("\t����� �޴� ȣ��");
		// ���� OFF
		else if (sel == 2)		
			System.exit(0);

		// sel == 0 �� �� �������� �޼ҵ� ����...
	}
}

//===============================================================================================================

//--------�ڽ��� �߰� ���� Ȯ�ο����� �����ȡ�-------------------------------------------------------------------

//����/���� ���� Ŭ����
class BuySnacksVO extends Record
{
	//����/���� ���
	static private int coke=300, cida=300, popcorn=300;
	
	//getter & setter ����
	public int getCoke()
	{ return coke;}

	public void setCoke(int coke)  
	{ this.coke += coke; }
	
	public int getCida()
	{ return cida;}

	public void setCida(int cida)  
	{ this.cida += cida; }

	public int getPopcorn()
	{ return popcorn;}

	public void setPopcorn(int popcorn)  
	{ this.popcorn += popcorn; }
}

class BuySnacks extends Record
{	
	static String[] str = new String[3];
	static char answer;
	static String temp;
	static int sPayCash, sPayCard;

	// ����/���� �޴� ��� �� �Է�
	public static void snackMenu() throws InterruptedException, IOException
	{
		BuySnacksVO bst = new BuySnacksVO();

		Scanner sc = new Scanner(System.in);

		do
		{
			System.out.print("\n\n");
			System.out.println("\t�޴���                   0. �ʱ�ȭ��");
			System.out.println("\t====================================");
			System.out.println("\t1. �ݶ�(2,000��)");
			System.out.println("\t2. ���̴�(2,000��)");
			System.out.println("\t3. ����(3,000��)");
			System.out.println();
			System.out.print("\t>> ���� ������ ������ ������� �Է����ּ���(�޸� ����) : ");

			temp = sc.next();
			str = temp.split(",");	// ������ �� �޸�

			int su[] = {bst.getCoke(), bst.getCida(), bst.getPopcorn()};
			String snacksName[] = {"�ݶ�", "���̴�", "����"};

			for (int i=0; i<3; i++)
			{	
				if (Integer.parseInt(str[i])>su[i])
				System.out.printf("\n\t�� ���� ��%s���� �ִ밡�� ���ż����� ��%d���Դϴ�.\n\t   �߰����Ÿ� ���Ͻø� �����ڸ� �ҷ��ּ���.\n", snacksName[i], su[i]);
			}
		}
		while (Integer.parseInt(str[0])>bst.getCoke() || Integer.parseInt(str[1])>bst.getCida() || Integer.parseInt(str[2])>bst.getPopcorn());
		
		snackCheck();
	}
		
	// ����/���� ���� Ȯ�� 
	public static void snackCheck() throws InterruptedException, IOException
	{	
		System.out.println("\n\t===================================================");
		System.out.printf("\n\t�ݶ� %d��, ���̴� %d��, ���� %d���� �����ϼ̽��ϴ�.\n", Integer.parseInt(str[0]), Integer.parseInt(str[1]), Integer.parseInt(str[2]));

		System.out.print("\t������ �����Ͻðڽ��ϱ�?(Y/N) : ");
		answer = (char)System.in.read();
		System.in.skip(2);
	
		snackPayTot = 2000*(Integer.parseInt(str[0]) + Integer.parseInt(str[1])) + 3000*Integer.parseInt(str[2]);
	
		//Pay p = new Pay(Integer.parseInt(str[0]), Integer.parseInt(str[1]), Integer.parseInt(str[2])); -- ������ ���� �� ���
		Pay p = new Pay();

		if (answer == 'y' || answer == 'Y')
				snackMenu();

		if (answer == 'n' || answer == 'N')
		{
			System.out.printf("\n\t�� ���� �ݾ��� %d�Դϴ�.", snackPayTot);
			System.out.println("\n\t===================================================");
			//����ȣ��	
			p.selPay();	// ����Ŭ�������� ������ ������ذ� Ȯ���ϱ�
		}
	}
}

//--------�ڽ��� �߰� ���� Ȯ�ο����� �����ȡ�-------------------------------------------------------------------

//===============================================================================================================

/*
	Title	 : AdminCash
	Function : ���� �ʱ� ����, �Ǹ� �ݾ� ����
	author	 : �輭��, �Ҽ���
*/

class AdminCashVO
{
   // ���� ����
   static private int cardMovie, cardSnacks, cashMovie, cashSnacks;

   // ���� �߰� ��
   static private int omanwon, manwon, ocheonwon, cheonwon;

   AdminCashVO() {}
   
   // getter,setter ����
   //static private int cardMovie, cardSnacks, cashMovie, cashSnacks;
   public int getCardMovie()
   { return cardMovie;}

   public void setCardMovie(int cardMovie)  
   { this.cardMovie += cardMovie; }

   public int getCardSnacks()
   { return cardSnacks;}

   public void setCardSnacks(int cardSnacks)  
   { this.cardSnacks += cardSnacks; }

   public int getCashMovie()
   { return cashMovie;}

   public void setCashMovie(int cashMovie)  
   { this.cashMovie += cashMovie; }

   public int getCashSnacks()
   { return cashSnacks;}

   public void setCashSnacks(int cashSnacks)  
   { this.cashSnacks += cashSnacks; }

   //static private int omanwon, manwon, ocheonwon, cheonwon;
   public int getOmanwon()
   { return omanwon;}

   public void setOmanwon(int omanwon)  
   { this.omanwon += omanwon; }

   public int getManwon()
   { return manwon;}

   public void setManwon(int manwon)  
   { this.manwon += manwon; }

   public int getOcheonwon()
   { return ocheonwon;}

   public void setOcheonwon(int ocheonwon)  
   { this.ocheonwon += ocheonwon; }

   public int getCheonwon()
   { return cheonwon;}

   public void setCheonwon(int cheonwon)  
   { this.cheonwon += cheonwon; }

}

class AdminCash extends Record
{
	AdminCashVO ac = new AdminCashVO();
	boolean flag;
	
	// �޴� ����
	public void menuCash() 
	{
		Scanner sc = new Scanner(System.in);
		int choice;
		do
		{	
			System.out.println("\n1. ���� �����ϱ�");
			System.out.println("2. �ݾ� �����ϱ�\n");
			System.out.print("��ȣ�� �����ϼ��� : ");
			choice = sc.nextInt();
		}
		while (choice>2 || choice<1);
		
		if (choice == 1)
			setCash();

		if (choice == 2)
			calCash();
	}
	
	// ���� ���� �� ����
	public void setCash()
	{
		Scanner sc = new Scanner(System.in);
		
		System.out.print("\n10000������ ��� : ");
		int a = sc.nextInt();
		ac.setManwon(a);

		System.out.print("5000������ ���  : ");
		int b = sc.nextInt();
		ac.setOcheonwon(b);

		System.out.print("1000������ ���  : ");
		int c = sc.nextInt();
		ac.setCheonwon(c);

		
		// �ݾ� �Է¹޾Ƽ� ���� 0������ ���ذ����� ����
		// ��� �Է¹����� �ݾ����� ��ȯ

		// ���� ���
		System.out.printf("\n���� 50000���� %d��, 10000���� %d��, 5000���� %d��, 1000���� %d�� �����ֽ��ϴ�.\n", 
							ac.getOmanwon(), ac.getManwon(), ac.getOcheonwon(), ac.getCheonwon());

		payHap = (ac.getOmanwon())*50000 + (ac.getManwon())*10000 + (ac.getOcheonwon())*5000 + (ac.getCheonwon())*1000;
		//System.out.print("payHap : " + payHap);

		menuCash();
	}
	
	// ���� ���
	public void calCash()
	{	
		System.out.println("\n\n\t\t\t     [ ���� ��� ] "); 
		System.out.println("\t ������������������������������������������������������������������������������������������������������");
		System.out.println("\t ��     ��     ��ȭ     ��     ����     ��     �հ�    ��");
		System.out.println("\t ������������������������������������������������������������������������������������������������������");
		System.out.printf("\t �� ���ݦ�%10d    ��%10d    ��%10d   ��\n", ac.getCashMovie(), ac.getCashSnacks(), ac.getCashMovie()+ac.getCashSnacks());
		System.out.println("\t ������������������������������������������������������������������������������������������������������"); 
		System.out.printf("\t �� ī�妢%10d    ��%10d    ��%10d   ��\n", ac.getCardMovie(), ac.getCardSnacks(), ac.getCardMovie()+ac.getCardSnacks());
		System.out.println("\t ������������������������������������������������������������������������������������������������������"); 
		System.out.printf("\t �� �հ覢%10d    ��%10d    ��%10d   ��\n", ac.getCashMovie()+ac.getCardMovie(), ac.getCashSnacks()+ac.getCardSnacks(), ac.getCashMovie()+ac.getCardMovie()+ac.getCashSnacks()+ac.getCardSnacks());
		System.out.println("\t ������������������������������������������������������������������������������������������������������");
		System.out.println();

		menuCash();
	}
}

//===============================================================================================================

//--------��ȸ������ Ȯ�ο����� �����ȡ�-------------------------------------------------------------------------

class MembersVO
{
   // �̸�, �ڵ�����ȣ, ���̵�, ����Ʈ
   private String name; 
   private String tel;
   private String id;
   private String point;

	// ����Ʈ �޾ƿ��� �׽�Ʈ
   private ArrayList<MembersVO> mData;

   // ������
   public MembersVO()
   {
      
   }

   // ����� ���� ������
   public MembersVO(String name, String tel, String id, String point)
   {
      this.name = name;
      this.tel = tel;
      this.id = id;
      this.point = point;
   }

   // getter, setter
   // �̸� 
   public String getName()
   {
      return this.name;
   }

   public void setName(String name)
   {
      this.name = name;
   }


	// ����Ʈ �޾ƿ��� �׽�Ʈ
	
	public void setMemList(ArrayList<MembersVO> mData)
	{
        this.mData = mData;
    }

    public ArrayList<MembersVO> getMemList()
	{
	   return this.mData;
    }

	public void printList()
	{
		
	   System.out.println("ȸ���� : " + this.mData.size());
    }

   
   // �ڵ�����ȣ
   public String getTel()
   {
      return this.tel;
   }

   public void setTel(String tel)
   {
      this.tel = tel;
   }

   //�ֹε�Ϲ�ȣ
   public String getId()
   {
      return this.id;
   }

   public void setId(String id)
   {
      this.id = id;
   }
   
   // ������
      public String getPoint()
   {
      return this.point;
   }

   public void setPoint(String point)
   {
      this.point = point;
   }


}// end MembersVO

// �� ȸ�� ���� Ŭ���� 
class Members extends Record // ������, ��ƺ�
{
   // �� MemebersVO ������� ������ ��ü�� data LinkedList�� ���� ���ִ�.
   ArrayList<MembersVO> mData = new ArrayList<MembersVO>();
   MembersVO mb = new MembersVO();

   // ȸ������ �޴� 
   public void mMenuDisp()
   {
      System.out.println("\n\n");
      System.out.println("\t=========�޴�  ����=========");
      System.out.println("\t    1.  ȸ��      ����     ");
      System.out.println("\t    2.  ȸ�� ���� Ȯ��   ");
      System.out.println("\t    3.    ���� �޴�   ");
      System.out.println("\t===========================");
      System.out.print("\t>> �޴� ����(1~3) : "); 
   }// end memMenuDisp()

   // ���õ� �޴� ���࿡ ���� ��� ȣ�� �޼ҵ�
   public void mMenuRun() throws IOException
   { 
      /*
      switch (sel)
      {
      //ȸ�� ���� �޼ҵ� 1��
      case memMenuSel.SIGN_IN : signIn(); break;
      // ȸ������ Ȯ�� �޼ҵ� 2��
      //case memMenuSel.CONFIRM_MEMBER :  break;

      // ���θ޴� �޼ҵ� 3��
      case memMenuSel.MAIN_MENU :  break;
      
      default: System.out.println("1~3���� �������ּ���."); break;
      }
      */
      
   }// end memMenuRun()


   // ���� ȸ�� ���� �߰� �޼ҵ� -- �ϼ�
   public void oldMem()
   {
      //���� ȸ��
      mData.add(new MembersVO("��ƺ�","010-1111-1111","760411-2575452","2500"));
      mData.add(new MembersVO("�輭��","010-2222-2222","651126-2127984","5000"));
      mData.add(new MembersVO("������","010-3333-3333","610125-2066131","10000"));
      mData.add(new MembersVO("������","010-4455-5566","641014-2211410","500"));
      //û�ҳ� ȸ��
      mData.add(new MembersVO("û�ҳ�","010-2222-2222","071022-1639841","2000"));
      mData.add(new MembersVO("�Ҽ���","010-2121-1212","080118-2250820","6000"));
   
      // ȸ���� �׽�Ʈ
      //System.out.println("ȸ���� : " + mData.size());
      //--==>> ȸ���� : 6
     
      // ȸ���� �̸���� �� get() ���
      
      for (int i=0 ; i < mData.size(); i++)
      {
         System.out.println(mData.get(i).getName());
      }      

	  mb.setMemList(mData);
   }//end oldMem()

   // ȸ��������ȸ �޼ҵ� 2��
   public void recogMem() throws IOException 
   { 
      sc = new Scanner(System.in);
      System.out.println("\t[ȸ�� ���� ��ȸ]");
      System.out.print("�ֹε�Ϲ�ȣ�� �Է��ϼ���(xxxxxx-xxxxxxx) : ");
      String temp = sc.next();
      String id, name, tel;
      tel = "";
      id = name = tel;

      boolean flag=false;
      int[] chk = {2, 3, 4, 5, 6, 7, 0, 8, 9, 2, 3, 4, 5}; 
      int tot = 0;

      for (int i=0 ; i<13 ; i++) // i �� 0 1 2 3 4 5 6 7 8 9 10 11 12
	  {
         if (i==6)
         {
             continue;			
         }
         tot += chk[i] * Integer.parseInt(temp.substring(i,i+1));
	  }
	
	  int su = 11 - tot % 11;
      su = su % 10;		

      if (su == Integer.parseInt(temp.substring(13)))
      {
          id = temp;
      }  
      else
      {  
          System.out.println();
          System.out.println("��ȿ�������� �ֹε�Ϲ�ȣ�Դϴ�.");
      }

      for (int i=0 ; i<mData.size() ; i++)
      {
         if (id.equals(mData.get(i).getId()))
         {
           flag = true;
           name = mData.get(i).getName();
           tel = mData.get(i).getTel();
           break;
         }     
      }

      if (flag)
      {
         System.out.println();
         System.out.println("ȸ�������� Ȯ�εǾ����ϴ�.");
         System.out.println();
         System.out.printf(" ��  ��  : %4s\n", name);
         System.out.printf("��ȭ��ȣ : %4s\n", tel);
         System.out.println("");
      }
      
      else
      {
         System.out.println();
         System.out.println("�Է��Ͻ� �ֹε�Ϲ�ȣ�� ȸ������ �̷��� �����ϴ�.");
      }
   }// recogMem()

}

//--------��ȸ������ Ȯ�ο����� �����ȡ�-------------------------------------------------------------------------

//================================================================================================================

/*
	Title	 : Pay
	Function : Ƽ�� ���� �� ���� ����, �������� �Է� �� ���� ��� ���, �ε� �� ���� ���, ��ȭǥ/��ȯ��/������ ���  
	author	 : �輭��, ������
*/

// ȸ��/��ȸ�� Ȯ�� �� ���� ����, ������ ���
class PayDisc extends Record
{
	//MembersVO mb = new MembersVO();		// ȸ�� �ν��Ͻ� ����

	// ȸ�� Ȯ��
	void checkMem()
	{
		do
		{
			Scanner sc = new Scanner(System.in);

			System.out.print("\n\t=================================");
			System.out.print("\n\t1.ȸ�� / 2.��ȸ��");
			System.out.print("\n\t=================================");
			System.out.print("\n\t�ش��ϴ� ��ȣ�� �Է����ּ��� : ");
			sel = sc.nextInt();

			if (sel>0)
			{
				if (sel==1 || sel==2)
					break;
				System.out.println(">> �߸��� ��ȣ�� �Է��߽��ϴ�. �ٽ� �Է����ּ���.\n");
			}
		}
		while (sel<1 || sel>2);

		if (sel==1)
		{
			System.out.println("\n\n\t[ ȸ�� ���� Ȯ�� ]");
			System.out.println("\t====================================");
			System.out.println("\t��ȭ ��ȣ�� �Է����ּ���.(xxx-xxxx-xxxx)\n\t:");
			System.out.println(m.getMemList().isEmpty());
			
			
		}
		else if(sel==2)
			System.out.print("\t��ȸ��");
	}

	void checkTel()
	{
	}

}

// ���� ����� �ݾ� + ���� �߰����� Ȯ�� �� �����ݾ� ���� Ŭ����
class Pay extends Record
{
	AdminCashVO ac = new AdminCashVO(); // ���� ���� VO �ν��Ͻ� ����
	
	int moviePayTot = 20000;
	int payTot = moviePayTot + snackPayTot;
	int a, b, c, d, inputTot, chaCash; // ���� �Է¹޾� ���翡 �ݿ��ϱ� ���� a,b,c,d ����
								  // �Է��� �� ����, �Ž�����(changeCash)

	public static boolean flag = false;

	// ���� �߰� ���� Ȯ�� �� ����
	void selSnack() throws InterruptedException,IOException
	{
		BuySnacks bst = new BuySnacks(); // ���� ���� VO �ν��Ͻ� ����
		Scanner sc = new Scanner(System.in);

		char answer;

		System.out.print("\n>> ����/���� �߰� ���� �Ͻðڽ��ϱ�?(Y/N) : ");
		answer = (char)System.in.read();
		
		if (answer=='Y' || answer=='y')
		{
			bst.snackMenu();
		}
		else
			selPay();
	}

	// ���� ���� ���� �޼ҵ�
	void selPay() throws InterruptedException,IOException
	{
		System.out.print("\n\t=================================");
		System.out.printf("\n\t���� ���� �ݾ��� %d�Դϴ�.", payTot);
		System.out.print("\n\t=================================");
		do
		{
			Scanner sc = new Scanner(System.in);

			System.out.println("\n\t1. ����");
			System.out.println("\t2. ī��");
			System.out.print("\t���� ����� �Է����ּ��� : ");

			sel = sc.nextInt();

			if (sel>0)
			{
				if (sel==1 || sel==2)
					break;
				System.out.println("\t>> �߸��� ��ȣ�� �Է��߽��ϴ�. �ٽ� �Է����ּ���.\n");
			}
		}
		while (sel<1 || sel>2);

		if (sel==1)
			payCash();
		else if(sel==2)
			payCard();

	} // end selPay() ���� ���� ���� �޼ҵ�

	// ���� ����
	void payCash() throws InterruptedException,IOException
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("\n\t������ �ݾ��� ���󺰷� �Է����ּ���.");

		do
		{
			flag = false;
			System.out.print("\n\t50000���� : ");
			a = sc.nextInt();
			System.out.print("\t10000���� : ");
			b = sc.nextInt();
			System.out.print("\t5000����  : ");
			c = sc.nextInt();
			System.out.print("\t1000����  : ");
			d = sc.nextInt();

			inputTot = 50000*a + 10000*b + 5000*c + 1000*d;

			System.out.printf("\n\t50000���� %d��, 10000���� %d��, 5000���� %d��, 1000���� %d�� \n\t�� [%d��] �����߽��ϴ�.\n", a, b, c, d, inputTot);

			if (payTot>inputTot)
			{
				flag = true;
				System.out.printf("\n\t[�� ���� �ݾ�(%d)]���� [%d��]���� �����߽��ϴ�. �ٽ� �Է����ּ���.\n", payTot, payTot-inputTot);
			}
		}
		while (flag);

		if (payTot<inputTot) // �� �ݾ׺��� ���� �������� �� �� �Ž�����
		{
			//----------------- ���翡 �Է¹��� �� �ݿ�
			ac.setOmanwon(a);
			ac.setManwon(b);
			ac.setOcheonwon(c);
			ac.setCheonwon(d);

			//----------------- �Ž����� ���
			chaCash = inputTot-payTot;

			int oman = chaCash / 50000;
			int man = chaCash % 50000 / 10000;
			int ocheon = chaCash % 50000 % 10000 / 5000;
			int cheon = chaCash % 50000 % 10000 % 5000 / 1000;

			if (chaCash>payHap) // �Ž������� ���� ���뿡 �ִ� �ݾ׺��� ���� ��(=�Ž����� �� ����)
			{
				AdminVO ad = new AdminVO(); // ������ �߰��ϱ� ���� AdminVO �ν��Ͻ� ����
				String add = "\n\t������ ��� ���� �������� ���� ������ ������ �� �����ϴ�. ī�� ������ �����մϴ١�\n";
				ad.addNotice(add);


				System.out.print("\n\t�˼��մϴ�. ���� ��迡 ���� �������� �ܵ� ��ȯ�� �Ұ��Ͽ� ������ ������ �� �����ϴ�.");
				System.out.print("\n\t==========================================");
				System.out.print("\n\t1.ī��� �����ϱ� | 2. ���� �������� �ʱ�");
				System.out.print("\n\t==========================================");
				System.out.print("\n\t>> �ٸ� ����� �Է����ּ��� : ");
				sel = sc.nextInt();

				if (sel==1)
					payCard();
				else if (sel==2)
					System.out.print("\n\t����� �޴� ȣ��");
				else
					System.out.println("\t>> �߸��� ��ȣ�� �Է��߽��ϴ�. �ٽ� �Է����ּ���.\n");
			}
			else
			{
				System.out.printf("\n\t���Ǳ� �ϴܿ� �Ž����� [50000���� %d��, 10000���� %d��, 5000���� %d��, 1000���� %d��]", oman, man, ocheon, cheon);
				System.out.printf("\n\t�� [%d��] �޾ư�����.",chaCash);
			}

			//----------------- ������ �Ž����� ���翡 �ݿ�(����)
			ac.setOmanwon(-(oman));
			ac.setManwon(-(man));
			ac.setOcheonwon(-(ocheon));
			ac.setCheonwon(-(cheon));
			ac.setCashMovie(moviePayTot);
			ac.setCashSnacks(snackPayTot);
		}
		else if (payTot==inputTot)
		{
			ac.setOmanwon(a);
			ac.setManwon(b);
			ac.setOcheonwon(c);
			ac.setCheonwon(d);
			ac.setCashMovie(moviePayTot);
			ac.setCashSnacks(snackPayTot);

			System.out.printf("\n%d�� ���� ��.\n", inputTot);
		}
		
	}// end payCash() ���� ���� �޼ҵ�
	
	// ī�� ����
	void payCard() throws InterruptedException,IOException
	{
		System.out.print("\n\t�ܸ��⿡ ī�带 �������ּ���.\n\t");

        for (int i = 0; i<3; i++) 
		{
            System.out.print("..");
            Thread.sleep(2000);
        }
        System.out.print("������ �������̿��� ī�带 ��������������...\n\t");

		for (int i = 0; i<2; i++) 
		{
            System.out.print(".");
            Thread.sleep(2000);
        }
		System.out.println("\n\n\t������ �Ϸ�ƽ��ϴ�!\n\tī�带 �������ּ���.\n");
		ac.setCardMovie(moviePayTot);
		ac.setCardSnacks(snackPayTot);

		//printAd();
	} // end payCard() ī�� ����

	// ���� �� ��� ���� Ȯ��
	void printAd() throws InterruptedException
	{
		System.out.println("\n\n====================================");
		System.out.print("��ȭ Ƽ�� ������Դϴ�");
		for (int i = 0; i<3; i++) 
		{
            System.out.print(".");
            Thread.sleep(2000);
        }
		System.out.println("\n====================================");
		System.out.print("|��ȭ Ƽ�� ���|");
		System.out.println("\n\n�������� ����Ͻðڽ��ϱ�?(Y/N) : ");
		// ���� �������� �� ��ȯ�ǵ� �߰��ؾ� ��.
		
	}
}

//==================================================================================================================


public class PayTest
{
	public static void main(String[] args) throws InterruptedException,IOException
	{	
		//Pay p = new Pay();
		PayDisc pd = new PayDisc();
		//AdminCash s = new AdminCash();

		// --- �ƺ� �ۼ� ---- //
        Members m = new Members();
		
		//p.selSnack();
		pd.checkMem();
		//s.menuCash();

		Admin ob = new Admin();
		ob.pw();



	}
}