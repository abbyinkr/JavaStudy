/*=============================================
        ���� �ڹ� �⺻ ���α׷��� ����
 - �ڹ��� �⺻ ����� : java.util.Scanner
=============================================*/

// ��  ��java.util.Scanner��
//		�ܶ� ���� ������ ����Ͽ� �Է��� ��ū�� ���� �����ϸ�
//		����Ʈ(default)�� ���Ǵ� �ܶ� ���ڴ� �����̴�.
//		�ۼ��� ������ū�� ��next()���޼ҵ带 ���,
//		�ٸ������� ������ ��ȯ�� �� �ִ�.

import java.util.Scanner;

public class Test019
{
	public static void main(String[] args)
	{
		// Scanner �ν��Ͻ� ����
		Scanner sc = new Scanner(System.in);

		// �� �ֿ� ���� ����
		String name;
		int kor, eng, mat, tot;

		// �� ���� �� ó��
		System.out.print("�̸�,����,����,���� �Է�(��,������) : ");

		// sc = new Scanner(sc.next()).useDelimiter("\\s*,\\s*");
		// sc = new Scanner("������,90,80,70").useDelimiter("\\s*,\\s*");
		// sc = new Scanner("������,90,80,70").useDelimiter("���ڿ������ڿ������� ,");
		// sc = new Scanner("������,90,80,70").useDelimiter("\\s*��\\s*������ ,");
		sc = new Scanner(sc.next()).useDelimiter("\\s*,\\s*");   // ������ �� �� \\, %% �̷��� �ι� �Է��ؾ� \, % �ϳ��� �Էµ�
		//				------------
		//			"������,90,80,70"		������ ���ڿ��� ���ڿ���
		//									����� ���� �����ڸ� ���� ����

		// ==>> "������" "90" "80" "70"

		name = sc.next();		// "������"
		kor = sc.nextInt();		// "90"
		eng = sc.nextInt();		// "80"
		mat = sc.nextInt();		// "70"

		//���� ����

		tot = kor + eng + mat;

		// �� ��� ���
		System.out.println();
		System.out.printf("�̸� : %s%n", name);
		System.out.printf("���� : %d%n", tot);

	}
}

/*[���� ���]
�̸�,����,����,���� �Է�(��,������) : ������,90,80,70

�̸� : ������
���� : 240
����Ϸ��� �ƹ� Ű�� �����ʽÿ� . . .
*/