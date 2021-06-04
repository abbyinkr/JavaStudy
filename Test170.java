/*========================================
  ■■■ 자바의 기본 입출력(I/O) ■■■ 
========================================*/

// Reader Writer 실습
// api, 책도 읽어야함!!!

import java.io.InputStream;
import java.io.IOException;
import java.io.Reader;
import java.io.OutputStreamWriter;
import java.io.InputStreamReader;
import java.io.Writer;

public class Test170
{
   public void process(InputStream is) // InputStream : 입력 스트림 - System.in 받음
   {
      int data;

      System.out.println("문자열 입력(종료:Ctrl+z)");

      try
      {  
         // 오른쪽 먼저 해석
         // 매개변수 is 라는 바이트 기반의 입력 스트림객체(InputStream)를
         // 문자 스트림으로 변환하여 Reader 타입의 rd에서 참조할 수 있도록 처리
         // rd 는 문자 기반 스트림
         Reader rd = new InputStreamReader(is);

         // 바이트 기반 스트림인 자바 기본 출력 스트림 객체(OutputStream - System.out)를
         // 문자 스트림으로 변환하여 Writer 타입의 wt에서 참조할 수 있도록 처리
         Writer wt = new OutputStreamWriter(System.out);
         // wt 는 물줄기 
         // write는 물에 띄우는 애 
         while ((data=rd.read()) != -1 ) // 문자 기반으로 입력된애를 
         {
            wt.write(data); //-- wt (문자) write 문자 기반의 스트림 물줄기에 기록 (한땀 한땀)
            wt.flush();     //-- 기록한 스트림을 밀어내어 내보냄 (주사기 피스톤)
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
문자열 입력(종료:Ctrl+z)
1234
1234
abcd
abcd
ABCD
ABCD
가나다라
가나다라
^Z
계속하려면 아무 키나 누르십시오 . . .

*/