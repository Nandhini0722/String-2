package org.str;

import java.util.Scanner;

public class Stringss {
	     public void phoneNumExit() {
         Scanner scan =new Scanner(System.in);
         System.out.println("enter the phone number");
         String a=scan.nextLine();
         int i=0;
         char[] ch=a.toCharArray();
         for(char b:ch) {
        	 i++;
         }
         if(i==10)
        	 System.out.println("valid number");
         else
        	 System.out.println("invalid number");
	     }
	     //
	     public void replace() {
			String str="welcome to java class";
			String str1="greens omr";
			String str2="welcome to core java class";
			String str3="5-35-2a,venkatesh nivas,Aruppukottai,pincode-626101";
			String strs=str.replace("java", "sql");
			String strss=str1.replace("omr","vellachery");
			String strd=str2.replace(" ", "#");
			String strd1=str3.replace(",pincode-626101",".");
			System.out.println(strs);
			System.out.println(strss);
			System.out.println(strd);
			System.out.println(strd1);
         }
	     //
	     public void lowUpCase() {
			Scanner scan=new Scanner(System.in);
			System.out.println("enter the string");
			String string=scan.nextLine();
			String a1=string.toUpperCase();
			String b1=string.toLowerCase();
			System.out.println(a1+"  "+b1);
			//
			System.out.println("enter the string combination of lower and upper");
			String s=scan.nextLine();
			int u=0,l=0;
			for(int i=0;i<s.length();i++) {
				char ch=s.charAt(i);
				if(Character.isUpperCase(ch)) {
					System.out.print(Character.toLowerCase(ch));
					u++;
				}
				else {
					System.out.print(Character.toUpperCase(ch));
					l++;
				}
				}
			System.out.println("UC count"+" "+u);
			System.out.println("LC count"+" "+l);
		}
	     //
	     public void startsWithEndsWith() {
			String j="welcome to java class";
			String k=" ";
			boolean o=j.startsWith("welcome");
			System.out.println(o);
			boolean e=j.endsWith("clas");
			System.out.println(e);
			boolean flag=j.isEmpty();
			boolean flg=k.isEmpty();
			System.out.println(flag);
			System.out.println(flg);
}
	     //
	     public void compare() {
	    	 String s1 = "Nisha";
	    	 String s2 = "nisha";
	    	 int s3=s1.compareTo(s2);
	    	 int s4=s1.compareToIgnoreCase(s2);
	    	 System.out.println(s3);
	    	 System.out.println(s4);
	     }
         public static void main(String[] args) {
			new Stringss().phoneNumExit();
			new Stringss().replace();
			new Stringss().lowUpCase();
		    new Stringss().startsWithEndsWith();
			new Stringss().compare();
			new Stringss().split();
			new Stringss().subString();
		}
         //
         public void split() {
        	 String w="Welcome to java class";
            String[] g= w.split("l");
            for(String z:g) {
            System.out.println(z);
            }
        }
         //
         public void subString() {
        	String s5="Welcome to java class"; 
            String gs=s5.substring(0, 7);
            System.out.println(gs);
		}
         
         
}
