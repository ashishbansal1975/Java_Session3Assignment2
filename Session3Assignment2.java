import java.util.Scanner;
public class Session3Assignment2
{
    public static void main(String [] args) 
       {
   
         Scanner sc = new Scanner(System.in);
        
   	 int temp;
         int num;
	 boolean isPrime=true;

	System.out.print("Enter a number to check: ");
	num=sc.nextInt();

	for(int i = 2;i <= num/2;i++)
	{
           temp = num % i;
	   if(temp == 0)
	   {
	      isPrime = false;
	      break;
	   }
	}

	//If isPrime is true then the number is prime else not
	if(isPrime)
	   System.out.println(num + " is Prime Number");
	else
	   System.out.println(num + " is not Prime Number");
   }
}