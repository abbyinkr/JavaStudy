/*==================================
     ���� Ŭ���� ��� ����
     - �������̽�(Interface)
==================================*/

// �� �ǽ� ����
//    ���� ó�� ���α׷��� �����Ѵ�.
//    ��, �������̽��� Ȱ���� �� �ֵ��� �Ѵ�.

// ���� ��)
// �ο� �� �Է�(1~10) : 2
// 1��° �л��� �й� �̸� �Է�(���� ����) : 2104256 �ڹ���
// ���� ���� ���� ���� �Է�   (���� ����) : 90 100 85
// 2��° �л��� �й� �̸� �Է�(���� ����) : 2104257 �輭��
// ���� ���� ���� ���� �Է�   (���� ����) : 85 70 65

// 2104256 �ڹ��� 90 100  85     275     91
//                ��  ��  �� 
// 2104257 �輭�� 85  70  65      220     73
//                ��  ��  ��

// ����Ϸ��� �ƹ� Ű��...

// 90 ~ 100 : ��
// 80 ~ 89  : ��
// 70 ~ 79  : ��
// 60 ~ 69  : ��
// ������   : ��

// �Ӽ��� �����ϴ� Ŭ���� �� �ڷ��� Ȱ��

import java.util.Scanner;

class Record
{
	String hak, name;		//-- �й�, �̸�
	int kor, eng, mat;		//-- ����, ����, ���� ����
	int tot, avg;	        //-- ����, ���(���ǻ� ����ó��)

}

//�������̽�
interface Sungjuk
{
	public void set();
	public void input();
	public void print();
}

// ���� �ذ� �������� �����ؾ� �� Ŭ����
class SungjukImpl implements Sungjuk
{
	private int inwon;
	private Record[] arr;

	// �� �ο��� �Է�
	@Override
	public void set()
	{
		Scanner sc = new Scanner(System.in);

		do
		{
			System.out.print("�ο� �� �Է�(1~10) : ");
			inwon = sc.nextInt();
		}
		while (inwon<1 || inwon>10);

		//RecordŸ���� �迭 arr ���� �ο��� ��ŭ ����

		arr = new Record[inwon];
	}

	// �й�, �̸�, ���� �Է��� ����, ���(���� ����) ���� �޼ҵ� ������ 
	@Override
	public void input()
	{
		Scanner sc = new Scanner(System.in);

		for (int i=0; i<inwon; i++)
		{
			arr[i] = new Record();

			System.out.printf("%d��° �л��� �й� �̸� �Է�(���� ����) : ", i+1);
			arr[i].hak = sc.next();
			arr[i].name = sc.next();
			
			System.out.print("���� ���� ���� ���� �Է�   (���� ����) : ");
			arr[i].kor = sc.nextInt();
			arr[i].eng = sc.nextInt();
			arr[i].mat = sc.nextInt();

			arr[i].tot += arr[i].kor + arr[i].eng + arr[i].mat;
			arr[i].avg = arr[i].tot/3;		
		}
	}
	
	// ��� �޼ҵ� ������
	@Override
	public void print()
	{
		// ����� ���� �迭�� �迭 �����
		String[][] result = new String[inwon][3];	// 0 1 2 : ����, ����, ����

		for (int i=0 ; i<inwon; i++)
		{
			switch (arr[i].kor/10)
			{
			case 10: case 9: result[i][0] = "��"; break;
			case 8: result[i][0] = "��";  break;
			case 7: result[i][0] =  "��"; break;
			case 6: result[i][0] = "��"; break;
			default: result[i][0] = "��";
			}

			switch (arr[i].eng/10)
			{
			case 10: case 9: result[i][1] = "��"; break;
			case 8: result[i][1] = "��";  break;
			case 7: result[i][1] =  "��"; break;
			case 6: result[i][1] = "��"; break;
			default: result[i][1] = "��";
			}

			switch (arr[i].mat/10)
			{
			case 10: case 9: result[i][2] = "��"; break;
			case 8: result[i][2] = "��";  break;
			case 7: result[i][2] =  "��"; break;
			case 6: result[i][2] = "��"; break;
			default: result[i][2] = "��";	
			}
		}//end ����� ��� 

		
		// ���
		for (int i=0 ; i<arr.length ; i++)
		{
			System.out.printf(" %s %s ", arr[i].hak, arr[i].name);
			System.out.printf("%3d %3d %3d %4d %3d",arr[i].kor, arr[i].eng, arr[i].mat, arr[i].tot, arr[i].avg);
			System.out.println();
			System.out.printf("%18s %2s %2s",result[i][0], result[i][1], result[i][2]);
			System.out.println();
		}	

	}//end print()
}//end class SungjukImpl

public class Test116
{
	public static void main(String[] args)
	{
		// check~!!!
		// Sungjuk �� �������̽�
		//Sungjuk ob;
		// �������̽��� ��ü���� �Ұ���
		
		// �������̽��� ������ Ŭ���� ����� �ν��Ͻ� ����
		// SungjukImpl ob = new SungjukImpl();

		Sungjuk ob = new SungjukImpl();	// ��ĳ����

		// ���� �ذ� �������� �ۼ��ؾ� �� ob ����
		ob.set();
		ob.input();
		ob.print();

	}
}