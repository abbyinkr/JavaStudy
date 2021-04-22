/*=============================
   ���� �迭 (array) ����
   - �迭�� ����� �ʱ�ȭ
   - �迭�� �⺻���� Ȱ��
=============================*/

// �� �ǽ� ����
// ��char���ڷ����� �迭�� ����� ���ĺ� �빮�ڸ� ä���
// ä���� �迭�� ��ü ��Ҹ� ����ϴ� ���α׷��� �����Ѵ�.

// ���� ��)
// A B C D E F G ... W X Y Z
// ����Ϸ��� �ƹ� Ű��...

public class Test082
{
	public static void main(String[] args)
	{
		/*
		char[] arr = new char[26];				 
		
		for (int i=0; i<=25; i++)				// �迭�� ���ĺ� �빮�� ä��� �ݺ���
		{
			arr[i] = (char)(i+65);  
		}

												// �迭 ���
		for (int j=0 ; j<arr.length; j++)
		{
			System.out.printf("%2c", arr[j]);
		}
		System.out.println();
		*/

		// ��� �� ( ��� ��, ��� �밡�ٶ� ��ŵ)

		char[] arr3 = new char[26];
		for (int i=0, ch=65; i<arr3.length; i++, ch++)		// 26�� ȸ��
		{
			arr3[i] = (char)ch;
			// arr3[0] = (char)65;
			// arr3[1] = (char)66;
			//   :
			// arr3[25] = (char)90;
		}

		// �迭 ��� ��ü ���
		for (int i=0; i<arr3.length; i++)
			System.out.print(arr3[i] + " ");
		System.out.println();

	}
}

/*
A B C D E F G H I J K L M N O P Q R S T U V W X Y Z
����Ϸ��� �ƹ� Ű�� �����ʽÿ� . . .

*/
