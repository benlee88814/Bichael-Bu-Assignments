import java.util.*;
import java.lang.*;

public class part2 {
    public static void main(String args[])
    {
        /**
        //assignment 6 test
        Scanner scan = new Scanner(System.in);
        System.out.println("What number would you like to check?");
        int in = scan.nextInt();
        if(isPrime(in))
        {
            System.out.println(in + " is a prime number.");
        }
        else
        {
            System.out.println(in + " is not a prime numer.");
        }
        */

        Scanner scan = new Scanner(System.in);
        System.out.println("Please enter numbers: ");
        //storing data temporarly
        List<Integer> temp = new ArrayList<>();
        while(scan.hasNext())
        {
            int current = scan.nextInt();
            if(current < 0)
            {
                break;
            }
            else
            {
                temp.add(current);
            }
        }
        //filling
        if((temp.size() % 3) != 0)
        {
            for (int i = 0; i < temp.size() % 3; i++)
            {
                temp.add(0);
            }
        }

        //temp index values

        //number of index needed
        int sin = temp.size() / 3;
        //making object array
        ArrayList<rando> comp = new ArrayList<rando>();
        for(int i = 0; i < temp.size(); i+=3)
        {
            rando tep = new rando(temp.get(i), temp.get(i + 1), temp.get(i + 2));
            comp.add(tep);
        }
        //order it
        Collections.sort(comp);

        System.out.println(comp);
        System.out.println(comp.get(1));
        comp.get(0).printObject();
        System.out.println(temp);
        System.out.println(temp.size());
    }
    public static boolean isPrime(int num)
    {
        for(int i = 2; i < num; i++)
        {
            if(num % i == 0)
            {
                return false;
            }
        }
        return true;
    }
}
