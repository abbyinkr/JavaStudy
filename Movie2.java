
// import
import java.util.Scanner;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;
import java.util.Iterator;

// ������ ��� Ŭ����
class Record 
{
  static Integer sel;      //-- �޴� ���� ���� ��� ����
  static Scanner sc;       //-- Scanner �޸� �Ҵ�
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

// ȸ�� ���� Ŭ���� 
class Members extends Record // ������, ��ƺ�
{
   //  MemebersVO ������� ������ ��ü�� data�� ���� ���ִ�.
   ArrayList<MembersVO> mData = new ArrayList<MembersVO>();

   // ȸ������ �޴� 
   public static void mMenuDisp()
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
      
      
      
   }//end oldMem()
   
   // ȸ�� ���� �޼ҵ�
   
   public void signIn() throws IOException
   { 
      /*
      sc = new Scanner(System.in);
      String name, tel, id, point;
      System.out.println();
      System.out.println("ȸ������ �޴��� �����̽��ϴ�.");
      System.out.println("�ϴ��� ������ �Է��ϼ���.");
      System.out.print("�̸��� �Է��ϼ��� : ");
      name = sc.next();
      System.out.print("��ȭ��ȣ�� �Է��ϼ���(010-xxxx-xxxx) : ");
      tel = sc.next();
      System.out.print("�ֹε�Ϲ�ȣ�� �Է��ϼ���(xxxxxx-xxxxxxx): ");
      
      String temp = sc.next();

      int[] chk = {2, 3, 4, 5, 6, 7, 0, 8, 9, 2, 3, 4, 5}; 
      int tot = 0;

      if (temp.length() == 14)
      {
         id = temp;
      }
      else
      {
         System.out.println(">> �ֹε�Ϲ�ȣ �Է¿����Դϴ�.");
         //signIn();
      }
      
      
      /*
      for (int j=0 ; j<13 ; j++) // i �� 0 1 2 3 4 5 6 7 8 9 10 11 12
      {
         if (j==6)
             continue;

         tot += chk[j] * Integer.parseInt(str.substring(j,j+1)); // �޺κ�
         int su = 11 - tot % 11;
         su = su % 10;

         if (su == Integer.parseInt(str.substring(13)))
         {
          System.out.println(">> ��ȿ�� �ֹι�ȣ�Դϴ�");
          info[2] = str;
         }
 
         else
          System.out.println(">> �ֹε�Ϲ�ȣ�� ��ȿ���� �ʽ��ϴ�.");
      }
      continue;
      
      info[i] = sc.next().trim();
   

      info[3] = "500";
      System.out.println("�������ּż� �����մϴ�. ���� ������ 500���� �����Ǿ����ϴ�.");
   

      /*
      û�ҳ� �ֹι�ȣ
      071022-1639841
      080118-2250820

       ���� �ֹι�ȣ
      760411-2575452
      651126-2127984
      761128-2376461
      610125-2066131
      641014-2211410
      */  

   }//end signIn()
   
   
   // ���ڿ� �迭 ����
   
    /*
	-ȸ��/��ȸ�� Ȯ�� �� �˻�
	-���Խ� ���� �Է�
	-�޴�����ȣ/�ֹι�ȣ �ߺ� �� ��ȿ�� �˻�
	-������ Ȯ�� 
    */
}

class User extends Record
{
   public static void menuSelect()
   {
      sel = sc.nextInt();
   }// end menuSelect()
}//end class Members


////////////////////////////////////////////////////////////////////////////////
public class Movie2
{
   public static void main(String[] args) throws IOException
   {
      Members m = new Members();

      // �� ���� ȸ�� ���� ��� �޼ҵ�
      m.oldMem();

      /*
      while (true)
      {
         m.mMenuDisp();
         User.menuSelect();
         m.mMenuRun();
      }
      */
   }
}