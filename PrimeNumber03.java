package programming;
import java.util.LinkedList;

public class PrimeNumber03 implements Runnable { //�������̽� Runnable
	private int number; 
	private String name;
	LinkedList<Integer> prime = new LinkedList<>();
	
	public PrimeNumber03(int number, String name) {
		this.number = number; //������ �̸� ����
		this.name = name;
	}// ������ ����
	
	
	public void run() {
		System.out.println(this.name + ":");
		int j;
		for(int i = 2; i <= this.number; i++) {
			// 1���� ������ ������ ����
			for(j = 2; j < i; j++) {
				if(i % j == 0)
					break;
			}// ������ �� ���� �Ҽ� ���
			if(j == i)
				prime.add((Integer)j);
		}
		System.out.println(prime.toString());
		prime.clear();
	}
}
