import java.util.Scanner;
class Queue{
    int que[];
    int size;
    int front;
    int rear;
    public Queue(int m){
        size = m;
        que = new int[size];
        front = 0;
        rear = 0;
    }

    public void addele(int v){
        if(rear == size)
            System.out.println("Overflow");
        else{
            que[rear++] = v;
            System.out.println(v + " PUSHED");
        }
    }

    public int delele(){
        if(rear == 0){
            System.out.println("Underflow");
            return -9999;
        }
        int v = que[front++];
        if(front >= rear){
            front = 0;
            rear = 0;
        }
        return v;
    }

    public void display(){
        if(rear == 0)
            System.out.println("QUEUE EMPTY");
        else{
            for(int i = front; i < rear; i++)
                System.out.print(que[i] + " ");
            System.out.println();
        }
    }

    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        System.out.print("Queue size: ");
        int max = Integer.parseInt(in.nextLine());
        if(max > 100)
            max = 100;
        Queue obj = new Queue(max);
        while(true){
            System.out.println("1. PUSH ELEMENT");
            System.out.println("2. POP ELEMENT");
            System.out.println("3. DISPLAY ELEMENTS");
            System.out.print("ENTER YOUR CHOICE: ");
            int choice = Integer.parseInt(in.nextLine());
            switch(choice){
                case 1:
                    System.out.print("Element to be pushed: ");
                    int v = Integer.parseInt(in.nextLine());
                    obj.addele(v);
                    break;
                case 2:
                    v = obj.delele();
                    if(v != -9999)
                        System.out.println(v + " POPPED");
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