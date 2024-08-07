import java.util.Scanner;
public class SumOfCarry {
    public static void main(String args[]){
        Scanner ob  = new Scanner(System.in);
        int num1, num2, sum =0 , carry = 0, countCarry = 0; 
        int temp1, temp2;
        System.out.println("Enter 2 numbers: ");
        num1 = ob.nextInt();
        num2 = ob.nextInt();
        temp1 = num1;
        temp2 = num2;
        while(num1 != 0 || num2 != 0){
            carry = carry + num1 % 10 + num2 % 10;
            carry = carry /10;
            countCarry+=carry;
            num1 /=10;
            num2/=10; 
        }
        System.out.println("Number 1: "+ temp1);
        System.out.println("Number 2: "+ temp2);
        System.out.println("Carry Count: "+ countCarry);
    }
}
