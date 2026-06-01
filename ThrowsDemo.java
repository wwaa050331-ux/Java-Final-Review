package week10;

import java.util.Scanner;

//사용자 정의 예외 클래스 생성방법및 사용방법
public class ThrowsDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		ThrowsDemo td = new ThrowsDemo();
		try {
		td.square(in.nextLine());
		}catch(Exception e) {
			System.out.println("양도된 예외를 처리하고 있어용!!");
		}
	}
	private void square(String s) {
		//integer : 정수형 랩퍼 클래스
		// 랩퍼 클래스:기본 데이터 타입들(int, char,double,boolean등)을 객체화하기위해서 사용되는 클래스
		//parseInt : 문자열을 int형으로 변화하는 메서드
		int n = Integer.parseInt(s);
		System.out.println(n*n);
		// TODO Auto-generated method stub

	}
}
