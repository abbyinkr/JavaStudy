/*===============================================
        ���� �ڹ� �⺻ ���α׷��� ����
 - ������ �ڷ���
 - �ڹ��� �⺻ ����� 
===============================================*/

// ����ڷκ��� �̸��� ��������, ��������, ���������� �Է¹޾�
// �̸��� ������ ����ϴ� ���α׷��� �����Ѵ�.

// ���� ��)
// �̸��� �Է��ϼ��� : �ڳ���
// ���� ���� �Է� : 90
// ���� ���� �Է� : 80
// ���� ���� �Է� : 70

// ====[���]====
// �̸� : �ڳ���
// ���� : 240 
// ==============
// ����Ϸ��� �ƹ� Ű�� ��������...

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;


//import java.io*;
//��� �� import�ϴ� ��� - ����õ

public class Test014
{
	public static void main(String[] args) throws IOException
	{
		/* ���� Ǯ���� ����
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		String name;
		int kor, eng, math, total;
		
		System.out.print("�̸��� �Է��ϼ��� : ");

		name = br.readLine();

		System.out.print("���� ���� �Է� : ");
		kor = Integer.parseInt(br.readLine());
		
		System.out.print("���� ���� �Է� : ");
		eng = Integer.parseInt(br.readLine());

		System.out.print("���� ���� �Է� : ");
		math = Integer.parseInt(br.readLine());
		total = kor + eng + math;

		System.out.print("====[���]====\n");
		System.out.printf("�̸� : %s \n���� : %d\n", name, total);
		System.out.print("==============");
		*/


		// �Բ� Ǯ���� ����

		//InputStreamReader �ν��Ͻ� ���� + BufferedReader �ν��Ͻ� ����
		InputStreamReader isr = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(isr);

		// �ֿ亯�� ���� 

		String strName;				 //-- �̸� ����
		int nKor, nEng, nMat, nTot;  //-- ����, ����, ����, ���� ����

		// �߰� ���� ����
		String strTemp;			     //-- ���ڿ� ������ �ӽ� ���� ����

		//���� �� ó��
		// ������ڿ��� �ȳ� �޼��� ���(�̸� �Է� �ȳ�)
		System.out.print("�̸��� �Է��ϼ��� : ");

		//������ڰ� �Է��� ��(�ܺ� ������)�� ������ ��Ƴ���
		strName = br.readLine();

		//������ڿ��� �ȳ� �޼��� ��� (�������� �Է� �ȳ�)
		System.out.print("���� ���� �Է� : ");
		
		//������ڰ� �Է��� ��(�ܺε�����)�� ������ ��Ƴ��� 
		strTemp = br.readLine();            //--���ڿ� �ӽ� ����     "90"
		nKor = Integer.parseInt(strTemp);   //--�ӽ����� ������ �� ��ȯ�� 
											//--�������� ������ ��Ƴ���

		//������ڿ��� �ȳ� �޼��� ��� (�������� �Է� �ȳ�)
		System.out.print("���� ���� �Է� : ");

		//������ڰ� �Է��� ��(�ܺε�����)�� ������ ��Ƴ���
		strTemp = br.readLine();			//--���ڿ� �ӽ� ����     "80"
		nEng = Integer.parseInt(strTemp);	//-- �ӽ����� ������ �� ��ȯ��
											//    �������� ������ ��Ƴ���

		//������ڿ��� �ȳ� �޼��� ��� (�������� �Է� �ȳ�)
		System.out.print("���� ���� �Է� :");
		
		//������ڰ� �Է��� ��(�ܺ� ������)�� ������ ��Ƴ���
		strTemp = br.readLine();			//--���ڿ� �ӽ� ����     "70"
		nMat = Integer.parseInt(strTemp);	//--�ӽ����� ������ �� ��ȯ��
											//	�������� ������ ��Ƴ���

		//���Էµ� �����͵�(nKor,nEng,nMat)�� �����Ͽ� ���� �����ϱ�
		nTot = nKor + nEng + nMat;

		//��� ���
		//System.out.println();	//����
		System.out.println("\n======[���]======");
		System.out.println("�̸� : " + strName);
		System.out.println("���� : " + nTot);
		System.out.println("==================");

	}
}

/*[���� ���]
�̸��� �Է��ϼ��� : �ڳ���
���� ���� �Է� : 90
���� ���� �Է� : 80
���� ���� �Է� :70

======[���]======
�̸� : �ڳ���
���� : 240
==================
����Ϸ��� �ƹ� Ű�� �����ʽÿ� . . .
*/