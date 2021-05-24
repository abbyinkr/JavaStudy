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
import java.util.Scanner;

public class Test158_1 extends Vector
{
   Vector<String> v = new Vector<String>();
   private int choice;
   private char answer;
   private String str;

   public void menu()
   {
      Scanner sc = new Scanner(System.in);
      System.out.println();
      System.out.println("\t[�޴� ����]");
      System.out.println("\t1. ��� �߰�");
      System.out.println("\t2. ��� ���");
      System.out.println("\t3. ��� �˻�");
      System.out.println("\t4. ��� ����");
      System.out.println("\t5. ��� ����");
      System.out.println("\t6. ����");
      System.out.print("\t>> �޴� ����(1~6) : ");
      choice = sc.nextInt();
      // ���ǹ� �Ἥ �� �޴��޼ҵ� ȣ��
      switch (choice)
      {
      case 1: add(); break;
      case 2: print(); break;
      case 3: search(); break;
      case 4: remove(); break;
      case 5: change(); break;
      case 6: return;
      default: System.out.println("�޴� ���� ����~!!"); break;
      
      }
   }

   // ���� ��� �߰� �޼ҵ�
   public void add()
   {
      int i=1;
      boolean flag=true;
      Scanner sc = new Scanner(System.in);
      
      while (flag)
      {
         System.out.printf("\t%d��° ��� �Է� : ", i);
         String adds = sc.next();
         v.add(adds); // ���Ϳ� �Էµ� ��� �߰�
         System.out.printf("\t%d��° ��� �Է� ����~!!!", i++);
         System.out.print("\t��� �Է� ���(Y/N) : ");
         answer = sc.next().charAt(0);
         if (answer != 'y' && answer !='Y')
         {
            flag = false;
            menu();
         }
      }
      
   }// end add()

   // ���� ��� ��ü ��� �޼ҵ�
   public void print()
   {
      System.out.println("\t���� ��ü ���");
      for (String element : v)
         System.out.println("\t"+ element);
      System.out.println("\t���� ��ü ��� �Ϸ�~!!!");
      menu();
   }// end print()

   public void search()
   {
      Scanner sc = new Scanner(System.in);
      System.out.print("\t�˻��� ��� �Է�: ");
      str = sc.next(); 
       if (v.contains(str))
       {
         System.out.println("\t[�˻� ��� ���]");
         System.out.println("\t�׸��� �����մϴ�.");
         menu();
       }
       else 
       {
         System.out.println("\t[�˻� ��� ���]");
         System.out.println("\t�׸��� �������� �ʽ��ϴ�");
         menu();
       }  
   }// end search()

   public void remove()
   {
      Scanner sc = new Scanner(System.in);
      System.out.print("\t������ ��� �Է� : ");
      str = sc.next();
      if (v.contains(str))
       {
         int i = v.indexOf(str);
         v.remove(i);
         System.out.println("\t[���� ��� ���]");
         System.out.println("\t�׸��� �����Ͽ����ϴ�.");
         menu();
       }
      else
       {
         System.out.println("\t[���� ��� ���]");
         System.out.println("\t�׸��� �������� �ʾ� ������ �� �����ϴ�.");
         menu();
       }
   }// end remove()
   
   public void change()
   {
      Scanner sc = new Scanner(System.in);
      System.out.print("������ ��� �Է� : ");
      str = sc.next();
      if (v.contains(str))
      {
         int i = v.indexOf(str);
         System.out.print("������ ���� �Է� : ");
         String str2 = sc.next();
         v.set(i, str2);
         System.out.println("\t[���� ��� ���]");
         System.out.println("������ �Ϸ�Ǿ����ϴ�.");
         menu();
      }
      else
      {
         System.out.println("�Է��� ����� �������� �ʽ��ϴ�.");
         menu();
      }
   }//end choice()


   public static void main(String[] args)
   {

      Test158 ob = new Test158();
      ob.menu();

   }
}