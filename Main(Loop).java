import java.util.*;
public class Main{
   public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter First Number:");
        int num1=sc.nextInt();
       for (int i=0;i<num1;i++){
System.out.println(i);
        }
        System.out.println("WHILE LOOP IMPLEMENTATION");
        //WHILE LOOP
        int x=1;
        while(x<11){
            if(x%2==0){
                System.out.println(x);
            }
            
            x=x+1;
        }
        //Do-While Loop
        System.out.println("DO- WHILE LOOP IMPLEMENTATION");
        int a=4;
        do{
          System.out.println(a);  
          a=a+1;
        }while(a<11);
        
           
        
    }
}
