package lab;
import java.util.Scanner;

class Sum{
	public int sum(int a,int b) {
		
        int sum;
		sum=a+b;
		return sum;
	}
}
class Diff{
	public int diff(int a,int b) {
		
        int diff;
		diff=a-b;
		return diff;
	}
}
public class Assignment1 {
    public static void main(String[]args) {
        
        Sum s1= new Sum();
        Diff d1= new Diff();
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter any two numbers :");
        int a=sc.nextInt();
        int b=sc.nextInt();
        sc.close();
           
        System.out.println("The sum is: "+ s1.sum(a, b));
        System.out.println("The difference is: "+ d1.diff(a, b));  
    }
}
