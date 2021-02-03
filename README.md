# Java Repo Guide

### Table of Contents

1. [Calculator](#calculator)
2. [Fraction](#frac)
3. [Stats](#stats)
4. [StringX](#strix)
5. [Tuple](#Tuple)
6. [License](#license)

### Calculator

The biggest package here! Contains calculators, graphing calculators, and more!

Quick Disclaimer: The package contains the Stringx Subtract.java file (see down), as it is needed.

Inheritance Tree:

<Interface> Calculations: Specifies methods in SciCalc
<Abstract Class> SciCalc: Implements Calculations
<Class> Calculator: Extends SciCalc
<Class> GraphingCalculator: Extends Calculator
<Class> MSGraphingCalculator: Extends GraphingCalculator

##### Calculator.java

Creates a calculator

Initializing:
```java
Calculator c = new Calculator();
//starts the calculator
```

Methods:
```java
double d; //implementation
c.toAns(d); //sets ans field to d
c.ans(); //gets ans field
c.sin(d); //returns sine of d
c.cos(d); //returns cosine of d
c.tan(d); //returns tangent of d
c.csc(d); //returns cosecant of d
c.sec(d); //returns secant of d
c.cot(d); //returns cotangent of d
c.arcsin(d); //returns arcsine of d
c.arccos(d); //returns arccosine of d
c.arctan(d); //returns arctangent of d
c.arccsc(d); //returns arccosecant of d
c.arcsec(d); //returns arcsecant of d
c.arccot(d); //returns arccotangent of d
c.ln(d); //returns natural log of d
c.log(d); //returns common log of d
c.log(/*base*/, d); //returns log base base of d
c.store(d, /*char*/); //stores d for recall with char
c.recall(/*char*/); //recalls value associated with char
c.getPi(); //returns value of pi
c.getE(); //returns value of e
c.squared(d); //returns d squared
c.exponent(d, /*exp*/); //returns d to the exp
c.squareRoot(d); //returns the square root of d
c.nthRoot(d, /*root*/); //returns the root root of d
c.toPrecent(d); //returns d as a percent
c.fromPercent(/*string*/); //returns double from string
c.getStoreList(); //returns the stored list of items
c.tenToTheNth(d); //returns 10 to the d
c.eToTheNth(d); //returns e to the d
c.inverseExponent(d); //returns d to the -1
c.inverseExponent(d, /*exp*/); //returns d to the -exp
c.toRadians(d); //returns d in radians
c.toDegrees(d); //returns d in degrees
c.clearMemory(); //clears calculator's memory
```

##### GraphingCalculator / MSGraphingCalculator Support Files

The following files are support files for GraphingCalculator and MSGraphingCalculator:
AbsoluteValue.java
ArcCosine.java
ArcSine.java
ArcTangent.java
Cosecant.java
Cosine.java
Cotangent.java
Equation.java <Interface> (Specifies other equations methods)
Exponential.java
Linear.java
Logarithm.java
Point.java
Quadratic.java
Reciprocal.java
Secant.java
Sine.java
SquareRoot.java
Subtract.java
Tangent.java

Every file has a constructor that is necessary for the graphing calculator. The parameters are named a, b, c, etc. To see the format for the constructor, use each classes public static field FORMAT and print it to see the format. For example, to see Tangent.java's, do System.out.println(Tangent.FORMAT) to get atan(b(cx+d))+e.

##### GraphingCalculator.java

Graphs equations

Initializing:
```java
GraphingCalculator g = new GraphingCalculator();
//creates a blank graphing calculator
```

Fields:
```java
GraphingCalculator.AUTOSCALE = false;
//set to true, and calculator will autoscale the
//equation to fit better on the JFrame
GraphingCalculator.RSCALE = 30;
//the scaling by which the graph will change if
//autoscale is set to true, declared as final
```

Methods:
```java
g.graphLine(Linear l);
//graphs a line from Linear.java
g.graphQuadratic(Quadratic q);
//graphs a quadratic from Quadratic.java
g.graphAbsoluteValue(AbsoluteValue a);
//graphs an absolute value from AbsoluteValue.java
g.graphSine(Sine s);
//graphs a sine from Sine.java
g.graphCosine(Cosine c);
//graphs a cosine from Cosine.java
g.graphExponential(Exponential e);
//graphs an exponential from Exponential.java
g.graphLogarith(Logarithm l);
//graphs a logarithm from Logarithm.java
g.graphSquareRoot(SquareRoot s);
//graphs a square root from SquareRoot.java
g.graphTangent(Tangent t);
//graphs a tangent from Tangent.java
g.graphCotangent(Cotangent c);
//graphs a cotangent from Cotangent.java
g.graphCosecant(Cosecant c);
//graphs a cosecant from Cosecant.java
g.graphSecant(Secant s);
//graphs a secant from Secant.java
g.graphReciprocal(Reciprocal r);
//graphs a reciprocal from Reciprocal.java
g.graphArcSine(ArcSine a);
//graphs an arcsine from ArcSine.java
g.graphArcCosine(ArcCosine a);
//graphs an arccosine from ArcCosine.java
g.graphArcTangent(ArcTangent a);
//graphs an arctangent from ArcTangent.java
```

##### MSGraphingCalculator.java

A manual-scaling (MS) graphing calculator

Initializing:
```java
MSGraphingCalculator m = new MSGraphingCalculator();
//starts the ms graphing calculator
```

Methods:
Inherits from GraphingCalculator, and therefore, all methods in GraphingCalculator can be used by the MSGraphingCalculator.

Using:
Once running the main method, you will see a frame with a slider and a submit button. Slide the slider to the scaling you want and hit submit, and any graph calls you have made after initialization will be ran.

### Frac

Classes representing fractions and mixed numbers

##### Fraction.java

Represents a fraction

Initializing:
```java
Fraction f = new Fraction();
//initializes a fraction to be 1/1
Fraction f = new Fraction(/*denominator*/);
//initializes a fraction to be 1/denominator
Fraction f = new Fraction(/*fraction*/);
//copy constructor, initializes a fraction to the given fraction
Fraction f = new Fraction(/*numerator*/, /*denominator*/)
//initializes a fraction to be numerator/denominator
Fraction f = new Fraction(/*mixed number*/);
//initializes an improper fraction from the mixed number
```

Methods:
```java
Fraction f = new Fraction(/*implementation*/);
f.getNum(); //gets the numerator
f.getDenom(); //gets the denominator
f.simplify(); //simplifies this fraction, if possible
f.toDouble(); //returns f as a double
f.toInt(); //returns f as an int
f.toString(); //returns f as a string
f.equals(Fraction other); //checks if f == other
f.compareTo(Fraction other); //returns f.toInt() - other.toInt()
f.equals(MixedNumber other); //checks if f == other.toFraction()
f.compareTo(MixedNumber other); //returns 
//f.toInt() - other.toFraction().toInt()
f.toMixedNumber() //returns f as a mixed number
```

##### MixedNumber.java

Represents a mixed number

Initializing:
```java
MixedNumber m = new MixedNumber();
//initializes a mixed number to 1 1/1
MixedNumber m = new MixedNumber(/*coeff*/);
//initializes a mixed number to coeff 1/1
MixedNumber m = new MixedNumber(/*coeff*/, /*denom*/);
//initializes a mixed number to coeff 1/denom
MixedNumber m = new MixedNumber(/*coeff*/, /*num*/, /*denom*/);
//initializes a mixed number to coeff num/denom
MixedNumber m = new MixedNumber(/*fraction*/);
//initializes a mixed number to 
//1 fraction.getNum()/fraction.getDenom()
MixedNumber m = new MixedNumber(/*coeff*/, /*fraction*/);
//initializes a mixed number to
//coeff fraction.getNum()/fraction.getDenom()
```

Methods:
```java
MixedNumber m = new MixedNumber(/*implementation*/);
m.getNum(); //returns the numerator
m.getDenom(); //returns the denominator
m.getCoeff(); //returns the coefficient
m.getSideFraction(); //returns the numerator and denominator
//as a fraction
m.simplify() //simplifies this mixed number, if possible
m.toDouble() //returns m as a double
m.toInt() //returns m as an int
m.toString() //returns m as a String
m.equals(MixedNumber other) //checks if m == other
m.compareTo(MixedNumber other) //returns m.toInt() - other.toInt()
m.equals(Fraction other) //checks if m.toFraction() == other
m.compareTo(Fraction other) //returns
//m.toFraction().toInt() - other.toInt()
m.toFraction() //returns m as an improper fraction
```

### Stats

Classes that are meant to do statistics with int / double datasets. All methods in this package are static.

##### Stats.java

Works with int[], double[], int[][], and double[][] datasets

Methods:
```java
int[] dataset = {/*Data*/};
Stats.max(dataset); //Returns highest value in dataset
Stats.min(dataset); //Returns lowest value in dataset
Stats.range(dataset); //Returns range of dataset (max - min)
Stats.mean(dataset); //Returns mean of dataset
Stats.variance(dataset); //Returns variance of dataset
Stats.standardDeviation(dataset); //Returns the standard deviation 
//of dataset
Stats.median(dataset); //Returns the median of dataset
Stats.mode(dataset); //Returns the mode of dataset
```

##### ListStats.java

Works with ArrayList<Integer> and ArrayList<Double>. For ArrayList<Integer>, methods are the same as Stats.java, but have "Int" in them (ie Stats.max would be ListStats.maxInt). For ArrayList<Double>, it is "Double" (ie Stats.max would be ListStats.maxDouble)

Methods:
```java
ArrayList<Integer> i = new ArrayList<Integer>();
ArrayList<Double> d = new ArrayList<Double>();
ListStats.maxInt(i); / ListStats.maxDouble(d);
//returns the highest value in i / d
ListStats.minInt(i); / ListStats.minDouble(d);
//returns the lowest value in i / d
ListStats.rangeInt(i); / ListStats.rangeDouble(d);
//returns the range of i / d
ListStats.meanInt(i); / ListStats.meanDouble(d);
//returns the mean of i / d
ListStats.varianceInt(i); / ListStats.varianceDouble(d);
//returns the variance in i / d
ListStats.standardDeviationInt(i);
ListStats.standardDeviationDouble(d);
//returns the standard deviation in i / d
ListStats.medianInt(i); / ListStats.medianDouble(d);
//returns the median in i / d
ListStats.modeInt(i); / ListStats.modeDouble(d);
//returns the mode in i / d
```

###### Combinatorics.java

Used for calculating permutations and combinations.

Methods:
```java
int n, r, num; //implementation
Combinatorics.nPr(n, r) 
//returns permutations of n and r (n! / (n-r)!)
Combinatorics.nCr(n, r)
//returns combinations of n and r (n! / [(n-r)! * r!])
Combinatorics.factorial(num)
//returns factorial of num
```

### Stringx

A String extender (Stringx) folder, that adds new things with strings

##### AsList.java

Returns strings as lists

Methods:
```java
String str; //implementation
AsList.getString(str); //returns str as a list of words
//spaces are not included in the list
AsList.getStringWithSpaces(str); 
//returns str as a list of words and spaces are in the list too
AsList.getChar(str); //returns str as a list of chars
```

##### DString.java

Does basic data with strings

Methods:
```java
String str; //implementation
DString.countVowels(str); //counts number of lowercase vowels in str
DString.countVowelsUpper(str); //counts number of uppercase vowels
//in str
DString.countVowelsIgnoreCase(str); //counts number of vowels in str
//regardless of case
DString.countConsonants(str); //counts number of lowercase consonants 
//in str
DString.countConsonantsUpper(str); //counts number of uppercase
//consonants in str
DString.countConsonantsIgnoreCase(str); //counts number of consonants
//in str regardless of case
DString.compare(char[] letters, char isIn); //returns index of isIn
//in letters, -1 otherwise
DString.getAsList(str); //gets str as a list of words
DString.isPalindrome(str); //returns true if str is a palindrome
DString.isPalindromeIgnoreCase(str); //returns true if str is
//a palindrome regardless of case
DString.reverse(str); //returns str reversed
```

##### Strip.java

Working with strings and whitespaces (ie spaces, newlines [\n], etc.)

Methods:
```java
String str; //implementation
Strip.trimFront(str); //removes whitespace in the front of str
Strip.trimEnd(str); //removes whitespace in the end of str
Strip.trimEnds(str); //removes whitespace from both ends of str
Strip.rstrip(str); //removes last \n from the end of str
Strip.rstripFront(str); //removes first \n at the front of str
Strip.rstripEnds(str); //removes first \n from both ends of str
Strip.fstrip(str); //removes all \n from the end of str
Strip.fstripFront(str); //removes all \n from the front of str
Strip.fstripEnds(str); //removes all \n from both ends of str
```

##### Subtract.java

Allows for subtracting of strings

Methods:
```java
String str; //implementation
Subtract.subtract(str, String/double/char/int remove);
//returns new string with first instance of remove removed
Subtract.subtractAll(str, String/double/char/int remove);
//returns new string with all instances of remove removed
```

### Tuple

>-- COMING SOON --< [UNDER CONSTRUCTION]

# License

  
MIT License

Copyright (c) 2020 RandomKiddo

Permission is hereby granted, free of charge, to any person obtaining a copy
of this software and associated documentation files (the "Software"), to deal
in the Software without restriction, including without limitation the rights
to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
copies of the Software, and to permit persons to whom the Software is
furnished to do so, subject to the following conditions:

The above copyright notice and this permission notice shall be included in all
copies or substantial portions of the Software.

THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE
SOFTWARE.
