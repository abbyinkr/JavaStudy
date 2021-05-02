//import java.io.BufferedReader;
//import java.io.InputStreamReader;
//import java.io.IOException;

import java.util.Scanner;

public class Sungjuk 
{
	/*
	int n;				// �Է¹��� �л���
	Record[] objArr;	// RecordŸ���� �迭 ����


	// �� �Է¹޴� �޼ҵ� ����
	void input() throws IOException
	{
	
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		do
		{
			System.out.print("�ο� �� �Է�(1~100) : ");
			n = Integer.parseInt(br.readLine());
		}
		while (n<1 || n>100); // �� ���ϴ� ���� ������ 1<=n<=100 �� ���

		objArr = new Record[n]; 
		//�Է��� �л����� 3���̸� 3���� ��

		for (int i=0; i<objArr.length; i++) 
		{
			objArr[i] = new Record(); // �渶�� �ν��Ͻ� ����
			
			System.out.printf("%d��° �л��� �̸� �Է� : ", i+1);

			objArr[i].name = br.readLine();
	
			System.out.print("���� ���� : ");
			objArr[i].score[0] = Integer.parseInt(br.readLine());
			System.out.print("���� ���� : ");
			objArr[i].score[1] = Integer.parseInt(br.readLine());	
			System.out.print("���� ���� : ");
			objArr[i].score[2] = Integer.parseInt(br.readLine());
				
		}
	}

	// ���� ���� ���� �޼ҵ� ���� -- ���� ��Ƶ� ������ Record�ȿ� ��� �����Ƿ� void			
	void sum()
	{
		for (int i=0; i<n; i++)
		{
			
			objArr[i].tot = objArr[i].score[0]+objArr[i].score[1]+objArr[i].score[2];
		}
		
	}
	
	//  ��� ���� ���� �޼ҵ� ����
	void avg()
	{
		for (int i=0; i<n; i++)
		{
			objArr[i].avg = objArr[i].tot/3.0;
		}
	}
	
	// ���� ���� �޼ҵ� ����
	void rank()
	{
			for (int i=0 ; i<n; i++)
			{
				objArr[i].rank = 1;

				for (int j=0 ; j<n; j++)
				{
					if (objArr[i].avg < objArr[j].avg)  // 1 4 10 
					{
						objArr[i].rank++; //               
					}
				}
			}
	}

	// ��� �޼ҵ� ����
	void print()
	{
		for (int i=0; i<n; i++)
		{
			System.out.printf("%s %d %d %d %3d %4.2f\n", objArr[i].name,objArr[i].score[0],objArr[i].score[1],objArr[i].score[2],objArr[i].tot, objArr[i].avg);

		}
		
	}
	*/

	//[�Բ� Ǯ���� ����]
	
	//    - �Ӽ� : �ο���, Record ������ �迭 ex) Record[] rec
	// �ֿ� �Ӽ� ����
	private int inwon;			//-- �ο� ��
	private Record[] recArr;	//-- Record �迭
								//   (�л� 1�� �� Record �迭 �� 1�� Ȱ��)
	


	//	  - ��� : �ο��� �Է�, �� ������ �Է�, ����/��� ����, ��� ���
	// �޼ҵ� ����
	// �� �ο��� �Է�
	public void set()
	{
		Scanner sc = new Scanner(System.in);

		do
		{
			System.out.print("�ο� �� �Է�(1~100) : ");
			inwon = sc.nextInt();
		}
		while (inwon<1 || inwon>100);

		// check~!!!
		// Record Ŭ������ ������� ������ ��ü(�ν��Ͻ�)�� ���� �� �ִ� �迭���� 
		// inwon��ŭ ������ ������,
		// Record Ŭ������ �ν��Ͻ��� ������ ���� �ƴϴ�.
		recArr = new Record[inwon];
		
	}

	// �޼ҵ� ����
	// �� �� ������ �Է� �� ����/��� ����

	public void input()	// ����ڿ��� �Է¾ȳ��ϸ鼭 ���� �޾Ƴ��⶧���� �Ű����� ����.
	{
		Scanner sc = new Scanner(System.in);

		String[] subTitle = {"���� ���� : ", "���� ���� : ", "���� ���� : "};

		for (int i=0 ; i<inwon ; i++)	// �ο� �� ��ŭ �ݺ�~!!! (inwon == recArr.length)
		{
			// check~!!
			// Record Ŭ���� ����� �ν��Ͻ� ���� 
			// Record rec = new Record();		 
			// recArr[i] = rec;
			recArr[i] = new Record(); 

			System.out.printf("%d��° �л��� �̸� �Է� : ", (i+1));
			recArr[i].name = sc.next();

			/*
			System.out.print("���� ���� : ");
			recArr[i].score[0] = sc.nextInt();
			recArr[i].tot += recArr[i].score[0];

			System.out.print("���� ���� : ");
			recArr[i].score[1] = sc.nextInt();
			recArr[i].tot += recArr[i].score[1];

			System.out.print("���� ���� : ");
			recArr[i].score[2] = sc.nextInt();
			recArr[i].tot += recArr[i].score[2];
			*/

			for (int j=0 ; j<subTitle.length ; j++)		// 0 1 2 
			{
				// �ȳ� �޼��� ���
				System.out.print(subTitle[j]);

				// ����ڰ� �Է��� �����͸� ���ھ�(score) �迭�� ��Ƴ���
				recArr[i].score[j] = sc.nextInt();

				// ����, ����, ���� ���� �����͸� �ݺ������� �Է¹޴� ����
				// �� �������� ���� �����ϱ�
				recArr[i].tot += recArr[i].score[j];
			}

			// �� ��� �����ϱ�
			recArr[i].avg = recArr[i].tot/3.0;

		}
		
	}//end input()

	// �޼ҵ� �߰� ����
	// �� ���� ���� (ũ�� ���ҷ��� �ݺ����� ��ø�� �ؾ��Ѵ�)
	private void ranking()	// ����ڰ� �ǵ������ϰ� private
	{
		// ���� ����
		int i, j;
		
		// ��� �л����� ���(����)�� 1�� �ʱ�ȭ
		for (i=0; i<inwon; i++)
			recArr[i].rank = 1;
			
		// ���(����) ����
		for (i=0; i<inwon-1; i++)		// i �� �� ������ �����ϴ� �ε���
		{
			for (j=i+1; j<inwon; j++)	// j �� �� ����� �����ϴ� �ε���
			{
				if (recArr[i].avg > recArr[j].avg)	// ���� �����Ͱ� �� �����ͺ��� ũ�ٸ�
				{
					// �񱳵������� rank�� 1��ŭ ����
					recArr[j].rank++;

				}

				else if (recArr[j].avg > recArr[i].avg)
				{
					// ���ص������� rank �� 1��ŭ ����
					recArr[i].rank++;
				}
				 
			}
		}


	
	}



	// �޼ҵ� ����
	// �� ��� ���
	public void print()
	{
		// ���� ���� �޼ҵ� ȣ�� ���� �߰� ~!!!
		ranking();

		// ����
		System.out.println();

		// �л� 1��� �ݺ� ��� ����

		for (int i=0; i<inwon ; i++)	//-- �л� �ο� �� ��ŭ �ݺ�~!!!
		{
			// �̸� ���
			System.out.printf("%5s", recArr[i].name);

			// ����(����, ����, ����) �ݺ� ���
			for (int j=0 ; j<3; j++) // 0 1 2 �� ���� ���� ����
				System.out.printf("%4d", recArr[i].score[j]);
		
			// ����, ��� ���
			System.out.printf("%5d", recArr[i].tot);
			System.out.printf("%8.2f", recArr[i].avg);

			// ���� ���
			System.out.printf("%5d", recArr[i].rank);

			// ����
			System.out.println();
		
		}
		
	}//end print()
	
}