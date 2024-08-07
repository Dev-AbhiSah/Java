import java.util.Scanner;
public class MaxExpo {
    public static int expoCount(int i){
        int count = 0;
        while (i % 2 == 0 && i != 0)
        {
            count += 1; 
            i = i / 2;
        }
        return count;
    }
    public static int maxExponents(int a, int b){
        int max =0;
        int num = 0;
        for (int i = a; i<=b; i++){
            int count = expoCount(i);
            if(max < count)
            {
                max = count;
                num = i;
            }
            
        }
        return num;
    }
    public static void main(String args[]){
        Scanner ob = new Scanner(System.in);
        System.out.println("Enter two number: ");
        int a = ob.nextInt();
        int b = ob.nextInt();
        int ans = maxExponents(a, b);
        System.out.println("The number is: "+ ans);
    }
}
