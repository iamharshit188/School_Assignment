import java.util.Scanner;
class Palin{
    private int num;
    private int revNum;
    public Palin(){
        num = 0;
        revNum = 0;
    }

    public void accept(){
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the number: ");
        num = Integer.parseInt(in.nextLine());
    }

    public int reverse(int y){
        if(y == 0)
            return revNum;
        else{
            revNum = revNum * 10 + y % 10;
            return reverse(y / 10);
        }
    }

    public void check(){
        revNum = reverse(num);
        if(num == revNum)
            System.out.println("Palindrome number!");
        else
            System.out.println("Not a palindrome number.");
    }

    public static void main(String args[]){
        Palin obj = new Palin();
        obj.accept();
        obj.check();
    }
}