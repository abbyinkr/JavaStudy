/*===================================
  ���� �÷��� (Collection) ���� 
===================================*/

// Map - Hashtable, HashMap

// - java.util.Map �������̽���
//   Ű(key)�� ��(value)�� ����(mapping)�ϸ�,
//   ������ Ű�� ����� �� ���� �����ؾ� �ϸ�,
//   �� Ű�� �� ���� ������ �����ؾ� �Ѵ�.
//   ��, �ϳ��� Ű�� �����ϴ� �ϳ��� ���� ���� �ڷᱸ���̴�.

/*
�� Hashtable<K, V> Ŭ����

   - �ؽ����̺� ������ ��ü �𵨸�ȭ �� Ŭ������
     �˻��� �����ϱ� ������ ��� �󵵰� ���� �� ���Ѵ�.

   - �ؽ����̺��̶� Ű(key)�� �׿� �����ϴ� ������(value)��
     ���е� ������ �����̴�.

   - �����͸� �����ϰ�, �˻��ϱ� ���ؼ� Ű�� �����ϸ�,
     �� ���������� Ű ���� �ο��ϸ� �ش� �����Ͱ� ��ȯ�ȴ�.

   - ����, Hashtable Ŭ������ key �Ǵ� value �� ������ null�� ������� �ʴ´�.

*/

import java.util.Hashtable;


public class Test164
{

   private static final String[] names 
      = {"��ƺ�","������","������","�輭��","�Ҽ���"};
   private static final String[] tels 
      = {"010-6888-5456","010-7101-9504","010-5472-5201","010-8220-0980", "010-9453-7149"};

   public static void main(String[] args)
   {
      // Hashtable �ڷᱸ�� �ν��Ͻ� ����
      Hashtable<String, String> ht = new Hashtable<String, String>();
      
      // ht ��� Hashtable �ڷᱸ���� �迭(names, tels)�� ����ִ�
      // �����͸� ��ҷ� �߰��ϱ�(��Ƴ���) �� put(k, v)
      // ex.ht.put("ȫ�浿", "010-1111-1111");
      //           --------  ----------------
      //             key         value

      for (int i= 0 ; i<names.length ; i++)
      {
         ht.put(names[i], tels[i]);
      }

      // ht ��� �ؽ����̺��� ��� �� ���� �˻� (key �� �̿��Ͽ� �˻�)
      String findName1 = "������";
      String str = ht.get(findName1); // get(Ű) �� value(��)
      if (str != null)
      {
         System.out.println(findName1 + " ��ȭ��ȣ : " + str);
      }
      System.out.println();
      //--==>> ������ ��ȭ��ȣ : 010-5472-5201

      // ht ��� �ؽ����̺� �ڷᱸ����... key�� �����ϴ����� ���� Ȯ��
      // �� containsKey()
      String findName2 = "������";
      if (ht.containsKey(findName2))
         System.out.println(findName2 + " �����Ͱ� �����մϴ�.");
      else 
         System.out.println(findName2 + " �����Ͱ� �������� �ʽ��ϴ�.");
      System.out.println();
      //--==>> ������ �����Ͱ� �������� �ʽ��ϴ�.

      String findName3 = "�輭��";
      if (ht.containsKey(findName3))
         System.out.println(findName3 + " �����Ͱ� �����մϴ�.");
      
      else 
         System.out.println(findName3 + " �����Ͱ� �������� �ʽ��ϴ�.");
      System.out.println();
      //--==>> �輭�� �����Ͱ� �����մϴ�.


      // ht ��� �ؽ����̺� �ڷᱸ����... value �� �����ϴ����� ���� Ȯ��
      // �� contains()

      String findTel1 = "010-9453-7149";
      if (ht.contains(findTel1))
         System.out.println(findTel1 + " �����Ͱ� �����մϴ�.");
      else 
         System.out.println(findTel1 + " �����Ͱ� �������� �ʽ��ϴ�.");
      System.out.println();
      //--==>> 010-9453-7149 �����Ͱ� �����մϴ�.

      String findTel2 = "010-8819-2565";
      if (ht.contains(findTel2))
         System.out.println(findTel2 + " �����Ͱ� �����մϴ�.");
      else 
         System.out.println(findTel2 + " �����Ͱ� �������� �ʽ��ϴ�.");
      System.out.println();
      //--==>> 010-8819-2565 �����Ͱ� �������� �ʽ��ϴ�.

      // ht ��� �ؽ����̺� �ڷᱸ������ ���������� ������ ����
      // �� remove()
   
      ht.remove("������");

      // ����(�� remove()) ���� key�� �����ϴ��� Ȯ��
      if (ht.containsKey("������"))
         System.out.println("�����̰� �����մϴ�.");
      else 
         System.out.println("������ ��𰬾�?");
      System.out.println();
      //--==>> ������ ��𰬾�?
      

      if (ht.contains("010-7101-9504"))
         System.out.println("010-7101-9504 �� �����մϴ�");
      else 
         System.out.println("010-7101-9504 �� �������� �ʽ��ϴ�");
      System.out.println();
      //--==>> 010-7101-9504 �� �������� �ʽ��ϴ�
      // Ű ���� �� value ���� �� �̷������ Ȯ���� �� ����

      // null �Է� �õ�
      //ht.put(null, null);                                          //-- key, value ��� null �� (��)
      //--==>> ���� �߻�(��Ÿ�� ����)
      //       java.lang.NullPointerException
      
      //ht.put("������",null);                                         //-- value �� null �� (��)
      //--==>> ���� �߻�(��Ÿ�� ����)
      //       java.lang.NullPointerException

      //ht.put(null, "010-1111-1111");                                 //-- key �� null �� (��)
      //--==>> ���� �߻�(��Ÿ�� ����)
      //       java.lang.NullPointerException

      // �ߺ��� key �� �Է�
      ht.put("��ƺ�", "010-7777-5456");

      System.out.println(ht.get("��ƺ�"));
      //--==>> 010-7777-5456
      //-- ���� "010-6888-5456" ���� "010-7777-5456"�� ����Ǿ����� Ȯ��
      //   (�� �����, ����)

      // �ߺ��� value �� �Է�
      ht.put("�ڹ���", "010-8220-0980");

      System.out.println(ht.get("�輭��"));
      System.out.println(ht.get("�ڹ���"));
      //--==>> 010-8220-0980
      //       010-8220-0980
      //-- value �� �ߺ��� ���� �����Ϳ� �ƹ��� ������ ��ġ�� ������ Ȯ��

      
   }
}