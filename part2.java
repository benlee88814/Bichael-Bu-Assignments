import java.util.*;

public class part2 {
    public static void main(String args[])
    {
        /**
        //assignemnet 1
        System.out.println("Please input a positive integer.");
        Scanner scan = new Scanner(System.in);
        int trial = scan.nextInt();
        countDown(trial);
        */
        //assignment 2
        System.out.println("Please Enter postive numbers: ");
        Scanner scan = new Scanner(System.in);
        ArrayList list = new ArrayList();
        int count = 0;
        while(true)
        {
            int current = scan.nextInt();
            if(current <= 0)
            {
                break;
            }
            list.add(current);
            count++;
        }
        Collections.sort(list);
        for(int i = 0; i < count; i++)
        {
            System.out.print(list.get(i));
            if(i < count - 1)
            {
                System.out.print(", ");
            }
        }
        System.out.println();
        System.out.println("You entered " + count + " numbers.");

    }

    public static void countDown(int num)
    {
        System.out.print(num + " ");
        if(num > 1)
        {
            countDown(num - 1);
        }
    }
}
