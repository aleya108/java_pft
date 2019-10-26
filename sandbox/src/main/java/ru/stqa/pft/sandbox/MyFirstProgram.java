package ru.stqa.pft.sandbox;

public class MyFirstProgram {
  public static void main(String[] args) {
    hello("World");
    hello("Yana");
    Square s = new Square(6);


    System.out.println("Area of square with " + s.l + " is " + s.area ());
    Rectangle r = new Rectangle(6.2, 10.8);

      System.out.println("Area of rectangle with " + r.a + " and " + r.b+ " is " + r.area());


  }

  public static void hello(String smb) {

    System.out.println("Hello, " + smb + "!");}






}
