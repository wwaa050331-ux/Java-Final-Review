package week12;

@FunctionalInterface //함수형 인터페이스
interface Funcinter{
	public abstract int max(int a, int b);
}

public class FuntionalIntEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Funcinter f=(a, b) -> a>b? a: b ;
		System.out.println(f.max(10,20));
	}

}
