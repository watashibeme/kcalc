# kcalc
a kotlin calculator using Scanner and System (java utils stuff)

basically it goes like this:
When you run the program, the output will be:

Enter two numbers: 1.5
4.5
Enter an operator (+, -, *, /): *
1.5 * 4.5 = 6.8

The * operator entered by the user is stored in the operator variable using the next() method of Scanner object.

Likewise, the two operands, 1.5 and 4.5 are stored in variables first and second respectively using the nextDouble() method of Scanner object.

Since, the operator * matches the when condition '*':, the control of the program jumps to

result = first * second;

This statement calculates the product and stores in the variable result and it is printed using the printf statement.

taken from https://www.programiz.com/kotlin-programming/examples/calculator-when
