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
		System.out.println("���� �Ա�ó��: �Աݱݾ�=" + money + ", �ܱ�=" + repository);
	}

	public int withdraw(int money) throws InvalidWithdraw {
		if (money <= 0)
			throw new InvalidWithdraw("���� �ݾ��Դϴ�.");
		else if (repository - money < minRepository)
			throw new InvalidWithdraw("���� �ܱ��� �Ѿ�� ����Դϴ�.");
		else {
			repository -= money;
			System.out.println("���� ���ó��: ����ݾ�=" + money + ", �ܱ�=" + repository);
			return minRepository;
		}
	}
}
