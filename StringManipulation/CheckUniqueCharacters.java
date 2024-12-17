import java.util.Scanner;
class NoRepeat{
    String word;
    int len;
    public NoRepeat(String wd){
        word = wd;
        len = word.length();
    }

    public boolean check(){
        for(int i = 0; i < len - 1; i++){
            char ch = word.charAt(i);
            if(word.substring(i + 1).indexOf(ch) >= 0)
                return false;
        }
        return true;
    }

    public void prn(){
        if(check())
            System.out.println(word + " has no repeated characters.");
        else
            System.out.println(word + " has repeated characters.");
    }

    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the word: ");
        String w = in.next().toUpperCase();
        NoRepeat obj = new NoRepeat(w);
        obj.prn();
    }
}
