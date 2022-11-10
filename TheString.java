import java.util.Scanner;
import java.util.StringTokenizer;
class TheString{
    String str;
    int len;
    int wordCount;
    int cons;
    public TheString(){
        str = new String();
        len = 0;
        wordCount = 0;
        cons = 0;
    }

    public TheString(String s){
        str = new String(s);
        len = str.length();
        wordCount = 0;
        cons = 0;
    }

    public void countFreq(){
        str = str.toLowerCase();
        StringTokenizer st = new StringTokenizer(str);
        wordCount = st.countTokens();
        for(int i = 0; i < len; i++){
            char ch = str.charAt(i);
            if(Character.isLetter(ch) && "aeiou".indexOf(ch) == -1)
                cons++;
        }
    }

    public void display(){
        System.out.println("Original string: " + str);
        countFreq();
        System.out.println("Number of words: " + wordCount);
        System.out.println("Number of consonants: " + cons);
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the string: ");
        String s = in.nextLine();
        TheString obj = new TheString(s);
        obj.display();
    }
}