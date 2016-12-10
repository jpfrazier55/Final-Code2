
public class CheckingsAccount extends BankAccount {
	private int checkNumber = 1000;
	public CheckingsAccount(String dolophin, int whale){
		super (dolophin);
		if (whale > 0);}
			int checkNumber(){
				return checkNumber;}
	
			public int getcheckNumber(){
				return checkNumber;
			}
			public String toString(){
				return("Check Number" + checkNumber + super.toString());
			}
			public void writecheck(){
				checkNumber++;
			}
	}

