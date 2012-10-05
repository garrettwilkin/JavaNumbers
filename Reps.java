import java.math.BigDecimal;
import java.math.MathContext;
import java.math.RoundingMode;

public class Reps {
  public static void main(String[] args) {
    System.out.println("Calculations using doubles");
    System.out.println("--------------------------");
    double a = 1.0;
    System.out.println("    double a = 1.0;");
    System.out.println("    a: "+a);
    double b = a - 0.65;
    System.out.println("    double b = a - 0.65;");
    System.out.println("    b: "+b);
    double c = a * 0.65;
    System.out.println("    double c = a * 0.65;");
    System.out.println("    c: "+c);
    double d = 35.0 / 100.0;
    System.out.println("    double d = 35.0 / 100.0;");
    System.out.println("    d: "+d);
    double e = 35.0 / 1000.0;
    System.out.println("    double e = 35.0 / 1000.0;");
    System.out.println("    e: "+e);
    double f = 0.70 * 0.05;
    System.out.println("    double f = 0.70 * 0.05;");
    System.out.println("    f: "+f);
    double g = f * 2.0;
    System.out.println("    double g = f * 2.0;");
    System.out.println("    g: "+g);

    System.out.println("    Demonstation of what happens when we hit a number which does not have a binary representation during operations with the double data type: 0.35");
    if (g == 0.07) {
      System.out.println("    0.70 * 0.05 * 2.0 == 0.07");
    } else {
      System.out.println("    0.70 * 0.05 * 2.0 != 0.07");
    }

    System.out.println("\nCalculations using BigDecimal");
    System.out.println("-----------------------------");
    MathContext m = new MathContext(10,RoundingMode.HALF_EVEN);
    BigDecimal p = new BigDecimal("0.70");
    BigDecimal q = new BigDecimal("0.05");
    BigDecimal r = new BigDecimal("2.0");
    BigDecimal s = new BigDecimal("0.07");
    BigDecimal t = p.multiply(q,m);
    BigDecimal u = t.multiply(r,m);
    int result = u.compareTo(s);
    if (result == 0) {
      System.out.println("    BigDecimal correctly determines that 0.70 * 0.05 * 2.0 == 0.07");
    } else {
      System.out.println("    BigDecimal also fails to determine that 0.70 * 0.05 * 2.0 == 0.07");
    }
  }
}
