class CoughSyrupGCD{
	
	// Greatest common divisor
	// gcd(a, 0) = a
	// gcd(b, a mod b)
	def calc(int numerator, int denominator)
	{
		if(denominator == 0)
		  return numerator
		else if(denominator % numerator == 0)
		  return numerator
		else if(numerator % 2 == 0)
		  return calc((numerator/2).intValue(), denominator)
		else return 0
	}
	
}