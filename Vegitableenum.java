package project1;

import java.util.Scanner;

public class Vegitableenum {
 
static    Scanner scn=new Scanner(System.in);
static String a="1000gms";
static String b="500gms";
static String c="750gms";
static String d="250gms";
public int carrot(int total)  {      
	 System.out.println("how much you want enter in gms");
     String i=scn.next();
      if(i.equals(a)) {
   	  System.out.println("carrot 1000gms cost:60 rupees");
   	  total=60;
   	  }else if(i.equals(b)) {
   	  System.out.println("carrot 500grms cost:30 rupees ");
   	  total=30;
     }else if(i.equals(d)) {
   	  System.out.println("carrot 250grms cost:15 rupees");
   	  total=15;

     }else if(i.equals(c)) {
   	  System.out.println("carrot 750grms cost:45 rupees");
   	  total=45;
    } else {
   		  System.out.println("sorry it wont come ");
    }
      return total;}
   	  public int potato(int total) {
   		System.out.println("how much you want enter in gms");
        String j=scn.next();
        if(j.equals(a)) {
       System.out.println("potato 1000grms cost:40 rupees");
       total=40;
     }else if(j.equals(b)) {
        System.out.println("potato 500grms cost:20 rupees ");
        total=20;
    }else if(j.equals(d)) {
          System.out.println("potato 250grms cost:10 rupees");
          total=10;
     }else if(j.equals(c)) {
      System.out.println("potato 750grms cost:30 rupees");
      total=30;
 } else {
 System.out.println("sorry it wont come ");
 }
        return total;}
public int brinjal(int total) {
	System.out.println("how much you want enter in gms");
    String k=scn.next();
      if(k.equals(a)) {
    System.out.println("brinjal 1000grms cost:30 rupees");
    total=30;
 }else if(k.equals(b)) {
   System.out.println("brinjal500grms cost:15 rupees ");
   total=15;
    }else if(k.equals(d)) {
System.out.println("brinjal 250grms cost:10 rupees");
total=10;
}else if(k.equals(c)) {
 System.out.println("brinjal 750grms cost:25 rupees");
 total=25;
} else {
System.out.println("sorry it wont come ");
}
      return total;
}

   	  }
