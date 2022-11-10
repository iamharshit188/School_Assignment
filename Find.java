import java.util.Scanner;
class Find{
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        System.out.print("M = ");
        int m = Integer.parseInt(in.nextLine());
        System.out.print("N = ");
        int n = Integer.parseInt(in.nextLine());
        if(m < 100 || m > 10000 || n > 99){
            System.out.println("INVALID INPUT");
            return;
        }
        int num = 0;
        int count = 0;
        int x = m + 1;
        while(true){
            int sum = sumOfDigits(x);
            if(sum == n){
                num = x;
                count = countDigits(x);
                break;
            }
            x++;
        }
        System.out.println("The required number = " + num);
        System.out.println("Total number of digits = " + count);
    }

    public static int sumOfDigits(int n){
        if(n < 10)
            return n;
        return n % 10 + sumOfDigits(n / 10);
    }

    public static int countDigits(int n){
        if(n < 10)
            return 1;
        return 1 + countDigits(n / 10);
    }
}