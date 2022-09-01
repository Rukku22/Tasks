package project1;

import java.util.Scanner;

public class Daymain {

	public static void main(String[] args) {
		DayNamee d=new DayNamee();
		while(true) {
        Scanner scn=new Scanner(System.in);
 		System.out.println("select 1-toget nextday,2-toget previousday,3-noof days,4-noof days enter in negative ");
		int t1=scn.nextInt();
		switch(t1) {
		case 1:d.getNextday();
               break;
		case 2:d.getpreviousday();
		       break;
		case 3:d.noofDays();
		       break;
		case 4:d.noofdayneg(); 
		        break;
		}
	}
	}
}
