package project1;
import java.util.*;

public class SportsDetails {
	static ArrayList<Integer> arr=new ArrayList<>();
    static ArrayList<Integer>arr1=new ArrayList<>();
    static ArrayList<Integer>arr2=new ArrayList<>();
    static int a=10;
    static int b=20;static int c=5;
   static Map<Integer,String> str=new HashMap<>();
   static  Map<Integer,String> str1=new HashMap<>();
    static Map<Integer,String> str2=new HashMap<>();
static Scanner scn=new Scanner(System.in);
  SportsDetails()
  {
    str.put(1,"10:00 am-11:00 am");
	str.put(2,"11:00 am-12:00 am");
	str.put(3,"12:00 pm-01:00 pm");
	str.put(4,"02:00 pm-03:00 pm");
	str.put(5,"03:00 pm-04:00 pm");
	str.put(6,"04:00 pm-05:00 pm");
	str.put(7,"05:00 pm-06:00 pm");
	str.put(8,"06:00 pm-07:00 pm");
	str.put(9,"07:00 pm-08:00 pm");
	str.put(10,"08:00 pm-09:00 pm");
	str1.put(1,"10:00 am-10:30 am");
	str1.put(2,"10:30 am-11:00 am");
	str1.put(3,"11:00 am-11:30 am");
	str1.put(4,"11:30 am-12:00 am");
	str1.put(5,"01:30 pm-02:00 pm");
	str1.put(6,"02:30 pm-03:00 pm");
	str1.put(7,"03:00 pm-03:30 pm");
	str1.put(8,"04:00 pm-04:30 pm");
	str1.put(9,"04:30 pm-05:00 pm");
	str1.put(10,"05:00 pm-05:30 pm");
	str1.put(11,"06:00 pm-06:30 pm");
	str1.put(12,"06:30 pm-7:00 pm");
	str1.put(13,"07:00 pm-07:30 pm");
	str1.put(14,"07:30 pm-08:00 pm");
	str1.put(15,"08:00 pm-08:30 pm");
	str1.put(16,"08:30 pm-09:00 pm");
	str1.put(17,"09:00 pm-09:30 pm");
	str1.put(18,"09:30 pm-10:00 pm");
	str1.put(19,"10:00 pm-10:30 pm");
	str1.put(20,"10:30 pm-11:00 pm");
	str2.put(1,"10:00 am-12:00 am");
	str2.put(2,"02:00 pm- 04:00 pm");
	str2.put(3,"04:00 pm- 06:00 pm");
	str2.put(4,"06:00 pm- 08:00 pm");
	str2.put(5,"08:00 pm- 10:00 pm");}
	
static	void   badmitoncourt() {
	for(int i=1;i<=1000;i++) {
		System.out.println("enter four digit  id no ");
		int t=scn.nextInt();
		if(t<=9999&&t>=1000) {}
		else {
			System.out.println("please enter four digit number");
			break;}
	while(true) {
		if(arr2.contains(t)) {
			System.out.println("existed this id if you want please enter new id no");
			    break;}
 	     else {
			System.out.println(arr2.add(t));}
	System.out.println("available slots choose which you want:");
	for(Map.Entry<Integer, String> print: str.entrySet())	{
		System.out.println(print.getKey()+" "+ print.getValue());}
        System.out.println("enter ur single slot number:");
		int t1=scn.nextInt();
		System.out.println("your slot no:"+t1);
     System.out.println("slot booked successfully timing:"+str.get(t1));
		str.remove(t1);
		if(t1<=10) {}
		else {System.out.println("please entr 1-10 slots no only");}
		    a--;
		  System.out.println("current slots:"+a);
		  System.out.println("thank you for booking slot");
		     int e=0;
		     if(str.size()==0) {
		 System.out.println("slots are already booked");}
			}}}

static	void footballslot() {
	for(int i=1;i<=1000;i++) {
		System.out.println("enter four digit  id no ");
		int t=scn.nextInt();
		if(t<=9999&&t>=1000) {}
		else {
			System.out.println("please enter four digit number");
			break;}
		while(true) {
		 if(arr1.contains(t)) {
			System.out.println("existed this id if you want please enter new id no");
			    break;}
 	     else {System.out.println(arr1.add(t));}
			 
			System.out.println("available slots and timing ,select slot no which you need");
			 for(Map.Entry<Integer, String> print: str1.entrySet())
			{
				System.out.println(print.getKey()+" "+ print.getValue());}
		 	System.out.println("enter ur single slot number:");
				int t1=scn.nextInt();
				System.out.println("your slot no:"+t1);
			 System.out.println("slot booked successfully timing:"+str.get(t1));
			 str1.remove(t1);
		  	if(t1<=10) {}
				else {System.out.println("please entr 1-10 slots no only");break; }
				 
				     b--;
				   System.out.println("current slots:"+b);
				  System.out.println("thank you for booking slot");
				     int e=0;
				     if(str.size()==0) {
			System.out.println("slots are already booked");}}}}
static   void boxCricket() {
	for(int i=1;i<=1000;i++) {
		System.out.println("enter four digit  id no ");
		int t=scn.nextInt();
		if(t<=9999&&t>=1000) {}
		else {
			System.out.println("please enter four digit number");
			break;}
	while(true) {
		if(arr2.contains(t)) {
			System.out.println("existed this id if you want please enter new id no");
			    break;}
 	     else {
			System.out.println(arr2.add(t));}
	System.out.println("available slots and timing ,select slot no which you need");
	 for(Map.Entry<Integer, String> print: str2.entrySet())
	{
	System.out.println(print.getKey()+" "+ print.getValue());}
 	System.out.println("enter ur single slot number:");
		int t1=scn.nextInt();
		System.out.println("your slot no:"+t1);
     System.out.println("slot booked successfully timing:"+str.get(t1));
        str2.remove(t1);
		if(t1<=10) {}
		else {System.out.println("please entr 1-10 slots no only");break; }
		     a--;
		   System.out.println("current slots:"+a);
		  System.out.println("thank you for booking slot");
		     int e=0;
		     if(str.size()==0) {
		 System.out.println("slots are already booked");}
		}}}}