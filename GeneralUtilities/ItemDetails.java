import java.util.Scanner;
class Item{
    protected String name;
    protected int code;
    protected double amount;
    public Item(String n, int c, double a){
        name = n;
        code = c;
        amount = a;
    }

    public void show(){
        System.out.println("Name: " + name);
        System.out.println("Code: " + code);
        System.out.println("Amount: " + amount);
    }
}