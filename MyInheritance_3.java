import java.util.Scanner;

class MyInheritance_3{
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        System.out.print("Name: ");
        String n = in.nextLine();
        System.out.print("Account Number: ");
        int a = Integer.parseInt(in.nextLine());
        System.out.print("Principal Amount: ");
        double p = Double.parseDouble(in.nextLine());
        Account obj = new Account(n, a, p);
        while(true){
            System.out.println("1. Deposit Money");
            System.out.println("2. Withdraw Money");
            System.out.println("3. Display Details");
            System.out.print("Enter your choice: ");
            int choice = Integer.parseInt(in.nextLine());
            switch(choice){
                case 1:
                    obj.deposit();
                    break;
                case 2:
                    obj.withdraw();
                    break;
                case 3:
                    obj.display();
                    break;
                default:
                    System.out.println("Bye!");
                    return;
            }
        }
    }
}

