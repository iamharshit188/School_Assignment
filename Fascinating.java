import java.util.Scanner;
class Fascinating{
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        System.out.print("m = ");
        int m = Integer.parseInt(in.nextLine());
        System.out.print("n = ");
        int n = Integer.parseInt(in.nextLine());
        if(m < 100 || n < 100 || m > 9999 || n > 9990){
            System.out.println("INVALID INPUT");
            return;
        }
        int f = 0;
        System.out.println("THE FASCINATING NUMBERS ARE:");
        for(int i = m; i <= n; i++){
            if(isFascinating(i)){
                System.out.print(i + " ");
                f++;
            }
        }
        if(f == 0)
            System.out.print("NIL\n");
        else
            System.out.println();
        System.out.println("FREQUENCY OF FASCINATING NUMBERS IS: " + f);
    }

    public static boolean isFascinating(int num){
        int x = num;
        int y = num * 2;
        int z = num * 3;
        String c = x + "" + y + "" + z;
        for(char i = '1'; i <= '9'; i++){
            int count = 0;
            for(int j = 0; j < c.length(); j++){
                if(i == c.charAt(j))
                    count++;
            }
            if(count != 1)
                return false;
        }
        return true;
    }
}
