import java.util.Scanner;

public class Fibonacci {
    public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner =  new Scanner (System.in);
		int n= scanner.nextInt();
		int a=0,b=1,count=0,c=0;
		while(count<n) {
			System.out.println(c);
			
			a=b;
			b=c;
			c=a+b;
			count++;
		}
		
		
	}

}
    

