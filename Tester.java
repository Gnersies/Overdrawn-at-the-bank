import java.util.Scanner;
public class Tester {
	public static void main(String[] args) {
		Scanner a = new Scanner(System.in);
		System.out.print("Initial Balance: ");
		double start = a.nextDouble();
		System.out.print("Name (First_Last): ");
		String name = a.next();
		BankAccount myAccount = new BankAccount(start, name);
		myAccount.deposit(505.22);
		System.out.println("\nBalance: " + myAccount.balance);
		myAccount.withdraw(100);
		System.out.println("The " + name + " account balance is: " + myAccount.balance);
	}

}