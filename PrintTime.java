package programming;
import java.util.Date; //Date ���

public class PrintTime implements Runnable {
	
	private int count;

	public PrintTime(int count) {
		this.count = count;
	} //������ �������� Ƚ����ŭ

	
	public void run() {
		Date current = new Date();
		
		while (count != 0) {
			System.out.println("����: " + Thread.currentThread().getPriority()
			+ " " + current.toString() + " " + Thread.currentThread().getName());
		// Thread.currentThread().getName() �� ������ �̸� ȣ��
			count--;
			try {
				Thread.sleep(1000);
				current = new Date();
			} catch (InterruptedException e) {}
			// sleep�޼ҵ尡 �߻��ϴ� InterruptedException
		}
	}
}
