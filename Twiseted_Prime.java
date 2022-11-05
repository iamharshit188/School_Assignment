import java.util.Scanner;

class Twiseted_Prime {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n=in.nextInt();

        if(isPrime(n)){

            //Computing Reverse
            int rev=0;
            while(n>0){
                rev=rev*10 + n%10;
                n=n/10;
            }

            if(isPrime(rev))
                System.out.println("Twisted Prime");
            else
                System.out.println("Not a Twisted Prime");
        }
        else
            System.out.println("Not a Twisted Prime");

    }

    //Function to Check Prime Number
    private static boolean isPrime(int n){
        for(int i=2; i<(n/2); i++){
            if(n%i==0)
                return false;
        }
        return true;
    }
}

