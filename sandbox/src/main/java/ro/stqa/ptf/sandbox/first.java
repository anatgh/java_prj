package ro.stqa.ptf.sandbox;

public class first {
  public static void main(String[] args) {
    hello("world");
    hello("user");
    hello("Selena");

    double len = 5;
    System.out.println("Plos4adi kvadrata so storonoi " + len + " = " + area(len));

    double a = 4;
    double b = 6;
    System.out.println("Plos4adi preamougolinika so storonami " + a + " and " + b + " = " + area(a,b));
  }

  public static void hello(String somebody) {
    System.out.println("Hello, " + somebody + "!");
  }

  public static double area(double l) {
    return l * l;
  }

  public static double area(double a, double b) {
    return a * b;
  }
}