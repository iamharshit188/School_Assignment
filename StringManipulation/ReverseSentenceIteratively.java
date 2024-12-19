import java.util.Scanner;
public class ReverseSentenceIteratively {
    public static void main(String args[]){
        Scanner in =new Scanner(System.in);

        //Input sentence
        System.out.print("Enter a sentence: ");
        String str = in.nextLine();

        //Append whitespace for the extraction of last word
        str += " ";

        String reversed = "";

        //repeat until no word is left
        while(str.indexOf(" ") != -1){
            //Extract word
            int idx = str.indexOf(" ");
            String word = str.substring(0, idx);

            //Concatenate in reverse order
            reversed = word + " "+ reversed;

            //Remove word from the sentence
            str = str.substring(idx+1);
        }

        //Output the reverse
        System.out.print("Reverse: ");
        System.out.println(reversed);
    }
}