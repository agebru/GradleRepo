package grdl01;

import java.util.ArrayList;
import java.util.List;
import java.util.Spliterator;
import java.util.stream.Stream;

public class SpliteratorDemo {

	public static void main(String[] args) {
		List<Integer> al = new ArrayList<>();
		al.add(1);
		al.add(2);
		al.add(-3);
		al.add(-4);
		al.add(5);

	 Stream<Integer> integerStream = al.stream();
	 
	 Spliterator<Integer> splitr1 = integerStream.spliterator();
	 
	 System.out.println("estimate size : " + splitr1.estimateSize()); 
	  System.out.println("exact size : " + splitr1.getExactSizeIfKnown()); 
	  System.out.println(splitr1.hasCharacteristics(splitr1.characteristics())); 
      
      System.out.println("Content of arraylist :"); 
      splitr1.forEachRemaining((n) -> System.out.println(n)); 
		
	}

}
