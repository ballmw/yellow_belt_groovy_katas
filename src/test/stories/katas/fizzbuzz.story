scenario "a game of fizzbuzz is played", {
  given "fizzbuzz",{
    fizzbuzz = new FizzBuzz()
  }

  when "3 is passed", {
    fizz = {
      fizzbuzz.answer(3)
    }
  }

  then "it should be fizz", {
    fizz.shouldBe("fizz");
  }
}


scenario "a game of fizzbuzz is played", {
  given "fizzbuzz",{
    fizzbuzz = new FizzBuzz()
  }

  when "5 is passed", {
    buzz = {
      fizzbuzz.answer(5)
    }
  }

  then "it should be buzz", {
    buzz.shouldBe("buzz")
  }
  
}