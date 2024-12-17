import java.io.*;
import java.util.*;
class ArmNum
{
    int  n;
    int  i;
    public ArmNum(int num)
    {
        n = num;
        i = 0;
        for(int i = n; i!= 0; i/= 10)
            i++;
    }

    public int sumPow(int i)
    { if(i < 10)
            return (int)Math.pow(i, 1);
        return (int)Math.pow(i % 10, 1) + sumPow(i/10);
    }

    public void isArmstrong()
    {
        if(n == sumPow(n))
            System.out.println(n+" is an Armstrong number.");
        else
            System.out.println(n+ " is not an Armstrong number.");
    }

    public static void main(String args[])throws IOException{
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number : ");
        int num = sc.nextInt();
        ArmNum obj = new ArmNum(num);
        obj.isArmstrong();
    }
}
