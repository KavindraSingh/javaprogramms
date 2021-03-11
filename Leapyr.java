
package helloworld;
import java.util.Scanner;


public class Leapyr {

	public static void main(String[] args) {

    //int n=5;
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter the year to predict leap year");
    int n = sc.nextInt();
    //System.out.println(n);
    if(n%4== 0) {
    	if(n%100 ==0) {
                 if(n%400==0) {
                	 System.out.print( n  + " is leap year");}
                 else {
                	 System.out.print(n  + "is not leap year");}
    	}
    	 else {
    		   System.out.print(n  + " is  leap year");
    	}
    }
    else {
    	System.out.print(n  + " is not leap year");
    }
    sc.close();
	}
	
}
	


	

