import java .util.Scanner;
public class ex5Compare {
    public static void main(String args[])
    {
        Scanner ob = new Scanner(System.in);
        String str1 =  ob.nextLine();
        String str2 = ob.nextLine();
        for(int i=0;i<Math.min(str1.length(), str2.length()); i++)
        {
            if(str1.charAt(i) > str2.charAt(i))
            {
                System.out.println("str1 is greater than str2:  1");
                return;
            }
            else if(str1.charAt(i)< str2.charAt(i))
            {
                System.out.println("str1 is Smaller than str2:  -1");
                return;
            }
        }
        if(str1.length()>str2.length())
        {
            System.out.println("str1 is greater than str2:  1");
            return;
        }
        else if(str1.length() <str2.length())
        {
            System.out.println("str1 is smaller than str2:  -1");
            return;
        }
        else{
            System.out.println("str1 is equals than str2:  0");
            return;
        }
    }
}
