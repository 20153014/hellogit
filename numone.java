package programming;
import java.util.InputMismatchException;
import java.util.Scanner;

public class numone {
	public static void main(String[] args) {
		int x=0, y=0, z=0;
		Scanner input = new Scanner(System.in); //입력을 받음
		
		try {
			x = input.nextInt();
			y = input.nextInt();
			z = x * y; //두 정수의 곱
			System.out.printf("%d * %d = %d \n", x, y, z);
		}catch(InputMismatchException e) { //정수 아닌 값 (문자와같은)입력시 예외 발생
			System.out.println("잘못된 입력입니다.");
		}
}
}


