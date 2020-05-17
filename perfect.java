import java.util.Scanner;

public class perfect {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number:");
        int value = sc.nextInt();
        boolean b = isPerfect(value);
        if (b)
            System.out.println("Perfect Number");
        else
            System.out.println("Not a Perferct Number");
    }

    public static boolean isPerfect(int value) {
        int sum=0;
        for (int i = 1; i <= value / 2; i++) {
            if(value%i == 0)
                sum += i;
        }        
        if(sum == value)
            return true;
        
        return false;
            

    }
}