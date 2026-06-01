# ☕ 자바 프로그래밍 기말고사 실기 요약집

> 📅 기말고사를 위해 무조건 외워야 하는 뼈대 코드와 핵심 개념 정리집입니다.

## 🔍 빠른 바로가기
* 📅 [1일차: 인터페이스와 구현](#1일차-인터페이스와-구현-week-09)
* 📅 [2일차: 인터페이스와 예외 클래스](#2일차-인터페이스와-예외-클래스-week-10)
* ⚠️ [예외 클래스 요약](#-예외-클래스-exception-class)

---

## 1일차: 인터페이스와 구현 (Week 09)

### 📌 개념 및 요약
* **인터페이스(Interface):** 클래스를 만들기 위한 **설계도**. 내부 코드에 매개변수나 여러 변수 선언이 가능함.
* **구현(Implement):** 설계도를 바탕으로 실제 기능을 채워 넣는 것.
* **상수 선언:** 인터페이스 내 변수는 자동으로 `public static final`이 되므로 상수는 대문자로 선언하며, `String`으로 여러 변수를 동시에 선언할 수 있음.
* **default 메서드:** 인터페이스가 `default` 키워드를 가질 때만 `{}` 블록(몸체)을 가질 수 있음.
* **private static 메서드:** 인터페이스 내부에서만 자기들끼리 공통으로 호출하여 사용할 때 선언함.


### 💡 핵심 뼈대 코드
```java
public interface ICalculator {
    String PLUS = "plus";
    String MINUS = "minus";
    String MULTIPLE = "multiple"; 

    int add(int a, int b);

    default int multiple(int i, int j) { 
        return i * j;
    }

    private static void initMessage(String opt) {  
        System.out.println(opt + "시작합니다~~~~");
    }
}
```
## 2일차: 인터페이스와 예외 클래스 (Week 10)
### 간단 개념정리
* **📌 간단 개념정리**
* 기본 구조: 구현 클래스 선언 시 자식 클래스가 앞에 오고 implements 뒤에 인터페이스가 위치함.
* 우선순위: main 메서드는 프로그램 실행 시 누구보다 먼저 실행됨.

* 접근 제어자,접근 범위
* public,어디서든 전부 접근 가능
* protected,같은 패키지 + 자식 클래스까지 접근 가능
* default,같은 패키지 내부에서만 접근 가능
* private,해당 클래스 내부에서만 접근 가능

**⚙️ 메서드 타입 구분**
* 일반/디폴트 메서드: 설계도를 바탕으로 만들어진 '제품(객체)' 소속. 즉, TV나 에어컨 같은 객체를 직접 생성해야만 turnOn()이나 repair()를 누를 수 있음.
* 정적(static) 메서드: 제품이 아니라 '설계도(인터페이스) 자체' 소속. 공통으로 써야 하는 도우미(Utility) 역할이며, 객체 생성 없이 인터페이스명.메서드명()으로 바로 사용 가능함.

**개념,설명,특징**
* 오버라이딩 (Overriding),부모의 기능을 자식이 새롭게 덮어쓰기 (업그레이드),@Override: 오타나 실수하지 않도록 컴퓨터가 미리 검사해 주는 안전벨트(알림 마크)
* 오버로딩 (Overloading),새로 추가하기 (같은 이름으로 여러 개 만들기),매개변수의 타입이나 개수가 달라야 함

### 💡 인터페이스의 핵심 뼈대 코드
```java
// 1. 인터페이스 구현 클래스 선언
public class Computer implements Controllable { 
    // 구현 코드 생략
}

// 2. 정적(static) 메서드 선언 및 호출 예시
interface Controllable {
    static void reset() {
        System.out.println("장비를 초기화한다");
    }
}
// 호출 시: Controllable.reset();

// 3. 다형성, 업캐스팅, 다운캐스팅 활용
public class Main {
    public static void main(String[] args) {
        Controllable[] controllable = { new TV(), new Computer() }; 

        for (Controllable c : controllable) { 
            printObj(c); 
        }

        if (controllable[0] instanceof TV) { 
            TV v = (TV) controllable[0]; 
            v.remoteOn();
            v.remoteOff();
        }
    }

    void printObj(Controllable c) { 
        c.turnOn();
        c.turnOff();
        c.repair();
    }
}
```
**⚠️ 예외 클래스 (Exception Class)**
**📌 개념 요약**
구조: try와 catch는 무조건 한 세트로 사용됨.
래퍼 클래스(Wrapper Class): int, char, double, boolean 등의 기본 데이터 타입들을 객체화하기 위해 사용하며, 정수형은 Integer를 사용함.
메서드: Integer.parseInt()는 문자열을 int형으로 변환해 줌.

**🚫 주요 예외 종류 (모두 catch와 세트)**
* Exception: 모든 에러의 조상 (어떤 에러 종류든 최상위에서 다 잡아낼 수 있음)
* ArrayIndexOutOfBoundsException: 배열의 인덱스 범위를 벗어나는 에러
* ArithmeticException: 수학적인 계산 오류 (예: 0으로 나누는 경우 등)

**🧼 finally {} 블록**
* in.close() 등을 내부에 넣어 자원을 반납할 수 있으며, 예외 발생 여부와 상관없이 마지막에 무조건 딱 한 번 실행됨.
* 보통 데이터베이스 연결을 끊거나, 열어두었던 메모리 파일들을 안전하게 닫아줄 때 사용함.

**💻 예외 처리 예시 코드**
* 호출 및 실행부 (예외 처리 담당 - "사장님 역할"): try 블록에서 문제를 감지하면 catch 블록이 넘겨받아 안전하게 처리하고 자원을 닫음.
* 메서드 정의부 (예외 발생 지점 - "매니저님 역할"): 실제로 하고 싶은 동작을 수행하되, 발생한 예외의 위험성을 내포하고 있음.


### 💡 예외클래스의 핵심 뼈대 코드
```java
try {
    td.square(in.nextLine()); 
} catch (Exception e) { 
    System.out.println("양도된 예외를 처리하고 있어요!"); 
    in.close();
}

// 메서드 정의부
private void square(String s) {
    int n = Integer.parseInt(s); 
    System.out.println(n * n);   
}
```
