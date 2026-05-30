# ☕ 자바 프로그래밍 기말고사 실기 요약집

여기에는 18일 남은 기말고사를 위해 무조건 외워야 하는 뼈대 코드만 모아둔다.


## 1일차 인터페이스와 구현 클래스 (Week 09)
```java
public interface ICalculator {
    int add(int a, int b);
}
// ... 이 아래에 구현 클래스 코드가 들어감
String PLUS="pluse",Minus="minus",Mutiple="multiple"; //plus,minus,mutiple은 상수
default int multiple(int i,int j) { //인터페이스가 defualt만 {}안에 있는걸 가질수 있음
		return i*j;
	}
private static void initMessage(String opt) {  //private static은 인터페이스 내부에서만 자기들끼리 쓸때
		System.out.println(opt+"시작합니다~~~~");
	}

결론:
interface 코드 안에 매개변수 쓰기 가능
String으로 여러 변수 선언 가능
interface는 설계도
implement는 구현
