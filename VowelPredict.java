package project2;
import java.util.Scanner;

public class Vowel_finder {

	public static void main(String[] args) {
		int a =0,e=0,i2=0,o=0,u1=0;           //variable for count the occurunce
		System.out.println("Enter the sentence");
		Scanner sc=new Scanner(System.in);
		String sentence = sc.nextLine();
		for(int i1=0;i1<sentence.length();i1++)
		{
		  char ch =sentence.charAt(i1);
		int res=(ch=='A'||ch=='a') ? a++   : 
			  (ch=='e'||ch=='E') ? e++ :      //from line 15-20-> using ternary operator.
			  (ch=='I'||ch=='i') ? i2++  :    //to check & count the occurence of vowels in sentence,
			  (ch=='o'||ch=='O') ? o++ :
			  (ch=='u'||ch=='U') ? u1++ :1;
			   }
		
			
		int store[]=new int[5];
		System.out.print("    Vowels in sentence->[ ");
		if(a>=1)                      //from line 25-38 we are printing only those vowels which are occured at least once.
		{
		  System.out.print("A ");
		  store[0]=a;
		}
		if(e>=1)
			{System.out.print("E ");store[1]=e;}
		
		if(i2>=1)
			{System.out.print("I ");store[2]=i2;}
		if(o>=1)
			{System.out.print("O ");store[3]=o;}
		if(u1>=1)
			{System.out.print("U ");store[4]=u1;}
		
		System.out.print("]");
		
		System.out.print("\nEach vowel repeated as->[ ");//from 43-50 printing count of vowels respected to given output.
		for(int i=0;i<store.length;i++)
		{     if(store[i]==0)
		    {
		     continue;
		    }
			System.out.print(store[i]+" ");
		}
		System.out.print("]");
	}     
}