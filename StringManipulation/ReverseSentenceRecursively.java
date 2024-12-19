import java.util.Scanner;
 
public class ReverseSentenceRecursively{
  public static void main(String args[]){
    Scanner in =new Scanner(System.in);

    //Input sentence
    System.out.print("Enter a Sentence: ");
    String sentence = in.nextLine();

    //Reverse by calling the recursive method
    String reversed = reverse(sentence);

    //output the reversed word
    System.out.print("Reverse: ");
    System.out.println(reversed);
  }

  public static String reverse(String str){
    int idx = str.indexOf(" ");
    //Base condition - when str has only one word
    if(idx == -1)
      return str;
    
    //return after concatenating in reverse order
    return reverse(str.substring(idx+1)) +" "+ str.substring(0, idx);
  }
}