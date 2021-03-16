//(c) A+ Computer Science
//www.apluscompsci.com
//Name -

import static java.lang.System.*; 

class Rational implements Comparable<Rational>
{
	//add two instance variables
	int num;
	int denom;
	//write two constructors
	public Rational() {
		setRational(1, 1);
	}
	
	public Rational(int n, int d) {
		setRational(n, d);
	}

	//write a setRational method
	public void setRational(int n, int d) {
		setNum(n);
		setDenom(d);
	}

	//write  a set method for numerator and denominator
	public void setNum(int n) {
		num = n;
	}
	public void setDenom(int d) {
		denom = d;
	}
	
	public void add(Rational  other)
	{
		//num1/den1 + num2/den2 
		//new numerator = (num1 * den2 + num2 * den1)
		//new denominator = (den1 * den2)
		
		setNum((num * other.getDenom()) + (other.getNum() * denom));
		setDenom(denom * other.getDenom());
		reduce();
	}

	private void reduce()
	{
		int gcd = gcd(num, denom);
		setNum(num/gcd);
		setDenom(denom/gcd);
	}

	private int gcd(int numOne, int numTwo)
	{
		int gcd = 1;
		for (int i = 1; i <= numOne; i++) {
			if (numOne % i == 0 && numTwo % i == 0) {
				gcd = i;
			}
		}

		return gcd;
	}

	public Object clone ()
	{
		return new Rational(num, denom);
	}


	//ACCESSORS

	//write get methods for numerator and denominator
	public int getNum() {
		return num;
	}
	public int getDenom() {
		return denom;
	}
	
	public boolean equals( Object obj)
	{
		if (this.compareTo((Rational)obj) == 0) return true;
		return false;
	}

	public int compareTo(Rational other)
	{
		if (((double)num/denom) < ((double)other.getNum()/other.getDenom())) {
			return -1;
		} else if (((double)num/denom) > ((double)other.getNum()/other.getDenom())) {
			return 1;
		} else {
			return 0;
		}
	}



	
	//write  toString() method
	public String toString() {
		return num + "/" + denom;
	}
	
}