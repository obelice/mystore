import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Test1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List list = new ArrayList();

		Integer[] a = { 1, 2, 3, 4, 4, 5 };
		list = Arrays.asList(a);
		Set<Integer> set = new HashSet<>(list);

		for (Integer i : set) {
			System.out.println(i);
		}
	}

}
