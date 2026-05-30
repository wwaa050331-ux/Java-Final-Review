package week11;

class Utils extends Object{
	public <T> void showArray(T[] a) {
		for(T t:a)
			System.out.printf("%s", t);
		System.out.println();
	}
	public <T> T getLast(T[] a) {
		return a[a.length -1];
	}
}
public class GenMethodDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Integer[] ia= {1,2,3,4,5};
		Character[] ca= {'H','E','L','L','O'};
		
		Utils utils=new Utils();
		
		//메서드 호출시 대입될 타입을 명시
		utils.<Character>showArray(ca);
		//구체적으로 타입을 생략 가능
		utils.showArray(ia);
		
		System.out.println(utils.getLast(ia));
		

	}

}
