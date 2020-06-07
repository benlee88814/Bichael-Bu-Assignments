import java.util.ArrayList;
import java.util.Collections;
import java.lang.*;

public class rando implements Comparable{
    int num1;
    int num2;
    int num3;
    int sum;
    public rando(int num1, int num2, int num3)
    {
        this.num1 = num1;
        this.num2 = num2;
        this.num3 = num3;
        sum = this.num1 + this.num2 + this.num3;
    }
    public int getSum()
    {
        return sum;
    }

    public void printObject()
    {
        System.out.println(num1 + ", " + num2 + ", " + num3);
    }

    @Override
    public String toString()
    {
        return String.format(num1 + ", " + num2 + ", " + num3);
    }

    @Override
    public int compareTo(rando compareRando) {
        int compareSum = compareRando.getSum();
        return compareSum - this.sum;
    }
}
