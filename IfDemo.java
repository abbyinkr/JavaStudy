import java.util.Scanner;
 
public class IfDemo {
 
    public static void main(String[] args) {
 
        Scanner sc = new Scanner(System.in);
 
        int num;
		
		System.out.print("������ ���� �Է� : ");
        num = sc.nextInt();


	
		// if ~ else if��: ���ǹ� �� �� ������ ����ȴ�.

		/*
        if (num % 2 == 0)
            System.out.println(num + "��(��) 2�� ����Դϴ�.");
 
		else if (num % 3 == 0)
            System.out.println(num + "��(��) 3�� ����Դϴ�.");
        

		[������]

		������ ���� �Է� : 6
		6��(��) 2�� ����Դϴ�.		(if���� �����Ǹ� ��������ϰ� ���� else if �Ⱥ�!)
		����Ϸ��� �ƹ� Ű�� �����ʽÿ� . . .
		
		*/

		// �� ���� if��: �ϳ��� ���Ǹ� �����Ǿ ������ ���ǹ��� ����ȴ�.
        
		if (num % 2 == 0)
            System.out.println(num + "��(��) 2�� ����Դϴ�.");
 
        if (num % 3 == 0)
            System.out.println(num + "��(��) 3�� ����Դϴ�.");
 

		// [���� ���]
		/*
		������ ���� �Է� : 6
		6��(��) 2�� ����Դϴ�. (ù ��° if�� ���� ����)
		6��(��) 3�� ����Դϴ�. (�� ��° if�� ���� ����)
		����Ϸ��� �ƹ� Ű�� �����ʽÿ� . . .
		*/

        sc.close();
 
    }
 
}

