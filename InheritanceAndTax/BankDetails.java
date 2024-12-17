import java.util.Scanner;
class Bank{
    protected String name;
    protected int accno;
    protected double p;
    public Bank(String n, int a, double p){
        name = n;
        accno = a;
        this.p = p;
    }

    public void display(){
        System.out.println("Customer Name: " + name);
        System.out.println("Account Number: " + accno);
        System.out.println("Principal Amount: " + p);
    }
}
