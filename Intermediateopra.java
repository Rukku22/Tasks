package project1;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Intermediateopra {

	public static void main(String[] args) {
 List<Integer> a=Arrays.asList(1,2,3,45,6);
 a.stream().map(num -> num * 2).forEach(System.out::println); 
 a.stream().limit(5).forEach(System.out::println);
  List country = Stream.of(Arrays.asList("Colombia", "Finland"), Arrays.asList("Peru","Greece", "Iceland")).flatMap(List::stream) .collect(Collectors.toList());  
       System.out.println(country);


	}

}
