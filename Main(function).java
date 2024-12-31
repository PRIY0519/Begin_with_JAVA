import java.util.*;
class Main {
    //Fuction for addition
    public static int calSum(int a , int b){
        int sum;
        sum=a+b;
        return sum;
        
    }
    //Fuction for multiplication
    public static int calmul(int a , int b){
        int mul;
        mul=a*b;
        return mul;
        
    }
    //Main Function
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter first number:");
        
        int a=sc.nextInt();
        System.out.print("Enter second number:");
         int b=sc.nextInt();
         System.out.println("SUM OF TWO NUMBER IS:"+ calSum(a,b));
         int mul=calmul(a,b);
         System.out.print("MULTIPLICATION OF 2 NUMBER IS:"+mul);
    }
}
