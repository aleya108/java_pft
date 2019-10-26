package ru.stqa.pft.sandbox;

public class MyFirstProgram {
  public static void main(String[] args) {
    hello("World");
    hello("Yana");
    double len = 7;
    System.out.println("Area of square with " + len + " is " + area(len));
    double a = 5;
    double b = 7;
      System.out.println("Area of rectangle with " + a + " and " + b+ " is " + area(a,b));


  }

  public static void hello(String smb) {

    System.out.println("Hello, " + smb + "!");}

    public static double area (double l) {
      return l * l;
    }

    public static double area (double a, double b) {
      return a*b;
    }


}
