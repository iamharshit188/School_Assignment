import java.util.Scanner;
class Adder{
    int a[];
    public Adder(){
        a = new int[2];
    }

    public void readTime(){
        Scanner in = new Scanner(System.in);
        System.out.print("Hours: ");
        a[0] = Integer.parseInt(in.nextLine());
        System.out.print("Minutes: ");
        a[1] = Integer.parseInt(in.nextLine());
    }

    public void addTime(Adder x, Adder y){
        this.a[0] = x.a[0] + y.a[0];
        this.a[1] = x.a[1] + y.a[1];
        this.a[0] += this.a[1] / 60;
        this.a[0] %= 24;
        this.a[1] %= 60;
    }

    public void dispTime(){
        System.out.print(a[0] + " hour(s) ");
        System.out.println(a[1] + " minute(s)");
    }

    public static void main(String[] args){
        Adder x = new Adder();
        System.out.println("Time A");
        x.readTime();
        Adder y = new Adder();
        System.out.println("Time B");
        y.readTime();
        Adder z = new Adder();
        z.addTime(x, y);
        z.dispTime();
    }
}