package week13;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class TreeSetDemo {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Set<String> set=Set.of("포도","수박","사과","키위","망고");
		HashSet<String> hashset=new HashSet<>(set);
		//해시 값 기준으로 저장 위치를 결정, 저장 순서를 보장하지 않음
		System.out.println(hashset);
		//정렬 상태로 생성
		TreeSet<String> fruits=new TreeSet<>(set);
		System.out.println(fruits);
		
		System.out.println(fruits.first());
		System.out.println(fruits.last());
		System.out.println(fruits.lower("사과"));
		System.out.println(fruits.higher("사과"));

	}

}