package lab;
import java.util.Scanner;

// Class for Summation
class Sum{
	public int sum(int a,int b) {
		
        int sum;
		sum=a+b;
		return sum;
	}
}

// Class for Difference
class Diff{
	public int diff(int a,int b) {
		
        int diff;
		diff=a-b;
		return diff;
	}
}

// Main Class 
public class Assignment1 {
    public static void main(String[]args) {
        
        Sum s1= new Sum();
        Diff d1= new Diff();
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter any two numbers :");
        int a=sc.nextInt();
        int b=sc.nextInt();
        sc.close();
           
        System.out.println("Sum of the numbers: "+ s1.sum(a, b));
        System.out.println("Difference of the numbers: "+ d1.diff(a, b));  
    }
}
