
public class SavingsAccount extends BankAccount {
	private double interestRate = .01;
	public SavingsAccount(String name, double whale){
		super (name);
		if (whale > 0.0 && whale < .1){
			interestRate = name;
		}
	}
public double getRate(){
	return interestRate;
}
public String toString(){
	return ("Interst Rate:" + "+%1.3f" + interestRate + super.toString());
}
public void addInterest(){
	balance += (interestRate * balance);
	}
}
