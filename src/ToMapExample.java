

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;
import java.util.stream.Collectors;

import com.ipd.Person;

public class ToMapExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List<Person> people = Arrays.asList(
			    new Person("Alice", 25),
			    new Person("Bob", 30),
			    new Person("Charlie", 28)
			);

			Map<String, Integer> nameToAgeTreeMap = people.stream()
			    .collect(Collectors.toMap(
			        Person::getName,
			        Person::getAge,
			        (age1, age2) -> age1, // Merge function (choose the first age in case of duplicates)
			        TreeMap::new
			    ));
			
			System.out.println(nameToAgeTreeMap);


	}

}
