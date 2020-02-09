package task3;

import java.util.*;
import java.io.*;

public class Mymain {
	public static void main(String[] args) throws IOException{
		  inter per;
        char ch;
        try {
        	Scanner sc=new Scanner(System.in);
        	boolean check = true;
        	int res = 0;
        	while(check) {
        		System.out.println("Enter the First number:");
        		int x = sc.nextInt();
        		System.out.println("Enter the Second number:");
        		int y = sc.nextInt();
        		System.out.println("MENU\n1.ADDITION\n2.SUBSTRACTION\n3.MULTIPLICATION\n4.DIVISION");
        		System.out.println("Enter your opnion");
        		int c = sc.nextInt();
        switch(c) {
        case 1:
        	System.out.println("THe addition of "+x+" & "+y+" :" );
       	 per = new addition();
       	 res = per.op(x, y);
       	 System.out.println(res);
       	 System.out.println("\nDo you want to perform more operations?(yes/no)");
       	 System.out.println("Done with program exit the program : ");
       	 ch=sc.next().charAt(0);
       	 if(ch == 'Y' || ch == 'y')
       		 check = true;
       	 else
       		 check = false;
       	 break;
        case 2:
        	System.out.println("The Substraction of "+x+" & "+y+" :" );
          	 per = new subtract();
          	 res = per.op(x, y);
          	 System.out.println(res);
          	 System.out.println("\nDo you want to perform more operations?(yes/no)");
          	 ch=sc.next().charAt(0);
          	if(ch == 'Y' || ch == 'y')
          		 check = true;
          	 else
          		 check = false;
          	 break;
        case 3:
        	System.out.println("The multippaction of "+x+" & "+y+" :" );
          	 per = new multiply();
          	 res = per.op(x, y);
          	 System.out.println(res);
          	 System.out.println("\nDo you want to perform more operations?(yes/no)");
          	 ch=sc.next().charAt(0);
          	if(ch == 'Y' || ch == 'y')
          		 check = true;
          	 else
          		 check = false;
          	 break;
        case 4:
        	System.out.println("The Division of "+x+" & "+y+" :" );
          	 per = new divide();
          	 res = per.op(x, y);
          	 System.out.println(res);
          	 System.out.println("\nDo you want to perform more operations?(yes/no)");
          	 ch=sc.next().charAt(0);
          	if(ch == 'Y' || ch == 'y')
          		 check = true;
          	 else
          		 check = false;
          	 break;
          	 default:
          		 System.out.println("Please enter a valid input : ");
        }
        	}
        		}
        	catch(Exception e) {
        		System.out.println("exception occured");
        	}
	}

}
