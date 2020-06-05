import java.lang.reflect.Array;
import java.util.Scanner;
import java.util.*;


public class HelloWorld {
    public static void main(String args[])
    {
        // testing if I set up intellij Correctly
        System.out.println("Hello World!");
        System.out.println("This is ready to go!");
/**
        // First Assignment
        System.out.println("Please enter two numbers.");
        Scanner scan = new Scanner(System.in);
        while(true)
        {
            System.out.println(scan.nextInt() + scan.nextInt());
        }
 */
/**
        //Second Assignment
        System.out.println("Please enter 5 words");
        Scanner scan = new Scanner(System.in);
        String len;
        String[] in = {scan.next(),scan.next(),scan.next(),scan.next(),scan.next()};
        for(int i = 0; i < 5; i++)
        {
            if(in[i].length() <= 5)
            {
                len = "no";
            }
            else
            {
                len = "yes";
            }
            System.out.println(i + ", " + in[i] + ", " + len);
        }
 */

        //third Assignment
        int num1;
        int num2;
        while(true)
        {
            System.out.println("Please enter two numers: ");
            Scanner scan = new Scanner(System.in);
            num1 = scan.nextInt();
            num2 = scan.nextInt();
            Product test = new Product(num1, num2);
            test.printProduct();
        }

    }
}
