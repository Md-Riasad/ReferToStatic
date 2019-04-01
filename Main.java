import java.util.Arrays;
import java.util.List;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		      List<Integer> numbers = Arrays.asList(20, 10, 15, 24, 55, 47, 16, 87, 88);

		     
		      
		      // Print even numbers using method references
		      numbers.stream().map(EvenCheck::isEven)
		         .forEach(System.out::println);
		   }
	}


