package project1;

import java.util.*;
import java.util.function.Predicate;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class TerminalOparation {
	 public static void main(String args[]) {
		 ArrayList<String> arr=new ArrayList<>();
		 arr.add("app");
		 arr.add("bana");
		 arr.add("potato");
		 arr.add("org");
 		 arr.forEach(fruits->System.out.println(fruits));
        boolean ans=arr.stream().allMatch(s->s.equals("bana"));
		 System.out.println(ans);
		 boolean ans1=arr.stream().anyMatch(s1->s1.equals("app"));
		 System.out.println(ans1);
		 List<String> p =  arr.stream() .collect(Collectors.toList()); 
	        System.out.println( p);  
	        long count=arr.stream().count();
	        System.out.println(count);
Optional<String> n = arr.stream().reduce((first, second)-> first + "-" + second);   
   if (n.isPresent()) {   
    System.out.println(n.get());   
}   

	    }  
}