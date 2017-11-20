package programming;
import java.util.Date; //Date 사용

public class PrintTime implements Runnable {
	
	private int count;

	public PrintTime(int count) {
		this.count = count;
	} //지정된 생성자의 횟수만큼

	
	public void run() {
		Date current = new Date();
		
		while (count != 0) {
			System.out.println("순위: " + Thread.currentThread().getPriority()
			+ " " + current.toString() + " " + Thread.currentThread().getName());
		// Thread.currentThread().getName() 로 스레드 이름 호출
			count--;
			try {
				Thread.sleep(1000);
				current = new Date();
			} catch (InterruptedException e) {}
			// sleep메소드가 발생하는 InterruptedException
		}
	}
}
