/*===================================
  ���� �÷��� (Collection) ���� 
===================================*/

// �� List �� Vector, ArrayList
//    - ���� ����
//    - �迭�� ����
//    - �ߺ� ����

/*
�� ArrayList Ŭ����

   - ArrayList �� Vector Ŭ������ 
     List �� ũ�� ������ ������ �迭�� ������ ������
     �������� Vector Ŭ������ ��ü�� �⺻������ ����ȭ������,
     ArrayList �� �׷��� �ʴٴ� ���̴�.

   - �񵿱�ȭ �÷����� ����ȭ�� �÷��Ǻ��� �� ���� ������ �����ϸ�
     ��������� �÷����� �������� �ʴ� ���α׷�������
     �Ϲ������� ArrayList �� Vector ���� �� ��ȣ�ϸ�,
     ArrayList �� ����ȭ�� ������� ���� Vector ó�� ���������ν�
     ������ ����ȭ�� ������ �δ��� ���� �ʱ� ������
     Vector ���� �� ������ ����ȴ�.
     (�񵿱�ȭ- ��Ƽ������, unsafety)

   - null �� ������ ��� ��Ҹ� ����ϸ�
     List �������̽��� �����ϴ� �� �ܿ� ����Ʈ�� �ݳ��ϱ� ����
     ���������� ���Ǵ� �迭�� ����� �����ϴ� �޼ҵ带 �����Ѵ�.

*/

import java.util.ArrayList;
import java.util.Vector;
import java.util.List;
import java.util.ListIterator;

public class Test160
{
   
   public static void main(String[] args)
   {  
      // ��� class�̱� ������ �ν��Ͻ� �������� 
      //ArrayList<String> list = new ArrayList<String>();
      //Vector<String> list = new Vector<String>();
      //List<String> list = new Vector<String>(); //--��ĳ����
      List<String> list1 = new ArrayList<String>(); //--��ĳ����

      // list1�� ��� �߰� �� add(); (Vector�� ����)
      list1.add("���Ѵ�");
      list1.add("�ҿ�");
      list1.add("�̳���");

      // �̹� �ν��Ͻ� ������... ���� �������� list1�� �����ڿ��� �Ѱ���
      List<String> list2 = new ArrayList<String>(list1); // check~!!!

      // list2 �� ��� �߰� �� add();
      list2.add("����");

      List<String> list3 = new ArrayList<String>();
      
      //list3�� list2 �� ��ü ��� �߰� �� addAll()
      list3.addAll(list2);

      // "�ҿ�" �տ� �ظ����� �߰�
      //-- �� "�ҿ�" ã�� �� indexOf() �� ��ġ�� �ε��� ��ȯ
      int n = list3.indexOf("�ҿ�");
      //-- �� "�ҿ�" ã�� �ε��� ��ġ�� "�ظ�����" ����
      list3.add(n, "�ظ�����");


      // ��� �� ���� ������ Ȯ��
      System.out.println("=============================");
      System.out.println(list1);
      //--==>> [���Ѵ�, �ҿ�, �̳���]
      System.out.println(list2);
      //--==>> [���Ѵ�, �ҿ�, �̳���, ����] 
      // �����ڷ� ���� list1�� ����Ʈ�� ����� �� �ڿ� �߰��� ����
      System.out.println(list3);
      //--==>> [���Ѵ�, �ظ�����, �ҿ�, �̳���, ����]
      // addAll()�� list2�� ���ڷ� �Ѱܹ���

      // ��� �� List.Iterator �� Ȱ���Ͽ� ��� �� listIterator() �޼ҵ� Ȱ��
      System.out.println("=============================");
      ListIterator<String> li = list3.listIterator();
      while (li.hasNext())
         System.out.print(li.next() + " ");
      System.out.println("\n");
      //--==>> ���Ѵ� �ظ����� �ҿ� �̳��� ����

      // List �ڷᱸ�� ��ü�� ������ �߿��ϱ� ������ ���� ��°���
      // ��� �� �������� ��� �� ListIterator�� Ȱ���Ͽ� ���
      // hasPrevious() / previous() �޼ҵ� Ȱ��
      System.out.println("=============================");
      while (li.hasPrevious()) // �����ʿ������� �������� ��ĵ����ٲ㼭 Ȯ��
      {   System.out.print(li.previous() + " ");
         //System.out.println(li.nextIndex());
      }
      System.out.println("\n");
      //--==>> ���� �̳��� �ҿ� �ظ����� ���Ѵ�


   }
}