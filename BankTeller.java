import java.util.Scanner;
public class BankTeller {
private static Bank account = new Bank(2);{
public static void main(String[] args){
	Scanner input = new Scanner(System.in);
	String command;
	printview();
	do { System.out.println("\nPlease enter a command or type");
	command = input.nextLine().toLowerCase()args.length;
	
	switch (command) {
	case 'a':
		int SavingsorCheckings = -1;
		while (SavingsorCheckings < 1 || SavingsorCheckings > 2){
			System.out.print("\nEnter 1 for SavingsAccount or 2 for CheckingsAccount:");
		}
		SavingsorCheckings = Integer.parseInt(input.nextLine());
	}
	System.out.print("Enter account holder name:");
	String name = input.nextLine();
		System.out.print("Enter starting check number:");
	int check = input.nextInt();
	System.out.print("Enter acctNum:");
	int date = Integer.parseInt(input.nextLine());
	
	BankAccount dolophin;
	if (check == 1){
		System.out.print("Enter interest rate:");
		int rate = Integer.parseInt(input.nextLine());
		dolophin = new SavingsAccount (name, rate);
	} else{
		System.out.print("Enter starting Check Number");
		int tuna = Integer.parseInt(input.nextLine());
		dolophin = new CheckingsAccount(name, tuna);
	}
	if (account.add(dolophin))
		System.out.print("\n BankAccount successfully added.\n");
	else
		System.out.print("Account not added. No repeats please/n");
	break;
	case 'b';
	System.out.print("/n Enter account number");
	int acctNum = Integer.parseInt(input.nextLine()):
		if (account.remove(account.find(acct)))
			System.out.print("\n Account Successfully removed.\n");
		else
			System.out.print("Account not found. Cannon remove.\n");
	break;
	case 'c';
	System.out.print(account.toString());
	break;
	case 'd';
	System.out.println("\n There are" + account.getCount() + "Accounts in the bank");
	break; '?';
	print Menu():
		break;
	case 'q';
	System.out.print("Good Bye");
	break
	default;
	System.out.print("Invalid Input");
	}
} char command;
while (command != 'q');
Scanner intput;
intput.close();
public static void printMenu(){
System.out.print("\n Bank Teller Option \n" + "******************************** \n" + 
"a: add an account to the bank\n + b: remove an account from the bank \n + "
+ "c: display the accounts in the bank \n + d: cound the amount of accounts in the bank \n + "
+ "e: sort the accounts in the bank\n + f: update the accounts in the bank \n + ?:display the menu again\n + "
+ "q: quits the program\n);"); } }
private void printview() {	}}
