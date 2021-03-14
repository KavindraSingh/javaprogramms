import java.util.Scanner;

public class ATM {

	public static void main(String[] args) {
		
    char ch;
    int c;
    int m;
    int b;
    int f;
    int r;
    
    int ab=5000;
    System.out.println("check account balance(a)");
    System.out.println("withdraw money(b)");
    System.out.println("deposit money(c)");
    
    System.out.println("enter choice");
    Scanner sc = new Scanner(System.in);
    ch=sc.next().charAt(0);
    switch(ch) {
    case 'a':// System.out.println("check account balance");
              System.out.println("press 1 to continue");
              c=sc.nextInt();
              if(c==1) {
            	  System.out.print(ab);
              }
              break;
    case 'b': System.out.println("enter money");
              m=sc.nextInt();
              if(m<ab) {
            	  System.out.println("your transition is successfull press 1 to continue");
            	  ab=ab-m;
            	  c=sc.nextInt();
            	   if(c==1) {
                      System.out.print("your Available balance is"+ ab);}
              }
            	   else {
            		   //b=sc.nextInt();
            		   if(m>ab) {
            		   System.out.println("Insufficient amount");
            	   }
            	   }
              
              break;
    case 'c' : System.out.println("enter the amount to deposit");
               f=sc.nextInt();
               r=f+ab;
               System.out.println("your amount is succcessfully deposited,press 1 to continue");
               c=sc.nextInt();
               if(c==1)
            	   System.out.println("Available balance is" +r);
               break;
    default : System.out.print("wrong choice");
            }
      }

}
