
//import java.util.Scanner;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

class CircleTest
{
	// ���� Ǭ ����
	/*
	int r;  // ���� ����

	void input() // �Է� �޼ҵ�
	{
		Scanner sc = new Scanner(System.in);
		
		System.out.print("������ �Է� : ");
		r = sc.nextInt();
		System.out.println(); //����
	}

	double calArea() // ���� ���� ��� �޼ҵ�
	{
		double result = r * r * 3.141592;
		return result;
	}

	double calLength() // ���� �ѷ� ��� �޼ҵ�
	{
		return r * 2 * 3.141592;
	}

	void print(double a, double l) // ��� ��� �޼ҵ�
	{
		System.out.printf(">> �������� %d �� ����\n", r);
		System.out.printf(">> ���� : %.2f\n", a);
		System.out.printf(">> �ѷ� : %.2f\n", l);
	}
	*/

	// ���� Ǭ ����
	
	private int r;						//-- ������
	//double pi = 3.141592;
	final double PI = 3.141592;		//-- ������
	//--��final�� : ������ ���ȭ
		
	void input() throws IOException
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		System.out.print("������ �Է� : ");
		r = Integer.parseInt(br.readLine());
	}

	double calArea()
	{
		double result;
		// result = ������ * ������ * 3.141592;
		result = r * r * PI;
		return result;
	}

	double calLength() // ���꿡 �ʿ��� �����Ͱ� ������ = �Ű������� �޾ƿ;� ��, ��������� ������ ���� 
	{
		// �ѷ� = ������ * 2 * 3.141592
		double result;
		result = r * 2 * PI;
		return result;
	}

	void print(double a, double l)
	{
		System.out.printf("\n>> �������� %d�� ����\n", r);
		System.out.printf(">> ���� : %.2f\n", a);
		System.out.printf(">> �ѷ� : %.2f\n", l);
	}
}//end class Circletest
