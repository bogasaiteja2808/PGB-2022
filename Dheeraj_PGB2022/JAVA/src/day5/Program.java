package day5;

import java.util.*;
import java.util.stream.Collectors;

class checkPrime{
	static int isPrime(int n) {
		if (n == 2 || n == 1)
	        return n;
		
		if (n <= 1 || n % 2 == 0)
            return -1;

 
        for (int i = 3; i <= Math.sqrt(n); i += 2)
        {
            if (n % i == 0)
                return -1;
        }
        return n;
    }
}

public class Program {

	static int[] ints = {1,2,3,4,5,6,7,8,9,73,100};
	
	// Converting number array to list
	static List<Integer> list = Arrays.stream(ints).boxed().collect(Collectors.toList());
	
	
	public static void main(String[] args) {
//		list.stream().map(checkPrime::isPrime).forEach((i)-> {
//			if (i != -1) {
//				System.out.println(i);
//				
//			}
//		});
		
		list.stream()
		.map(x -> checkPrime.isPrime(x)) 	// Using .map() to get all prime numbers
		.filter(x -> (x < 25 && x > 0))  	// Using .filter() to get prime numbers less than 25
		.sorted(Comparator.reverseOrder())	// Using .sorted() to sort the above numbers in descending order
		.collect(Collectors.toList())		// Using .collect() to store the above sorted list into a list
		.forEach(System.out::println);		// Using .forEach() to print the prime numbers less than 25
 		
		// Using .reduce() to get the sum of all the integers in list
		System.out.println("Sum Of elements in list : "+list.stream().reduce(0, (a, b) -> a + b, Integer::sum));
	}

}
