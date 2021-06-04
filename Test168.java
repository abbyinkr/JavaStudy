/*========================================
  ■■■ 자바의 기본 입출력(I/O) ■■■ 
========================================*/

// Reader 실습 
// Test166.java 와 비교~!!

import java.io.InputStreamReader;
import java.io.Reader;
import java.io.IOException;

public class Test168
{
   public static void main(String[] args) throws IOException
   {
      int data;
      char ch;
      // BufferedReader    : 문자 기반 스트림 
      // System.in         : 자바의 표준 입력 스트림(객체) → 바이트 기반 스트림
      // InputStreamReader : 바이트 기반 스트림을 문자 기반 스트림으로 변환
      //                   : (변환기, 번역기, 필터기 역할 수행)
      // Reader            : 문자 기반 스트림 객체
      
      Reader rd = new InputStreamReader(System.in);
      // 입력 물줄기 염

      System.out.println("문자열 입력(종료:Ctrl+z)");

      while ((data = rd.read()) != -1)
      {
         ch = (char)data;
         // print() : 문자 스트림
         //System.out.print(ch);      //-- 한글 깨지지 않음
      
      //--==>>
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
      
      // write() : OutputStream 클래스의 대표적 메소드 (→ 바이트 스트림)
      System.out.write(ch);
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
       섆|
      ^Z
      계속하려면 아무 키나 누르십시오 . . .
      */

   }
}