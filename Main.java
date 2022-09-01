package project1;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
public class Main {
public static void main(String[] args){
		Atmapp a = new Atmapp();
 		Scanner sc = new Scanner(System.in);
		for (int n = 0; n <=100; n++) {
             System.out.println("enter 0- for withdraw,1- for deposit,2- for checkbalance,3-for ministatement");
		int k = sc.nextInt();
		System.out.println("welcome to atm");
		switch (k) {
		case 0:
		       a.withdraw();
                break;
	    case 1:
			   a.deposit();
			   break;
		case 2:
			   a.checkbalance();
 				break;
		case 3:
				a.ministatement();
 				break;
	default:
				System.out.println("invalid");

			}
		}
	}
}
