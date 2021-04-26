/*=============================
   ���� �迭 (array) ����
   - �迭�� ���� ó��
=============================*/

// ����ڷκ��� ������ ������ �Է¹޾�
// �� ������ ������ŭ ����(1~100)�� �߻����Ѽ� �迭�� ���
// �迭�� ����ִ� �����͵� �� 
// ���� ū ���� ���� ���� ���� �����Ͽ� ����ϴ� ���α׷��� �����Ѵ�.

// ���� ��)
// �߻���ų ������ ���� �Է� : 3
// (52 21 17 �� �������� �߻��� ������... �� �迭�� ��Ƴ���(�迭 ����))
// ���� ū �� : 52, ���� ���� �� : 17
// ����Ϸ��� �ƹ� Ű��...

import java.util.Scanner;
import java.util.Random;	// ���� ���� Ŭ����

public class Test090
{
	public static void main(String[] args)
	{
		// Scanner Ŭ���� ��� �ν��Ͻ� ����
		Scanner sc = new Scanner(System.in);

		// �ȳ� �޼��� ���
		System.out.print("�߻���ų ������ ���� �Է� : ");
		int size = sc.nextInt();

		// size ������ ��Ƴ� �� ��ŭ�� �迭�� �����
		// (�迭 ���� �� �޸� �Ҵ�)
		int[] arr = new int[size];

		// ������ ����(����)�� �߻���Ű�� ���ؼ���
		// ���� �߻� ���� ��ü�� �ʿ��ϴ�.
		// �� ��java.util.Random��
		Random rd = new Random();

		// �׽�Ʈ
		//System.out.println("�߻��� ���� : " + rd.nextInt(100)); // 0 ~ 99 
		// �� ��Random��Ŭ������ ��nextInt()���޼ҵ�
		//	   0 ~ �Ű������� �Ѱܹ��� ����-1 ������ �� ��
		//	   ������ ����(����) 1���� �߻���Ų��.

		for (int i=0 ; i<size; i++)	// for (int i=0 ; i<arr.length; i++)
		{	arr[i] = rd.nextInt(100)+1; // (0~99)+1 �� 1~100
			System.out.printf("%4d", arr[i]); // ���Ե� arr �迭 ������� Ȯ��
		}
		System.out.println();

		

		 /*
		 for(int i=0, n=1; (i+n)<arr.length; i++, n++)   // i=0
		 {
			 if(arr[i]<arr[i+n])				// arr[0]<arr[1]   1 < 2 3 -> 2  1  3  
			 {
				arr[i]= arr[i]^arr[i+n];		// arr[0]=arr[0]^arr[1]
				arr[i+n]= arr[i+n]^arr[i];		// arr[1]=arr[1]^arr[0]
				arr[i]= arr[i]^arr[i+n];		// arr[0]=arr[0]^arr[1]
				n++;
			 }
		 }
		 */
			 
			 // �ڸ��ٲٱ�� �ƴѰŰ���
		/*
			 for (int i=0 ; (i+1)<size; i++)
			 {
				 if (arr[i] < arr[i+1])
				 {
					arr[i] = arr[i+1];
				 }
			
			 }
		*/
		

		// ���� Ǭ ����

		// ex)  56  61  36  83  53  35  53  80  45  98

		int max, min;		//-- �ִ밪, �ּҰ�
		//min = arr[0];
		//max = arr[0];
		max = min = arr[0]; //-- max==min==56 ���� �ӽ� ����! (��� �� �ҰŴϱ�)

		for (int i=1; i<arr.length; i++) // �̹� arr[0]���� �ʱ�ȭ�����ϱ� �ݺ����̱� ���� i=1���� �ݺ�
		{
			// max �� i��° ����� ũ�� �� �� i�� �� ū ��Ȳ �� max �� i ����
			if (max<arr[i])
				max = arr[i];
			
			// min �� i��° ����� ũ�� �� �� i�� �� ū ��Ȳ �� min �� i ����
			if (min>arr[i])				// else if �ƴϰ� �ѹ� �� �˻��ؾߵǴϱ� if
				min = arr[i];
		}

		// ��� ���
		System.out.printf("���� ū �� : %d, ���� ���� �� : %d\n", max, min);

		
	}

}


/* [���� ���] 
�߻���ų ������ ���� �Է� : 10
  32  92  65  32   5  75  87  11  75  94
���� ū �� : 94, ���� ���� �� : 5
����Ϸ��� �ƹ� Ű�� �����ʽÿ� . . .

*/