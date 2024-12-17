import java.util.Scanner;

class MyInheritance{
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        System.out.print("Name: ");
        String n = in.nextLine();
        System.out.print("Code: ");
        int c = Integer.parseInt(in.nextLine());
        System.out.print("Sale amount: ");
        double a = Double.parseDouble(in.nextLine());
        Taxable obj = new Taxable(n, c, a);
        obj.calTax();
        obj.show();
    }
}