/*=======================================
 ���� ���� �帧�� ��Ʈ��(���) ����
 - if ~ else�� �ǽ�
=======================================*/

// ����ڷκ��� ������ ������ �� �� �Է¹޾�
// ���� �� ���� ū �� ������ ����ϴ� ���α׷��� �����Ѵ�.

// ���� ��)
// ù ��° ���� �Է� : 45
// �� ��° ���� �Է� : 81
// �� ��° ���� �Է� : 13

// >> ���� ��� : 13 45 81
// ����Ϸ��� �ƹ� Ű��...

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Test036
{
	public static void main(String[] args) throws IOException
	{
		/* �� Ǯ�̹��
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int a, b, c;
		System.out.print("ù ��° ���� �Է� : ");
		a = Integer.parseInt(br.readLine());
		System.out.print("�� ��° ���� �Է� : ");
		b = Integer.parseInt(br.readLine());
		System.out.print("�� ��° ���� �Է� : ");
		c = Integer.parseInt(br.readLine());

		
		if(a>b)
		{
			if(b>c)
			System.out.printf(">>���� ��� : %d %d %d\n",c,b,a);
			else
			System.out.printf(">>���� ��� : %d %d %d\n",b,c,a);
		}
		else if(b>a)
		{
			if(a>c)
			System.out.printf(">>���� ��� : %d %d %d\n",c,a,b);
			else
			System.out.printf(">>���� ��� : %d %d %d\n",a,c,b);
		}
		else if(c>a)
		{
			if(a>b)
			System.out.printf(">>���� ��� : %d %d %d\n",b,a,c);
			if(b>a)
			System.out.printf(">>���� ��� : %d %d %d\n",a,b,c);
		}
		else
			System.out.println("�߸� �Է��߽��ϴ�.");
		
	*/
	/* �ٸ����
		if(a>b && b>c)
			System.out.printf("%d %d %d\n",c,b,a);
		else if (a>b && c>b)
			System.out.printf("%d %d %d\n",c,b,a);
		else if (b>a && a>c)
			System.out.printf("%d %d %d\n",c,a,b);
		else if (b>a && c>a)
			System.out.printf("%d %d %d\n",a,b,b);
	*/	

	// ���� Ǭ ���

	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

	int a, b, c;		//--����ڰ� �Է��ϴ� ������ ������ ���� ����
	int temp;			//--�ӽ� ���� ����(�� ��)

	System.out.print("ù ��° ���� �Է� : ");
	a= Integer.parseInt(br.readLine());

	System.out.print("�� ��° ���� �Է� : ");
	b = Integer.parseInt(br.readLine());

	System.out.print("�� ��° ���� �Է� : ");
	c = Integer.parseInt(br.readLine());

	// 2 2 2 | 3 2 1 | 2 1 3 | 3 1 2 | 1 3 2 | 1 2 3
	//       | 2 3 1 | 1 2 3 | 1 3 2 | 1 2 3
	//       | 2 1 3         | 1 2 3 
	//       | 1 2 3

	if (a>b)	// �� ù ��° ������ �� ��° �������� ũ�ٸ�... 
	{
		// �� ����(a�� b)�� �ڸ��� �ٲ۴�.
		temp = a;
		a = b;
		b =temp;
	}
	if (b>c)	// �� �� ��° ������ �� ��° �������� ũ�ٸ�
	{
		// �� ����(b�� c)�� �ڸ��� �ٲ۴�.
		temp = b;
		b = c;
		c = temp;
	}
	if (a>b)	// �� ù ��° ������ �� ��° �������� ũ�ٸ�... (�ι�°���� �ڸ��ٲ����������ϱ� �ѹ��� ��)
	// �ص����� if�� ������ ��ŵ���� (else�� ���� �տ��� ����Ǹ� Ż����)
	{
		// �� ����(a�� b)�� �ڸ��� �ٲ۴�.
		temp = a;
		a = b;
		b = temp;
	}
	
	System.out.printf("\n>> ���� ��� : %d %d %d\n", a, b, c);
	}
}