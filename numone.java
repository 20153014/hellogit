package programming;
import java.util.InputMismatchException;
import java.util.Scanner;

public class numone {
	public static void main(String[] args) {
		int x=0, y=0, z=0;
		Scanner input = new Scanner(System.in); //�Է��� ����
		
		try {
			x = input.nextInt();
			y = input.nextInt();
			z = x * y; //�� ������ ��
			System.out.printf("%d * %d = %d \n", x, y, z);
		}catch(InputMismatchException e) { //���� �ƴ� �� (���ڿͰ���)�Է½� ���� �߻�
			System.out.println("�߸��� �Է��Դϴ�.");
		}
}
}


