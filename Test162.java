/*===================================
  ���� �÷��� (Collection) ���� 
===================================*/

// Set �� HashSet, TreeSet
// - ���� (�ǹ�) ����
// - �ߺ��� ������� �ʴ� ����(�⺻) // �������� �ǹ̰� ���� (input/output)

/*
�� HashSet<E> Ŭ����

  - java.util.HashSet<E> Ŭ������
    Set �������̽��� �����ϴ� Ŭ������
    ������ ������ �ƴ϶� ������ �������� �����ؾ� �ϴ� �ڷᱸ���̴�.
  - �̷� ���� �������� �ߺ��� ������� �ʴ´�.
  - ����, ����ȭ�� �������� �ʴ´�.

*/

import java.util.Set;
import java.util.HashSet;

public class Test162
{
   public static void main(String[] args)
   {
      //Set<String> dogs = new Set<String>();
      // �������̽��� �ν��Ͻ� ���� �ȵǼ� HashSet �ν��Ͻ� ������ 
      //Set ��ĳ����
      Set<String> dogs = new HashSet<String>();
      dogs.add("Ǫ��");
      dogs.add("�ùٰ�");
      dogs.add("��Ʈ����");
      dogs.add("ġ�Ϳ�");

      System.out.print("���� ������ Set : ");
      for (String str : dogs )
         System.out.print(str + " ");
      System.out.println();
      //--==>> ���� ������ Set : ��Ʈ���� Ǫ�� �ùٰ� ġ�Ϳ�
      //-- ������ �ǹ� ���� �ڷᱸ���̱� ������
      //   ������ �Է� ����(�ڷᱸ���� ��� �ݳ� ����)��
      //   ������� �����Ǿ� �ִ� ���� Ȯ��
      
      // ������(���) �߰�
      dogs.add("��Ƽ��");
      dogs.add("�˰�");
      dogs.add("�˰�");
      dogs.add("�˰�");
      dogs.add("�˰�");
      dogs.add("��Ƽ��");     // �� �ߺ� �����͸� �߰��Ѵٰ� �ؼ�
      dogs.add("��Ƽ��");     //    ������ ���� ��������
      dogs.add("��Ƽ��");     //    ������ �߻��ϴ� ���� �ƴϴ�.
      dogs.add("��Ƽ��");     // �� input �ߺ� ���
      dogs.add("��Ʈ����");
      dogs.add("��Ʈ����");
      dogs.add("��Ʈ����");
      dogs.add("��Ʈ����");
      dogs.add("������");
      dogs.add("ǳ�갳");
      dogs.add("������");
      dogs.add("ǳ�갳");

       System.out.print("�߰� �� ������ Set : ");
      for (String str : dogs )
         System.out.print(str + " ");
      System.out.println();
      //--==>> �߰� �� ������ Set : ��Ʈ���� �˰� ������ Ǫ�� �ùٰ� ġ�Ϳ� ��Ƽ�� ǳ�갳
      // output �� �ߺ��� ������� �ʴ´�. (input�� ���)

      // �� �����Ͱ� �߰��Ǵ� ������ ������� ����� �����Ǿ� ������
      //    ���� �����Ͱ� ���� �� �ݺ��Ǿ� �߰��� ��� (�ߺ� ������)
      //    �ϳ��� ��ȿ�� �����ͷ� �����Ǿ� �ִ� ���� Ȯ���� �� �ִ�.
      //    (�ƹ��� �߰��ص� �� ���� ��µ�)


   }
}