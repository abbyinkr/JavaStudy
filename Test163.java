/*===================================
  ■■■ 컬렉션 (Collection) ■■■ 
===================================*/

//반드시 꼼꼼하게 1시간 이상 복습할 것.!!!! 

// Set → HashSet, TreeSet
// - 순서 (의미) 없음
// - 중복을 허용하지 않는 구조(기본) // 이중적인 의미가 있음 (input/output)

/*
○ TreeSet<E> 클래스

  - java.util.TreeSet<E> 클래스는
    Set 인터페이스를 상속한 SortedSet 인터페이스를 구현한 클래스로(Set상속)
    데이터를 추가하면 데이터들이 자동으로 오름차순 정렬된다. // 정렬할려면 크기 비교가 반드시 필요하다
*/

import java.util.TreeSet;
import java.util.Iterator;
// import java.lang.Comparable;
import java.util.Comparator;


// VO   → Value Object
// DTO  → Data Transfer Object
// DAO  → Data Access Object // 오라클 담당자 혜림이 

class GradeVo //implements Comparable<GradeVo>// GradeDTO
{
   // 주요 속성 구성
   private String hak;
   private String name;
   private int kor, eng, mat;

   // getter / setter 구성

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

   
   // 생성자(사용자 정의 생성자 → 5개의 매개변수를 가진 생성자)
   public GradeVo(String hak, String name, int kor, int eng, int mat)
   {
      this.hak=hak;
      this.name=name;
      this.kor=kor;
      this.eng=eng;
      this.mat=mat;
   }

   // 생성자(사용자 정의 생성자 → 매개변수 없는 기본 생성자)
   public GradeVo()
   {
   }
  
   // 추가 메소드 정의 → 총점 산출 
   int getTotal()
   {
      return kor + eng + mat;
   }

   /* [혜진이가 알려준 방법]
   public int compareTo(GradeVo gv)
   {
      return this.hak.compareTo(gv.hak);
   }
   */
   //java.lang.ClassCastException: GradeVo cannot be cast to java.lang.Comparable
}

class MyComparator<T> implements Comparator<T> // 인터페이스는 implements !
{
   // Api문서에서 본 compare() 재정의
   @Override
   public int compare(T o1, T o2)
   {
      GradeVo s1 = (GradeVo)o1;  //object -> gradeVo
      GradeVo s2 = (GradeVo)o2;

      // 학번 기준 오름차순
      //return Integer.parseInt(s1.getHak()) - Integer.parseInt(s2.getHak());
      //--==>>
      /*
         2103     김가영   90   80   70    240
         2104     장서현   80   70   60    210
         2105     박나현  100  100  100    300
         2106     이새롬   12   23   34     69
         2107     김서현   50   50   50    150
      */

      // 총점 기준 오름차순
      //return s1.getTotal()-s2.getTotal();
      /*
         2106     이새롬   12   23   34     69
         2107     김서현   50   50   50    150
         2104     장서현   80   70   60    210
         2103     김가영   90   80   70    240
         2105     박나현  100  100  100    300
      */

      //총점 기준 내림차순
      //return s2.getTotal()-s1.getTotal();
      /*
         2105     박나현  100  100  100    300
         2103     김가영   90   80   70    240
         2104     장서현   80   70   60    210
         2107     김서현   50   50   50    150
         2106     이새롬   12   23   34     69
      */

      //이름 기준
      //return s1.getName() - s2.getName();
      //--==>> 에러 발생(컴파일 에러)
      //return Integer.parseInt(s1.getName()) - Integer.parseInt(s2.getName());
      //--==>> 에러 발생(컴파일 에러)
      return s1.getName().compareTo(s2.getName());
      /*
         2103     김가영   90   80   70    240
         2107     김서현   50   50   50    150
         2105     박나현  100  100  100    300
         2106     이새롬   12   23   34     69
         2104     장서현   80   70   60    210
      */

   }
}


public class Test163
{
   
   public static void main(String[] args)
   {
      // TreeSet 자료구조 인스턴스 생성
      TreeSet<String> set = new TreeSet<String>();

      // set 이라는 TreeSet 자료구조에 요소 추가 → add()
      set.add("짱구는못말려");
      set.add("아기공룡둘리");
      set.add("아따맘마");
      set.add("꼬마마법사레미");
      set.add("명탐정코난");
      set.add("심슨");
      set.add("포켓몬스터");
      set.add("은하철도999");
      set.add("미래소년코난");

      // Iterator 를 활용하여 set 요소 전체 출력

      Iterator<String> li = set.iterator(); 

      while (li.hasNext())
         System.out.print(li.next() + " ");
      System.out.println("\n");
      //--==>> 꼬마마법사레미 명탐정코난 미래소년코난 심슨 아기공룡둘리 아따맘마 은하철도999 짱구는못말려 포켓몬스터



	  /* // [꼭 다시 풀기]
      // TreeSet 자료구조 인스턴스 생성
      TreeSet<GradeVo> sungjuk = new TreeSet<GradeVo>();
      // 생성된 자료구조에 요소 추가
      //-- 2103 김가영 90 80 70
      //   2104 장서현 80 70 60
      //   2105 박나현 100 100 100
      //   2106 이새롬 12 23 34
      //   2107 김서현 50 50 50 

      GradeVo gv = new GradeVo("2103", "김가영", 90, 80, 70);
      

      // treeSet 에 담기 (왜 에러나지????)
      try
      {
         sungjuk.add(gv);
      }
      catch (ClassCastException e)
      {
         System.out.println(e.toString());
      }
 
   
      // 생성된 자료구조에 요소 추가
     
      
      Iterator<GradeVo> li2 = sungjuk.iterator();
      while (li2.hasNext())
      {
         System.out.print(li2.next() + " ");         
      }

      System.out.println("\n");
      // GradeVo@15db9742
      */


      // TreeSet 자료구조 인스턴스 생성
      //TreeSet<GradeVo> set2 = new TreeSet<GradeVo>();
      TreeSet<GradeVo> set2 = new TreeSet<GradeVo>(new MyComparator<GradeVo>());

      // 생성된 자료구조에 요소 추가
      //-- 2103 김가영 90 80 70
      //   2104 장서현 80 70 60
      //   2105 박나현 100 100 100
      //   2106 이새롬 12 23 34
      //   2107 김서현 50 50 50 

      //GradeVo vo1 = new GradeVo("2103", "김가영", 90, 80, 70);
      //set.add(vo1);
      
      set2.add(new GradeVo("2103", "김가영", 90, 80, 70));
      set2.add(new GradeVo("2104", "장서현", 80, 70, 60));
      set2.add(new GradeVo("2105", "박나현", 100, 100, 100));
      set2.add(new GradeVo("2106", "이새롬", 12, 23, 34));
      set2.add(new GradeVo("2107", "김서현", 50, 50, 50));

      // 요소 추가딘 자료구조 전체 출력
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