class FizzBuzz{
  // The answer should be "fizz" if the input is divisible by 3, "buzz"
  // if the input is divisible by 5 and "fizzbuzz" if the input is
  // divisible by 5 and 3.  Otherwise just the input number
  def answer(int i)
  {
    if( i % 15 == 0)
      return "fizzbuzz"
    else if(i % 3 == 0)
      return "fizz"
    else if (i % 5 == 0)
      return "buzz"
    else
      return i
  }

}