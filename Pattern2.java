package project1;

import java.util.Scanner;

public class Pattern2 {
	  static int a = 0;
 public static void main(String[] args) {
	        int c = 0;
	        while(true) {
	        Scanner sc=new Scanner(System.in);
	        System.out.println("enter no of rows");
	        int n=sc.nextInt();
	        int arr[] = { 2, 3, 5, 7 };
	        
	        for (int i = 0; i < n; i++) {
	            
	            for (int j =0; j <n-i; j++) {
                System.out.print(" ");
	            }
	            for (int l = 0; l <= i; l++) {
	                if (a < 4) {
	                    System.out.print(arr[a]);
	                    a++;
	                } else {
	                    a = 0;
	                    System.out.print(arr[a]);
	                    a++;
	                }
	            }
 a = 0;
 System.out.println();



	       }
	    }}
}

	
	
	
	
	
	
	

