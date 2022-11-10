import java.util.Scanner;
class Book{
    String name[];
    int point;
    int max;
    public Book(int cap){
        max = cap;
        point = -1;
        name = new String[max];
    }

    public void tell(){
        if(point == -1)
            System.out.println("SHELF EMPTY");
        else
            System.out.println("LAST ENTERED: " + name[point]);
    }

    public void add(String v){
        if(point + 1 == max)
            System.out.println("SHELF FULL");
        else
            name[++point] = v;
    }

    public void display(){
        if(point == -1)
            System.out.println("SHELF EMPTY");
        else{
            System.out.println("BOOKS AVAILABLE:");
            for(int i = 0; i <= point; i++)
                System.out.println(name[i]);
            System.out.println();
        }
    }

    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        System.out.print("Bookshelf capacity: ");
        int cap = Integer.parseInt(in.nextLine());
        Book stack = new Book(cap);
        while(true){
            System.out.println("1. Last entered book");
            System.out.println("2. Add book");
            System.out.println("3. Display all books");
            System.out.print("Enter your choice: ");
            int choice = Integer.parseInt(in.nextLine());
            switch(choice){
                case 1:
                    stack.tell();
                    break;
                case 2:
                    System.out.print("Name of the book: ");
                    String n = in.nextLine();
                    stack.add(n);
                    break;
                case 3:
                    stack.display();
                    break;
                default:
                    System.out.println("Bye!");
                    return;
            }
        }
    }
}