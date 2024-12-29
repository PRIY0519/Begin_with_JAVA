import java.util.*;
public class Main{
   public static void main(String[]args){
        int n;
        Scanner sc=new Scanner(System.in);
        
            System.out.print("Enter N : ");
            n=sc.nextInt();
            //outer loop
    
       for (int i=1;i<=n;i++){
          //for printing spaces
           for(int j=1;j<=n-i;j++){
              
              System.out.print(" ");
}
            //for printing star
        for(int j=1;j<=i;j++){
           System.out.print("X"); 
       }
         System.out.println("");
       }
       
   }
}
