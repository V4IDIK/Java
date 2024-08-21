package lab;

import java.util.Scanner;

public class VeggieShop {
    public static void main(String[] args) {
        
        System.out.println("No. of items ");

        Scanner sc= new Scanner(System.in);
        int itemCount= sc.nextInt();
        int itemID[]= new int[itemCount];
        int quan[]= new int[itemCount];
        String item[]= new String[itemCount];
        float rate[]= new float[itemCount];

        for(int i=0; i<itemCount; i++){

            System.out.println("Enter item details ");
            itemID[i]=sc.nextInt();      
            quan[i]=sc.nextInt();
            item[i]=sc.next();
            rate[i]=sc.nextFloat();
        }
        
        for (int i=0; i<itemCount; i++){
            
            System.out.println(itemID[i]+"  "+quan[i]+"  "+item[i]+"  "+rate[i]);
        }

        System.out.println("How many do you wanna buy? ");
        int buy= sc.nextInt();
        float bill=0.0f;

        if(buy<=itemCount){
            for (int i=0; i<buy; i++){

                System.out.println("Enter id ");
                int buyid=sc.nextInt();

                System.out.println("Enter quantity ");
                int buyquan=sc.nextInt();
                if (buyquan<=quan[buyid-1]) {
                
                    bill=bill+(buyquan*rate[buyid-1]);

            }
                else;
                    System.out.println("Wrong quantity");
            }
        
        System.out.println("Your bill "+bill);
        }
        else; 
            System.out.println("Not available");    
        sc.close();
    }
}
