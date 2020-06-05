import java.util.*;

public class Product {
    public static void main(String args[])
    {
        int x1;
        int x2;
        Scanner scan = new Scanner(System.in);
        System.out.println("Please enter two numers:");
        while(true)
        {
            x1 = scan.nextInt();
            x2 = scan.nextInt();
            printProduct(x1, x2);
        }
    }
    public static void printProduct(int num1, int num2)
    {
        int product = num1 * num2;
        System.out.println("The two numers that were entered were: " + num1 + " and " + num2);
        System.out.println("The Product of the two numbers entered is: " + product);
        System.out.println("Pleaes enter two more numers: ");2
    }
}
