/*=====================================================
  ���� �޼ҵ� �ߺ�����(Method Overloading) ����
   - �޼ҵ� �����ε��� ������ ���¿� �Ұ����� ����
=====================================================*/

public class Test096
{
	public static void main(String[] args)
	{
		print();
		print(10);

		//double result = print(10.1); 
		// print(10.1); 
		//�ڹٴ� ���Կ����� ���� ���׺��� ó���ҷ��� �޷���µ�
		// �ڹٴ� �̰� ������ ������!
		
	}

	public static void print(){}
	public static void print(int i){}
	//public static void print(int j){}				//--(X)
	public static void print(char c){}				// �� �ڵ� �� ��ȯ ��Ģ�� �����ؼ� ���
	public static void print(int i, int j){}
	public static void print(int i, double d){}		// �� �ڵ� �� ��ȯ ��Ģ�� �����ؼ� ���
	public static void print(double d, int k){}
	public static double print(double d){return 3.14;}
	public static void print(double d){}			//--(X)
	public static String print(double d){}			//--(X)
}