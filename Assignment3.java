package myApps;

import java.util.Scanner;

public class Assignment3 {
	public static void main(String[] args)
	{
String orignal, reverse = "";
Scanner sc=new Scanner(System.in);
System.out.println("Enter the string");
orignal=sc.nextLine();
for(int i=orignal.length()-1;i>=0;i--)
{
	reverse=reverse+orignal.charAt(i);
}
sc.close();
System.out.println(reverse);
	}
}