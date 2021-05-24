/*===================================
  ���� �÷��� (Collection) ���� 
===================================*/

// �� �ǽ� ����
//    ���� �ۼ����� Test158 Ŭ������ �ϼ��Ͽ�
//    ���� ����� ���� ���α׷��� �����Ѵ�.

/*
���� ��)

     [�޴� ����]
     1. ��� �߰�
     2. ��� ���
     3. ��� �˻�
     4. ��� ����
     5. ��� ����
     6. ����
     >> �޴�����(1~6) : 1

     1��° ��� �Է� : ������
     1��° ��� �Է� ����~!!!
     ��� �Է� ���(Y/N) : y

     2��° ��� �Է� : ������
     2��° ��� �Է� ����~!!!
     ��� �Է� ���(Y/N) : n

      [�޴� ����]
     1. ��� �߰�
     2. ��� ���
     3. ��� �˻�
     4. ��� ����
     5. ��� ����
     6. ����
     >> �޴�����(1~6) : 2

     [���� ��ü ���]
         ������
         ������
     ���� ��ü ��� �Ϸ�~!!!

     [�޴� ����]
     1. ��� �߰�
     2. ��� ���
     3. ��� �˻�
     4. ��� ����
     5. ��� ����
     6. ����
     >> �޴�����(1~6) : 3

     �˻��� ��� �Է� : ������

     [�˻� ��� ���]
     �׸��� �����մϴ�.

     [�޴� ����]
     1. ��� �߰�
     2. ��� ���
     3. ��� �˻�
     4. ��� ����
     5. ��� ����
     6. ����
     >> �޴�����(1~6) : 4

     ������ ��� �Է� : ������

     [���� ��� ���]
     �׸��� �������� �ʾ� ������ �� �����ϴ�.

     [�޴� ����]
     1. ��� �߰�
     2. ��� ���
     3. ��� �˻�
     4. ��� ����
     5. ��� ����
     6. ����
     >> �޴�����(1~6) : 5

     ������ ��� �Է� : ������
     ������ ���� �Է� : ������

     [���� ��� ���]
     ������ �Ϸ�Ǿ����ϴ�.

     [�޴� ����]
     1. ��� �߰�
     2. ��� ���
     3. ��� �˻�
     4. ��� ����
     5. ��� ����
     6. ����
     >> �޴�����(1~6) : 6

     ���α׷� ����
     ����Ϸ��� �ƹ� Ű��...
*/

import java.util.Vector;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;



class Menus //--�ϼ�~!!! (���� NO)
{
   public static final int E_ADD=1;    //-- ��� �߰�
   public static final int E_DISP=2;   //-- ��� ���
   public static final int E_FIND=3;   //-- ��� �˻�
   public static final int E_DEL=4;    //-- ��� ����
   public static final int E_CHA=5;    //-- ��� ����
   public static final int E_EXIT=6;   //-- ����
}

public class Test158 
{
   // �ֿ� �Ӽ� ���� -- �ϼ�~!!! 
   private static final Vector<Object> vt;
   private static BufferedReader br;
   private static Integer sel;         //-- ���� ��
   private static String con;          //-- ��� ����


   // static �ʱ�ȭ ��   -- �ϼ�~!!!
   static 
   {
      // Vector �ڷᱸ�� ����
      vt = new Vector<Object>();

      // BufferedReader Ŭ���� �ν��Ͻ� ����
      br = new BufferedReader(new InputStreamReader(System.in));

      // ����� �Է°� �ʱ�ȭ
      sel = 1;
      con = "Y";
   }

   // �޴� ��� �޼ҵ� (�ϼ�)

   public static void menuDisp()
   {
      System.out.println("\n\n\t[ �޴� ���� ]");
      System.out.println("\t1. ��� �߰�");
      System.out.println("\t2. ��� ���");
      System.out.println("\t3. ��� �˻�");
      System.out.println("\t4. ��� ����");
      System.out.println("\t5. ��� ����");
      System.out.println("\t6. ����");

      System.out.print("\t>> �޴� ����(1~6) : "); 
   }

   // �޴� ���� �޼ҵ�
   public static void menuSelect() throws IOException
   {  /*
      //menuRun()���� default �Ⱦ��Ÿ� do~while������ �ۼ�
      do
      {
         sel =  Integer.parseInt(br.readLine());
      }
      while (sel<Menus.E_ADD || sel>Menus.E_EXIT);
      */

      sel =  Integer.parseInt(br.readLine());

   }

   // ���õ� �޴� ���࿡ ���� ��� ȣ�� �޼ҵ�

   public static void menuRun() throws IOException
   {
      switch (sel)
      {
      case Menus.E_ADD : addElement(); break;
      case Menus.E_DISP : dispElement(); break;   
      case Menus.E_FIND : findElement(); break;
      case Menus.E_DEL : delElement(); break;
      case Menus.E_CHA : chaElement(); break;
      case Menus.E_EXIT : exit(); break;
      default: System.out.println("�޴� ���� ����~!!"); break;
      }
   }

   // ��� �߰�(�Է�) �޼ҵ�
   public static void addElement() throws IOException
   {
     int i = 1;
     do
     {
         System.out.printf("%d��° ��� �Է� : ", i);
         //String str = br.readLine();
         vt.add(br.readLine());
         System.out.printf("%d��° ��� �Է� ����~!!!\n", i++);
         System.out.println("��� �Է� ���(Y/N) : ");
         con = br.readLine();
         //if (con.equals("y") || con.equals("Y"))
         //   i++;
     }
     while (con.equals("y") || con.equals("Y"));
   }

   // ��� ��� �޼ҵ�
   public static void  dispElement()
   {
      System.out.println("\t���� ��ü ���");
      for (Object element: vt)
      {
         System.out.println((String)element);
      }
      System.out.println("\t���� ��ü ��� �Ϸ�~!!!");
   }

   // ��� �˻� �޼ҵ�
   public static void findElement() throws IOException
   {
      
      System.out.print("\t�˻��� ��� �Է�: ");
      String str = br.readLine();

      if (vt.contains(str))
      {
        System.out.println("\t[�˻� ��� ���]");
        System.out.println("\t�׸��� �����մϴ�.");
      }
      else 
      {
        System.out.println("\t[�˻� ��� ���]");
        System.out.println("\t�׸��� �������� �ʽ��ϴ�");
      }  
   }
 
   // ��� ���� �޼ҵ�
   public static void delElement()  throws IOException
   {
      System.out.print("\t������ ��� �Է� : ");
      String str = br.readLine();
      if (vt.contains(str))   //
       {
         int i = vt.indexOf(str);
         vt.remove(i);
         System.out.println("\t[���� ��� ���]");
         System.out.println("\t�׸��� �����Ͽ����ϴ�.");
       }
      else
       {
         System.out.println("\t[���� ��� ���]");
         System.out.println("\t�׸��� �������� �ʾ� ������ �� �����ϴ�.");
       }
      
   }

   // ��� ����(����) �޼ҵ�
   public static void chaElement() throws IOException
   {
      System.out.print("������ ��� �Է� : ");
      String str = br.readLine();
      if (vt.contains(str))
      {
         int i = vt.indexOf(str);
         System.out.print("������ ���� �Է� : ");
         String str2 = br.readLine();
         vt.set(i, str2);
         System.out.println("\t[���� ��� ���]");
         System.out.println("������ �Ϸ�Ǿ����ϴ�.");
      }
      else
      {
         System.out.println("�Է��� ����� �������� �ʽ��ϴ�.");
      }
   }
    
   // ���α׷� ���� �޼ҵ� -- �ϼ�~!!!
   public static void exit()
   {
      System.out.println("\n\t���α׷� ����");
      System.exit(-1); // ���α׷� ��ü ����޼ҵ� �ܿ�!
   }

   // main() �޼ҵ� --  �ϼ�
   public static void main(String[] args) throws IOException
   {
      do
      {
         menuDisp();
         menuSelect();
         menuRun();
      }
      while (true);

   }
}