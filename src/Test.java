import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[]= {2,3,30,2,21,0,11};
		  int res = Arrays.stream(a).boxed().sorted(Comparator.reverseOrder()).skip(1).findFirst().get();
		  System.out.print(res);
		  //count the duplicate words in a string
		  String s="Ravi is Always Ravi is";
		       Map<String, Long> map = Arrays.stream(s.split(" ")).collect(Collectors.groupingBy(str -> str, Collectors.counting()));
		       map.entrySet().stream().filter( x -> x.getValue() > 1 ).map(x -> x.getKey()).forEach(System.out :: print);
		       
		       Integer a1[]= {1,2,7,9};
		       Integer a2[]= {11,22,7,9};
		       Integer a3[]= {21,22,7,9};
		       
		       List<Integer> l1= Arrays.asList(a1);
		       List<Integer> l2= Arrays.asList(a2);
		       List<Integer> l3= Arrays.asList(a3);
		       l1.stream().filter(x -> l2.contains(x)).filter(y -> l3.contains(y)).collect(Collectors.toList()).forEach(System.out :: print);
		       
		       
	}

}
