package week10;

public class TryCatchDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] array= {0,1,2};
		
		try {
			System.out.println("마지막 원소=>"+array[3]);
			System.out.println(3/array[0]);
			
		}catch(ArrayIndexOutOfBoundsException e) {
			//예외 발생객체와 동일한 매개변수 타입을 가지는 catch블럭을 실행
			System.out.println("에궁!! 배열참조 범위를 넘엇슈");
			System.out.println(e.getMessage());
		}catch(ArithmeticException e) {
			System.out.println("0으로 나눳슈 똑바로 해용 좀!!!");
		}catch(Exception e) {
			System.out.println("상위에 정의된 예외타입을 제외한 모든 예외를 처리하는 블럭입니당!!");
		}	
			finally { 
			
		}
			//finally 블럭은 주로 객체 소멸, 파일 close 관련 코드들을 포함
			System.out.println("예외발생과 상관없이 무조건 실행해야할 코드들이에용!!!");
		}
	}


