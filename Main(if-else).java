import java.util.*;
class Main{
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter Age:");
        int age=sc.nextInt();
        if(age>=18){
            System.out.print("You are Eligible");
        }
        else{
            System.out.print("You are Not Eligible");
        }
        
        
    }
}