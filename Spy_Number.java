import java.util.Scanner;

public class Spy_Number
{
    public static void main(String[] args) {
        Scanner in= new Scanner(System.in);
        int digit, num; 

        System.out.println("Enter a number");
        num = in.nextInt();

        int product = 1;
        int sum = 0;

        //Extract digit, add to sum and multiply to product
        while(num>0){
            digit = num%10;
            sum += digit;
            product *= digit;
            num=num/10;
        }

        if(sum == product)
            System.out.println("Spy Number");
        else
            System.out.println("Not a Spy Number");
    }
}