/*===================================
  ���� �÷��� (Collection) ���� 
===================================*/

//�ݵ�� �Ĳ��ϰ� 1�ð� �̻� ������ ��.!!!! 

// Set �� HashSet, TreeSet
// - ���� (�ǹ�) ����
// - �ߺ��� ������� �ʴ� ����(�⺻) // �������� �ǹ̰� ���� (input/output)

/*
�� TreeSet<E> Ŭ����

  - java.util.TreeSet<E> Ŭ������
    Set �������̽��� ����� SortedSet �������̽��� ������ Ŭ������(Set���)
    �����͸� �߰��ϸ� �����͵��� �ڵ����� �������� ���ĵȴ�. // �����ҷ��� ũ�� �񱳰� �ݵ�� �ʿ��ϴ�
*/

import java.util.TreeSet;
import java.util.Iterator;
// import java.lang.Comparable;
import java.util.Comparator;


// VO   �� Value Object
// DTO  �� Data Transfer Object
// DAO  �� Data Access Object // ����Ŭ ����� ������ 

class GradeVo //implements Comparable<GradeVo>// GradeDTO
{
   // �ֿ� �Ӽ� ����
   private String hak;
   private String name;
   private int kor, eng, mat;

   // getter / setter ����

   public String getHak()
   {
      return hak;
   }

   public void setHak(String hak)
   {
     this.hak = hak;
   }

   public String getName()
   {
      return name;
   }

   public void setName(String name)
   {
      this.name = name;
   }

   public int getKor()
   {
      return kor;
   }

   public void setKor(int kor)
   {
      this.kor = kor;
   }

   public int getEng()
   {
      return eng;
   }

   public void setEng(int eng)
   {
      this.eng = eng;
   }

   public int getMat()
   {
      return mat;
   }

    public void setMat(int mat)
   {
      this.mat = mat;
   }

   
   // ������(����� ���� ������ �� 5���� �Ű������� ���� ������)
   public GradeVo(String hak, String name, int kor, int eng, int mat)
   {
      this.hak=hak;
      this.name=name;
      this.kor=kor;
      this.eng=eng;
      this.mat=mat;
   }

   // ������(����� ���� ������ �� �Ű����� ���� �⺻ ������)
   public GradeVo()
   {
   }
  
   // �߰� �޼ҵ� ���� �� ���� ���� 
   int getTotal()
   {
      return kor + eng + mat;
   }

   /* [�����̰� �˷��� ���]
   public int compareTo(GradeVo gv)
   {
      return this.hak.compareTo(gv.hak);
   }
   */
   //java.lang.ClassCastException: GradeVo cannot be cast to java.lang.Comparable
}

class MyComparator<T> implements Comparator<T> // �������̽��� implements !
{
   // Api�������� �� compare() ������
   @Override
   public int compare(T o1, T o2)
   {
      GradeVo s1 = (GradeVo)o1;  //object -> gradeVo
      GradeVo s2 = (GradeVo)o2;

      // �й� ���� ��������
      //return Integer.parseInt(s1.getHak()) - Integer.parseInt(s2.getHak());
      //--==>>
      /*
         2103     �谡��   90   80   70    240
         2104     �弭��   80   70   60    210
         2105     �ڳ���  100  100  100    300
         2106     �̻���   12   23   34     69
         2107     �輭��   50   50   50    150
      */

      // ���� ���� ��������
      //return s1.getTotal()-s2.getTotal();
      /*
         2106     �̻���   12   23   34     69
         2107     �輭��   50   50   50    150
         2104     �弭��   80   70   60    210
         2103     �谡��   90   80   70    240
         2105     �ڳ���  100  100  100    300
      */

      //���� ���� ��������
      //return s2.getTotal()-s1.getTotal();
      /*
         2105     �ڳ���  100  100  100    300
         2103     �谡��   90   80   70    240
         2104     �弭��   80   70   60    210
         2107     �輭��   50   50   50    150
         2106     �̻���   12   23   34     69
      */

      //�̸� ����
      //return s1.getName() - s2.getName();
      //--==>> ���� �߻�(������ ����)
      //return Integer.parseInt(s1.getName()) - Integer.parseInt(s2.getName());
      //--==>> ���� �߻�(������ ����)
      return s1.getName().compareTo(s2.getName());
      /*
         2103     �谡��   90   80   70    240
         2107     �輭��   50   50   50    150
         2105     �ڳ���  100  100  100    300
         2106     �̻���   12   23   34     69
         2104     �弭��   80   70   60    210
      */

   }
}


public class Test163
{
   
   public static void main(String[] args)
   {
      // TreeSet �ڷᱸ�� �ν��Ͻ� ����
      TreeSet<String> set = new TreeSet<String>();

      // set �̶�� TreeSet �ڷᱸ���� ��� �߰� �� add()
      set.add("¯���¸�����");
      set.add("�Ʊ����Ѹ�");
      set.add("�Ƶ�����");
      set.add("���������緹��");
      set.add("��Ž���ڳ�");
      set.add("�ɽ�");
      set.add("���ϸ���");
      set.add("����ö��999");
      set.add("�̷��ҳ��ڳ�");

      // Iterator �� Ȱ���Ͽ� set ��� ��ü ���

      Iterator<String> li = set.iterator(); 

      while (li.hasNext())
         System.out.print(li.next() + " ");
      System.out.println("\n");
      //--==>> ���������緹�� ��Ž���ڳ� �̷��ҳ��ڳ� �ɽ� �Ʊ����Ѹ� �Ƶ����� ����ö��999 ¯���¸����� ���ϸ���



	  /* // [�� �ٽ� Ǯ��]
      // TreeSet �ڷᱸ�� �ν��Ͻ� ����
      TreeSet<GradeVo> sungjuk = new TreeSet<GradeVo>();
      // ������ �ڷᱸ���� ��� �߰�
      //-- 2103 �谡�� 90 80 70
      //   2104 �弭�� 80 70 60
      //   2105 �ڳ��� 100 100 100
      //   2106 �̻��� 12 23 34
      //   2107 �輭�� 50 50 50 

      GradeVo gv = new GradeVo("2103", "�谡��", 90, 80, 70);
      

      // treeSet �� ��� (�� ��������????)
      try
      {
         sungjuk.add(gv);
      }
      catch (ClassCastException e)
      {
         System.out.println(e.toString());
      }
 
   
      // ������ �ڷᱸ���� ��� �߰�
     
      
      Iterator<GradeVo> li2 = sungjuk.iterator();
      while (li2.hasNext())
      {
         System.out.print(li2.next() + " ");         
      }

      System.out.println("\n");
      // GradeVo@15db9742
      */


      // TreeSet �ڷᱸ�� �ν��Ͻ� ����
      //TreeSet<GradeVo> set2 = new TreeSet<GradeVo>();
      TreeSet<GradeVo> set2 = new TreeSet<GradeVo>(new MyComparator<GradeVo>());

      // ������ �ڷᱸ���� ��� �߰�
      //-- 2103 �谡�� 90 80 70
      //   2104 �弭�� 80 70 60
      //   2105 �ڳ��� 100 100 100
      //   2106 �̻��� 12 23 34
      //   2107 �輭�� 50 50 50 

      //GradeVo vo1 = new GradeVo("2103", "�谡��", 90, 80, 70);
      //set.add(vo1);
      
      set2.add(new GradeVo("2103", "�谡��", 90, 80, 70));
      set2.add(new GradeVo("2104", "�弭��", 80, 70, 60));
      set2.add(new GradeVo("2105", "�ڳ���", 100, 100, 100));
      set2.add(new GradeVo("2106", "�̻���", 12, 23, 34));
      set2.add(new GradeVo("2107", "�輭��", 50, 50, 50));

      // ��� �߰��� �ڷᱸ�� ��ü ���
      Iterator<GradeVo> it2 = set2.iterator();
      while (it2.hasNext())
      {
         GradeVo vo = it2.next();
         System.out.printf("%7s %7s %4d %4d %4d %6d \n", vo.getHak(), vo.getName(), vo.getKor(), 
            vo.getEng(), vo.getMat(), vo.getTotal());
      }
      System.out.println();


   }
}