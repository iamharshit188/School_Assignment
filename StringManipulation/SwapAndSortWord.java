import java.util.Scanner;
class SwapSort{
    String wrd;
    int len;
    String swapWrd;
    String sortWrd;
    public SwapSort(){
        wrd = new String();
        len = 0;
        swapWrd = new String();
        sortWrd = new String();
    }

    public void readWord(){
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the word: ");
        wrd = in.next().toUpperCase();
        len = wrd.length();
    }

    public void swapChar(){
        char first = wrd.charAt(0);
        char last = wrd.charAt(len - 1);
        swapWrd = last + wrd.substring(1, len - 1) + first;
    }

    public void sortWord(){
        char a[] = new char[len];
        for(int i = 0; i < a.length; i++)
            a[i] = wrd.charAt(i);
        for(int i = 0; i < a.length; i++){
            for(int j = 0; j < a.length - 1 - i; j++){
                if(a[j] > a[j + 1]){
                    char temp = a[j];
                    a[j] = a[j + 1];
                    a[j + 1] = temp;
                }
            }
        }
        for(int i = 0; i < a.length; i++)
            sortWrd += a[i];
    }

    public void display(){
        System.out.println("Original word: " + wrd);
        System.out.println("Swapped word: " + swapWrd);
        System.out.println("Sorted word: " + sortWrd);
    }

    public static void main(String[] args){
        SwapSort obj = new SwapSort();
        obj.readWord();
        obj.swapChar();
        obj.sortWord();
        obj.display();
    }
}

