//Copy an ArrayList content into another ArrayList 
package collection;
import java.util.*;
public class ArrayListClass {

	public static void main(String[] args) {
		List<Integer> list1 = new ArrayList<>();
		
		//insert elements into list1
		for(int i=1; i<=5;i++) {
			list1.add(i);
		}
		
		List<Integer> finalList = new ArrayList<>(list1);
		List<Integer> list2 = new ArrayList<>();
		
		//insert elements into list2
		for(int i=6; i<=8;i++) {
			list2.add(i);
		}
		
		finalList.addAll(list2);
		finalList.forEach((n) -> {
			System.out.println(n);
		});
		
	}

}
