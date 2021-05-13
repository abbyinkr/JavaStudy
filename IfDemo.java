import java.util.Scanner;
 
public class IfDemo {
 
    public static void main(String[] args) {
 
        Scanner sc = new Scanner(System.in);
 
        int num;
		
		System.out.print("임의의 정수 입력 : ");
        num = sc.nextInt();


	
		// if ~ else if문: 조건문 중 한 가지만 실행된다.

		/*
        if (num % 2 == 0)
            System.out.println(num + "은(는) 2의 배수입니다.");
 
		else if (num % 3 == 0)
            System.out.println(num + "은(는) 3의 배수입니다.");
        

		[실행결과]

		임의의 정수 입력 : 6
		6은(는) 2의 배수입니다.		(if조건 성립되면 문장실행하고 나옴 else if 안봄!)
		계속하려면 아무 키나 누르십시오 . . .
		
		*/

		// 두 개의 if문: 하나의 조건만 성립되어도 각각의 조건문이 실행된다.
        
		if (num % 2 == 0)
            System.out.println(num + "은(는) 2의 배수입니다.");
 
        if (num % 3 == 0)
            System.out.println(num + "은(는) 3의 배수입니다.");
 

		// [실행 결과]
		/*
		임의의 정수 입력 : 6
		6은(는) 2의 배수입니다. (첫 번째 if문 문장 실행)
		6은(는) 3의 배수입니다. (두 번째 if문 문장 실행)
		계속하려면 아무 키나 누르십시오 . . .
		*/

        sc.close();
 
    }
 
}

