package project1;

import java.util.Scanner;

public class UserdefinedExp extends Atmapp {
	static double amount = 100;

	public static void main(String[] args) {
		Atmapp a1 = new Atmapp();
		Scanner scn = new Scanner(System.in);
		while (true) {
			System.out.println("enter the amount to withdraw");
			double money = scn.nextInt();
			if (money > balance) {
				try {
					throw new InSuffientFundException("please check your balance...");
				} catch (InSuffientFundException e) {
					e.printStackTrace();
				}
			} else if (money < 100) {

				try {
					throw new minimumAmountException("please enter amount in 100's");
				} catch (minimumAmountException e) {
					e.printStackTrace();
				}
			}  if (balance == 0) {
				try {
					throw new nullPointerException("balance is zero");
				} catch (nullPointerException e) {
					e.printStackTrace();
				}
				}
		}

	}
}
