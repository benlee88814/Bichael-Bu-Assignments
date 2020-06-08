import javax.lang.model.element.AnnotationMirror;
import java.util.*;
import java.lang.*;

public class catDog {
    public static void main(String args[])
    {
        Scanner scan = new Scanner(System.in);
        System.out.println("State how many cat and dogs: ");
        int a = scan.nextInt();
        ArrayList<Animal> lis = new ArrayList<Animal>();
        for(int i = 0;i < a;i++)
        {
            String typ = scan.next();
            String nam = scan.next();
            int age = scan.nextInt();
            if(typ.equalsIgnoreCase("Dog"))
            {
                Animal tDog = new Dog(nam, age);
                lis.add(tDog);
            }
            if(typ.equalsIgnoreCase("Cat"))
            {
                Animal tCat = new Cat(nam, age);
                lis.add(tCat);
            }
        }
        for (int i = 0;i < a;i++)
        {
            System.out.println(lis.get(i));
            lis.get(i).speak(lis.get(i).getTimes());
            if(lis.get(i) instanceof Dog)
            {
                System.out.println("This is a dog");
            }
            else if(lis.get(i) instanceof Cat)
            {
                System.out.println("THis is a cat.");
            }
        }
        System.out.println(lis.get(0));

    }
}
