
import java.util.Scanner;
public class UniqueNumberInOrder {

    public static void main(String args[]){
        Scanner ob = new Scanner(System.in);
        String cipher = ob.next();
        String str = "";
        char dif = (char)(25) +'a';
        for(int i = 0; i<cipher.length(); i++){
            char ch = cipher.charAt(i);
            char temp =(char) (dif - ch +'a');
            str = str+ temp;
        }
        
        System.out.println("Chiper text: "+ cipher);
        System.out.println("Plain text: "+ str);
    }
    
}
