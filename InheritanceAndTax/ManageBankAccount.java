import java.util.Scanner;

class Account extends Bank{
    double amt;
    public Account(String n, int acc, double p){
        super(n, acc, p);
        amt = 0.0;
    }

    public void deposit(){
        Scanner in = new Scanner(System.in);
        System.out.print("Amount to be deposited: ");
        amt = Double.parseDouble(in.nextLine());
        p += amt;
    }

    public void withdraw(){
        Scanner in = new Scanner(System.in);
        System.out.print("Amount to be withdrawn: ");
        amt = Double.parseDouble(in.nextLine());
        if(amt > p)
            System.out.println("INSUFFICIENT BALANCE");
        else{
            p -= amt;
            if(p < 500)
                p = p - (500 - p) / 10;
        }
    }

    public void display(){
        super.display();
        System.out.println("Transaction Amount: " + amt);
    }
}