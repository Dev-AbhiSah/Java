import java.util.*;
class DecimalBinary{
    public static String dB(int num){
        if(num/8 == 0) return num+"";
        return dB(num/8)+ num%8;
    }
    public static void main(String args[])
    {
        Scanner ob = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int decimal = ob.nextInt();
        // String str ="";
        // while(decimal!=0){
        //     str = decimal%2+str;
        //     decimal/=2;
        // }
        // System.out.println(str);
        String str = dB(decimal);
        System.out.println(str);
    }
}