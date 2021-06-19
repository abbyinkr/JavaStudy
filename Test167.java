/*========================================
  ���� �ڹ��� �⺻ �����(I/O) ���� 
========================================*/

// OutputStream �ǽ�

import java.io.OutputStream;
import java.io.IOException;

public class Test167
{
   public static void main(String[] args) throws IOException
   {
      // System.in   : �ڹ��� ǥ�� �Է� ��Ʈ��(��ü)
      // System.out  : �ڹ��� ǥ�� ��� ��Ʈ��(��ü)
      OutputStream out = System.out; // �������� ƴ

      // �迭 ����
      byte[] ch = new byte[3];
      ch[0] = 65;    // A
      ch[1] = 97;    // a
      ch[2] = 122;   // z

      out.write(ch); //-- (������ �帣�� ���ٱ⿡)������ ������ ������ ��Ʈ���� ^���^ <- write() �� �� ��

      //out.flush();   //-- ��ϵ� ��Ʈ���� �������� ����� ����
                       //   ������ Buffer�� Ȱ������ �ʰ� �ִ� ��Ȳ�̱� ������
                       //   ������ ������ �ڵ�
                       //   ��, ������� �ʾƵ� ��¿� ������ ���� �ڵ�
                       //   (������, Buffered �Ǿ��ִ� Stream �� ��� ���� �Ұ�)

      out.close();     //-- ��� ��Ʈ��(���ٱ�)�� ���� ���ҽ� �ݳ�
                       //   (out ��Ʈ��(����������) �ᰡ���� ��Ȳ)

      System.out.println("�������� �ŷڵ��� ���� �ִ� ����");

   }
}