/*==================================================
  ���� ��ü ����ȭ(Object Serialization) ���� 
==================================================*/

/*
�� ��ü ����ȭ(Object Serialization)��
   �޸𸮿� ������ Ŭ���� ��ü�� ��� ������ ���� ���¸�
   �״�� �����ؼ� �����ϰų�
   ��Ʈ��ũ�� ���� ������ �� �ִ� �������
   ��� ������ ���� �����Ѵٰų�
   �ٸ� ��Ʈ��ũ�� �ִ� ȣ��Ʈ�� ���� ���� ��� ����ϰ� �ȴ�.

   ��, ��ü ����ȭ�� ���빰�� ����Ʈ ������ ��ȯ�Ͽ�
   ���� �Ǵ� ��Ʈ��ũ�� ���� �ۼ���(��Ʈ��)�� �����ϰ� ������ִ� ������
   �� ��, ��ü�� ��� ������ �޸𸮸����� ������ ���� ���Ѵ�.

   ����, �޼ҵ�� �����ڴ� ��ü ����ȭ�� ��󿡼� ���ܵȴ�.
   (��ü�� �Ӽ�(����)���� ������. �߿��Ѱ� ���� �������Ѵ�.)

�� ��ü ����ȭ�� ����
   ��ü ��ü�� ������ ����� ���Ŀ� ���ֹ��� �ʰ�
   ��ü�� ���Ͽ� ���������ν� ���Ӽ��� ������ �� �ְ�
   ��ü ��ü�� ��Ʈ��ũ�� ���� �ս��� ��ȯ�� �� �ְ� �ȴ�.

   System.exit(-1);

   ��ü ����ȭ�� �ڹ� 1.1 ���Ŀ� ���ԵǾ��µ�
   �� ������ RMI�� Bean �����̾���. 
   RMI�� ���� ��ü ����� �����ؾ� �ϱ� ������
   ��ü�� �״�� �̵��� �� �־�� �Ѵ�.
   ���� �̸� �����ϱ� ���ؼ��� ��ü ����ȭ�� �ʼ����̾���.

   ����, Bean�� ���� �� ���¿� ���� ������ ������ ��
   �� ��ü ����ȭ�� ����Ͽ� ���ϰ� ��ü ���¸� ������ �� �ִ�.

   �� RMI(Remote Method Invocation)
      ���� �ٸ� ���� �����ġ�� �����ϴ� �Լ�(�޼ҵ�)��
      ȣ���ϰ� �����ϴ� ����� ����Ѵ�.
      ���� �ٸ� ��� ������ ��ġ�� ������ ���� ��ü�� ����
      ��� ������ �����ϴ� �������� �����ϸ� ���ڴ�.
      // ���� ���� ��ü�� ������ ���ʿ��� �ް� �Լ��� ���۰����ϰ� �ϴ°�

   �� Bean(��)
      CS(Client �� Server) ������ �𵨿��� ^������ ����^�� �ش��ϸ�
      ^���� ����^�� ����Ʈ���� ��ü�� ���� �� �ְ� �ϴ� ^������Ʈ ���^
      �ۼ��� ��ü�� ������ �����Ͽ� ������Ʈ�� ���� ���Խ�ų �� �ֵ��� �Ѵ�.
      Ŭ���̾�Ʈ���� ���̶�� ���α׷� ������Ʈ�� �й��ϴ� ������� ó��.
      
�� Serializable �������̽�
    
   - ��ü ����ȭ�� �ϱ� ���� ���� ��ü ����ȭ�� �����ϵ���
   ��java.io.Serializable�� �������̽��� �����ؾ� �Ѵ�.
   �� �������̽��� ��ü����ȭ�� �����Ǿ�� �Ѵٴ� �����
   JVM(�ڹ� ���� �ӽ�)���� �˷��ִ� ������ �����Ѵ�.
   ����, Serializable �������̽��� �ٸ� �������̽��ʹ� �޸�
   �����ؾ� �� �޼ҵ尡 ���� ������ ���� ���� ���ָ� �ȴ�.

   ����)
   ��
   public class Ŭ������ implements Serializable
   {
      // ...
   }

   ��
   Serializable �������̽��� ������ ��
   ObjectInputStream Ŭ������ ObjectOutputStream Ŭ������ �̿��Ͽ�
   ��ü ������ ������� �����ϰ� �ȴ�.

   �� ��� ������ static ���� ����� �ܿ�(��, Ŭ���� ������ ���)
      ��ü ����ȭ�� ��󿡼� ���ܵȴ�. (�ν��Ͻ� �����鸸 ����ȭ�� ���)
    
�� Object Stream (����ȭ ����� �����ϰ� ����)

   - java.io.ObjectInputStream
     ObjectInputStream Ŭ������ ObjectOutputStream Ŭ������ ���� (����Ʈ���)
     ���Ͽ� ����Ǿ� �ִ� ��ü�� ��Ʈ��ũ�� ���� ���޵� ��ü��
     ����ȭ�� �����ϴ� ����� �����Ѵ�.
     ��, java.io.Serializable(����ȭ������) �������̽���
     java.io.Externalizable(���Ӽ��� �ִ�) �������̽��� �������ִ� ��ü�� ���ؼ���
     ����� �����ϴ�.
     ��, Serializable �������̽��� Externalizable �������̽��� 
     ������ ��ü������ ����� �����ϴٴ� ���̴�.
     �� ��, readObject() �޼ҵ带 �̿��Ͽ�
     ��Ʈ�����κ��� ����ȭ�� ��ü�� ���� �� ������

     �̷��� ���� ��ü�� �迭, ���ڿ�, �� ��ü ��...
     Object�� ���ֵǱ� ������
     ������ ��(Type)���� ĳ���� �� �־�� �Ѵ�.


*/

import java.io.File;
import java.util.Hashtable;
import java.io.FileOutputStream;
import java.io.ObjectOutputStream;

import java.io.FileInputStream;
import java.io.ObjectInputStream;
import java.util.Enumeration;

public class Test171
{
   public static void main(String[] args) throws Exception
   {
      // ���θ޼ҵ尡 � ȯ�濡�� ����ǰ��ִ���
      String appDir = System.getProperty("user.dir"); // �Ӽ����� �����ڴ� ������� ���丮�� 
   
      // �׽�Ʈ(Ȯ��)
      //System.out.println(appDir);
      //--==>> C:\JavaStudy

      // ���� ��ü ����
      File f0 = new File(appDir, "\\data\\test.ser");
      //-- ��appDir���� C:\JavaStudy 
      //    appDir ��ġ�� �߽����� "\\data\\test.ser"�� �����ϰڴٴ� �ǹ�.
      //    ���������... ��C:\JavaStudy\data\test.ser�� // "\\" �� \ �ϳ�
      //                    ================== getParent
      // ��ser�� : ����ȭ ������ Ȯ����


      // �׽�Ʈ(Ȯ��)
      //System.out.println(f0.getParentFile().exists());
      //--==>> false 
      // C:\JavaStudy\data\ ��ΰ� ���õ����� ������ �ǹ��Ѵ�. 

          // false�� �´ٸ�
      if (!f0.getParentFile().exists()) //-- ���͸� ������ ���������ʴ� ��Ȳ�� �´ٸ�....
      {
         // ���͸� ��θ� �����ϰڴ�. (����ڴ�.)
         f0.getParentFile().mkdirs(); // make directories

      }

      // hashtable �ڷᱸ�� �ν��Ͻ� ����
      Hashtable<String, String> h1 = new Hashtable<String, String>();

      // ������ h1 �̶�� Hashtable �ڷᱸ���� ��� �߰�
      h1.put("5", "�ڹ���");
      h1.put("2", "������");
      h1.put("1", "������");
      h1.put("4", "������");
      h1.put("3", "�Ҽ���");

      // �׽�Ʈ(Ȯ��)
      //System.out.println(h1.get("2"));
      //--==>> ������
      
      // ���� ���� ��� ��Ʈ�� ����
      FileOutputStream fos = new FileOutputStream(f0);
      //-- ���� ���� ��� ��Ʈ��(���ٱ�)��ü�� (���������� �ϳ� ���)
      //   f0��� ���� ��ü�� ���ڴ�...

      // ��ü ���� ��� ��Ʈ�� ����
      ObjectOutputStream oos = new ObjectOutputStream(fos);
      //-- ��ü ���� ��� ��Ʈ��(���ٱ�) ��ü��
      //   fos ��� ���� ���� ��½�Ʈ���� ���ΰڴ�...
      
      // ���� line 147 + line 152 �� ������ ���� 
      //ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(f0));

      // ���� ����� ���ؾ� �� ����
      // BufferedReader br = new BufferedReader(new InputStreamReader(System.in));



      // �� ObjectOutputStream Ŭ������
      //    ��ü���� ����ϴ� ����� �����ϴ� Ŭ������
      //    ��� ��Ʈ���� ����ϱ� ���� ���������� ����ȭ�� �����ϰ� �ȴ�.
      //    �ڹ� �⺻�� ������ �Ǵ� ��ü���� ���Ͽ� �����ϰų�
      //    ��Ʈ��ũ�� ���� �����ϱ� ����
      //    ������ ��ü�� ����ȭ �ϴ� ����� �����ϴ� ���̴�.

      oos.writeObject(h1);       //-- ������ ��Ʈ�� ��ü(oos)�� ������ ��ü�� ���
      
      oos.close();               //-- ObjectOutputStream ���ҽ� �ݳ�
      
      fos.close();               //-- FileOutputStream ���ҽ� �ݳ�

      // �������� ��~!!!

      //--------------------------------------------------------------- ����ȭ
      // h1�� put�� �������� ����ȭ�Ǽ� test.ser�� ��������!!



      // �о���̱� ����~!!!

      if (f0.exists()) //- f0 ���� ��ü�� �����Ѵٸ�...
      {
         FileInputStream fis = new FileInputStream(f0);
         ObjectInputStream ois = new ObjectInputStream(fis);

         // �о���� ��ü(Object)�� �ٿ�ĳ����(Hashtable �̶�� ������ Ÿ��)�Ͽ�
         // h2 ��� Hashtable �ڷᱸ���� ��Ƴ���
         Hashtable h2 = (Hashtable)ois.readObject();

         ois.close();
         fis.close();

         //------------------------------ ������� �����ϸ� �о���̴� �۾��� ��~!

         // �о���� h2 ��ü�� ���� Ȯ��
         String key;
         String value;

         // �� Hashtable�� Iterator ����� �� ����~!!!! check~!!�ڡ�
         Enumeration e = h2.keys();

         while (e.hasMoreElements())
         {
            //key = (String)e.nextElement(); // o -> s �ٿ�ĳ����
            //System.out.println(key);

            key = (String)e.nextElement();
            value = (String)h2.get(key);

            System.out.println(key + " �� " + value);

         }
         /*
         5 �� �ڹ���
         4 �� ������
         3 �� �Ҽ���
         2 �� ������
         1 �� ������
         ����Ϸ��� �ƹ� Ű�� �����ʽÿ� . . .
         */
         
      }

   }

}