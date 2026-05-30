package week13;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class SearchDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] s= {"황금을","돌","같이","봐라"};
		List<String> list=Arrays.asList(s);
		
		Collections.sort(list);
		System.out.println(list);
		int i=Collections.binarySearch(list, "돌");
		System.out.println(i);

	}

}
