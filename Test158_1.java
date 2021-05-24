/*===================================
  ■■■ 컬렉션 (Collection) ■■■ 
===================================*/

// ○ 실습 문제
//    현재 작성중인 Test158 클래스를 완성하여
//    다음 기능을 가진 프로그램을 구현한다.

/*
실행 예)

     [메뉴 선택]
     1. 요소 추가
     2. 요소 출력
     3. 요소 검색
     4. 요소 삭제
     5. 요소 변경
     6. 종료
     >> 메뉴선택(1~6) : 1

     1번째 요소 입력 : 이유림
     1번째 요소 입력 성공~!!!
     요소 입력 계속(Y/N) : y

     2번째 요소 입력 : 한혜림
     2번째 요소 입력 성공~!!!
     요소 입력 계속(Y/N) : n

      [메뉴 선택]
     1. 요소 추가
     2. 요소 출력
     3. 요소 검색
     4. 요소 삭제
     5. 요소 변경
     6. 종료
     >> 메뉴선택(1~6) : 2

     [벡터 전체 출력]
         이유림
         한혜림
     벡터 전체 출력 완료~!!!

     [메뉴 선택]
     1. 요소 추가
     2. 요소 출력
     3. 요소 검색
     4. 요소 삭제
     5. 요소 변경
     6. 종료
     >> 메뉴선택(1~6) : 3

     검색할 요소 입력 : 이유림

     [검색 결과 출력]
     항목이 존재합니다.

     [메뉴 선택]
     1. 요소 추가
     2. 요소 출력
     3. 요소 검색
     4. 요소 삭제
     5. 요소 변경
     6. 종료
     >> 메뉴선택(1~6) : 4

     삭제할 요소 입력 : 이희주

     [삭제 결과 출력]
     항목이 존재하지 않아 삭제할 수 없습니다.

     [메뉴 선택]
     1. 요소 추가
     2. 요소 출력
     3. 요소 검색
     4. 요소 삭제
     5. 요소 변경
     6. 종료
     >> 메뉴선택(1~6) : 5

     변경할 대상 입력 : 한혜림
     수정할 내용 입력 : 두혜림

     [변경 결과 출력]
     변경이 완료되었습니다.

     [메뉴 선택]
     1. 요소 추가
     2. 요소 출력
     3. 요소 검색
     4. 요소 삭제
     5. 요소 변경
     6. 종료
     >> 메뉴선택(1~6) : 6

     프로그램 종료
     계속하려면 아무 키나...
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
      System.out.println("\t[메뉴 선택]");
      System.out.println("\t1. 요소 추가");
      System.out.println("\t2. 요소 출력");
      System.out.println("\t3. 요소 검색");
      System.out.println("\t4. 요소 삭제");
      System.out.println("\t5. 요소 변경");
      System.out.println("\t6. 종료");
      System.out.print("\t>> 메뉴 선택(1~6) : ");
      choice = sc.nextInt();
      // 조건문 써서 각 메뉴메소드 호출
      switch (choice)
      {
      case 1: add(); break;
      case 2: print(); break;
      case 3: search(); break;
      case 4: remove(); break;
      case 5: change(); break;
      case 6: return;
      default: System.out.println("메뉴 선택 오류~!!"); break;
      
      }
   }

   // 벡터 요소 추가 메소드
   public void add()
   {
      int i=1;
      boolean flag=true;
      Scanner sc = new Scanner(System.in);
      
      while (flag)
      {
         System.out.printf("\t%d번째 요소 입력 : ", i);
         String adds = sc.next();
         v.add(adds); // 벡터에 입력된 요소 추가
         System.out.printf("\t%d번째 요소 입력 성공~!!!", i++);
         System.out.print("\t요소 입력 계속(Y/N) : ");
         answer = sc.next().charAt(0);
         if (answer != 'y' && answer !='Y')
         {
            flag = false;
            menu();
         }
      }
      
   }// end add()

   // 벡터 요소 전체 출력 메소드
   public void print()
   {
      System.out.println("\t벡터 전체 출력");
      for (String element : v)
         System.out.println("\t"+ element);
      System.out.println("\t벡터 전체 출력 완료~!!!");
      menu();
   }// end print()

   public void search()
   {
      Scanner sc = new Scanner(System.in);
      System.out.print("\t검색할 요소 입력: ");
      str = sc.next(); 
       if (v.contains(str))
       {
         System.out.println("\t[검색 결과 출력]");
         System.out.println("\t항목이 존재합니다.");
         menu();
       }
       else 
       {
         System.out.println("\t[검색 결과 출력]");
         System.out.println("\t항목이 존재하지 않습니다");
         menu();
       }  
   }// end search()

   public void remove()
   {
      Scanner sc = new Scanner(System.in);
      System.out.print("\t삭제할 요소 입력 : ");
      str = sc.next();
      if (v.contains(str))
       {
         int i = v.indexOf(str);
         v.remove(i);
         System.out.println("\t[삭제 결과 출력]");
         System.out.println("\t항목을 삭제하였습니다.");
         menu();
       }
      else
       {
         System.out.println("\t[삭제 결과 출력]");
         System.out.println("\t항목이 존재하지 않아 삭제할 수 없습니다.");
         menu();
       }
   }// end remove()
   
   public void change()
   {
      Scanner sc = new Scanner(System.in);
      System.out.print("변경할 대상 입력 : ");
      str = sc.next();
      if (v.contains(str))
      {
         int i = v.indexOf(str);
         System.out.print("수정할 내용 입력 : ");
         String str2 = sc.next();
         v.set(i, str2);
         System.out.println("\t[변경 결과 출력]");
         System.out.println("변경이 완료되었습니다.");
         menu();
      }
      else
      {
         System.out.println("입력한 대상이 존재하지 않습니다.");
         menu();
      }
   }//end choice()


   public static void main(String[] args)
   {

      Test158 ob = new Test158();
      ob.menu();

   }
}