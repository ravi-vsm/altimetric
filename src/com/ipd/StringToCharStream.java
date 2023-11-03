package com.ipd;
import java.util.Map;
import java.util.stream.Collectors;

public class StringToCharStream {

	public static void main(String[] args) {
		
		
		String testString = "StringS";
		
		Map<Object, Long> map = testString.chars().mapToObj(c -> (char) c)
				.collect(Collectors.groupingBy(x -> x, Collectors.counting()));
		
		map.entrySet().forEach(x -> System.out.println(x.getKey() + "----" + x.getValue()));
		

		}

}
