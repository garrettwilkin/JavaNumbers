Java Numbers
===========
I created this class to explore some of my recent investigations and research on the trouble with doubles & precision in the Java language.  This was done in part to justify my move to the BigDecimal data type.

Calculations using doubles
--------------------------
    double a = 1.0;
    a: 1.0
    double b = a - 0.65;
    b: 0.35
    double c = a * 0.65;
    c: 0.65
    double d = 35.0 / 100.0;
    d: 0.35
    double e = 35.0 / 1000.0;
    e: 0.035
    double f = 0.70 * 0.05;
    f: 0.034999999999999996
    double g = f * 2.0;
    g: 0.06999999999999999
    Demonstation of what happens when we hit a number which does not have a binary representation during operations with the double data type: 0.35
    0.70 * 0.05 * 2.0 != 0.07

Calculations using BigDecimal
-----------------------------
    BigDecimal correctly determines that 0.70 * 0.05 * 2.0 == 0.07
