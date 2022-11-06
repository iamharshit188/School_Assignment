import java.util.Scanner;
class Check
{ String wrd;
    int len;
    public Check()
    wId="";
    len=0;
}
public void acceptword()
Scanner sc=new Scanner(System.in);
System.out.println("Enter a word");
wId=sc.next();
len-wrd.length();
} public boolean palindrome ( )
{ for(int i=0, j-len-1; i<=j; i++, j--)
if(wrd.charAt(i)!=wrd.charAt(j))
return false;
}
return true;
} public void display()
System.out.print(wrd);
if(palindrome ( )) System.out.println("is a Palindrome word");
else
System.out.println("is not a Palindrome }
public static void main(String ar[ ])
Check ob=new Check();
ob.acceptword(); ob.display();
}
}