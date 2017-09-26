package edu.cnm.deepdive.algorithms;

/**
 * Implements the classic Euclid algorithm for finding the GCD of 2
 * integers. When run as a Java application, the input values are
 * read from the command line arguments.
 *
 * @autho Ejerson Balabas
 */
public class Euclid {
  /** Format string used for display of input values and GCD. */
  public static final String DISPLAY_FORMAT = "GCD(%,d, %,d) = %,d%n";

  /**
   * Reads 2 integer values from the command line and displays their GCD,
   * along with the original input values.
   *
   * @param args integer input values
   */
  public static void main(String[] args) {
    int a = Integer.parseInt(args[0]);
    int b = Integer.parseInt(args[1]);

    int gcd = gcd(a, b);
    System.out.printf(DISPLAY_FORMAT, a, b, gcd);
  }

  /**
   * Computes and returns the GCD of 2 integers, using the modular division form of
   * Euclid's algorithm.
   *
   * @param a first input
   * @param b second input
   * @return GCD of <code>a</code> and <code>b</code>
   */
  public static int gcd(int a, int b) {
    // transforms a number into its absolute form
    a = Math.abs(a);
    b = Math.abs(b);
    // finds the larger number of two integers
    int c = Math.max(a, b);
    // finds the smaller number of two integers
    b = Math.min(a, b);
    // a will be assigned the larger value
    a = c;

    while (b > 0) {
      // c = remainder
      // a = min value(b)
      // b = c
      c = a % b;
      a = b;
      b = c;
    }
    return a;


//    classical form of euclid algorithm.
//    // TODO - Change this to modular division.
//    if (a == 0 || b == 0) {
//      // Math.max | take two numbers, compare, and return the larger one
//      return Math.max(a, b);
//    }
//
//    while (a != b) {
//      if (a > b) {
//        a -= b;
//      } else {
//        b -= a;
//      }
//    }
//    return a;
  }


}
