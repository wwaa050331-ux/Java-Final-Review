package week11;

class Entry<K, V>{
	
	private K key;
	private V value;
	
	public Entry(K key, V value) {
		super();
		this.key = key;
		this.value = value;
	}

	public K getKey() {
		return key;
	}

	public V getValue() {
		return value;
	}
	
	
}

public class EntryDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Entry<String, Integer> e1=new Entry<>("김선달",20);
		Entry<String, String> e2=new Entry<>("기타","등등");
		
		//타입 매개변수에는 반드시 객체만 대입 가능 , 기초 타입은 대입될 수 없음
		//Entry<String, double> e3=new Entry<>("기타",40.2);
		
		
	  System.out.println(e1.getKey()+" : "+e1.getValue());
	  System.out.println(e2.getKey()+" : "+e1.getValue());
	}

}
