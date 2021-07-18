object qSix {
  def fibonacci(num: Int): Int = num match {
    case 0   => 0;
    case 1   => 1;
    case num => fibonacci(num - 1) + fibonacci(num - 2);
  }

  def fibonacci_sequence(num: Int): Unit = {
    if (num > 0) fibonacci_sequence(num - 1);
    println(fibonacci(num));
  }

  println("\n5th question, print first n Fibonacci numbers for given n \n");
  fibonacci_sequence(12);
}
