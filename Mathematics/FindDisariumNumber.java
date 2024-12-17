import java.util.Scanner;
class Disarium{
    int num;
    int size;
    public Disarium(int n){
        num = n;
        size = 0;
    }

    public void countDigits(){
        for(int i = num; i != 0; i /= 10)
            size++;
    }

    public int sumOfDigits(int n, int p){
        if(p == 1)
            return n;
        int d = n % 10;
        int t = (int)(Math.pow(d, p));
        return t + sumOfDigits(n / 10, p - 1);
    }

    public void check(){
        if(num == sumOfDigits(num, size))
            System.out.println(num + " is a disarium number.");
        else
            System.out.println(num + " is not a disarium number.");
    }

    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int n = Integer.parseInt(in.nextLine());
        Disarium obj = new Disarium(n);
        obj.countDigits();
        obj.check();
    }
}