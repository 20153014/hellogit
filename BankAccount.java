package programming;


public class BankAccount {
	
	private int minRepository;
	private int repository;

	public BankAccount() {
		minRepository = 0;
	}

	public BankAccount(int min) {
		minRepository = min;
	}

	public void deposit(int money) {
		repository += money;
		System.out.println("정상 입금처리: 입금금액=" + money + ", 잔금=" + repository);
	}

	public int withdraw(int money) throws InvalidWithdraw {
		if (money <= 0)
			throw new InvalidWithdraw("음수 금액입니다.");
		else if (repository - money < minRepository)
			throw new InvalidWithdraw("최저 잔금을 넘어서는 출금입니다.");
		else {
			repository -= money;
			System.out.println("정상 출금처리: 인출금액=" + money + ", 잔금=" + repository);
			return minRepository;
		}
	}
}
