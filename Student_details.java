package package1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Student_details {
	static int age;
	static String name;
	static String max_name;
	static int max_age=0;
			public static void accept()
		{
			try
			{
			InputStreamReader is=new InputStreamReader(System.in);
			BufferedReader br =new BufferedReader(is);
			for(int i=0;i<5;i++)
				
			{
				System.out.println("enter name");
				name=br.readLine();
				System.out.println(" enter age");
				age=Integer.parseInt(br.readLine());
				if(age>max_age)
				{
					max_name=name;
					max_age=age;
				}}}
				catch(IOException ex)
				{
					
				}
			   }
			public static void display()throws IOException
			{
				System.out.println(max_name);
				System.out.println(max_age);
				
			}
		public static void main(String args[])
		{
		 try{
			accept();
			display();
		}
		catch(IOException th)
		{
			
		}
		}
		}
