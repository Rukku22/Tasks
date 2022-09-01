package project1;

import java.util.*;

public class SportsComplex {
	static Scanner scn=new Scanner(System.in);
	public static void main(String args[]) {
 		SportsDetails s1=new SportsDetails();
 		  System.out.println("please enter username");
		String s=scn.next();
		List l=new ArrayList();
		l.add("Badmiton");
		l.add("Cricket");
		l.add("football");
		  for(Object a:l) {
	   System.out.println(a);}
	   System.out.println("enter a next to get details of slot and timings");
	   String l3=scn.next();
	    while(true) {
	    System.out.println("please select which sport you want to book:1-Badmiton,2-football,3-cricket ");
	   int tel=scn.nextInt();
	   switch(tel) {
	   case 1:
		   s1.badmitoncourt(); 
		        break;
	  case 2:s1.footballslot();
	            break;
	   case 3:s1.boxCricket() ;
	            break;
		}
	}

}}
