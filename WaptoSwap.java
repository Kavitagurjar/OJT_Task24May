
import java.util.Scanner;

public class WaptoSwap{
    public static void main(String[] args) {
        int a, b, temp;
        System.out.println("Enter two numbers ");
        Scanner c = new Scanner(System.in);
        a = c.nextInt();
        b = c.nextInt();
        System.out.println("Before Swapping " + a + " " + b);
        temp = a;
        a = b;
        b = temp;
        System.out.println("After Swapping " + a +" " + b);
    }
}
