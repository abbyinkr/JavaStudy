// import
import java.util.Scanner;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;
import java.util.Iterator;
import java.util.Random;

// ������ ��� Ŭ����
class Record 
{
  static Integer sel;      //-- �޴� ���� ���� ��� ����
  static Scanner sc;       //-- Scanner �޸� �Ҵ�
}

// Ŭ���� ��ü�� ������ �����ؾߵǴ� ���� static ������ �����ϸ�
// ���� ������ ������ ��������� �ȴ�. �׷��� static�� �����Ѵ�.
//getter, setter ���� this.������ �ۼ��ؾ� �Ѵ�.

/*
2021-03-18
��ƺ�:
������-������ Ŭ���� �ϼ�
�����-���θ޴� Ŭ���� �ϼ�
 - ���θ޴�/ �����޴� ���� ����� ����� Ŭ���� ��� Ʋ ���� �Ŀ� ���� ����
�����-ȸ������ Ŭ���� �ϼ�
�����-��ȭ ���� Ŭ���� ������
*/

//-----------------------------------------------------������ : ������ ���� Ŭ����
class StocksVO
{
   // ����, ���� ������
   private static int cida;
   private static int coke=cida=100;
   private static int popcorn = 50;
   private static int paper = 300;

   // getter, setter �޼ҵ�
   public int getCoke()
   { return coke; }
   
   public void setCoke(int coke)
   { StocksVO.coke += coke; }

   public int getCida()
   { return cida; }

   public void setCida(int cida)
   { StocksVO.cida += cida; }

   public int getPop()
   { return popcorn; }

   public void setPop(int popcorn)
   { StocksVO.popcorn += popcorn; }

   // ���� ��� ��ȯ �޼ҵ�
   public int getPaper()
   { return paper; }

   public void setPaper(int paper)
   { StocksVO.paper += paper; }

}//end class StockVO


//--------------------------------------------------������ : ������ Ŭ���� <�ϼ�>
class Stocks extends Record // ��ƺ�, ������
{
   StocksVO asv = new StocksVO();
   
   // ������ ���� �޴� ��� �޼ҵ�
   public void menuStocks() 
   {
      //sc = new Scanner(System.in);
      System.out.println("\n===========================");
      System.out.println(" 1. �ݶ� ��� Ȯ��/����");
      System.out.println(" 2. ���̴� ���Ȯ��/����");
      System.out.println(" 3. ���� ��� Ȯ��/����");
      System.out.println(" 4. ������ �޴��� ���ư���");
      System.out.println("===========================");
      System.out.print("  ��ȣ�� �Է��ϼ���(1~4) : ");
   }
  
   // ������ �޴� ȣ�� �޼ҵ�
   public void menuRun() throws IOException
   {
      switch (sel)
      {
      case 1: addCoke(); break;
      case 2: addCida(); break;
      case 3: addPop(); break;
      //case 4: break; �� �����ڸ޴� ȣ��޼��� �Է� �ʿ�
      default: System.out.println("�Է� �����Դϴ�."); break;
      }
   }
   
   // �ݶ� ���Ȯ�� �� ���� �޼ҵ�
   public void addCoke() throws IOException
   {
      sc = new Scanner(System.in);
      
      System.out.println();
      System.out.printf("���� �ݶ�ĵ�� ���� %d���Դϴ�.\n", asv.getCoke());
      System.out.print("��� �����Ͻðڽ��ϱ�?(Y/N): ");
      char sel;
      sel = (char)System.in.read();

      if (sel=='y' || sel =='Y')
      {
         
         System.out.print("������ ������ �Է��ϼ��� : ");
         int n = sc.nextInt();

         if (n+asv.getCoke()>300)
            System.out.println("���� ����� 300���� �ʰ��Ҽ� �����ϴ�.");
         else
         {
            asv.setCoke(n);
            System.out.println("������ �Ϸ�Ǿ����ϴ�.");
            System.out.printf("���� �ݶ��� ���� %d�Դϴ�.\n", asv.getCoke());
            System.out.println();
         }   
      }
   }//end addCoke()

   // ���̴� ���Ȯ�� �� ���� �޼ҵ�
   public void addCida() throws IOException
   {
      sc = new Scanner(System.in);
      
      System.out.println();
      System.out.printf("���� �ݶ�ĵ�� ���� %d���Դϴ�.\n", asv.getCida());
      System.out.print("��� �����Ͻðڽ��ϱ�?(Y/N): ");
      char sel;
      sel = (char)System.in.read();

      if (sel=='y' || sel =='Y')
      {
         
         System.out.print("������ ������ �Է��ϼ��� : ");
         int n = sc.nextInt();

         if (n+asv.getCida()>300)
            System.out.println("���� ����� 300���� �ʰ��Ҽ� �����ϴ�.");
         else
         {
            asv.setCida(n);
            System.out.println("������ �Ϸ�Ǿ����ϴ�.");
            System.out.printf("���� �ݶ��� ���� %d�Դϴ�.\n", asv.getCida());
            System.out.println();
         }   
      }
   }//end addCida()


   // ���� ���Ȯ�� �� ���� �޼ҵ�
   public void addPop() throws IOException
   {
      sc = new Scanner(System.in);
      
      System.out.println();
      System.out.printf("���� �ݶ�ĵ�� ���� %d���Դϴ�.\n", asv.getPop());
      System.out.print("��� �����Ͻðڽ��ϱ�?(Y/N): ");
      char sel;
      sel = (char)System.in.read();

      if (sel=='y' || sel =='Y')
      {
         
         System.out.print("������ ������ �Է��ϼ��� : ");
         int n = sc.nextInt();

         if (n+asv.getPop()>300)
            System.out.println("���� ����� 300���� �ʰ��Ҽ� �����ϴ�.");
         else
         {
            asv.setPop(n);
            System.out.println("������ �Ϸ�Ǿ����ϴ�.");
            System.out.printf("���� �ݶ��� ���� %d�Դϴ�.\n", asv.getPop());
            System.out.println();
         }    
      }
   }//end addPop()

   // ���� ���� �� ���� �޼ҵ�
   public void addPaper() throws IOException
   {
      sc = new Scanner(System.in);

      System.out.printf("\t���� ������ ����� %d���Դϴ�.\n", asv.getPaper());
      System.out.print("\t��� �����Ͻðڽ��ϱ�?(Y/N): ");
      char sel;
      sel = (char)System.in.read();
 
      if (sel=='y' || sel =='Y')
      {
         
         System.out.print("������ ������ �Է��ϼ��� : ");
         int n = sc.nextInt();

         if (n+asv.getPaper()>1000)
            System.out.println("���� ����� 1000���� �ʰ��Ҽ� �����ϴ�.");
         else
         {
            asv.setPaper(n);
            System.out.println("������ �Ϸ�Ǿ����ϴ�.");
            System.out.printf("���� ������ ����� %d���Դϴ�.\n", asv.getPaper());
            System.out.println();
         }    
      }
   }//end addPaper()

}//end class Stocks

//---------------------------------------------------------����� : ��ȭ ���� Ŭ����

class ReserveTiketsVO // ��ƺ�, �輭��
{
   static private char[] mr0 = {'A','B','C','D','E','F','G','H','I','K'}; // �󿵰� ��
   // 1�� 10x5 �迭
   static private char[] mr1 = new char[50];
   // 2�� 10x5 �迭 
   static private char[] mr2 = new char[50];
   // 3��  8x4 �迭
   static private char[] mr3 = new char[32];

   ReserveTiketsVO()
   {
      // 1�� �¼� �Է�
      for (int i=0; i<mr1.length; i++)
      {
         mr1[i] = '��'; // ���¼�
         if(i%3==0)
            mr1[i] = '��'; // �Ÿ��α�� ���ɴ� �¼�
      }
      
      // 2�� �¼� �Է� (1�� �迭 ����)
      mr2 = (char[])mr1.clone(); // ���� �ǹ��� �迭 �������
      
      // 3�� �¼� �Է�
      for (int i=0; i<mr3.length; i++)
      {
         mr3[i] = '��';
         if(i%3==0)
            mr3[i] = '��'; 
      }
   }

   // getter, setter
   public char[] getZero()
   {
      return mr0;
   }

   public void setZero(char[] mr0)
   {
      ReserveTiketsVO.mr0 = mr0;
   }


   public char[] getOne()
   {
      return mr1;
   }

   public void setOne(char[] mr1)
   {
      ReserveTiketsVO.mr1 = mr1;
   }

   public char[] getTwo()
   {
      return mr2;
   }

   public void setTwo(char[] mr2)
   {
      ReserveTiketsVO.mr2 = mr2;
   }

   public char[] getThree()
   {
      return mr3;
   }

   public void setThree(char[] mr3)
   {
      ReserveTiketsVO.mr3 = mr3;
   }

}


class ReserveTikets // �輭��, ��ƺ�
{
   ReserveTiketsVO rtv = new ReserveTiketsVO();


   // 1�� �¼� ���
   public void printOne()
   {
      System.out.println("\t [2D 1��]");
      System.out.println("  --------Screen--------  \n\n");
      for (int i=0 ; i<5; i++)
      {
         System.out.print(rtv.getZero()[i] + "�� ");
         for (int j=10*i; j<10*(i+1); j++) // i=0 �� j : 0 ~ 9 , i = 1 �� j : 10~18  
         {
            System.out.print(rtv.getOne()[j]);
            if (j%10==1 || j%10==7)
            {
               System.out.print(" ");
            }

            if (j%10 == 9)
            {
               System.out.println();
               for (int k=0; k<1; k++)
               {
                  System.out.println("   1 2  3 4 5 6 7 8  9 10");
               }
            }
         }
      }// 1�� �¼�ȭ�� ���
   }//end printOne()

   // 2�� �¼� ��� 
   public void printTwo()
   {
      // 2�� �¼�ȭ�� ���
      System.out.println("\t [2D 2��]");
      System.out.println("--------Screen--------  \n\n");
      for (int i=0 ; i<5; i++)
      {
         System.out.print(rtv.getZero()[i] + "�� ");
         for (int j=10*i; j<10*(i+1); j++) // i=0 �� j : 0 ~ 9 , i = 1 �� j : 10~18  
         {
            System.out.print(rtv.getTwo()[j]);
            if (j%10==1 || j%10==7)
               System.out.print(" ");
            if (j%10 == 9)
            {
               System.out.println();
               for (int k=0; k<1; k++)
                  System.out.println("   1 2  3 4 5 6 7 8  9 10");
            }
         }
      } 
   }//end printTwo()

   // 3�� �¼�ȭ�� ���
   public void prinThree()
   {
      System.out.println("\t\t [4D 4��]");
      System.out.println("\t----------Screen-----------\n\n");
      for (int i=0 ; i<4; i++)
      {
         System.out.print("\t  "+ rtv.getZero()[i] + "�� ");
         for (int j=8*i; j<8*(i+1); j++) // i=0 �� j :  
         {
            System.out.print(rtv.getThree()[j]);
            if (j%8==3)
               System.out.print("  ");
            if (j%8 == 7)
            {
               System.out.println();
               for (int k=0; k<1; k++)
                  System.out.println("\t     1 2 3 4   5 6 7 8");
            }
         }
      }
   }//end printThree()

    /*
	-��¥ ��� �� �Է�
	-��ȭ������ͼ���+��ȭ�Է�+��ȭ�������
	-�����ð��� �Է� 
	-�������� Ȯ�� 
	-�ο� �Է� 
	-���� ���� �¼� ���
	-�¼� �Է� 
	-����Ȯ�� ��� 
	-ȸ��/��ȸ�� Ȯ�� �� �˻� ȣ��
    - ����Ʈ���� ��ȭ�����ݾ��� 5%, 100�� ������ �ø� ó��


    // ������ �¼� ���� �ٲٱ�

    char[] st = new char[50];
    ���������� ������������
     �������� ������������
     �������� ������
     ����ڰ� ������ �¼� �ε����� �޾Ƽ� �� �� �� �� �ٲ��ټ��ִ�!
    */
}


//---------------------------------------------����� : ���� �޴� User Ŭ���� <�ϼ�>
class User extends Record // ��ƺ�, �Ҽ��� 
{
   //�޴��޴��޴�
   public void startUser()
   {
      do
      {
         menuDisp();
         menuSelect();
         menuRun();
      }
      while (true);
   }


   // �ֿ� ���� ���� �� �ν��Ͻ� ����
   static Scanner sc = new Scanner(System.in);

   // ������ �����޼ҵ� ���� 
   //Admin.notice();

   //-���� Ȯ��/��ȭ ����/����,���� ����/ȸ�� ����/�����ڸ��� �̵�(switch)
   // �޴� ��� �޼ҵ� --- �ϼ� 
   public static void menuDisp()
   {
      System.out.println("\n\n");
      System.out.println("=========�޴�  ����=========");
      System.out.println("    1.  ��ȭ ����     ");
      System.out.println("    2.  ���� Ȯ��     ");
      System.out.println("    3. ����/���� ���� ");
      System.out.println("    4.  ȸ�� ����     ");
      System.out.println("===========================");
      System.out.print(">> �޴� ����(1~4) : "); 
      // �����ڸ޴��� 1004��(����)
   }// end menuDisp()

   // �޴� ���� �޼ҵ� --- �ϼ�(�ٸ� Ŭ�������� �������� �� User.menuSelect();)
   public static void menuSelect()
   {
      sel = sc.nextInt();
   }// end menuSelect


   //-�ʱ�ȭ��/����ȭ�� �̵� �޼ҵ� �� ���� ��


   // ���õ� �޴� ���࿡ ���� ��� ȣ�� �޼ҵ�
   public static void menuRun()
   { 
      /*
      switch (sel)
      {
      //��ȭ ���� �޼ҵ� 1��
      case UserMenuSel.RESERVE_TICKETS : reserveTikets(); break;
      // ���� Ȯ�� �޼ҵ� 2��
      case UserMenuSel.CONFIRM_TICKETS : ConfirmReservation(); break;

      // ����, ���� ���� �޼ҵ� 3��
      case UserMenuSel.BUY_SNACKS : 
      
      // ȸ������ �޼ҵ� 4��
      case UserMenuSel.SIGN_IN : 
      
      // �����ڸ޴�(����޴�) 1004��
      case UserMenuSel.ADMIN : 
      default: System.out.println("1~4���� �������ּ���."); break;
      }
      */
      
   }// end menuRun()
}//end User class

 
// ���� �޴� ���ð��� ��� Ŭ����
class UserMenuSel
{
  // ���ȭ�� ������(�޴�)
  final static int RESERVE_TICKETS = 1;
  final static int CONFIRM_TICKETS = 2;
  final static int BUY_SNACKS = 3;
  final static int SIGN_IN = 4;
  private static final int ADMIN = 1004;  //����
}

class MembersVO
{
   // �̸�, �ڵ�����ȣ, ���̵�, ����Ʈ
   private String name; 
   private String tel;
   private String id;
   private String point;

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

// ȸ������ �޴� ���ð��� ��� Ŭ����
class memMenuSel
{
  // ���ȭ�� ������(�޴�)
  final static int SIGN_IN = 1;
  final static int CONFIRM_MEMBER = 2;
  final static int MAIN_MENU = 3;
}



//-------------------------------------------------����� : ȸ�� ���� Ŭ���� <�ϼ�>
class Members extends Record // ������, ��ƺ�
{
   // �޴��޴��޴�
   User user = new User();

   //  MemebersVO ������� ������ ��ü�� data�� ���� ���ִ�.
   ArrayList<MembersVO> mData = new ArrayList<MembersVO>();

   // �޴��޴��޴�--->>> Ŭ������ �̵������ϰ�....
   public void startMem() throws IOException
   {
      do
      {
         mMenuDisp();
         User.menuSelect();
         mMenuRun();
      }
      while (true);

   }


   // ȸ������ �޴� 
   public void mMenuDisp()
   {
      System.out.println("\n");
      System.out.println("=========ȸ�� ��� �޴�=========");
      System.out.println("    1.  ȸ��      ����     ");
      System.out.println("    2.  ȸ�� ���� ��ȸ   ");
      System.out.println("    3.    ���� �޴�   ");
      System.out.println("================================");
      System.out.print(">> �޴� ����(1~3) : "); 
   }// end memMenuDisp()

   // ���õ� �޴� ���࿡ ���� ��� ȣ�� �޼ҵ�
   public void mMenuRun() throws IOException
   { 
      switch (sel)
      {
      //ȸ������ �޼ҵ� 1��
      case memMenuSel.SIGN_IN :  signIn(); break;
      // ȸ��������ȸ �޼ҵ� 2��
      case memMenuSel.CONFIRM_MEMBER : recogMem(); break;

      // ���θ޴� �޼ҵ� 3��
      case memMenuSel.MAIN_MENU : user.startUser();  break;
      
      default: System.out.println("1~3���� �������ּ���."); break;
      }
   }// end memMenuRun()


   // ���� ȸ�� ���� �߰� �޼ҵ� -- �ϼ�
   public void oldMem()
   {
      //���� ȸ��
      mData.add(new MembersVO("��ƺ�","010-1111-1111","760411-2575452","2500"));
      mData.add(new MembersVO("�輭��","010-2222-2222","651126-2127984","5000"));
      mData.add(new MembersVO("������","010-3333-3333","610125-2066131","10000"));
      mData.add(new MembersVO("������","010-4444-4444","641014-2211410","500"));
      //û�ҳ� ȸ��
      mData.add(new MembersVO("û�ҳ�","010-5555-5555","071022-1639841","2000"));
      mData.add(new MembersVO("�Ҽ���","010-1212-1212","080118-2250820","6000"));
   
      // ȸ���� �׽�Ʈ
      //System.out.println("ȸ���� : " + mData.size());
      //--==>> ȸ���� : 6
     
      // ȸ���� �̸���� �� get() ���
      
      /*
      for (int i=0 ; i < mData.size(); i++)
      {
         System.out.println(mData.get(i).getName());
      }
      */
      //--==>>
      /*
      ��ƺ�
      �輭��
      ������
      ������
      û�ҳ�
      �Ҽ���
      */
   }//end oldMem() 

   // ȸ�� ���� �޼ҵ� -- �ϼ�  
   public void signIn() throws IOException 
   { 
      sc = new Scanner(System.in);
      String name, tel, id, point, temp;
      System.out.println();
      System.out.println("\t[ȸ�� ����]");
      System.out.println("�ϴ��� ������ �Է��ϼ���.");
      System.out.print("�̸��� �Է��ϼ��� : ");
      name = sc.next();
      tel = "";
     
      // �ߺ����� ���� ��ȭ��ȣ �ޱ�
      System.out.print("��ȭ��ȣ�� �Է��ϼ���(xxx-xxxx-xxxx) : ");
      temp = sc.next();
      for (int i=0 ; i<mData.size() ; i++)
      {
         if (temp.equals(mData.get(i).getTel()))
         {
            System.out.println("�ߺ��� ��ȭ��ȣ�Դϴ�.");
            System.out.print("��ȭ��ȣ�� �Է��ϼ���(xxx-xxxx-xxxx) : ");
            temp = sc.next();
         }
         else
            tel = temp;
      }

      // �ߺ����� ���� �ֹε�Ϲ�ȣ �ް� ��ȿ�� �˻��� ȸ������
      System.out.print("�ֹε�Ϲ�ȣ�� �Է��ϼ���(xxxxxx-xxxxxxx) : ");
      temp = sc.next();
      for (int i=0 ; i<mData.size() ; i++)
      {
         if (temp.equals(mData.get(i).getId()))
         {
            System.out.println("�ߺ��� �ֹε�Ϲ�ȣ�Դϴ�.");
            System.out.print("�ֹε�Ϲ�ȣ�� �Է��ϼ���(xxxxxx-xxxxxxx) : ");
            temp = sc.next();
         }
      }

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

      // ���� ��� ���

      if (su == Integer.parseInt(temp.substring(13)))
      {
          id = temp;
          // ���� ������ 500�� ����
          point = "500";

          // ȸ�� �߰�
          mData.add(new MembersVO(name,tel,id,point));

          // �׽�Ʈ
          //for (int i=0 ; i < mData.size(); i++)
          //  System.out.println(mData.get(i).getName());
         
          System.out.println("===================================");
          System.out.println("     �������ּż� �����մϴ�.");
          System.out.println("���� ������ 500���� �����Ǿ����ϴ�.");
          System.out.println("===================================");
          
      }  
      else
      {
          System.out.println("��ȿ�������� �ֹε�Ϲ�ȣ�Դϴ�.");
      }

   }//end signIn()

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

}// end class Members


//=============================================�ۡۡۡ�===============================================//


public class Movieab
{
   public static void main(String[] args) throws IOException
   {


      // ������ ��� ���� �޴�(����/����/����)
      Stocks as = new Stocks();
      /*
      while (true)
      {
         as.menuStocks();
         User.menuSelect();
         as.menuRun();
      }
      */

      // ȸ�� ���� ���� �޴� 
      Members m = new Members();
      m.startMem();
      /*
      while (true)
      {
         m.mMenuDisp();
         User.menuSelect();
         m.mMenuRun();
      }
      */
      ReserveTikets rt = new ReserveTikets();



      




      



      
      
   }
}