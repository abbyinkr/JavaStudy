import java.util.Scanner;
import java.util.HashMap;
import java.util.Map;
import java.util.Iterator;
import java.util.Hashtable;
import java.util.Set;

class MovieVO
{
	 // ��ȭ ���� ��� ������
	 private String mTitle;			// ��ȭ ����
	 private String mGenre;			// �帣
	 private String mOpenDate;		// �������� 
	 private String mEndDate;		// ��������
	 private String mStory;		    // �ٰŸ�
	 private int mAge;				// �������ɿ���
	 private int mTime;				// �� �󿵽ð�(����Ÿ��)
	 private int mStar;				// ����
		
	// ������(����� ���� ������ �� �Ű����� ���� �⺻ ������)
	MovieVO()
	{
	}
	
	// ������(����� ���� ������)
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
	
	
	// get, set �޼ҵ� 
	public String getmTitle()			// ��ȭ ����
	{
		return mTitle;
	}

	public void setmTitle(String mTitle)
	{
		this.mTitle = mTitle;
	}

	public String getmGenre()			// �帣
	{
		return mGenre;
	}

	public void setmGenre(String mGenre)
	{
		this.mGenre = mGenre;
	}

	public String getmOpenDate()		// �� ����
	{
		return mOpenDate;
	}

	public void setmOpenDate(String mOpenDate)
	{
		this.mOpenDate = mOpenDate;
	}

	public String getmEndDate()			// ���� ����
	{
		return mEndDate;
	}

	public void setmEndDate(String mEndDate)
	{
		this.mEndDate = mEndDate;
	}

	public String getmStory()			// �ٰŸ�
	{
		return mStory;
	}

	public void setmStory(String mStory)
	{
		this.mStory = mStory;
	}

	public int getmAge()				// ���� ���� ����
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
		return "\t��"+mTitle+"�� ��"+mGenre+"�� ��"+mOpenDate+"�� ��"+mEndDate+"�� ��"+mStory+"�� ��"+mAge+"�� ��"+mTime+"�� ��"+mStar+"��";
		//��ȭ���� �帣 �������� �������� �ٰŸ� �������ɿ��� �ѻ󿵽ð� ����
	}

}

class ScreenVO
{
	// �󿵰�
	String mRoom;
	// �󿵽��۽ð�
	int mStart;

	int mend;
	
	// �󿵰� û�ҽð� 
	final int M_CLEAN = 20;

	
	//get, set �޼ҵ�
}

//-�󿵰� �¼� �迭 ����(default)
class ScreenSeat
{
	// 1��(2D) 10*5
	int[][] oneScreen = new int[5][10];
	// 2��(2D) 12*10
	int[][] twoScreen = new int[10][12];
	// 3��(2D) 10*5
	int[][] threeScreen = new int[5][10];
	// 4��(4D) 8*4
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

	// ��ȭ ���� �޴� ��� �޼ҵ�
	public static void movieMenuDisp() 
	{
		Scanner sc = new Scanner(System.in);

		int sel;

		System.out.println("\n\n");
		System.out.println("\t��ȭ ����             0. ������ �޴�");
		System.out.println("\t====================================");
		// ��ȭ ���?
		System.out.println("\t1. ��ȭ ���");
		// ��� ��ȭ ���?
		System.out.println("\t2. ��� ��ü ���");
		// ��ϵ� ��ȭ ����
		System.out.println("\t3. ��� ��ȭ ���� ����");
		// ��ϵ� ��ȭ ����
		System.out.println("\t4. ��� ��ȭ ����");
		// �󿵰� ����Ʈ?
		System.out.println("\t5. �󿵸���Ʈ ���");
		// �󿵰� ��Ȳ ���?
		System.out.println("\t6. �󿵰� ��Ȳ ���");
		// �󿵰� ����Ʈ ����
		System.out.println("\t7. �󿵰�����Ʈ ����");
		// �󿵰� ����Ʈ ����
		System.out.println("\t8. �󿵰�����Ʈ ����");
		System.out.println();
		System.out.print("\t>> �޴��� �������ּ��� (0~8) : ");
		
		sel = sc.nextInt();
		switch (sel)
		{
			case 0: break;
			default : movieMenuSelect(sel); break;
		}
		
	} // end movieMenuDisp() ��ȭ ���� �޴� ��� �޼ҵ�

	// ��ȭ ���� �޴� ���� �޼ҵ�
	public static void movieMenuSelect(int sel) 
	{
		switch (sel)
		{
			case 0: break;	// ������ �޴��� 
	    	case 1: registerMovie(); break;		
			case 2: printMoive(); break;		
			case 3: chaMoive(); break;			
			case 4: delMoive(); break; 
		}

		movieMenuDisp();
	} // end movieMenuSelect() ��ȭ ���� �޴� ���� �޼ҵ�

  // ��ȭ���� ��� �޼ҵ� 
  public static void registerMovie() 
  {
	 Scanner sc = new Scanner(System.in);

	 String title="";	// ��ȭ ������ �޴�..
	 String genre;
	 String openDate;
	 String endDate;
	 String story;
	 int age;
	 int time;
	 int star;

	 int t=0;	//do while�� �ٽ� ���Ҵٸ�...
	 
	 System.out.println("\n\n");
	 System.out.println("\t��ȭ ���                 ");
	 System.out.println("\t====================================");
	 do
	 {	
		 if (t>0)
			System.out.println("\t" + title + "�� �̹� ��ϵǾ��ֽ��ϴ�.");

		 System.out.print("\t>> ����� ��ȭ ������ �Է��ϼ��� : ");
		 title = sc.nextLine();

		 t++;

	 }
	 //while (map.containsKey(title));
	 while (ht.containsKey(title));
	  
	 System.out.println();
	 System.out.print("\t>> ����� ��ȭ �帣�� �Է��ϼ��� : ");
	 genre = sc.next();

     System.out.println();
	 System.out.print("\t>> ����� ��ȭ ���� ���ڸ� �Է��ϼ��� (MM-DD) : ");
	 openDate = sc.next();

	 System.out.println();
	 System.out.print("\t>> ����� ��ȭ ���� ���ڸ� �Է��ϼ��� (MM-DD) : ");
	 endDate = sc.next();
	 
	 sc.nextLine();
	 System.out.println();
	 System.out.print("\t>> ����� ��ȭ �ٰŸ��� �Է��ϼ��� : ");
	 story = sc.nextLine();
	 //sc.next().trim();

	 System.out.println();
	 System.out.print("\t>> ����� ��ȭ ���� ���� ������ �Է��ϼ��� : ");
	 age = sc.nextInt();
	 
	 System.out.println();
	 System.out.print("\t>> ����� ��ȭ �� �󿵽ð��� �Է��ϼ��� (MM) : ");
	 time = sc.nextInt();
	 
	 System.out.println();
	 System.out.print("\t>> ����� ��ȭ ������ �Է��ϼ���. : ");
	 star = sc.nextInt();

	 //map.put(title,(new MovieVO(title, genre, openDate, endDate, story, age, time, star)));
	 ht.put(title,(new MovieVO(title, genre, openDate, endDate, story, age, time, star)));
	 

  } // end registerMovie() ��ȭ ��� �޼ҵ� 

   // ��ϵ� ��ȭ ��ü ��� �޼ҵ� 
   public static void printMoive() 
   {
	  System.out.println("\n\n");
	  System.out.println("\t��ȭ���� �帣 �������� �������� �ٰŸ� �������ɿ��� �ѻ󿵽ð� ����");
	  System.out.println("\t================================================================================");
	  Set<Object> key = ht.keySet();
	  Iterator<Object> hit = key.iterator();
	  while (hit.hasNext())
	  {
		  String keys = (String)hit.next();
		  System.out.println(ht.get(keys));
	  }
   } // end printMovie()


   // ��ȭ ���� ���� �޼ҵ�
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
      System.out.println("\t��ȭ ���� ����");
      System.out.println("\t====================================");
      System.out.print("\t>> ������ ��ȭ ������ �Է��ϼ��� : ");
      key = sc.nextLine();
      
      if (ht.containsKey(key))
      {
         do
         {
            if (t>0)
              System.out.println("��ȿ���� ���� �޴��Դϴ�. �ٽ� �������ּ���.\n");

            System.out.println("\t1. ��ȭ ����");
            System.out.println("\t2. ��ȭ �帣");
            System.out.println("\t3. ���� ����");
            System.out.println("\t4. ���� ����");
            System.out.println("\t5. �ٰŸ�");
            System.out.println("\t6. ���� ���� ����");
            System.out.println("\t7. �� �� �ð�");
            System.out.println("\t8. ����"); 
            System.out.println();
            System.out.println();
            System.out.print("\t>> ������ �ɼ��� �����ϼ��� : ");

            sel = sc.nextInt();
 
            t++;//
         }
         while (sel>8 || sel<1);


         
      }
      else 
         System.out.println("\t�ش� ��ȭ�� ��� �Ǿ������ʽ��ϴ�.");

      //sel�� �ٸ� �� �Է½� default�� �ذ��� �� �ֵ���
      
      if (sel==1)

      {
		 sc.nextLine();
         System.out.print("\t>> ������ ������ �Է��ϼ��� : ");
         str = sc.nextLine();
         ht.get(key).setmTitle(str);
         ht.get(key).getmTitle();
         ht.replace(key, ht.get(key));
		 
		 // key ���� ��ȭ �������� ����, key ���� �����ϱ� ����
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
         System.out.print("\t>> ������ �帣�� �Է��ϼ��� : ");
         str = sc.next();
         ht.get(key).setmGenre(str);
         ht.get(key).getmGenre();
         ht.replace(key, ht.get(key));
      } 

      if (sel==3)
      {
         System.out.print("\t>> ������ ���� ���ڸ� �Է��ϼ��� : ");
         str = sc.next();
         ht.get(key).setmOpenDate(str);
         ht.get(key).getmOpenDate();
         ht.replace(key, ht.get(key));
      }

      if (sel==4)
      {
         System.out.print("\t>> ������ ���� ���ڸ� �Է��ϼ��� : ");
         str = sc.next();
         ht.get(key).setmEndDate(str);
         ht.get(key).getmEndDate();
         ht.replace(key, ht.get(key));
      }

      if (sel==5)
      {
         System.out.print("\t>> ������ �ٰŸ��� �Է��ϼ��� : ");
         sc.nextLine();//�̰Ÿ³� �򰥸��� 
         str = sc.nextLine();
         ht.get(key).setmStory(str);
         ht.get(key).getmStory();
         ht.replace(key, ht.get(key));
      }

      if (sel==6)
      {
         System.out.print("\t>> ���� ���� ������ �Է��ϼ��� : ");
         n = sc.nextInt();
         ht.get(key).setmAge(n);
         ht.get(key).getmAge();
         ht.replace(key, ht.get(key));
      }

      if (sel==7)
      {
         System.out.print("\t>> �� �󿵽ð��� �Է��ϼ��� : ");
         n = sc.nextInt();
         ht.get(key).setmTime(n);
         ht.get(key).getmTime();
         ht.replace(key, ht.get(key));
      }

      if (sel==8)
      {
         System.out.print("\t>> ������ �Է��ϼ��� : ");
         n = sc.nextInt();
         ht.get(key).setmStar(n);
         ht.get(key).getmStar();
         ht.replace(key, ht.get(key));
      }
      
   } // end chaMoive() ��ϵ� ��ȭ ���� ���� �޼ҵ� 

   public static void delMoive() 
   {
		Scanner sc = new Scanner(System.in);
		
		Object key;

		System.out.println("\t��� ��ȭ ����");
		System.out.println("\t====================================");
		System.out.print("\t������ ��ȭ ������ �Է��ϼ��� : ");
		key = sc.nextLine();

		if (ht.containsKey(key))
			ht.remove(key);
		else 
			System.out.println("\t�Է��Ͻ� ��ȭ�� ���������ʽ��ϴ�.");

   }
   
  /*
  // ������ ��� �޼ҵ�
  public static void registerScreen()
  {
	 Scanner sc = new Scanner();
	 
	 Object key=""; 
	 int sel;
	 int t=0;
	 // -������ ���
	 System.out.println("\n\n");
	 System.out.println("\t�� ����Ʈ ���");
	 System.out.println("\t====================================");
	 
	 // �����ٸ��� ��ȭ ���� 
	 do
	 {
		 if (t>0)
			 System.out.printf("\t%s �� ��ϵ��� ���� ��ȭ �Դϴ�.", key); 

		 System.out.println("\t>> �󿵰��� ����� ��ȭ ������ �Է��ϼ��� : ");
		 key = sc.nextLine();
		 t++;
	 }
	 while (!ht.containKey(key));
	
	 t = 0;		// �� do while���� ���� ���� �ʱ�ȭ 
	
	 // �󿵰� ����
	 do
	 {
		 if (t>0)
			 System.out.println("��ȿ���� ���� �޴��Դϴ�. �ٽ� �������ּ���."); 

		 System.out.println("\t1. 1��(2D)");
		 System.out.println("\t2. 2��(2D)");
		 System.out.println("\t3. 3��(2D)");
		 System.out.println("\t4. 4��(4D)");
		 System.out.println();
		 System.out.println("\t>> ���� �󿵰��� �������ּ��� : ");
		 sel = sc.nextInt();

		 t++;
	 }
	 while (sel>4 || sel<1);
	
	 int d, h, m;	// �ð��� ���� ���� ����
	 int endTime;

	 do
	 {
		 System.out.println("\t 1. ����");
		 System.out.println("\t 2. ����");
		 System.out.println("\t 3. ��");
	 }
	 while ();

	 // �� �ð� ���� 
	 do
	 {
		 System.out.println("\t>> �� ���� �ð��� �Է����ּ��� (�ð����Է�) : ");
		 h = sc.nextInt();

		 System.out.println("\t>> �� ���� �ð��� �Է����ּ��� (�и� �Է�) :");
		 m = sc.nextInt();
	 }
	 while ();
	 
	 
     
	 //
	 int h = 11;				// ��
	 int m = 55;				// ��
	 int runtime =215;  // �� �󿵽ð� (��)

	 // ������ �ð� ���
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