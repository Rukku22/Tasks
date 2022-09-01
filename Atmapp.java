package project1;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
interface Atm {
	abstract void withdraw();
    abstract void deposit();
    abstract void checkbalance();
    abstract void ministatement();
}
public class Atmapp implements Atm {
	static int balance =5000;
	int a;
	Map<Double,String> ministate=new HashMap<>();

Scanner scn = new Scanner(System.in);
public void withdraw() {
	
		System.out.println("enter the withdraw money");
		int i = scn.nextInt();
	   if (i <= balance) {
	  balance = balance - i;
		     a=i;
		    ministate.put((double) a," :amount withdrawn");
	         		System.out.println("please collect  the money");
        }  
        else
        {
		System.out.println("insufficient balance");
       }
	}
public void deposit() 
{
	System.out.println("enter the deposit amount");

		int j = scn.nextInt();
		balance = balance + j;
		ministate.put((double) j," :deposited amount");
	 System.out.println(j+":amount successly deposited"+'\n'+"current balance:"+balance);
}
public void checkbalance() {
		System.out.println("balance:"+balance);
	}
public void ministatement()
{
	for(Map.Entry<Double,String>m:ministate.entrySet()) {
		System.out.println( m.getKey()+""+m.getValue());
}
}
}