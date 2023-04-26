package edu.guilford;

public class Rational {
    
    //create a rational object with two integer attributes that store the numerator and denominator.
    private int numerator;
    private int denominator;

    //create a constructor that takes two integers and assigns them to the numerator and denominator attributes.
    public Rational(int numerator, int denominator) {
        this.numerator = numerator;
        this.denominator = denominator;
    }

    //create a constructor that generates a random numerator and demoniator between -100 and 100.
    public Rational() {
        this.numerator = (int) (Math.random() * 200 - 100);
            //create a while loop that will keep generating a random number until the denominator is not zero.
         while (this.denominator == 0) {
                this.denominator = (int) (Math.random() * 200 - 100);
            }
        }
    
    //create a constructor that takes no arguments and assigns 0 to the numerator attribute and 1 to the denominator attribute.
    //public Rational() {
    //    this.numerator = 0;
    //    this.denominator = 1;
    //}

    //getters 
    public int getNumerator() {
        return numerator;
    }

    public int getDenominator() {
        return denominator;
    }

    //setters
    public void setNumerator(int numerator) {
        this.numerator = numerator;
    }

    public void setDenominator(int denominator) {
        if (denominator == 0) {
            throw new IllegalArgumentException("Denominator cannot be zero.");
        }
        this.denominator = denominator;
    }
    
    //create a method that returns a string representation of the rational number in the form "numerator/denominator".
    public String toString() {
        return numerator + "/" + denominator;
    }

    //negate toString
    public String negateToString() {
        int oldNumerator = numerator;
        int oldDenominator = denominator;
        negate();
        return "The input is " + oldNumerator + "/" + oldDenominator + "\nThe negated output is " + numerator + "/" + denominator;
    }

    //invert toString
    public String invertToString() {
        int oldNumerator = numerator;
        int oldDenominator = denominator;
        invert();
        return "The input is " + oldNumerator + "/" + oldDenominator + "\nThe inverted output is " + numerator + "/" + denominator;
    }

    //double toString
    public String toDoubleToString() {
        return "The input is " + numerator + "/" + denominator + "\nThe double output is " + toDouble();
    }

    //add toString
    public String addToString(Rational rational) {
        return "The input is " + numerator + "/" + denominator + " and " + rational.numerator + "/" + rational.denominator + "\nThe added output is " + add(rational).numerator + "/" + add(rational).denominator;
    }

    //combine all te toString methods into one toString method
    public String toStringAll(Rational rational) {
        return "The input is " + numerator + "/" + denominator + "\nThe negated output is " + negateToString() + "\nThe inverted output is " + invertToString() + "\nThe double output is " + toDoubleToString() + "\nThe added output is " + addToString(rational);
    }

    //Write a method called that reverses the sign of the rational number. 
    public void negate() {
        numerator = -numerator;
        //it is a void method because it does not return anything since it is changing the numerator attribute and not creating a new numerator attribute.
    }
    
    //Write a method called invert that inverts the number by swapping the numerator and denominator.
    public void invert() {
        int tempnumerator = numerator;
        numerator = denominator;
        denominator = tempnumerator;
    }

    //Write a method called toDouble that returns the rational number as a double.
    public double toDouble() {
        return (double) numerator / denominator;
    }

    //Write a method that adds two rational objects together and returns a new rational object.
    public Rational add(Rational rational) {
        int newNumerator = numerator * rational.denominator + rational.numerator * denominator;
        int newDenominator = denominator * rational.denominator;
        return new Rational(newNumerator, newDenominator);
    }
    
    
    
    

}
