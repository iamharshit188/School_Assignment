import java.util.Scanner;
class Stack{
    char cha[];
    int size;
    int top;
    public Stack(int m){
        size = m;
        top = -1;
        cha = new char[size];
    }

    public void pushChar(char v){
        if(top + 1 == size)
            System.out.println("Stack full");
        else
            cha[++top] = v;
    }

    public char popChar(){
        if(top == -1)
            return '$';
        return cha[top--];
    }

    public void display(){
        if(top == -1)
            System.out.println("Stack empty");
        for(int i = 0; i <= top; i++)
            System.out.print(cha[i] + " ");
        System.out.println();
    }

    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        System.out.print("Enter stack size: ");
        int m = Integer.parseInt(in.nextLine());
        Stack obj = new Stack(m);
        while(true){
            System.out.println("1. Push");
            System.out.println("2. Pop");
            System.out.println("3. Display");
            System.out.print("Enter your choice: ");
            int choice = Integer.parseInt(in.nextLine());
            switch(choice){
                case 1:
                    System.out.print("Enter the character: ");
                    char v = in.nextLine().charAt(0);
                    obj.pushChar(v);
                    break;
                case 2:
                    v = obj.popChar();
                    if(v == '$')
                        System.out.println("Stack empty");
                    else
                        System.out.println(v + " popped");
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

