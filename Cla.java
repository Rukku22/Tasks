package project1;
import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class Cla {
	    static int a=0;
		static int b=0;
		public static void files(String name) {
			File f1=new File(name);
			File[] str=f1.listFiles();
			for(File f2:str) {
			if(f2.isFile()) {
			a++;
		}
			else {
				b++;
				files(f2.getAbsolutePath());
				
				 }
			}}
			
		
	public static void main(String[] args) {
	try {	
		 Scanner scn=new Scanner(System.in);
		 System.out.println("enter the path");
		 String path=scn.next();
		 files(path );
 	System.out.println("files:"+a);
	System.out.println("folders:"+b);
	}catch(Exception e) {
		System.out.println("invalid path");
	}

	}}
