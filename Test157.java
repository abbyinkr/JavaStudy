/*===================================
  ���� �÷��� (Collection) ���� 
===================================*/

// ���� �ڷᱸ�� ��ü ���� �� ���� �� ����� ���� �ڷ��� Ŭ���� Ȱ��
// �� �ڷ������� Ȱ��~!!!

// ����� ���� Ŭ���� ���� �� �ڷ���ó�� Ȱ��

import java.util.Vector;
import java.util.Iterator;

class MyData
{
   // �ֿ� �Ӽ� ���� �� �ֿ� ���� ����(��� ����)
   private String name;      //-- �̸�
   private int age;          //-- ����

   // bean �Ծ� (���̹� ���)
   // getter / setter ����
   public String getName()
   {
      return name;
   }

   public void setName(String name)
   {
      this.name = name;
   }

   public int getAge()
   {
      return age;
   }

   public void setAge(int age)
   {
      this.age = age;
   }

   // ������(���ھ��� ������)
   public MyData()
   {
      name = "";
      age = 0;
   }
   
   // ������(���� 2���� ������)
   public MyData(String name, int age)
   {
      this.name = name;
      this.age = age;
   }

}

public class Test157
{
   public static void main(String[] args)
   {
      // ���� �ڷᱸ�� �ν��Ͻ� ����
      Vector<MyData> v = new Vector<MyData>();
      //-- MyData ������� ������ �ν��Ͻ��� 
      //   Vector �ڷᱸ�� v �� ������ �� �ִ�.

      // ���� �ڷᱸ�� v ��
      // ������ 16�� / �Ҽ��� 14�� / ������ 86�� 
      // ��Ƴ���
      
      

      /* [���� Ǯ��] : vector�� �ϳ��� ��¹��� �𸣰ٳ�
      String[] names = {"������", "�Ҽ���", "������"};
      int[] ages = {16, 14, 86};

      for (int i=0 ; i<names.length; i++)
      {
         MyData ob = new MyData();
         ob.setName(names[i]);
         ob.setAge(ages[i]);
         v.add(ob);
         System.out.printf("%s %d�� / ",ob.getName(), ob.getAge());
      }
      System.out.println();
      */

      // �� 
      /*
      MyData st1 = new MyData();
      st1.setName("������");
      st1.setAge(16);
      v.add(st1);

      MyData st2 = new MyData();
      st2.setName("�Ҽ���");
      st2.setAge(14);
      v.add(st2);

       MyData st3 = new MyData();
      st3.setName("������");
      st3.setAge(86);
      v.add(st3);
      */

      // �� 
      /*
      MyData st1 = new MyData("������", 16);
      v.add(st1);
      MyData st2 = new MyData("�Ҽ���", 14);
      v.add(st2);
      MyData st3 = new MyData("������", 86);
      v.add(st3);
      */

      // ��
      v.add(new MyData("������", 16));
      v.add(new MyData("�Ҽ���", 14));
      v.add(new MyData("������", 86));

      // ���� �ڷᱸ�� v �� ��� ����(���) ��ü ����ϱ�
      // ���� ��) 
      // �̸�:������, ����:16
      // �̸�:�Ҽ���, ����:14
      // �̸�:������, ����:86

   
      //System.out.println(v.elementAt(0).getName());
      
      // [���� Ǯ��]
      /*
      for (int i=0; i<3; i++)
      {
         String name = v.elementAt(i).getName();
         int age = v.elementAt(i).getAge();
         //System.out.printf("�̸�:%s, ����:%d\n",v.elementAt(i).getName(), v.elementAt(i).getAge());
         System.out.printf("�̸�:%s, ����:%d\n",name, age);
      }
      */

      // �� 
      for (MyData obj : v)
         System.out.printf("�̸�:%s, ����:%d\n", obj.getName(), obj.getAge());
      System.out.println();
      //--==>> �̸�:������, ����:16
      //       �̸�:�Ҽ���, ����:14
      //       �̸�:������, ����:86

      // ��
      for (int i=0 ; i<v.size(); i++)
      {
         System.out.printf("�̸�:%s, ����:%d\n"
                    , v.elementAt(i).getName(), v.elementAt(i).getAge());
      }
      System.out.println();
      //--==>> �̸�:������, ����:16
      //       �̸�:�Ҽ���, ����:14
      //       �̸�:������, ����:86

      // ��
      for (Object temp : v)   // ���ǽĿ��� �̹� ��ĳ���� 
      {
         System.out.printf("�̸�:%s, ����:%d\n"
                     , ((MyData)temp).getName(), ((MyData)temp).getAge());
      }
      System.out.println();
      //--==>> �̸�:������, ����:16
      //       �̸�:�Ҽ���, ����:14
      //       �̸�:������, ����:86

   }
}