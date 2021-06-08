import java.util.Scanner;
import java.util.HashMap;
import java.util.Map;
import java.util.Iterator;
import java.util.Hashtable;
import java.util.Set;

class MovieVO
{
	 // 영화 정보 담는 변수들
	 private String mTitle;			// 영화 제목
	 private String mGenre;			// 장르
	 private String mOpenDate;		// 개봉일자 
	 private String mEndDate;		// 종영일자
	 private String mStory;		    // 줄거리
	 private int mAge;				// 관람가능연령
	 private int mTime;				// 총 상영시간(러닝타임)
	 private int mStar;				// 평점
		
	// 생성자(사용자 정의 생성자 → 매개변수 없는 기본 생성자)
	MovieVO()
	{
	}
	
	// 생성자(사용자 정의 생성자)
	public MovieVO(String mTitle, String mGenre, String mOpenDate, String mEndDate, String mStory, int mAge, int mTime, int mStar)
	{
		this.mTitle = mTitle;
		this.mGenre = mGenre;
		this.mOpenDate = mOpenDate;
		this.mEndDate = mEndDate;
		this.mStory = mStory;
		this.mAge = mAge;
		this.mTime = mTime;
		this.mStar = mStar;
	}
	
	
	// get, set 메소드 
	public String getmTitle()			// 영화 제목
	{
		return mTitle;
	}

	public void setmTitle(String mTitle)
	{
		this.mTitle = mTitle;
	}

	public String getmGenre()			// 장르
	{
		return mGenre;
	}

	public void setmGenre(String mGenre)
	{
		this.mGenre = mGenre;
	}

	public String getmOpenDate()		// 상영 일자
	{
		return mOpenDate;
	}

	public void setmOpenDate(String mOpenDate)
	{
		this.mOpenDate = mOpenDate;
	}

	public String getmEndDate()			// 종영 일자
	{
		return mEndDate;
	}

	public void setmEndDate(String mEndDate)
	{
		this.mEndDate = mEndDate;
	}

	public String getmStory()			// 줄거리
	{
		return mStory;
	}

	public void setmStory(String mStory)
	{
		this.mStory = mStory;
	}

	public int getmAge()				// 관람 가능 연령
	{
		return mAge;
	}

	public void setmAge(int mAge)
	{
		this.mAge = mAge;
	}

	public int getmTime()
	{
		return mTime;
	}

	public void setmTime(int mTime)
	{
		this.mTime = mTime;
	}

	public int getmStar()
	{
		return mStar;
	}

	public void setmStar(int mStar)
	{
		this.mStar = mStar;
	}

	public String toString()
	{
		return "\t『"+mTitle+"』 『"+mGenre+"』 『"+mOpenDate+"』 『"+mEndDate+"』 『"+mStory+"』 『"+mAge+"』 『"+mTime+"』 『"+mStar+"』";
		//영화제목 장르 개봉일자 종영일자 줄거리 관람가능연령 총상영시간 평점
	}

}

class ScreenVO
{
	// 상영관
	String mRoom;
	// 상영시작시간
	int mStart;

	int mend;
	
	// 상영관 청소시간 
	final int M_CLEAN = 20;

	
	//get, set 메소드
}

//-상영관 좌석 배열 설정(default)
class ScreenSeat
{
	// 1관(2D) 10*5
	int[][] oneScreen = new int[5][10];
	// 2관(2D) 12*10
	int[][] twoScreen = new int[10][12];
	// 3관(2D) 10*5
	int[][] threeScreen = new int[5][10];
	// 4관(4D) 8*4
	int[][] fourScreen = new int[4][8];
}

class AdminMovieTest
{
	//private static final Map<Object, MovieVO> map;
	private static final Hashtable<Object, MovieVO> ht;
	//Hashtable<Object, MovieVO> ht = new Hashtable<Object, MovieVO>();

	static 
	{
		//map = new HashMap<Object, MovieVO>();
		//ht = new Hashtable<Object, MovieVO>();
		ht = new Hashtable<>();
	}

	// 영화 관리 메뉴 출력 메소드
	public static void movieMenuDisp() 
	{
		Scanner sc = new Scanner(System.in);

		int sel;

		System.out.println("\n\n");
		System.out.println("\t영화 관리             0. 관리자 메뉴");
		System.out.println("\t====================================");
		// 영화 등록?
		System.out.println("\t1. 영화 등록");
		// 등록 영화 출력?
		System.out.println("\t2. 등록 전체 출력");
		// 등록된 영화 변경
		System.out.println("\t3. 등록 영화 정보 변경");
		// 등록된 영화 삭제
		System.out.println("\t4. 등록 영화 삭제");
		// 상영관 리스트?
		System.out.println("\t5. 상영리스트 등록");
		// 상영관 현황 출력?
		System.out.println("\t6. 상영관 현황 출력");
		// 상영관 리스트 변경
		System.out.println("\t7. 상영관리스트 변경");
		// 상영관 리스트 삭제
		System.out.println("\t8. 상영관리스트 삭제");
		System.out.println();
		System.out.print("\t>> 메뉴를 선택해주세요 (0~8) : ");
		
		sel = sc.nextInt();
		switch (sel)
		{
			case 0: break;
			default : movieMenuSelect(sel); break;
		}
		
	} // end movieMenuDisp() 영화 관리 메뉴 출력 메소드

	// 영화 관리 메뉴 선택 메소드
	public static void movieMenuSelect(int sel) 
	{
		switch (sel)
		{
			case 0: break;	// 관리자 메뉴로 
	    	case 1: registerMovie(); break;		
			case 2: printMoive(); break;		
			case 3: chaMoive(); break;			
			case 4: delMoive(); break; 
		}

		movieMenuDisp();
	} // end movieMenuSelect() 영화 관리 메뉴 선택 메소드

  // 영화정보 등록 메소드 
  public static void registerMovie() 
  {
	 Scanner sc = new Scanner(System.in);

	 String title="";	// 영화 제목을 받는..
	 String genre;
	 String openDate;
	 String endDate;
	 String story;
	 int age;
	 int time;
	 int star;

	 int t=0;	//do while을 다시 돌았다면...
	 
	 System.out.println("\n\n");
	 System.out.println("\t영화 등록                 ");
	 System.out.println("\t====================================");
	 do
	 {	
		 if (t>0)
			System.out.println("\t" + title + "은 이미 등록되어있습니다.");

		 System.out.print("\t>> 등록할 영화 제목을 입력하세요 : ");
		 title = sc.nextLine();

		 t++;

	 }
	 //while (map.containsKey(title));
	 while (ht.containsKey(title));
	  
	 System.out.println();
	 System.out.print("\t>> 등록할 영화 장르를 입력하세요 : ");
	 genre = sc.next();

     System.out.println();
	 System.out.print("\t>> 등록할 영화 개봉 일자를 입력하세요 (MM-DD) : ");
	 openDate = sc.next();

	 System.out.println();
	 System.out.print("\t>> 등록할 영화 종영 일자를 입력하세요 (MM-DD) : ");
	 endDate = sc.next();
	 
	 sc.nextLine();
	 System.out.println();
	 System.out.print("\t>> 등록할 영화 줄거리를 입력하세요 : ");
	 story = sc.nextLine();
	 //sc.next().trim();

	 System.out.println();
	 System.out.print("\t>> 등록할 영화 관람 가능 연령을 입력하세요 : ");
	 age = sc.nextInt();
	 
	 System.out.println();
	 System.out.print("\t>> 등록할 영화 총 상영시간을 입력하세요 (MM) : ");
	 time = sc.nextInt();
	 
	 System.out.println();
	 System.out.print("\t>> 등록할 영화 평점을 입력하세요. : ");
	 star = sc.nextInt();

	 //map.put(title,(new MovieVO(title, genre, openDate, endDate, story, age, time, star)));
	 ht.put(title,(new MovieVO(title, genre, openDate, endDate, story, age, time, star)));
	 

  } // end registerMovie() 영화 등록 메소드 

   // 등록된 영화 전체 출력 메소드 
   public static void printMoive() 
   {
	  System.out.println("\n\n");
	  System.out.println("\t영화제목 장르 개봉일자 종영일자 줄거리 관람가능연령 총상영시간 평점");
	  System.out.println("\t================================================================================");
	  Set<Object> key = ht.keySet();
	  Iterator<Object> hit = key.iterator();
	  while (hit.hasNext())
	  {
		  String keys = (String)hit.next();
		  System.out.println(ht.get(keys));
	  }
   } // end printMovie()


   // 영화 정보 변경 메소드
   public static void chaMoive()   
   {
      Scanner sc = new Scanner(System.in);
      
      String str;
      int n;
      int intele;
      Object key;

      int sel=0;
      int t=0;
      
      System.out.println("\n\n");
      System.out.println("\t영화 정보 변경");
      System.out.println("\t====================================");
      System.out.print("\t>> 변경할 영화 제목을 입력하세요 : ");
      key = sc.nextLine();
      
      if (ht.containsKey(key))
      {
         do
         {
            if (t>0)
              System.out.println("유효하지 않은 메뉴입니다. 다시 선택해주세요.\n");

            System.out.println("\t1. 영화 제목");
            System.out.println("\t2. 영화 장르");
            System.out.println("\t3. 개봉 일자");
            System.out.println("\t4. 종영 일자");
            System.out.println("\t5. 줄거리");
            System.out.println("\t6. 관람 가능 연령");
            System.out.println("\t7. 총 상영 시간");
            System.out.println("\t8. 평점"); 
            System.out.println();
            System.out.println();
            System.out.print("\t>> 변경할 옵션을 선택하세요 : ");

            sel = sc.nextInt();
 
            t++;//
         }
         while (sel>8 || sel<1);


         
      }
      else 
         System.out.println("\t해당 영화는 등록 되어있지않습니다.");

      //sel에 다른 수 입력시 default로 해결할 수 있도록
      
      if (sel==1)

      {
		 sc.nextLine();
         System.out.print("\t>> 수정할 제목을 입력하세요 : ");
         str = sc.nextLine();
         ht.get(key).setmTitle(str);
         ht.get(key).getmTitle();
         ht.replace(key, ht.get(key));
		 
		 // key 값이 영화 제목으로 있음, key 값을 변경하기 위해
		 String genre = ((MovieVO)ht.get(key)).getmGenre();
		 String openDate = ((MovieVO)ht.get(key)).getmOpenDate();
		 String endDate = ((MovieVO)ht.get(key)).getmEndDate();
		 String story = ((MovieVO)ht.get(key)).getmStory();
		 int age = ((MovieVO)ht.get(key)).getmAge();
		 int time = ((MovieVO)ht.get(key)).getmTime();
		 int star = ((MovieVO)ht.get(key)).getmStar();

		 ht.remove(key);
		 ht.put(str,(new MovieVO(str, genre, openDate, endDate, story, age, time, star)));
      } 

      if (sel==2)
      {
         System.out.print("\t>> 수정할 장르를 입력하세요 : ");
         str = sc.next();
         ht.get(key).setmGenre(str);
         ht.get(key).getmGenre();
         ht.replace(key, ht.get(key));
      } 

      if (sel==3)
      {
         System.out.print("\t>> 수정할 개봉 일자를 입력하세요 : ");
         str = sc.next();
         ht.get(key).setmOpenDate(str);
         ht.get(key).getmOpenDate();
         ht.replace(key, ht.get(key));
      }

      if (sel==4)
      {
         System.out.print("\t>> 수정할 종영 일자를 입력하세요 : ");
         str = sc.next();
         ht.get(key).setmEndDate(str);
         ht.get(key).getmEndDate();
         ht.replace(key, ht.get(key));
      }

      if (sel==5)
      {
         System.out.print("\t>> 수정할 줄거리를 입력하세요 : ");
         sc.nextLine();//이거맞나 헷갈리네 
         str = sc.nextLine();
         ht.get(key).setmStory(str);
         ht.get(key).getmStory();
         ht.replace(key, ht.get(key));
      }

      if (sel==6)
      {
         System.out.print("\t>> 관람 가능 연령을 입력하세요 : ");
         n = sc.nextInt();
         ht.get(key).setmAge(n);
         ht.get(key).getmAge();
         ht.replace(key, ht.get(key));
      }

      if (sel==7)
      {
         System.out.print("\t>> 총 상영시간을 입력하세요 : ");
         n = sc.nextInt();
         ht.get(key).setmTime(n);
         ht.get(key).getmTime();
         ht.replace(key, ht.get(key));
      }

      if (sel==8)
      {
         System.out.print("\t>> 평점을 입력하세요 : ");
         n = sc.nextInt();
         ht.get(key).setmStar(n);
         ht.get(key).getmStar();
         ht.replace(key, ht.get(key));
      }
      
   } // end chaMoive() 등록된 영화 정보 변경 메소드 

   public static void delMoive() 
   {
		Scanner sc = new Scanner(System.in);
		
		Object key;

		System.out.println("\t등록 영화 삭제");
		System.out.println("\t====================================");
		System.out.print("\t삭제할 영화 제목을 입력하세요 : ");
		key = sc.nextLine();

		if (ht.containsKey(key))
			ht.remove(key);
		else 
			System.out.println("\t입력하신 영화는 존재하지않습니다.");

   }
   
  /*
  // 상영정보 등록 메소드
  public static void registerScreen()
  {
	 Scanner sc = new Scanner();
	 
	 Object key=""; 
	 int sel;
	 int t=0;
	 // -상영정보 등록
	 System.out.println("\n\n");
	 System.out.println("\t상영 리스트 등록");
	 System.out.println("\t====================================");
	 
	 // 스케줄링할 영화 선택 
	 do
	 {
		 if (t>0)
			 System.out.printf("\t%s 는 등록되지 않은 영화 입니다.", key); 

		 System.out.println("\t>> 상영관을 등록할 영화 제목을 입력하세요 : ");
		 key = sc.nextLine();
		 t++;
	 }
	 while (!ht.containKey(key));
	
	 t = 0;		// 밑 do while문을 돌기 위한 초기화 
	
	 // 상영관 선택
	 do
	 {
		 if (t>0)
			 System.out.println("유효하지 않은 메뉴입니다. 다시 선택해주세요."); 

		 System.out.println("\t1. 1관(2D)");
		 System.out.println("\t2. 2관(2D)");
		 System.out.println("\t3. 3관(2D)");
		 System.out.println("\t4. 4관(4D)");
		 System.out.println();
		 System.out.println("\t>> 상영할 상영관을 선택해주세요 : ");
		 sel = sc.nextInt();

		 t++;
	 }
	 while (sel>4 || sel<1);
	
	 int d, h, m;	// 시간과 분을 담을 변수
	 int endTime;

	 do
	 {
		 System.out.println("\t 1. 오늘");
		 System.out.println("\t 2. 내일");
		 System.out.println("\t 3. 모레");
	 }
	 while ();

	 // 상영 시간 선택 
	 do
	 {
		 System.out.println("\t>> 상영 시작 시간을 입력해주세요 (시간만입력) : ");
		 h = sc.nextInt();

		 System.out.println("\t>> 상영 시작 시간을 입력해주세요 (분만 입력) :");
		 m = sc.nextInt();
	 }
	 while ();
	 
	 
     
	 //
	 int h = 11;				// 시
	 int m = 55;				// 분
	 int runtime =215;  // 총 상영시간 (분)

	 // 끝나는 시간 계산
	 h += runtime / 60;
	 m += runtime % 60;
	
	 if (m >=60)
	 {
		h += (m/60); 
		m %= 60;
	 }
	 
	
  }
  */

  public static void main(String[] args) 
	{
		do
		{
			movieMenuDisp();
		}
		while (true);
	}
}