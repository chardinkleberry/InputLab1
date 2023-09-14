import java.util.Scanner;

public class Main
{
    public static void main (String[] args)
    {
        Scanner keyboard = new Scanner(System.in);

        int intOne, intTwo;
        float floatOne, floatTwo;
        double doubleOne, doubleTwo;


        System.out.print("Enter an integer :: ");
        intOne = keyboard.nextInt();


        System.out.print("Enter an integer :: ");
        intTwo = keyboard.nextInt();


        System.out.print("Enter an float :: ");
        floatOne = keyboard.nextFloat();


        System.out.print("Enter an float :: ");
        floatTwo = keyboard.nextFloat();

        System.out.print("Enter an double :: ");
        doubleOne = keyboard.nextDouble();


        System.out.print("Enter an double :: ");
        doubleTwo = keyboard.nextDouble();


        //add in input for all variables


        System.out.println();
        System.out.println("integer one = " + intOne );
        System.out.println("integer two = " + intTwo );

        System.out.println();
        System.out.println("float one = " + floatOne );
        System.out.println("float two = " + floatTwo );

        System.out.println();
        System.out.println("double one = " + doubleOne );
        System.out.println("double two = " + doubleTwo );

        //add output for all variables


    }
}