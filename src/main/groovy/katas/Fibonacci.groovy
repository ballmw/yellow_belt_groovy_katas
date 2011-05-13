class Fibonacci
{
	// Calc the fibonacci sequence
	// f(0) = 0 , f(1) = 1
	// f(n) = f(n-1) + f(n-2)
	def fibonacci(Integer i)
	{
		if ( i == 0)
		  return 0
		else if (i == 1)
		  return 1
		else return fibonacci(i - 1) + fibonacci(i - 2)
	}
}