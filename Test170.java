/*========================================
  ���� �ڹ��� �⺻ �����(I/O) ���� 
========================================*/

// Reader Writer �ǽ�
// api, å�� �о����!!!

import java.io.InputStream;
import java.io.IOException;
import java.io.Reader;
import java.io.OutputStreamWriter;
import java.io.InputStreamReader;
import java.io.Writer;

public class Test170
{
   public void process(InputStream is) // InputStream : �Է� ��Ʈ�� - System.in ����
   {
      int data;

      System.out.println("���ڿ� �Է�(����:Ctrl+z)");

      try
      {  
         // ������ ���� �ؼ�
         // �Ű����� is ��� ����Ʈ ����� �Է� ��Ʈ����ü(InputStream)��
         // ���� ��Ʈ������ ��ȯ�Ͽ� Reader Ÿ���� rd���� ������ �� �ֵ��� ó��
         // rd �� ���� ��� ��Ʈ��
         Reader rd = new InputStreamReader(is);

         // ����Ʈ ��� ��Ʈ���� �ڹ� �⺻ ��� ��Ʈ�� ��ü(OutputStream - System.out)��
         // ���� ��Ʈ������ ��ȯ�Ͽ� Writer Ÿ���� wt���� ������ �� �ֵ��� ó��
         Writer wt = new OutputStreamWriter(System.out);
         // wt �� ���ٱ� 
         // write�� ���� ���� �� 
         while ((data=rd.read()) != -1 ) // ���� ������� �ԷµȾָ� 
         {
            wt.write(data); //-- wt (����) write ���� ����� ��Ʈ�� ���ٱ⿡ ��� (�Ѷ� �Ѷ�)
            wt.flush();     //-- ����� ��Ʈ���� �о�� ������ (�ֻ�� �ǽ���)
         }
      }
      catch (IOException e)
      {
         System.out.println(e.toString());
      }
   }

   public static void main(String[] args)
   {
      Test170 ob = new Test170();
      ob.process(System.in);
   }
}

/*
���ڿ� �Է�(����:Ctrl+z)
1234
1234
abcd
abcd
ABCD
ABCD
�����ٶ�
�����ٶ�
^Z
����Ϸ��� �ƹ� Ű�� �����ʽÿ� . . .

*/