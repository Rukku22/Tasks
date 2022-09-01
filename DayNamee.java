package project1;

import java.util.Scanner;

public class DayNamee {
	static String[] arr = { "sunday", "monday", "tuesday", "wednesday", "thursday", "friday", "saturday",};
	static Scanner scn = new Scanner(System.in);
    public static void getNextday() {
	   String s2 = "saturday";
			System.out.println("enter a current day to get nextday:");
			String st = scn.nextLine();
			for (int i = 0; i <= arr.length - 1; i++) {
				String s1 = arr[i];
				if (s1 == s2) {
					System.out.println("sunday");}
				if (arr[i].equals(st)) {
					System.out.println(arr[++i]);
					break;
				}}}
	public void getpreviousday() {
		System.out.println("enter a current day to get previousday:");
		String st = scn.nextLine();
       for (int i = 0; i <= arr.length - 1; i++) {
			 if (arr[i].equals(st)) {
				System.out.println(arr[--i]);
			   break;
			   }}}
   public void noofDays() {
	     System.out.println("enter current day");
         String st=scn.next();
	     System.out.println("enter a number");
	     int no=scn.nextInt();
	     for (int i = 0; i <= arr.length - 1; i++) {
	    	if(arr[i].equals(st)) {
	    int[] arr1= {0,1,2,3,4,5,6};
	    for(int j=0;j<=6;j++) {
		   int temp=arr1[j];
	        if(no%7==temp) { 
		System.out.println(arr[i+temp])	;
		 }
		}}}}
	public void noofdayneg() {
	    	 System.out.println("enter current day");
	         String st=scn.next();
		     System.out.println("enter a number");
		     int no=scn.nextInt();
		     String[] str= {"sunday","satrday","friday","thursday","wednesday","tuesday","monday"};
		     for (int i = 0; i <= str.length - 1; i++) {
		    	 if(arr[i].equals(st)) {
		    		    int[] arr1= {0,1,2,3,4,5,6};
		    		    for(int j=0;j<=6;j++) {
		    			   int temp=arr1[j];
		    		        if(-(no%7)==(temp)) { 
		    			System.out.println(str[temp-i])	;
		    			  }
   }}}}}
	

