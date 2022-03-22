import java.util.Scanner;

public class Code2 {

	public static void main(String[] args) {

		int number = 123;
		
		Scanner keyboard1 = new Scanner(System.in); //입력받고싶으면 Scanner를 사용하면 된다.
		
		System.out.println("Please enter an integer: ");
		
		int input = keyboard1.nextInt();
		
		if(input==number) {
			System.out.println("Numbers match :-)");
		}
		else {
			System.out.println("Numbers do not match! :-(");
		}
		keyboard1.close();
		}
		
		
		/* 초보자의 경우 뭘 import 해야 하는지 알기 어렵다. import문 없이 먼저 코드를 작성한 후 Eclipse의 메뉴 "Source>OrganizeImports"를 실행하면 자으로 필요한 
		 *	import문을 생성해준다.*/
	}


