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
			System.out.print("���� �Է� : ");
			int n = sc.nextInt();
			sk.setPaper(n);
			System.out.println("���� ���� : " + sk.getPaper() + "���Դϴ�.");
			if (sk.getPaper()>=300)
			{
				break;
			}
			System.out.printf("������ %d������մϴ�.\n", 300-sk.getPaper());
			System.out.println("������ �ּ� 300���� �־���մϴ�. �� �Է����ּ���.");
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
			System.out.print("���� �Է� : ");
			int n = sc.nextInt();
			sk.setPaper(n);
			System.out.println("���� ���� : " + sk.getPaper() + "���Դϴ�.");
			if (sk.getPaper()>=300)
			{
				break;
			}
			System.out.printf("������ %d������մϴ�.\n", 300-sk.getPaper());
			System.out.println("������ �ּ� 300���� �־���մϴ�. �� �Է����ּ���.");
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


