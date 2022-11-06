import java.util.Scanner;
class Revno{
    int num;
    public Revno(){
        num = 0;
    }

    public void inputNum(){
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the number: ");
        num = Integer.parseInt(in.nextLine());
    }

    public int reverse(int n){
        if(n < 10)
            return n;
        int d = n % 10;
        n /= 10;
        int len = String.valueOf(n).length();
        int p = (int)(Math.pow(10, len));
        return d * p + reverse(n);
    }

    public void display(){
        System.out.println("Number: " + num);
        int rev = reverse(num);
        System.out.println("Reverse: " + rev);
    }

    public static void main(String[] args){
        Revno obj = new Revno();
        obj.inputNum();
        obj.display();
    }
}