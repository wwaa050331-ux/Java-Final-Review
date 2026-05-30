package week12;

import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;

public class IteratorDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//Arrays : 자바에서 배열을 쉬게 관리할 수 있도록 하기 위해서 제공되는 클래스
		//Arrays.alist : 배열을 리스트 형태로 변환
		Collection<String> list=Arrays.asList("다람쥐","개구리","나비");
		Iterator<String> iterator =list.iterator();
		while(iterator.hasNext())
			System.out.print(iterator.next()+"-");
		System.out.println();
		
		//반복자 사용하지 않을 경우 for~each문을 사용할 수도 있음
		for(String s:list)
			System.out.print(s+"+");
		System.out.println();
	}

}
