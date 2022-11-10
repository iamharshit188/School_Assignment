import java.util.Scanner;
class Unique{
    String word;
    int len;
    public void acceptWord(){
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the word: ");
        word = in.next().toUpperCase();
        len = word.length();
    }

    public boolean checkUnique(){
        char first = word.charAt(0);
        char last = word.charAt(len - 1);
        if("AEIOU".indexOf(first) >= 0 && "AEIOU".indexOf(last) >= 0)
            return true;
        return false;
    }

    public void display(){
        if(checkUnique())
            System.out.println(word + " is unique");
        else
            System.out.println(word + " is not unique");
    }

    public static void main(String[] args){
        Unique obj = new Unique();
        obj.acceptWord();
        obj.display();
    }
}