package project1;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import project1.TaskVeg.Vegetables;

public class Newveg extends Vegitableenum{
	static	Scanner scn=new Scanner(System.in);
	 
	  enum Vegetables {
			carrot(60),potato(40),brinjal(30);
		private	 int price;
		 Vegetables(int price) {
			 this.price=price;
	 	 }	
		 public int getPrice()
		 {
			 return price;
		 }
		}
		public static void main(String args[]){
			
			Vegitableenum n=new Vegitableenum();
			
			String condition="yes";
			while(condition.equals("yes")) {  
				int sum=0;
				int  totalprice=0;
				System.out.println("enter you name");
				String name=scn.next();
	 		System.out.println("available vegetables in shop");
			for (Vegetables veg :Vegetables.values())  
			System.out.println(veg+"-->"+veg.price+"rupees(1kg)");
			for(int i=1;i<=3;i++) {
	 	     System.out.println("choose which vegitable u want");
	 		 String st=scn.next();
			 
	 		 if(st.equals("carrot"))
	 		 {
	 			 sum=sum+ n.carrot(totalprice);
	 		 }
	 		 else if(st.equals("potato"))
	 		 {
	 			 sum=sum+ n.potato(totalprice);
	 		 }
	 		 else
	 		 {
	 			sum=sum+n.brinjal(totalprice); 
	 		 }
	 		  }
			ArrayList arr=new ArrayList(sum);
			
			   Stream<String> stream = Stream.of(name+"--> total amount: "+Integer.toString(sum) );
 
		        stream.forEach(s->System.out.println(s));
		}
			}}


