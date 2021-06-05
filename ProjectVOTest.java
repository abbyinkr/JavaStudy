import java.util.Scanner;

class StockVO
{
	static private int paper;

	StockVO(){}

	public int getPaper()
	{ return paper;}

	public void setPaper(int paper)
	{ this.paper += paper; }
}

class Stock
{
	StockVO sk = new StockVO();
	boolean flag;
	void stock()
	{
		Scanner sc = new Scanner(System.in);
		
		do
		{
			System.out.print("용지 입력 : ");
			int n = sc.nextInt();
			sk.setPaper(n);
			System.out.println("현재 용지 : " + sk.getPaper() + "장입니다.");
			if (sk.getPaper()>=300)
			{
				break;
			}
			System.out.printf("용지가 %d장부족합니다.\n", 300-sk.getPaper());
			System.out.println("용지는 최소 300장이 있어야합니다. 더 입력해주세요.");
		}
		while (sk.getPaper()<300);	

		System.out.println("==========================================================");
	}
}

class Stock1
{
	StockVO sk = new StockVO();
	boolean flag;
	void stock1()
	{
		Scanner sc = new Scanner(System.in);
		
		do
		{
			System.out.print("용지 입력 : ");
			int n = sc.nextInt();
			sk.setPaper(n);
			System.out.println("현재 용지 : " + sk.getPaper() + "장입니다.");
			if (sk.getPaper()>=300)
			{
				break;
			}
			System.out.printf("용지가 %d장부족합니다.\n", 300-sk.getPaper());
			System.out.println("용지는 최소 300장이 있어야합니다. 더 입력해주세요.");
		}
		while (sk.getPaper()<300);	
	}
}

//====================================================================================================

// main()
public class ProjectVOTest
{
	public static void main(String[] args)
	{
		Stock s = new Stock();
		Stock1 s1 = new Stock1();
		
		s.stock();
		s1.stock1();
		
	}
}


