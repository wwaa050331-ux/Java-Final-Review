package week13;
import java.util.HashSet;
import java.util.Arrays;
import java.util.Set;   
	
class Fruit{
	String name;
	


	public Fruit(String name) {
			super();
			this.name=name;
	}
	@Override
	public boolean equals(Object obj) {
		// TODO Auto-generated method stub	return super.equals(obj);
		if(obj instanceof Fruit)
			return ((Fruit)obj).name.equals(name);
		return false;
	}

	@Override
	public int hashCode() {
		// TODO Auto-generated method stub
		
		return name!=null ? name.hashCode():0;
	}
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "Fruit[name="+name+"]";
	}
}
public class HashSet2Demo {
			public static void main(String[] args) {
				Set<Fruit> fruits = new HashSet<>();
				// TODO Auto-generated method stub
				// 2. 생성한 컬렉션 변수(fruits)에 객체를 추가합니다. (대문자 Fruit.add가 아님)
			    fruits.add(new Fruit("사과"));
			    fruits.add(new Fruit("사과")); // 오버라이딩된 hashCode()와 equals() 덕분에 중복 제거!

			    // 3. 컬렉션 변수명(fruits)을 정확히 지정하여 출력합니다.
			    System.out.println(fruits.size());
			    System.out.println(fruits);
			}
}
