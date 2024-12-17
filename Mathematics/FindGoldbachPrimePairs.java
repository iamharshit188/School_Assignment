import java.util.Scanner;
class Goldbach{
    public static void main(String args[]){
        Scanner in = new Scanner(System.in);
        System.out.print("N = ");
        int n = Integer.parseInt(in.nextLine());
        if(n % 2 != 0){
            System.out.println("INVALID INPUT. NUMBER IS ODD.");
            return;
        }
        if(n < 10 || n > 49){
            System.out.println("INVALID INPUT. NUMBER OUT OF RANGE.");
            return;
        }
        System.out.println("PRIME PAIRS ARE:");
        int p = 3;
        int q = n - p;
        for(int i = p; i <= n / 2; i++){
            if(isPrime(p) && isPrime(q) && p <= q)
                System.out.println(p + ", " + q);
            p += 2;;
            q = n - p;
        }
    }

    public static boolean isPrime(int n){
        for(int i = 2; i <= n / 2; i++){
            if(n % i == 0)
                return false;
        }
        return true;
    }
}
