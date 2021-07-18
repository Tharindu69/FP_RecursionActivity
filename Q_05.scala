	// 5 th question
import java.util.Scanner;
import scala.io.StdIn.readInt;

object qFive{
	def create_less_num(num : Int): Int = {
		if(num%2 == 0) add_even_num(num-2);
		else add_even_num(num-1);
	}


	def add_even_num(num : Int) : Int=num match{
		case 0 => 0;
		case 1 => 0;
		case num if(num<0) => 0;
		case num => (num + add_even_num(num-2));
	}


	println("\n5th question, get the addition of all even numbers less than given n \n");
	println(create_less_num(9));
	println(create_less_num(10));
}