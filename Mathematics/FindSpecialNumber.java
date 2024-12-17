import java.util.Scanner;

class Special_Number 
{
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int digit, n, sum=0, temp;
        System.out.println("Enter a number");
        n = in.nextInt();
        temp = n;

        while(temp != 0){
            digit = temp%10;
            sum += factorial(digit);
            temp = temp/10;
        }

        if(sum == n)
            System.out.println("Special number");
        else
            System.out.println("Not a Special Number");

    }

    private static int factorial(int num){
        int f=1;
        for(int i=2; i<=num; i++){
            f = f*i;
        }
        return f;
    }
}