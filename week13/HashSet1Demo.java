package week13;

import java.util.Arrays;
import java.util.HashSet; // 추가
import java.util.List;    // 추가
import java.util.Set;     // 추가

public class HashSet1Demo {

	public static void main(String[] args) {
		String[] fruits= {"사과","바나나","포도","수박"};
		Set<String> h1=new HashSet<>();
		Set<String> h2=new HashSet<>();
		
		for(String s:fruits)
			h1.add(s);
		
		System.out.println("1단계 : "+h1);
		//중복 데이터는 추가되지 않음
		h1.add("바나나");
		h1.remove("포도");
		h1.add("null");
		
		System.out.println("2단계 : "+h1);
		System.out.println(h1.size());
		System.out.println(h1.contains("수"));
		
		List<String> list=Arrays.asList(fruits);
		h1.addAll(list);
		System.out.println("3단계 : "+h2);
		h1.clear();
		System.out.println(h2.isEmpty());
	}

}
