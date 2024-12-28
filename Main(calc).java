import java.util.*;
class Main{
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter First Number:");
        int num1=sc.nextInt();
        System.out.print("Enter Second Number:");
        int num2=sc.nextInt();
        System.out.println("1. Addition(Press..+)");
        System.out.println("2. Subtraction(Press..-)");
        System.out.println("3. Multiplication(Press..*)");
        System.out.println("4. Division(Press../)");
        System.out.println("5. Modulus(Press..%)");

        System.out.print("Enter Your Choice Which Operation You Want To Perform:");
        char x = sc.next().charAt(0);
        switch(x){
            case '+': System.out.print("SUM OF TWO NUMBERS ARE:");
            System.out.print(num1+num2);
            break;
            case '-': System.out.print("DIFFERENCE OF TWO NUMBERS ARE:");
            System.out.print(num1-num2);
            break;
            case '*': System.out.print("MULTIPLICATION OF TWO NUMBERS ARE:");
            System.out.print(num1*num2);
            break;
            case '/': System.out.print("DIVISION OF TWO NUMBERS ARE:");
            System.out.print(num1/num2);
            break;
            case '%': System.out.print("MODULO OF TWO NUMBERS ARE:");
            System.out.print(num1%num2);
            break;
        default:  System.out.print("Invalid Choice");
        break;

        }
           
        
    }
}
