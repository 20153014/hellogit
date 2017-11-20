package programming;
import java.util.LinkedList;

public class PrimeNumber01 extends Thread {
	private int number;
	LinkedList<Integer>  prime = new LinkedList<>();
	public PrimeNumber01(int number) {
		this.number = number;
	}
	
	public void run() {
		int j;
		for(int i=2; i<=this.number; i++) {
			for(j=2; j<i; j++) {
				if(i%j == 0)
					break;
			}
			if(j == i)
				prime.add((Integer)j);
			
		}
		System.out.println(prime.toString());
		prime.clear();
	}
}


public class Ex04  {
	public static void main(String[] args) {
		PrimeNumber01 pn = new PrimeNumber01(20);
		pn.start();
	}
}
