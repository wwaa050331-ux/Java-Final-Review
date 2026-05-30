package week12;

import java.util.Arrays;
import java.util.List;
import java.util.Iterator;
import java.util.Collections;

public class ListDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] animals1= {"사슬","호랑이","바다표범","곰"};
		
	  List<String> animals2 =Arrays.asList(animals1);
	  Iterator<String> iterator=animals2.iterator();
	  while (iterator.hasNext())
	  	System.out.print(iterator.next()+" ");
	  System.out.println();
	  
	  animals2.set(1,"앵무새");
	  //배열을 List 타입으로 변경한 경우 크기를 변경할 수 없음
	  //animals2.add("늑대")
	
		
	for (String s:animals2)
			System.out.print(s+" ");
		System.out.println();
	
		//Collection 인터페이스를 구현한 클래스의 객체 생성,정렬,검색 등의 기능을 효율적으로 수행할 수 있도록 지원하는 유틸리티 클래스
	Collections.sort(animals2);
	String[] animals3=animals2.toArray(new String[animals2.size()]);
	
	for(int i=0;i<animals3.length;i++)
		System.out.print(animals3[i]+" ");
	System.out.println();

	}

}
