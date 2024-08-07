 import java.util.Scanner;
 public class ex8Contains {
 
    public static void main(String args[])
    {
        Scanner ob = new Scanner(System.in);
        String str1 = ob.nextLine();
        String str2 = ob.nextLine();
        int i = 0, j=0;
        while (i<str1.length() ) {
            
            if(str1.charAt(i) == str2.charAt(0))
            
            {int k= i;
            j=0;
                while(k<str1.length() && j<str2.length())
                {
                    if(str1.charAt(k) != str2.charAt(j))
                    break;
                    k++;
                    j++;
                }
                if(j==str2.length()){
                    System.out.println("Found: true "+ i+ " "+k);
                    return;
                }
            }
            i++;
        }
        System.out.println("Found: false");
    }
 }