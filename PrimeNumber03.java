package programming;
import java.util.LinkedList;

public class PrimeNumber03 implements Runnable { //인터페이스 Runnable
	private int number; 
	private String name;
	LinkedList<Integer> prime = new LinkedList<>();
	
	public PrimeNumber03(int number, String name) {
		this.number = number; //스레스 이름 지정
		this.name = name;
	}// 생성자 구현
	
	
	public void run() {
		System.out.println(this.name + ":");
		int j;
		for(int i = 2; i <= this.number; i++) {
			// 1부터 지정된 생성자 까지
			for(j = 2; j < i; j++) {
				if(i % j == 0)
					break;
			}// 지정된 수 까지 소수 출력
			if(j == i)
				prime.add((Integer)j);
		}
		System.out.println(prime.toString());
		prime.clear();
	}
}
