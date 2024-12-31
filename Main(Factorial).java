import java.util.*;
class Main {
    //Fuction for factorial
    public static int fact(int n){
        int res=1;
        for(int i=n;i>=1;i--){
        res=res*i;}
        return res;
        
    }
   
    //Main Function
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter any number:");
        
        int n=sc.nextInt();
      
         System.out.print("FACTORIAL OF NUMBER IS:"+fact(n));
    }
}
