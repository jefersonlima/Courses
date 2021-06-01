package Colections;
import java.util.*;

public class TesteListas {

	@SuppressWarnings("deprecation")
	public static void main(String[] args) {
		List <String> l1 = new ArrayList<String>();
		List <Integer> l2 = new ArrayList<Integer>();
		
		for(int i = 0; i < 5; i++) {
			l1.add("a"+i);
			l2.add(i, new Integer(i));
		}
		for(int j = 0; j < l1.size();j++) {
			System.out.println(l1.get(j));
		}
		
		for(Integer obj:l2) {
			System.out.println(obj);
		}
		System.out.println(l2.contains(5));
	}

}
