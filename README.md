# ☕ 자바 프로그래밍 기말고사 실기 요약집

> 📅 기말고사를 위해 무조건 외워야 하는 뼈대 코드와 핵심 개념 정리집입니다.

## 🔍 빠른 바로가기
* 📅 [1일차: 인터페이스와 구현](#1일차-인터페이스와-구현-week-09)
* 📅 [2일차: 인터페이스와 예외 클래스](#2일차-인터페이스와-예외-클래스-week-10)
* ⚠️ [예외 클래스 요약](#-예외-클래스-exception-class)

---

## 1일차: 인터페이스와 구현 (Week 09)

### 💡 핵심 뼈대 코드
```java
public interface ICalculator {
    // 상수는 대문자로 선언 (인터페이스 내 변수는 자동으로 public static final)
    String PLUS = "plus";
    String MINUS = "minus";
    String MULTIPLE = "multiple"; 

    // 추상 메서드
    int add(int a, int b);

    // default 메서드: 인터페이스가 default 키워드를 가질 때만 {} 블록(몸체)을 가질 수 있음
    default int multiple(int i, int j) { 
        return i * j;
    }

    // private static 메서드: 인터페이스 내부에서만 자기들끼리 공통으로 쓸 때 사용
    private static void initMessage(String opt) {  
        System.out.println(opt + "시작합니다~~~~");
    }
}
📌 요약 및 결론인터페이스(Interface): 클래스를 만들기 위한 설계도. 내부 코드에 매개변수나 여러 변수 선언이 가능함.
구현(Implement): 설계도를 바탕으로 실제 기능을 채워 넣는 것.

## 2일차: 인터페이스와 예외 클래스 (Week 10)📌

### 간단 개념정리
인터페이스 기본 개념:구현 클래스 선언 시 자식 클래스가 앞에 오고 implements 뒤에 인터페이스가 위치함.
main 메서드는 프로그램 실행 시 누구보다 먼저 실행됨.
public class Computer implements Controllable { ... }


🔒 접근 제어자 요약접근 제어자접근 범위

public 어디서든 전부 접근 가능
protected 같은 패키지 + 자식 클래스까지 접근 가능
default 같은 패키지 내부에서만 접근 가능
private해당 클래스 내부에서만 접근 가능

⚙️ 메서드 타입 구분
일반/디폴트 메서드: 설계도를 바탕으로 만들어진 '제품(객체)' 소속. 즉, TV나 에어컨 같은 객체를 직접 만들어야만 turnOn()이나 repair()를 누를 수 있음.
정적(static) 메서드: 제품이 아니라 '설계도(인터페이스) 자체' 소속. 공통으로 써야 하는 도우미(Utility) 역할.

// 인터페이스 내부 선언
static void reset() {
    System.out.println("장비를 초기화한다");
}

// 호출 시 객체 생성 없이 바로 사용 가능
Controllable.reset();

🔄 오버라이딩 vs 오버로딩
오버라이딩 (Overriding)부모의 기능을 자식이 새롭게 덮어쓰기 (업그레이드)
@Override: 오타나 실수하지 않도록 컴퓨터가 미리 검사해 주는 안전벨트(알림 마크)
오버로딩 (Overloading)새로 추가하기 (같은 이름으로 여러 개 만들기)매개변수의 타입이나 개수가 달라야 함🙄 다형성과 형변환 (Controllable 예제)

### 핵심코드 분석
// 다형성과 업캐스팅: TV는 Controllable을 구현하기 때문에 더 높음 -> 업캐스팅하여 배열로 묶기 가능
Controllable[] controllable = { new TV(), new Computer() }; 

for (Controllable c : controllable) { // 배열 안에서 하나씩 꺼내 c라고 부름
    cont.printObj(c); // cont 안에 있는 printObj 기능에 재료 c를 넘겨줌
}

// 강제 타입 변환 (다운캐스팅)
if (controllable[0] instanceof TV) { // instanceof는 맞다 아니다 판별용 (꺼냈는데 에어컨일 수도 있으므로 확인 필수)
    
    // "TV 맞네! 그럼 상자에서 나와. 이제부터 넌 다시 온전한 TV야!"
    TV v = (TV) controllable[0]; // Controllable 타입에서 TV 타입으로 되돌리기 (다운캐스팅)

    v.remoteOn();
    v.remoteOff();
    
    // private 메서드는 인터페이스 외부에선 호출 불가
    // v.show("TV") -> X
}

// 다형성과 결합도 감소를 위해 매개변수 타입을 인터페이스 타입으로 선언
void printObj(Controllable c) { // 접근제어자가 없으면 default
    c.turnOn();
    c.turnOff();
    c.repair();
}

⚠️ 예외 클래스 (Exception Class)📌

try와 catch는 무조건 세트로 사용됨.
래퍼 클래스(Wrapper Class): int, char, double, boolean 등의 기본 데이터 타입들을 객체화하기 위해 사용 (예: 정수형은 Integer).
Integer.parseInt(): 문자열을 int형으로 변환하는 메서드.

🚫 주요 예외 종류 (모두 catch와 세트)
Exception: 모든 에러의 조상 (어떤 에러든 다 잡을 수 있음
)ArrayIndexOutOfBoundsException: 배열의 범위를 벗어나는 에러
ArithmeticException: 수학적인 계산 에러 (예: 0으로 나누기 등)
🧼 finally {} 블록in.close() 등을 대신하여 쓰기 가능하며, 마지막에 무조건 딱 한 번 실행됨
보통 데이터베이스 연결을 끊거나, 열어두었던 메모리 파일들을 안전하게 닫아줄 때 사용.

### 💻 예외 처리 예시 코드
// 호출 및 실행부
try {
    td.square(in.nextLine()); // "사장님 이거 문제 있어요" (예외 발생 가능 지점)
} catch (Exception e) { 
    System.out.println("양도된 예외를 처리하고 있어요!"); // 결국 호출한 곳(사장님)이 해결 
    in.close();
}

// 메서드 정의부
private void square(String s) {
    int n = Integer.parseInt(s); // "매니저님 이거 문제 있어요"
    System.out.println(n * n);   // 사실상 이게 하고 싶은 실제 동작
}
	}
	private void square(String s){
		int n=Integer.parseInt(s);//매니저님 이거 문제 있어요
		System.out.println(n*n); //사실상 이게 하고싶은 동작임.
		
	}
		
