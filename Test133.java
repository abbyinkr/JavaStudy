/*=============================================
     ���� �ڹ��� �ֿ�(�߿�) Ŭ���� ����
	 - StringBuffer Ŭ����
=============================================*/

/*
�� StringBuffer Ŭ������
   ���ڿ��� ó���ϴ� Ŭ������ String Ŭ�������� ��������
   String Ŭ������ ���� ���ڿ� �������� ������ �Ұ���������
   StringBuffer Ŭ������ ���ڿ��� ����� ��
   ���� ���ڿ��� ���� �ܰ迡�� ������ �� �ִٴ� ���̴�.

   ��, StringBuffer ��ü�� �������� ���̸� �����Ƿ�
   ��ü�� �����ϴ� �������� �̸� �� ũ�⳪ ���� �����ϰų�
   ���� �������� ���� ũ�⸦ �ٲܼ� �ִ� ����� �����ϴ� ���̴�.

   ���� JDK 1.5 ���ĺ��ʹ�
   ���ڿ��� ó���ϴ� StringBuilder ��� Ŭ������ �����Ѵ�.
   StringBuilder Ŭ������ ����� StringBuilder Ŭ������ ����������
   ���� ū �������� multi-thread unsafe ��� ���̴�.
   ��, Syncronization �� ���� ������
   StringBuffer ���� ������ ���ü�(����ȭ) ������ ���ٸ�
   StringBuilder �� ����ϴ� ���� ������ ����ų �� �ִ�.
*/


// import ���� �� java.lang. ��Ű������~~

public class Test133
{
	public static void main(String[] args)
	{
		StringBuffer sb1 = new StringBuffer("korea");
		StringBuffer sb2 = new StringBuffer("korea");

		System.out.println(sb1 == sb2);
		//--==>> false (�ּҰ��� �ٸ�)
		System.out.println(sb1.equals(sb2));
		//--==>> false �� equals�޼ҵ�� �������̵����ؼ� Object���� �����Ѵ�� �ּҰ��� �� �׷��� false

		//sb1.toString();
		//============== stringŸ��
		
		System.out.println(sb1.toString().equals(sb2.toString()));
		//System.out.println("korea".equals("korea"));
		//--==>> true

		//System.out.println(sb1.toString());
		//--==>> korea
		// �� toString�޼ҵ�� StringBuffer Ŭ�������� Object Ŭ�������� �������� Overriding ������ �� �� �ִ�.

		/*
		�Ʒ� ������ ����.
		String str1 = sb1.toString();
		String str2 = sb2.toString();

		System.out.println(str1.equals(str2));
		*/

		StringBuffer sb3 = new StringBuffer();
		//-- StiringBuffer �⺻ ������ ȣ���(�ν��Ͻ� ���� ����)
		//   �⺻������ �����Ǵ� ���� ũ�� ��16��
		
		System.out.println("���� ũ�� : " + sb3.capacity());
		//--==>> ���� ũ�� : 16

		///////////////////////////////////////////////////////////////////////////////////////////////////////////////////
		
		System.out.println(sb3);
		//--==>> ��
		
		//sb3 = "seoul"; (��)
		sb3.append("seoul");	// StringŬ���� ���忡���� sb3 += "seoul"; �� sb3 = sb3 + "seoul";
		sb3.append("korea");
		sb3.append("�츮����");
		sb3.append("���ѹα�");

		System.out.println(sb3);
		//--==>> seoulkorea�츮������ѹα�

		System.out.println(sb3.toString());
		//--==>> seoulkorea�츮������ѹα�
		
		System.out.println("���� ũ�� : " + sb3.capacity());
		//--==>> ���� ũ�� : 34
		// ����� ���ڿ��� �þ�� �������� �˾Ƽ� ���� ũ�⸦ �÷����� Ȯ�ΰ���

		///////////////////////////////////////////////////////////////////////////////////////////////////////////////////

		String temp1 = "java and oracle";
		System.out.println(temp1.toUpperCase());
		//--==>> JAVA AND ORACLE

		String temp2 = "JAVA AND ORCLE";
		System.out.println(temp2.toLowerCase());
		//--==>> java and orcle

		//System.out.println(sb3.toUpperCase());
		//System.out.println(sb3.LowerCase());
		//--> toUpperCase() �� toLowerCase() �� StringŬ�������� ���ǵ� �޼ҵ�

		String temp3 = sb3.toString(); 
		System.out.println(temp3.toUpperCase());
		System.out.println(temp3.toLowerCase());
		//--==>> SEOULKOREA�츮������ѹα�
		//       seoulkorea�츮������ѹα�
		System.out.println(sb3.toString().toUpperCase());
		//--==>> SEOULKOREA�츮������ѹα�

		// seoulKorea�츮������ѹα�
		// �� ��� ���ڿ�(sb3) �� seoul ���ڿ� ^��^��
		//    ���ѱ����̶�� ���ڿ� �߰�
		sb3.insert(0,"�ѱ�");
		// sb3 ��ü�� �ٲ�
		System.out.println("seoul �տ� ���ѱ��� �߰� : " + sb3.toString());
		//--==>> seoul �տ� ���ѱ��� �߰� : �ѱ�seoulkorea�츮������ѹα�

		// �ѱ�seoulkorea�츮������ѹα�


		// ��insert() �޼ҵ塻 : ���ڿ� �߰�
		
		// �� ��� ���ڿ�(sb3) �� seoul ���ڿ� �ڿ�
		//    ��������̶�� ���ڿ� �߰�
		//     ��, ��� ���ڿ��� �ε����� ���� Ȯ������ ����...

		/* [���� Ǯ��]
		// �׽�Ʈ
		//System.out.println(sb3.indexOf("seoul"));
		//--==>> 2

		System.out.println(sb3.insert(sb3.indexOf("seoul")+"seoul".length(), "���"));
		*/

		// step 1 
		System.out.println(sb3.toString());
		//--==>> �ѱ�seoulkorea�츮������ѹα�

		// step 2
		//sb3.insert(7, "���");
		
		// step 3
		//System.out.println(sb3.indexOf("seoul"));
		//--==>> 2
		
		// step 4
		//sb3.insert(sb3.indexOf("seoul"), "���");
		//System.out.println(sb3.toString());
		//--==>> �ѱ����seoulkorea�츮������ѹα�

		// step 5
		//sb3.insert(sb3.indexOf("seoul")+5, "���");
		//System.out.println(sb3.toString());
		//--==>> �ѱ�seoul���korea�츮������ѹα�

		// step 6

		//sb3.insert(sb3.indexOf("seoul")+("seoul"�� ����"), "���");
		//System.out.println(sb3.toString());

		// step 7
		sb3.insert(sb3.indexOf("seoul")+"seoul".length(), "���");
		System.out.println(sb3.toString());
		//--==>> �ѱ�seoul���korea�츮������ѹα�

		// ��delete() �޼ҵ塻 : ���ڿ� ����
		
		// �� ���츮���� ���ڿ� ����
		//sb3.delete(14, 18);
		//System.out.println(sb3.toString());
		//--==>> �ѱ�seoul���korea���ѹα�

		
		//System.out.println(sb3.indexOf("�츮����"));
		//--==>> 14
		System.out.println(sb3.delete(sb3.indexOf("�츮����"),sb3.indexOf("�츮����")+"�츮����".length()));
		//--==>> �ѱ�seoul���korea���ѹα�

		// �� ��� ���ڿ�(sb3)����
		//    ��korea������ ���ڿ� ����(korea ����)
		//sb3.delete(sb3�� "korea"���ڿ� ������ġ, sb3�� ���ڿ�����)
		//System.out.println(sb3.delete(sb3.indexOf("korea"),sb3.toString().length()));
		sb3.delete(sb3.indexOf("korea"),sb3.length());
		System.out.println(sb3.toString());
		//--==>> �ѱ�seoul���

		// �� ��� ���ڿ�(sb3)����
		//    ��seoul�� ���� ���ڿ� ���� (seoul ����)
		sb3.delete(sb3.indexOf("seoul")+"seoul".length(), sb3.length());
		System.out.println(sb3.toString());
		//--==>> �ѱ�seoul

		System.out.println("���� ũ�� : " + sb3.capacity());
		//--==>> ���� ũ�� : 34
		// capacity�� �ڵ����� �پ���� �ʴ´�.
		
		// ���ڿ�(sb3)�� ���� Ȯ��
		System.out.println("���ڿ��� ���� : " + sb3.length());
		//--==>> ���ڿ��� ���� : 7

		// ���� ũ�� ���� �� ���� ���ڿ��� ��Ƶ� �� �ִ� ���� ũ���...
		sb3.trimToSize();

		System.out.println("���� ũ�� : " + sb3.capacity());
		//--==>> ���� ũ�� : 7

	}
}