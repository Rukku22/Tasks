package project1;

import java.util.Scanner;

public class Pattern1 {

public static void main(String[] args) {
 Scanner scn=new Scanner(System.in);
 while(true) {
 System.out.println("enter rows  no");
 int m=scn.nextInt();
	 int n=2,d=0,dup=n,loop=0;
	 System.out.println("enter number");
	for(int i=m;i>=1;i--)
     {
            loop=loop+1;
         
         for(int j=1;j<=m;j++)
         {  
             if(j>=i)
             {    
                 int count=0;
                 for(int l=dup;l>=dup;l++)
                 {  
                     for(int k=1;k<=l;k++)
                     {
                          if(dup%k==0)
                     {
                        count++;
                     }
                     }
                         if(count==2)
                         {
                             System.out.print(dup);
                             
                             count=0;
                             dup=dup+1;
                             break;
                         }
                         if(count>2)
                         {
                             count=0;
                             dup=dup+1;
                         }
                         
                         if(dup>7)
                         {
                             dup=2;
                         }   
                 }    
             }
             else {
                 System.out.print(" ");
             }
         }
         System.out.println();
     }				 
}}
}
		
