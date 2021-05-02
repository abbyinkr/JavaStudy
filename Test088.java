/*=============================
   ���� �迭 (array) ����
   - �迭�� �迭(2���� �迭)
=============================*/

// �迭�� �迭(������ �迭)�� Ȱ���Ͽ�
// ������ ���� �����͸� ��ҷ� ���ϴ� �迭(5x5)�� �����ϰ�
// �� ����� ����ϴ� ���α׷��� �����Ѵ�.

// ���� ��)

/*
  1  2  3  4  5
  2  3  4  5  6
  3  4  5  6  7
  4  5  6  7  8
  5  6  7  8  9
 ����Ϸ��� �ƹ� Ű��..
*/

/*
  1  2  3  4  5		�� i==0
  6  7  8  9 10		�� i==1
 11 12 13 14 15		�� i==2
 16 17 18 19 20		�� i==3
 21 22 23 24 25		�� i==4

*/

public class Test088 
{
	public static void main(String[] args)
	{
		/*
		int n;
		
		// �迭�� �迭 ����� �޸� �Ҵ�
		int[][] arr;
		arr = new int[5][5];
		
		// �迭�� �迭 ����
		for (int i=0; i<arr.length; i++)
		{
			n = (i+1);
			for (int j=0; j<arr[i].length; j++)
			{
				arr[i][j] = n;
				n++;
			}
		}

		// �迭�� �迭 ���

		for (int i=0 ; i<arr.length; i++)
		{
			for (int j=0 ; j<arr[i].length; j++)
			{
				System.out.printf("%3d", arr[i][j]);
			}
			System.out.println();
		}
		*/

		// �迭�� �迭 ���� �� �޸� �Ҵ�
		int[][] arr = new int[5][5];

		int n;

		// ��~ 
		for (int i=0; i<arr.length; i++)	// i �� 0 1 2 3 4 
		{
			n = i + 1;
			// ��~
			for (int j=0; j<arr[i].length; j++) // j �� 0 1 2 3 4 / 0 1 2 3 4 / ...
			{
				arr[i][j] = n;
				n++;
			}
		}

		// �迭�� �迭 ��� ��ü ���

		for (int i=0; i<arr.length; i++)
		{
			for (int j=0; j<arr[i].length; j++)
				System.out.printf("%3d", arr[i][j]); // 1���̴ϱ� {} �������� 
			System.out.println(); 
		}
	}//end main
}

/* [���� 
  1  2  3  4  5
  2  3  4  5  6
  3  4  5  6  7
  4  5  6  7  8
  5  6  7  8  9
����Ϸ��� �ƹ� Ű�� �����ʽÿ� . . .
*/