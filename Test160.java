/*===================================
  ■■■ 컬렉션 (Collection) ■■■ 
===================================*/

// ※ List → Vector, ArrayList
//    - 순서 있음
//    - 배열과 유사
//    - 중복 가능

/*
○ ArrayList 클래스

   - ArrayList 와 Vector 클래스는 
     List 를 크기 변경이 가능한 배열로 구현한 것으로
     차이점은 Vector 클래스의 객체는 기본적으로 동기화되지만,
     ArrayList 는 그렇지 않다는 점이다.

   - 비동기화 컬렉션은 동기화된 컬렉션보다 더 나은 성능을 제공하며
     스레드들이 컬렉션을 공유하지 않는 프로그램에서는
     일반적으로 ArrayList 를 Vector 보다 더 선호하며,
     ArrayList 를 동기화를 고려하지 않은 Vector 처럼 동작함으로써
     스레드 동기화에 따르는 부담을 갖지 않기 때문에
     Vector 보다 더 빠르게 실행된다.
     (비동기화- 멀티스레드, unsafety)

   - null 을 포함한 모든 요소를 허용하며
     List 인터페이스를 구현하는 것 외에 리스트에 격납하기 위해
     내부적으로 사용되는 배열의 사이즈를 조작하는 메소드를 제공한다.

*/

import java.util.ArrayList;
import java.util.Vector;
import java.util.List;
import java.util.ListIterator;

public class Test160
{
   
   public static void main(String[] args)
   {  
      // 모두 class이기 때문에 인스턴스 생성가능 
      //ArrayList<String> list = new ArrayList<String>();
      //Vector<String> list = new Vector<String>();
      //List<String> list = new Vector<String>(); //--업캐스팅
      List<String> list1 = new ArrayList<String>(); //--업캐스팅

      // list1에 요소 추가 → add(); (Vector와 같다)
      list1.add("불한당");
      list1.add("소울");
      list1.add("미나리");

      // 이번 인스턴스 생성은... 생성 과정에서 list1을 생성자에게 넘겨줌
      List<String> list2 = new ArrayList<String>(list1); // check~!!!

      // list2 에 요소 추가 → add();
      list2.add("광해");

      List<String> list3 = new ArrayList<String>();
      
      //list3에 list2 의 전체 요소 추가 → addAll()
      list3.addAll(list2);

      // "소울" 앞에 해리포터 추가
      //-- ① "소울" 찾기 → indexOf() → 위치값 인덱스 반환
      int n = list3.indexOf("소울");
      //-- ② "소울" 찾은 인덱스 위치에 "해리포터" 투입
      list3.add(n, "해리포터");


      // 출력 → 더미 데이터 확인
      System.out.println("=============================");
      System.out.println(list1);
      //--==>> [불한당, 소울, 미나리]
      System.out.println(list2);
      //--==>> [불한당, 소울, 미나리, 광해] 
      // 생성자로 받은 list1을 리스트로 만들고 그 뒤에 추가된 광해
      System.out.println(list3);
      //--==>> [불한당, 해리포터, 소울, 미나리, 광해]
      // addAll()로 list2을 인자로 넘겨받음

      // 출력 → List.Iterator 를 활용하여 출력 → listIterator() 메소드 활용
      System.out.println("=============================");
      ListIterator<String> li = list3.listIterator();
      while (li.hasNext())
         System.out.print(li.next() + " ");
      System.out.println("\n");
      //--==>> 불한당 해리포터 소울 미나리 광해

      // List 자료구조 자체가 순서가 중요하기 때문에 역순 출력가능
      // 출력 → 역순으로 출력 → ListIterator를 활용하여 출력
      // hasPrevious() / previous() 메소드 활용
      System.out.println("=============================");
      while (li.hasPrevious()) // 오른쪽에서부터 왼쪽으로 스캔방향바꿔서 확인
      {   System.out.print(li.previous() + " ");
         //System.out.println(li.nextIndex());
      }
      System.out.println("\n");
      //--==>> 광해 미나리 소울 해리포터 불한당


   }
}