import java.util.Scanner;
class PrimeAdam{
    public static void main(String args[]){
        Scanner in = new Scanner(System.in);
        System.out.print("m = ");
        int m = Integer.parseInt(in.nextLine());
        System.out.print("n = ");
        int n = Integer.parseInt(in.nextLine());
        int count = 0;
        if(m >= n){
            System.out.println("INVALID INPUT.");
            return;
        }
        System.out.println("THE PRIME-ADAM INTEGERS ARE:");
        for(int i = m; i <= n; i++){
            if(isPrime(i) && isAdam(i)){
                System.out.print(i + " ");
                count++;
            }
        }
        if(count == 0)
            System.out.println("NIL");
        System.out.println("\nFREQUENCY OF PRIME-ADAM INTEGERS IS: " + count);
    }

    public static boolean isPrime(int n){
        for(int i = 2; i <= n / 2; i++){
            if(n % i == 0)
                return false;
        }
        return true;
    }

    public static boolean isAdam(int n){
        int rev1 = reverse(n);
        int sq1 = n * n;
        int sq2 = rev1 * rev1;
        int rev2 = reverse(sq2);
        if(sq1 == rev2)
            return true;
        return false;
    }

    public static int reverse(int n){
        int rev = 0;
        while(n != 0){
            rev = rev * 10 + n % 10;
            n /= 10;
        }
        return rev;
    }
}