package programming;

public class One {
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int value = 5;
		try {
			System.out.println(1);
			value = value / 0;
			System.out.println(2);
		}catch (ArithmeticException e) {
			System.out.println(3);
		}catch (IndexOutOfBoundsException e) {
			System.out.println(4);
		}catch (Exception e) {
			System.out.println(5);
		}
		System.out.println(6);

	}

}
