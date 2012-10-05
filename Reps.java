public class Reps {
  public static void main(String[] args) {
    double a = 1.0;
    System.out.println("a: "+a);
    double b = a - 0.65;
    System.out.println("b: "+b);
    double c = a * 0.65;
    System.out.println("c: "+c);
    double d = 35.0 / 100.0;
    System.out.println("d: "+d);
    double e = 35.0 / 1000.0;
    System.out.println("e: "+e);
    double f = 0.70 * 0.05;
    System.out.println("f: "+f);
    double g = f * 2.0;
    System.out.println("g: "+g);
    if (g == 0.07) {
      System.out.println("0.70 * 0.05 * 2.0 == 0.07");
    } else {
      System.out.println("0.70 * 0.05 * 2.0 != 0.07");
    }
  }
}
