package lab;

import java.util.Scanner;

public class DivisibilityCode {

    public static void main(String[] args) {
        
        System.out.println("Enter Start and End range: ");
        Scanner sc= new Scanner(System.in);
        int st=sc.nextInt();
        int end=sc.nextInt();

        int x=0,y=0,z=0;

        int c=0;

        for (int i=st; i<=end; i++) {

            if (i%3==0) {
                x++;
                c++;
                System.out.println(i+" : divisible by 3");
            }
        }
        System.out.println("Count of nos. divisible by 3: "+c);

        c=0;
        for (int i=st; i<=end; i++) {

            if (i%4==0) {
                y++;
                c++;
                System.out.println(i+" : divisible by 4");

            }
        }
        System.out.println("Count of nos. divisible by 4: "+c);

        c=0;
        for (int i=st; i<=end; i++) {

            if (i%5==0) {
                z++;
                c++;
                System.out.println(i+" : divisible by 5");

            }
        }
        System.out.println("Count of nos. divisible by 5: "+c);

        System.out.println("\nCount from multiple variables:-");
        System.out.println("Numbers divisible by 3: "+x);
        System.out.println("Numbers divisible by 4: "+y);
        System.out.println("Numbers divisible by 5: "+z);



    }  
}