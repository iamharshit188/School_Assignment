import java.util.Scanner;
class DeleteWord{
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        System.out.print("Sentence: ");
        String s = in.nextLine().toUpperCase();
        char last = s.charAt(s.length() - 1);
        if(".?!".indexOf(last) == -1){
            System.out.println("INVALID INPUT.");
            return;
        }
        System.out.print("WORD TO BE DELETED: ");
        String w = in.nextLine().toUpperCase();
        System.out.print("WORD POSITION IN THE SENTENCE: ");
        int pos = Integer.parseInt(in.nextLine());
        String t = new String();
        for(int i = 0; i < s.length(); i++){
            char ch = s.charAt(i);
            if(i == 0)
                t += ch;
            else if(" .?!,".indexOf(s.charAt(i - 1)) >= 0 && ch == ' ')
                continue;
            else
                t += ch;
        }
        s = new String(t);
        int count = 0;
        String word = new String();
        t = new String();
        for(int i = 0; i < s.length(); i++){
            char ch = s.charAt(i);
            if(Character.isLetterOrDigit(ch))
                word += ch;
            else if(" .?!,".indexOf(ch) >= 0){
                count++;
                if(count == pos && w.equals(word)){
                    word = new String();
                    continue;
                }
                else
                    t += word + ch;
                word = new String();
            }
        }
        System.out.println(t);
    }
}

