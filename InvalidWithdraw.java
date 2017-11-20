
public class InvalidWithdraw extends RuntimeException {
	//RuntimeException 사용 , 비체크예외로 작성
	private static final long serialVersionUID = 1L;
	public InvalidWithdraw(String msg) {
		super(msg);
	}
}
