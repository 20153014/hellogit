package programming;

public class Ex06 {
	public static void main(String[] args) {
		new Thread(new PrimeNumber03(25, "소수 만드는 스레드")).start();
	} //지정된 스레드 이름
}
