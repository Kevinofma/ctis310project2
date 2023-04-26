package edu.guilford;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        //create a rational object with two integer attributes that store the numerator and denominator.
        Rational rational1 = new Rational(8,10);
        System.out.println(rational1.negateToString());
        System.out.println("expected output is -8/10\n");
        
        Rational rational2 = new Rational(6,10);
        System.out.println(rational2.invertToString());
        System.out.println("expected output is 10/6\n");

        Rational rational3 = new Rational(5,10);
        System.out.println(rational3.toDoubleToString());
        System.out.println("expected output is 0.5\n");

        //create 2 rational objects and add them together
        Rational rational5 = new Rational(1,2);
        Rational rational6 = new Rational(2,5);
        System.out.println(rational5.addToString(rational6));
        System.out.println("expected output is 9/10\n");
        
        //create a random rational object and print it.
        Rational rational4 = new Rational();
        System.out.println("A random rational number is: " + rational4.toString());

        











    }
}
