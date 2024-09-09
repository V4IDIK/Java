package lab;

public class StringRev {
	public static void main(String[] args) {
		
	String str= "loop", StrRev="";
  char ch;
      
  System.out.print("Original word: ");
  System.out.println("loop"); 
      
  for (int i=0; i<str.length(); i++)
    {
      ch= str.charAt(i); 
      StrRev= ch+StrRev; 
    }
    System.out.println("Reversed word: "+ StrRev);	
	}
}
