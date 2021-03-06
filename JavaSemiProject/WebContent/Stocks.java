// import
import java.util.Scanner;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;
import java.util.Iterator;
import java.util.Random;
import java.util.InputMismatchException;


/*
	Title	 : Stocks
	Function : 재고 관리
	author	 : 김아별, 심혜진
*/


// 수정사항 : menrRun() switch문 case 5 수정 
//			: 초기화 블럭 생성 (3/20)

//-----------------------------------------------------관리자 : 재고관리 변수 클래스
class StocksVO
{
   
   // 음료, 팝콘 변수들
   private static int coke, cida, popcorn, paper;

   // getter, setter 메소드
   public static int getCoke()
   { return coke; }
   
   public static void setCoke(int coke)
   { StocksVO.coke += coke; }

   public static int getCida()
   { return cida; }

   public static void setCida(int cida)
   { StocksVO.cida += cida; }

   public static int getPop()
   { return popcorn; }

   public static void setPop(int popcorn)
   { StocksVO.popcorn += popcorn; }

   public static int getPaper()
   { return paper; }

   public static void setPaper(int paper)
   { StocksVO.paper += paper; }
  
}//end class StockVO

//--------------------------------------------------관리자 : 재고관리 클래스 <완성>

class Stocks extends Record
{
   
    // ●● (다른 클래스에서 Stocks 메인메뉴 호출시 startStocks() 사용하시면 됩니다!)
   public static void startStocks() throws InterruptedException, IOException
   {
         menuStocks();
         User.menuSelect();
         menuRun();
   }   
   
   static StocksVO asv = new StocksVO();

   // 재고관리 메인 메뉴 출력 메소드
   public static void menuStocks() 
   {
      System.out.println();
      System.out.println("\t===========================");
      System.out.println("\t1. 콜라 재고 확인/충전");
      System.out.println("\t2. 사이다 재고확인/충전");
      System.out.println("\t3. 팝콘 재고 확인/충전");
      System.out.println("\t4. 용지 재고 확인/충전");
      System.out.println("\t5. 관리자 메뉴로 돌아가기");
      System.out.println("\t===========================");
      System.out.print("\t>> 메뉴 선택(1~5) : ");
   }
  
   // 재고관리 메뉴 호출 메소드
   public static void menuRun() throws InterruptedException, IOException
   {

      // Admin 클래스 인스턴스 생성(메뉴 이동)
      Admin ad = new Admin();

      switch (sel)
      {
		  case 1: addCoke(); break;
		  case 2: addCida(); break;
		  case 3: addPop(); break;
		  case 4: addPaper(); break;
		  case 5: 
		 // 수정 
		  {  ad.AdminMenuDisp();
			 ad.menuSelect();
			 ad.AdminMenuRun(); break;
		  }
      default: System.out.println("입력 오류입니다."); break;
      }
   }
   
   // 콜라 재고확인 및 충전 메소드
   public static void addCoke() throws InterruptedException, IOException
   {
      sc = new Scanner(System.in);
      int n;

      System.out.println();
      System.out.printf("\t현재 콜라캔의 재고는 %d개입니다.\n", StocksVO.getCoke());
      System.out.print("\t재고를 충전하시겠습니까?(Y/N): ");
      char sel;
      sel = (char)System.in.read();
	  System.in.skip(2);

      if (sel=='y' || sel =='Y')
      {
         while (true)
         {
			 try
			 {
				System.out.print("\t충전할 수량을 입력하세요 : ");
			    n = sc.nextInt();

				break;
			 }
			 catch (InputMismatchException e)
			 {
				sc = new Scanner(System.in);
				System.out.println("\t>> 잘못 입력하셨습니다. 정수만 입력해 주세요.\n");
			 }
         }
        
         if (n+StocksVO.getCoke()>300)
            System.out.println("\t보유 재고량은 300개를 초과할수 없습니다.");
         else
         {
            StocksVO.setCoke(n);
            System.out.println("\t충전이 완료되었습니다.");
            System.out.printf("\t현재 콜라의 재고는 %d입니다.\n", StocksVO.getCoke());
            System.out.println();
         }
         startStocks();
      }
   }//end addCoke()

   // 사이다 재고확인 및 충전 메소드
   public static void addCida() throws InterruptedException, IOException
   {
      sc = new Scanner(System.in);
      int n;

      System.out.println();
      System.out.printf("\t현재 사이다캔의 재고는 %d개입니다.\n", StocksVO.getCida());
      System.out.print("\t재고를 충전하시겠습니까?(Y/N): ");
      char sel;
      sel = (char)System.in.read();
	  System.in.skip(2);

      if (sel=='y' || sel =='Y')
      {
         
         while (true)
         {
			 try
			 {
				System.out.print("\t충전할 수량을 입력하세요 : ");
			    n = sc.nextInt();

				break;
			 }
			 catch (InputMismatchException e)
			 {
				sc = new Scanner(System.in);
				System.out.println("\t>> 잘못 입력하셨습니다. 정수만 입력해 주세요.\n");
			 }
         }

         if (n+StocksVO.getCida()>300)
            System.out.println("\t보유 재고량은 300개를 초과할수 없습니다.");
         else
         {
            StocksVO.setCida(n);
            System.out.println("\t충전이 완료되었습니다.");
            System.out.printf("\t현재 사이다캔의 재고는 %d입니다.\n", StocksVO.getCida());
            System.out.println();
         }   
      }

      startStocks();

   }//end addCida()


   // 팝콘 재고확인 및 충전 메소드
   public static void addPop() throws InterruptedException, IOException
   {
      sc = new Scanner(System.in);
      int n;
      System.out.println();
      System.out.printf("\t현재 팝콘의 재고는 %d개입니다.\n", StocksVO.getPop());
      System.out.print("\t재고를 충전하시겠습니까?(Y/N): ");
      char sel;
      sel = (char)System.in.read();
	  System.in.skip(2);

      if (sel=='y' || sel =='Y')
      {
         
         while (true)
         {
			 try
			 {
				System.out.print("\t충전할 수량을 입력하세요 : ");
			    n = sc.nextInt();

				break;
			 }
			 catch (InputMismatchException e)
			 {
				sc = new Scanner(System.in);
				System.out.println("\t>> 잘못 입력하셨습니다. 정수만 입력해 주세요.\n");
			 }
         }

         if (n+StocksVO.getPop()>300)
            System.out.println("\t보유 재고량은 300개를 초과할수 없습니다.");
         else
         {
            StocksVO.setPop(n);
            System.out.println("\t충전이 완료되었습니다.");
            System.out.printf("\t현재 팝콘의 재고는 %d개입니다.\n", StocksVO.getPop());
            System.out.println();
         }
      startStocks();
      }
   }//end addPop()

   // 용지 세팅 및 충전 메소드
   public static void addPaper() throws InterruptedException, IOException
   {
      sc = new Scanner(System.in);
	  int n;

      System.out.printf("\t현재 용지의 재고량은 %d장입니다.\n", StocksVO.getPaper());
      System.out.print("\t재고를 충전하시겠습니까?(Y/N): ");
      char sel;
      sel = (char)System.in.read();
 	  System.in.skip(2);

      if (sel=='y' || sel =='Y')
      {
         
         while (true)
         {
			 try
			 {
				System.out.print("\t충전할 수량을 입력하세요 : ");
			    n = sc.nextInt();

				break;
			 }
			 catch (InputMismatchException e)
			 {
				sc = new Scanner(System.in);
				System.out.println("\t>> 잘못 입력하셨습니다. 정수만 입력해 주세요.\n");
			 }
         }

         if (n+StocksVO.getPaper()>1000)
            System.out.println("\t보유 재고량은 1000개를 초과할수 없습니다.");
         else
         {
            StocksVO.setPaper(n);
            System.out.println("\t충전이 완료되었습니다.");
            System.out.printf("\t현재 용지의 재고량은 %d장입니다.\n", StocksVO.getPaper());
            System.out.println();
         }    
      }
      startStocks();
   }//end addPaper()

}//end class Stocks


