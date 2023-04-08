package bankaccount;
class BankAccount{
	private String name;
	private String no;
	private double balance;
	private double rate;

	public BankAccount(String name, 
						String no, 
						double balance,
						double rate){
		this.name = name;
		this.no = no;
		this.balance = balance;
		this.rate = rate;
	}
	public  BankAccount(){
		name = "이름없음";
		no="번호없음";
		balance = 0;
		rate = 0;
	}
	public double getRate(){
		return rate;
	}
	public double getBalance(){
		return balance;
	}
	public String getNo(){
		return no;
	}
	public String getName(){
		return name;
	}
	public void setRate(double rate){
		this.rate=rate;
	}
	public void setBalance(double balacne)
	{
		this.balance = balance;
	}
	public void setNo(String no){
		this.no = no;
	}
	public void setName(String name){
		this.name = name;
	}
	
}
public class BankAccount2 {
	public static void main(String[] args) 	{
		BankAccount b1 = new BankAccount();
		BankAccount b2 = new BankAccount("홍길동", "12345678",1000,1.5);

		System.out.println("이름:" + b1.getName());
		System.out.println("계좌번호:" + b1.getNo());
		System.out.println("잔액:" + b1.getBalance());
		System.out.println("이자율:" + b1.getRate());
		System.out.println("-----------------------------");
		System.out.println("이름:" + b2.getName());
		System.out.println("계좌번호:" + b2.getNo());
		System.out.println("잔액:" + b2.getBalance());
		System.out.println("이자율:" + b2.getRate());

	}
}

