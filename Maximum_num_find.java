import java.util.Scanner;

public class IfElse {

	public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter three numbers to find Maximum number");
     int a = sc.nextInt();
     int b = sc.nextInt();
     int c = sc.nextInt();
     if(a>=b) {
    	 if(a>=c) {
    		 System.out.print("Maximum number is " + a);
    	 }
    	 else {
    		 System.out.print("Maximum number is " + c);
    	 }
     } 
     else {
    	 if(b>=c) {
    		 System.out.print("Maximum number is " + b);
    	 }
    	 else {
    		 System.out.print("Maximum nuber is "+ c);
    	 }
         }
     sc.close();
       }
     }
